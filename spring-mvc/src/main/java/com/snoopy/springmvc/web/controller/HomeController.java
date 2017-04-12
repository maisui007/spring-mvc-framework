package com.snoopy.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={"/","/home.action"})
    public String goHome(){
        System.out.println("Brave New World!");

        return "index";
    }
}
