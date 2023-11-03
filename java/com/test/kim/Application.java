package com.test.kim;

import com.test.kim.dto.Member;
import com.test.kim.repository.MemberRepository;
import com.test.kim.repository.MemoryMemberRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.test.kim.repository.MemoryMemberRepository.store;

@SpringBootApplication
@MapperScan(basePackages = "com.test.kim.mapper") // Mapper 인터페이스가 있는 패키지 경로로 변경
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        /*MemberRepository memberRepository = new MemoryMemberRepository();


        Member member = new Member(1L, "kim", "kim", "kim");
        memberRepository.save(member);*/

        MemberRepository memberRepository = new MemoryMemberRepository();
        Member member = new Member(1L, "kim", "kim", "kim");
        memberRepository.save(member);
        //System.out.println(store);

    }
    //
}

