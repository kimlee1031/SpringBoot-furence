package com.test.kim.repository;

import com.test.kim.dto.Member;
import org.springframework.stereotype.Component;


@Component
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memNb);

    Member findByMemberName(String memberNm);

}
