package com.khan.code.Shopping.Cart.API.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Entity
@Getter
@Setter
@ToString

@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(mappedBy = "user")
    @Builder.Default
    private List<Address> addressList = new ArrayList<Address>();

    public void addAddress(Address address) {
        addressList.add(address);
        address.setUser(this);
    }

    public void removeAddress(Address address) {
        addressList.remove(address);
        address.setUser(null);
    }


}
