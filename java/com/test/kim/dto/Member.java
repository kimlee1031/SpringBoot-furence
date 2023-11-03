package com.test.kim.dto;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    private Long memN;
    private String memberId;
    private String memberPwd;
    private String memberNm;

    public Member(Long memN, String memberId, String memberPwd, String memberNm) {
        this.memN = memN;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberNm = memberNm;
    }

    Member() {
    }

    @Override
    public String toString() {
        return "Member [ memberNumber : " +memN+"memberId = " + memberId + "/memberPwd = " + memberPwd + "/memberNm" + memberNm + "]";
    }
}
