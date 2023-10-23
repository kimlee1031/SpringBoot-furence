// UserMapper.java
package com.test.kim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.kim.dto.UserDto;


@Mapper
public interface UserMapper {
    List<UserDto> findUser();
    void insertUser(UserDto user);

    void deleteUsers();
}
//mapper