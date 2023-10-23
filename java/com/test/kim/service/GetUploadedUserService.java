package com.test.kim.service;

import com.test.kim.dto.UserDto;
import com.test.kim.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class GetUploadedUserService {

    private UserMapper userMapper;

    @Autowired
    public GetUploadedUserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }



    public List<UserDto> getUploadedUsers() {
        return userMapper.findUser();
    }

    //데이터 삭제 코드 주석 처리1
    public void deleteUsers() {
        userMapper.deleteUsers();
    }

}
