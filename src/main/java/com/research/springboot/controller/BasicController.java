package com.research.springboot.controller;

import com.research.springboot.constant.Constant;
import com.research.springboot.constant.PathConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping(PathConstant.HELLO)
    public String hello() {
        return Constant.HELLO;
    }
}
