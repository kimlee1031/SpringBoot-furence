package com.test.kim.dto;

import java.sql.Timestamp;

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
    private Integer kim;
    public UserDto() {
    	
    }

    public UserDto(String[]args) {
        //ArrayIndexOutOfBoundsException11
        this.id = args[0];
        this.pwd = args[1];
        this.name = args[2];
        this.level = args[3];
        this.description = args[4];
        this.regdate = Timestamp.valueOf(args[5]);
    }
    public UserDto(String id, String pwd, String name, String level, String desciption, String regdate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.level = level;
        this.description = desciption;
        this.regdate = Timestamp.valueOf(regdate);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s",id, pwd, name, level, description, regdate);
    }

}




