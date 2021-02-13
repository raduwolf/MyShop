package org.sci.myshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping(value="/")
    public String login(){
        return "login";
    }

    @GetMapping(value="/fff1")
    public String loginh(){

        return "fff1";
    }
    @GetMapping(value="/loginError")
    public String loginE(){
        return "loginError";
    }
   /* @GetMapping(value="/fff1")
    public String loginF(){
        return "fff1";
    }*/
}
