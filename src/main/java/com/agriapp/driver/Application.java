//Package
package com.agriapp.driver;

//Libraries
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author MARC
 * @version 1.0.0
 * @since 11/27/2021
 */

@SpringBootApplication
public class Application {

    /**
     * Method to start this application
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner start(){
        return args -> {
            System.out.println("Welcome");
        };
    }
}
