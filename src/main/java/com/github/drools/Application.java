package com.github.drools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : hongqiangren.
 * @since: 2018/8/7 23:27
 */
@SpringBootApplication
public class Application {

    static {
        System.setProperty("drools.dateformat", "yyyy-MM-dd HH:mm:ss");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
