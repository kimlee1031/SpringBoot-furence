package com.test.kim.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    @GetMapping("/error400")
    public String Error400(HttpServletRequest request) {
        return "/join";
    }
}
