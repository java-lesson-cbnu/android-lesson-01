package kr.easw.lesson01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;

@SpringBootApplication
public class Lesson01Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Lesson01Application.class)
                .registerShutdownHook(true)
                .run(args);
    }
}
