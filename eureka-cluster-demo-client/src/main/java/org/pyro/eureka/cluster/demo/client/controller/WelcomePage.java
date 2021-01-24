package org.pyro.eureka.cluster.demo.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 * @date 2021/1/24 22:09
 */
@RestController
public class WelcomePage {
    
    @GetMapping
    public String welcomePage() {
        return "WELCOME PAGE";
    }
    
}
