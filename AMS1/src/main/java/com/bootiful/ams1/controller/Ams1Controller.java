package com.bootiful.ams1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ams1")
public class Ams1Controller {

    @GetMapping("/hello")
    public String send() {
        return "hello AMS1...";
    }

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }

    @GetMapping(value = "/open")
    public String echo1() {
        return "feign 远程调用成功了" ;
    }
}
