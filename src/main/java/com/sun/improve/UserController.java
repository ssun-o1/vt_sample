package com.sun.improve;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("aaa")
    public String aaa() {
        return "aaaaa";
    }
}
