package com.hsnthn;

import com.hsnthn.service.ProverbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    @Autowired
    private ProverbService proverbService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
