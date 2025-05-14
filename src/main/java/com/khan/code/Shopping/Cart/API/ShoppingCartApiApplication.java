package com.khan.code.Shopping.Cart.API;

import com.khan.code.Shopping.Cart.API.entities.Address;
import com.khan.code.Shopping.Cart.API.entities.Tag;
import com.khan.code.Shopping.Cart.API.entities.Users;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingCartApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApiApplication.class, args);

		var user = Users.builder()
				.name("John")
				.password("password")
				.email("john@gmail.com")
				.build();


		user.addTag("tag");
		System.out.println(user);

	}

}
