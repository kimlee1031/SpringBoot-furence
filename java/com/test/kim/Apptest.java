package com.test.kim;

import com.test.kim.repository.MemberRepository;
import com.test.kim.repository.MemoryMemberRepository;

import static com.test.kim.repository.MemoryMemberRepository.store;

public class Apptest {
    public static void main(String[] args) {
        MemberRepository memberRepository = new MemoryMemberRepository();

        System.out.println(store);
    }
}
