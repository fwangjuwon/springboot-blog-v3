package site.metacoding.blogv3.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import site.metacoding.blogv3.web.dto.user.JoinReqDto;

@Controller
public class UserController {

    @GetMapping("/login-form")
    public String loginForm() {
        return "user/loginForm";
    }

    @GetMapping("/join-form")
    public String joinForm() {
        return "user/joinForm";
    }

    @PostMapping("/join")
    public String join(JoinReqDto joinReqDto) {

        return "redirect:/login-form";
    }
}
