package com.khan.code.Shopping.Cart.API.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.userdetails.User;

import java.time.LocalDate;

@Builder
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "profiles")
public class Profile {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bio")
    private String bio;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "loyalty_points")
    private Integer loyaltyPoints;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    @MapsId
    @ToString.Exclude
    private Users user;
}
