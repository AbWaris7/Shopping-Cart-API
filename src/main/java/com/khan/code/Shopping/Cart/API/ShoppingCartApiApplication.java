package com.khan.code.Shopping.Cart.API;

import com.khan.code.Shopping.Cart.API.entities.Users;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingCartApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApiApplication.class, args);

		var user = new Users(1L,"Abdul","abdul@gmail.com","122");

	}

}
