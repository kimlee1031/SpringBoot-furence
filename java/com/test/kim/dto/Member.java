package com.test.kim.dto;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    private Long memberNumber;
    private String memberId;
    private String memberPwd;
    private String memberName;

    public Member(Long memberNumber, String memberId, String memberPwd, String memberName) {
        this.memberNumber = memberNumber;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
    }

    Member() {
    }

    @Override
    public String toString() {
        return "Member [ memberNumber : " + memberNumber +"memberId = " + memberId + "/memberPwd = " + memberPwd + "/memberName" + memberName + "]";
    }
}
