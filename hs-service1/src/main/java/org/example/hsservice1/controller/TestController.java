package org.example.hsservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: TestController
 * @Description:
 * @Author: hushuai
 * @Date 2020/9/13
 */
@Controller
public class TestController {
    @Value("${Drive.Info}")
    private String config;

    @GetMapping("/getConfig1")
    @ResponseBody
    public String getConfig1() {
        return config;
    }
}
