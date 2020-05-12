package com.trl.microserviced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceDApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDApplication.class, args);
    }

}
