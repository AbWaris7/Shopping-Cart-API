package com.khan.code.Shopping.Cart.API.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;


}
