package com.test.kim.service;

import com.test.kim.dto.Member;
import com.test.kim.mapper.MemberMapper;
import com.test.kim.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MemberServicePostgres implements MemberService {

    private final MemberMapper memberMapper;


    @Autowired
    public MemberServicePostgres(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }


    @Override
    public List<Member> findAllMember() {
        return memberMapper.findMember();
    }


    @Override
    public void insertMember(Member member) throws Exception {
        memberMapper.insertMember(member);
    }

    @Override
    public Member findMember(Long memN) {

        return null;
    }

    @Override
    public Member findMemberByAll(String memberId, String memberPwd) {
        return memberMapper.findMemberByMemberIdAndPassword(memberId, memberPwd);
    }
}
