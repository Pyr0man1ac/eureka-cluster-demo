package org.pyro.eureka.cluster.demo.server.alpha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZYC
 * @date 2021/1/24 21:52
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaClusterDemoServerAlphaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterDemoServerAlphaApplication.class, args);
    }

}
