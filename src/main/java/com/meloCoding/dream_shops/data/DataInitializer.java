package com.meloCoding.dream_shops.data;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.meloCoding.dream_shops.models.User;
import com.meloCoding.dream_shops.services.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataInitializer implements ApplicationListener<ApplicationReadyEvent> {
    private final UserRepository userRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        createUsers();
    }

    private void createUsers() {
        if (userRepository.count() > 0) {
            return;
        }

        for (int i = 1; i <= 5; i++) {
            User user = new User();
            user.setFirstName("User");
            user.setLastName("" + i);
            user.setEmail("user" + i + "@example.com");
            user.setPassword("123456");
            userRepository.save(user);
        }

        System.out.println("5 default users created successfully.");
    }
}
