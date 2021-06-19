package ru.i.conditional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConditionalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(ConditionalApplication.class, args);

        SystemProfile profile = context.getBean(SystemProfile.class);
        System.out.println(profile.getProfile());
    }
}