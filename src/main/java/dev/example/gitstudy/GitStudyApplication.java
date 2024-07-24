package dev.example.gitstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitStudyApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("");
        System.out.println("Spring Boot");
        SpringApplication.run(GitStudyApplication.class, args);
    }

}
