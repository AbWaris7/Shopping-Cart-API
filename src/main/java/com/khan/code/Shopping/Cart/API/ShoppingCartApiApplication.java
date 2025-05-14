package com.khan.code.Shopping.Cart.API;

import com.khan.code.Shopping.Cart.API.entities.Address;
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

		var address = Address.builder()
				.street("street")
				.city("city")
				.state("state")
				.zip("zip")
				.build();

		user.addAddress(address);
		System.out.println(user);

	}

}
