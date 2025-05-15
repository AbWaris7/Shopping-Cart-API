package com.khan.code.Shopping.Cart.API.repositories;


import com.khan.code.Shopping.Cart.API.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer> {
}
