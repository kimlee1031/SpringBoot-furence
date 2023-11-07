package com.test.kim;

import com.test.kim.repository.MemberRepository;
import com.test.kim.repository.MemoryMemberRepository;

import static com.test.kim.repository.MemoryMemberRepository.store;

public class Apptest {
    MemberRepository memberRepository;

    public Apptest(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public static void main(String[] args) {


        System.out.println(store.values());
    }
}
