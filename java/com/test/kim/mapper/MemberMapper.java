// UserMapper.java
package com.test.kim.mapper;

import com.test.kim.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MemberMapper {
    List<Member> findMember();
    void insertMember(Member member);
    Member findMemberByMemberId(String memberId);
    Member findMemberByMemberIdAndPassword(String memberId, String password);

}
//mapper