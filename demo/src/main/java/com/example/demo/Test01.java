package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test01 {
    @RequestMapping("/start")
    public String startPage() {
        return "testpage";
    }
}
