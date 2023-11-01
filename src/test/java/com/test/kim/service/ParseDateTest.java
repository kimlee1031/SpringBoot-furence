/*
package com.test.kim.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class ParseDateTest {


    ParseDate D = new ParseDate();

    @Test    void parseD() {

        String dataString = "2020-10-01 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = D.parseD(dataString);

        Assertions.assertThat(localDateTime).isEqualTo("2020-10-01T10:00");

        System.out.println(localDateTime);

    }
}*/
