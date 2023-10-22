package com.test.kim.service;

import com.test.kim.dto.UserDto;
import com.test.kim.mapper.UserMapper;
import com.test.kim.model.ErrorInfo;
import com.test.kim.model.Result;
import com.test.kim.service.FileUploadServiceMethod.ValidateFile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class FileUploadService {

    private final UserMapper userMapper;

    @Autowired
    public FileUploadService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Result uploadFile(MultipartFile file) throws Exception {//throws IOException을 사용해서 입출력 예외가 발생할 수 있다는 것을 알린다..?
        Result result = new Result();
        String fileName = file.getOriginalFilename();
        ValidateFile validateFile= new ValidateFile();

        validateFile.ValidateF(fileName, result);
        if (!result.isFileCheck()) {
            return result;
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                try {
                    if (line.trim().isEmpty()) {
                        continue;
                    }
                    userMapper.insertUser(new UserDto(line.split("/")));
                    result.incSuccessCount();
                    log.info("데이터 저장 완료");
                }catch (DuplicateKeyException de){
                    log.info("중복 데이터 오류");
                    de.printStackTrace();
                    result.setDuplicateCheck(true);
                } catch (Exception e) {
                    result.failedErrors(line,lineNumber);
                    e.printStackTrace();
                    result.incFailCount();
                    log.info("파일업로드 중  예외발생 ");
                }finally {
                    lineNumber++;
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
            log.info("IOException 발생 ");
            throw e;
        }
        return result;
    }

}
