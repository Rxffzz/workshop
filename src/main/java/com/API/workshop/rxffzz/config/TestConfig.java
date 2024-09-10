package com.API.workshop.rxffzz.config;

import java.util.Arrays;

import com.API.workshop.rxffzz.entities.User;
import com.API.workshop.rxffzz.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "123456", "988888888");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "123456", "977777777");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}