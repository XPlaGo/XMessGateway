package com.xplago.xmessgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@CrossOrigin("*")
public class XMessGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(XMessGatewayApplication.class, args);
    }
}

