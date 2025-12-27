package com.example.demok8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoK8sApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoK8sApplication.class);
        application.setWebApplicationType(org.springframework.boot.WebApplicationType.SERVLET);
        application.run(args);
    }

}
