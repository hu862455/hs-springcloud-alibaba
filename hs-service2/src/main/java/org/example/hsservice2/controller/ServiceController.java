package org.example.hsservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: ServiceController
 * @Description:
 * @Author: hushuai
 * @Date 2020/10/29
 */
@RestController
public class ServiceController {
    @GetMapping("/service")
    public String service(){
        return "service2";
    }
}
