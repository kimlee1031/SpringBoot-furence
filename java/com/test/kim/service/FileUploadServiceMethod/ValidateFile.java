package com.test.kim.service.FileUploadServiceMethod;

import com.test.kim.model.Result;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ValidateFile {
    public void ValidateF(String fileName, Result result) {
        if (fileName != null && !fileName.endsWith(".dbfile")) {
            result.setFileCheck(false);
            result.setMessage("Error: 파일 확장자가 허용되지 않습니다.");
            log.info(result.getMessage());
        }
    }

}
