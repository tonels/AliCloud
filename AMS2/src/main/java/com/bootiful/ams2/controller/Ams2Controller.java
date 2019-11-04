package com.bootiful.ams2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/ams2")
public class Ams2Controller {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @Value("${spring.application.name}")
    private String appName;
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/hello")
    public String send() {
        return "hello AMS2...";
    }

    @GetMapping("/echo/app-name")
    public String echoAppName(){

        //使用 LoadBalanceClient 和 RestTemolate 结合的方式来访问
        ServiceInstance serviceInstance = loadBalancerClient.choose("AMS1");
        String url = String.format("http://%s:%s/ams1/echo/%s",serviceInstance.getHost(),serviceInstance.getPort(),appName);
        System.out.println("request url:"+url);
        return restTemplate.getForObject(url,String.class);
    }


}
