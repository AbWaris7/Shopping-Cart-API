package com.khan.code.Shopping.Cart.API;

import com.khan.code.Shopping.Cart.API.entities.Users;
import com.khan.code.Shopping.Cart.API.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ShoppingCartApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApiApplication.class, args);

		ApplicationContext context = SpringApplication.run(ShoppingCartApiApplication.class, args);
		var repository = context.getBean(UserRepository.class);

		var user = Users.builder()
				.name("John")
				.email("john@gmail.com")
				.password("password")
				.build();
		repository.save(user);




	}

}
