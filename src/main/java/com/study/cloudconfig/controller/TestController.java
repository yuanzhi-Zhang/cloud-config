package com.study.cloudconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 张远志
 * @Date: 2020/4/26 13:48
 */

@RestController
@RequestMapping("config/")
public class TestController {

    @Value("${form}")
    String name;

    @GetMapping("name")
    public String getName(){
        return name;
    }

}
