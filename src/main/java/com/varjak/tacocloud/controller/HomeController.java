package com.varjak.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author XHJ
 */
@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
