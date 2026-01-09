package com.taskflow.taskmanager.config;

import com.taskflow.taskmanager.domain.User;
import com.taskflow.taskmanager.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            if (userRepository.count() == 0) {
                User user = new User("Barış", "baris@test.com", "123456");

                userRepository.save(user);
            }
        };
    }
}
