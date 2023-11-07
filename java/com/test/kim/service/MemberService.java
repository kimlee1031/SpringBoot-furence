package com.test.kim.service;

import com.test.kim.dto.Member;

public interface MemberService {
    public void insertMember(Member member) throws Exception;

    Member findMember(Long memN);

    Member findMemberByAll(String memberId, String password);



}
