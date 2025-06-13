package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void init()
    {
        log.info("Java app started");
    }

    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot!";
    }

    public String getStatus() {
        return "OK";
    }
}
