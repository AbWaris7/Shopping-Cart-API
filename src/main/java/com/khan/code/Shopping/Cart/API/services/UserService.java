package com.khan.code.Shopping.Cart.API.services;

import com.khan.code.Shopping.Cart.API.entities.Users;
import com.khan.code.Shopping.Cart.API.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final EntityManager entityManager;

    public void showEntityStates() {
        var user = Users.builder()
                .name("John Doe")
                .email("john.doe@gmail.com")
                .password("password")
                .build();

        if(entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Not Persistent");
        }

    userRepository.save(user);

    }
}
