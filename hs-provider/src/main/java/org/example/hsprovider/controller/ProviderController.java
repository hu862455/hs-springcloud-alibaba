package org.example.hsprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: ProviderController
 * @Description:
 * @Author: hushuai
 * @Date 2020/9/13
 */
@RestController
public class ProviderController {

    @GetMapping("/service")
    public String service(){
        return "provider service";
    }
}
