package com.Movie.IMDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// It basically start the springboot and select all the bean and store it into the memory
// and run and see where to start the bean.

@SpringBootApplication // This notation @ before springboot is called the bean
public class ImdbApplication {

    public static void main(String[] args) {
        // So this will run the complete pacakge rating
        SpringApplication.run(ImdbApplication.class, args);
    }
}

// MODEL=>REPOSITORY=>SERVICE=>CONTROLLER
