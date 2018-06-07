package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@EnableAutoConfiguration
@RestController
public class HelloWorldController {

    @RequestMapping(value="getMap")
    public Map<String, Object> getMap(){
        Map<String, Object> stringObjectHashMap = new HashMap<String, Object>();
        stringObjectHashMap.put("a","a");
        stringObjectHashMap.put("b","b");
        return stringObjectHashMap;

    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class,args);
    }
}
