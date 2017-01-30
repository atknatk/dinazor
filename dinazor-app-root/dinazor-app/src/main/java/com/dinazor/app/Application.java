package com.dinazor.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by atakan on 30.01.2017.
 */


@SpringBootApplication(scanBasePackages = {"com.dinazor.*"})
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
