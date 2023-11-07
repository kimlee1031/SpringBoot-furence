package com.test.kim.service;

import com.test.kim.dto.Member;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface MemberService {
    void insertMember(Member member) throws Exception;

    Member findMember(Long memN);

    Member findMemberByAll(String memberId, String password);
    public List<Member> findAllMember();


}
