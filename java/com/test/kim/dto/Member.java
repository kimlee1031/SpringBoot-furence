package com.test.kim.dto;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    private Long memN;
    private String memberId;
    private String memberPwd;
    private String memberNm;

    @Override
    public String toString() {
        return "Member [ memberId = " + memberId + "memberPwd = " + memberPwd + "memberNm" + memberNm + "]";
    }
}
