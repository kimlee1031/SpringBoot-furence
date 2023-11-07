package com.test.kim.repository;

import com.test.kim.dto.Member;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryMemberRepository implements MemberRepository {

    public static Map<String, Member> store = new ConcurrentHashMap<>();

    private static long sequence = 1L;

    @Override
    public void save(Member member) {
        member.setMemberNumber(sequence++);
        store.put(member.getMemberId(), member);
    }

    @Override
    public Member findByN(Long memberNumber) {
        return store.get(memberNumber);
    }

    @Override
    public Member findByMemberId(String memberId) {
        return store.get(memberId);
    }

}
