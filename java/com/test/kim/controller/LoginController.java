package com.test.kim.controller;// LoginController.java
import com.test.kim.dto.Member;
import com.test.kim.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    private final MemberService memberService;

    public LoginController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // 로그인 페이지 (login.html)를 반환
    }

    @PostMapping("/login")
    public String processLogin(Member member, RedirectAttributes redirectAttributes) {
        // 여기에 사용자 로그인 처리 로직을 구현
        Member foundMember = memberService.findMemberByAll(member.getMemberId(), member.getMemberPwd());

        if (foundMember != null) {
            // 사용자 검증 및 로그인 성공
            // 세션 또는 쿠키를 사용하여 사용자 정보를 저장할 수도 있음
            redirectAttributes.addFlashAttribute("message", "로그인에 성공했습니다.");
            return "redirect:/index.html"; // 로그인 성공 시 index.html로 리다이렉트
        } else {
            // 로그인 실패 시 다시 로그인 페이지로 리다이렉트
            redirectAttributes.addFlashAttribute("message", "로그인에 실패했습니다. 다시 시도하세요.");
            return "redirect:/login";
        }
    }
}
