package com.ktill.queuesaber;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class queuesaberApplication {

    @Value("${fileLocation}")
    private String fileLocation;

    public static void main(String[] args){
        SpringApplication.run(queuesaberApplication.class, args);
    }

    @Bean
    public String fileLocation(){
        return this.fileLocation;
    }
}
