package com.bootiful.ams2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ams2")
public class TestController {

    @GetMapping("/hello")
    public String send() {
        return "hello AMS2...";
    }
}
