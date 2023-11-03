package com.test.kim.repository;

import com.test.kim.dto.Member;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryMemberRepository implements MemberRepository {

    public static Map<Long, Member> store = new ConcurrentHashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getMemN(), member);
    }

    @Override
    public Member findByN(Long memN) {
        return store.get(memN);
    }

    /*@Override
    public Member findByMemberId(String memberId) {
        return store.get(memberId);
    }*/

}
