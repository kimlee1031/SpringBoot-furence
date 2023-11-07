package com.test.kim.service;

import com.test.kim.dto.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class loginTest {

    private final MemberService memberService;


    @Autowired
    public loginTest(MemberService memberService) {
        this.memberService = memberService;
    }

    @Test
    void checkLogin() throws Exception {
        Member member = new Member("kim5", "kim5", "kim5");
        Member member1 = new Member("kim5", "kim5", "kim5");

        memberService.insertMember(member1);
        Member member2 = memberService.findMember(5L);
        System.out.println(member2);
        Member foundMember = memberService.findMemberByAll(member.getMemberId(), member.getMemberPwd());
        Assertions.assertThat(foundMember).isEqualTo(member1);



    }



}