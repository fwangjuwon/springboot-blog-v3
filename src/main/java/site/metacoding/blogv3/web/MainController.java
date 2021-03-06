package site.metacoding.blogv3.web;

import java.security.Principal;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.blogv3.config.auth.LoginUser;

@RequiredArgsConstructor
@Controller
public class MainController {

    @GetMapping({"/"})
    public String main(){
        return "main";
    }
}
