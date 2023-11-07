package com.test.kim.service;

import com.test.kim.dto.Member;
import com.test.kim.repository.MemberRepository;
import com.test.kim.repository.MemoryMemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Ctest {

    @InjectMocks
    private MemberServiceImpl memberService;

    @Mock
    private MemberRepository memberRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("멤버 찾기")
    public void testInsertMember() throws Exception {
        // 샘플 멤버 제작...
        Member member = new Member( "testuser", "password123", "John Doe");

        // Mock the behavior of the memberRepository
        Mockito.when(memberRepository.findByMemberId("testuser")).thenReturn(null); // Member not found

        // Call the method to be tested
        memberService.insertMember(member);

        // Verify that the save method was called once
        Mockito.verify(memberRepository, Mockito.times(1)).save(member);
    }

    @Test
    @DisplayName("멤버 검색")
    public void testFindMember() {
        // Mock the behavior of the memberRepository
        Member expectedMember = new Member( "testuser", "password123", "John Doe");
        Mockito.when(memberRepository.findByN(1L)).thenReturn(expectedMember);

        // Call the method to be tested
        Member foundMember = memberService.findMember(1L);

        // Verify that the correct member is returned
        assertEquals(expectedMember, foundMember);
    }

    @Test
    @DisplayName("로그인")
    public void testFindMemberByAll() {
        // Mock the behavior of the memberRepository
        Member expectedMember = new Member( "testuser", "password123", "John Doe");
        Mockito.when(memberRepository.findByMemberId("testuser")).thenReturn(expectedMember);

        // Call the method to be tested
        //Member foundMember = memberService.findMemberByAll("testuser", "password123");

        // Verify that the correct member is returned
        //assertEquals(expectedMember, foundMember);

        // Test with incorrect password
        Member foundMember = memberService.findMemberByAll("testuser", "11111111");

        // Verify that null is returned when the password is incorrect
        assertNull(foundMember);
    }
}
