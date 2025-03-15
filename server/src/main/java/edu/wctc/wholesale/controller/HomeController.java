package edu.wctc.wholesale.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String showHomePage() { return "Welcome to the Home Page"; }
}
