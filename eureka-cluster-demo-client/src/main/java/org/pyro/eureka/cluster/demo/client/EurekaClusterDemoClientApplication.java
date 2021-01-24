package org.pyro.eureka.cluster.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZYC
 * @date 2021/1/24 22:03
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClusterDemoClientApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterDemoClientApplication.class, args);
    }
    
}
