package com.jjl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;

import javax.sql.DataSource;

@SpringBootApplication
public class Springboot04DataApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04DataApplication.class, args);
    }

}
