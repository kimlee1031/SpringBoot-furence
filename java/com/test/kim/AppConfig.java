package com.test.kim;

import com.test.kim.repository.MemberRepository;
import com.test.kim.repository.MemoryMemberRepository;
import com.test.kim.service.MemberService;
import com.test.kim.service.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

}
