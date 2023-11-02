package com.test.kim.service;// MemberServiceImpl.java
import com.test.kim.dto.Member;
import com.test.kim.repository.MemberRepository;
import com.test.kim.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void insertMember(Member member) {
        // 사용자 추가 로직을 여기에 구현
        // 예를 들어, 사용자 저장
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memN) {
        // 사용자 검색 로직을 여기에 구현
        return memberRepository.findById(memN);
    }

    @Override
    public Member findMemberByAll(String username, String password) {
        Member foundMember = memberRepository.findByMemberName(username);

        if (foundMember != null && foundMember.getMemberPwd().equals(password)) {
            // 사용자명(username)와 비밀번호(password)가 일치하는 경우 사용자 반환
            return foundMember;
        } else {
            // 일치하지 않으면 null 반환
            return null;
        }
    }
}
