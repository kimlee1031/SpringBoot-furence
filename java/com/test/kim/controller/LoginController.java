package com.test.kim.controller;// LoginController.java
import com.test.kim.dto.Member;
import com.test.kim.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.test.kim.repository.MemoryMemberRepository.store;

@Slf4j
@Controller
public class LoginController {
    private final MemberService memberService;

    public LoginController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String main() {
        log.info("현재 저장되어 있는 유저들"+store.toString());
        return ("redirect:/login");
    }


    @GetMapping("/login")
    public String login() {
        log.info("현재 저장되어 있는 유저들"+store.toString());
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(Member member, RedirectAttributes redirectAttributes) {
        System.out.println(member + "=받아온 멤버");
        Member foundMember1 = memberService.findMemberByAll(member.getMemberId(), member.getMemberPwd());
        if (foundMember1 != null) {
            redirectAttributes.addFlashAttribute("message", "로그인에 성공했습니다.");
            return "redirect:/upload"; // 로그인 성공 시 index.html로 리다이렉트
        } else {
            redirectAttributes.addFlashAttribute("message", "로그인에 실패했습니다. 다시 시도하세요.");
            return "redirect:/login";
        }
    }


    @GetMapping("/join")
    public String join() {
        log.info("회원가입으로 이동");
        return "join";
    }

    @PostMapping("/join")
    public String processJoin(Member joinMember) {
        log.info(joinMember+"회원가입 진행 완료");
        memberService.insertMember(joinMember);
        System.out.println(memberService.findMember(1L));
        System.out.println(memberService.findMember(2L));
        System.out.println(memberService.findMember(3L));
        System.out.println(memberService.findMember(4L));
        return "/login";
    }



}
