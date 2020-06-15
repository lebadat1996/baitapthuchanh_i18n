package com.codegym.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DashBoardController {
    @GetMapping("dashBoard")
    public String login() {
        return "dashBoard";
    }
}
