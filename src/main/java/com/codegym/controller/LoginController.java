package com.codegym.controller;

import com.codegym.request.Credential;
import com.codegym.response.User;
import org.dom4j.swing.XMLTableModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class LoginController {
    @GetMapping("/login")
    public ModelAndView showLogin() {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("credential", new Credential());
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute Credential credential) {
        ModelAndView modelAndView = new ModelAndView("dashBoard");
        User user = new User();
        user.setUsername(credential.getUsername());
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
