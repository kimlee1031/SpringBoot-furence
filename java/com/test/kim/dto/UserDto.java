package com.test.kim.dto;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.*;

@Setter
@Getter
public class UserDto {
    private String id;
    private String pwd;
    private String name;
    private String level;
    private String description;
    private Timestamp regdate;// Timestamp 타입 사용

    public UserDto() {
    	
    }

    public UserDto(String[]args) {
        //ArrayIndexOutOfBoundsException
        this.id = args[0];
        this.pwd = args[1];
        this.name = args[2];
        this.level = args[3];
        this.description = args[4];
        this.regdate = Timestamp.valueOf(args[5]);
    }
    public UserDto(String id, String pwd, String name, String level, String desciption, LocalDateTime regdate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.level = level;
        this.description = desciption;
        this.regdate = Timestamp.valueOf(regdate);
    }

}




