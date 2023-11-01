package com.test.kim.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDtoTest {
    public static void main(String[] args) {
        UserDto DTO1 = new UserDto("kik", "0723", "A", "인턴", "호형호제 못함", "2022-10-04 14:00:00");
        System.out.println(DTO1.toString());

    }


}