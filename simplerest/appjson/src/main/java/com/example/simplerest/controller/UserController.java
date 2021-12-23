package com.example.simplerest.controller;


import com.example.simplerest.repo.UserRepository;
import com.example.simplerest.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SecurityService securityService;



    @Autowired
    private BCryptPasswordEncoder encoder;

    @GetMapping("/error")
    public String handleError(HttpServletRequest request) {
        return "/error";
    }

    @RequestMapping("/showRegistration")
    public String showRegistrationPage() {

        return "login/register";
    }

    //@RequestMapping({"/", "/index", "/home"})
    @RequestMapping("/main")
    public String showMainPage() {

        return "/main";
    }



    @GetMapping(path = "/showLogin")
    public String showLoginPage(ModelMap modelMap) {

        return "login/login";
    }

    @PostMapping(value = "/login")
    public RedirectView login(@RequestParam("email") String email, @RequestParam("password") String password
            , ModelMap modelMap, RedirectAttributes rm) {

        RedirectView redirectView = new RedirectView("/showLogin", true);
        boolean loginResponse = securityService.login(email, password);

        if (loginResponse) {
            redirectView.setUrl("/main");

        } else {

            //redirectView.addStaticAttribute("msg", "Invalid user name or password");
            rm.addFlashAttribute("msg", "Invalid user name or password");

        }

        return redirectView;

    }


    @PostMapping(value = "/logout")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "/";
    }


}
