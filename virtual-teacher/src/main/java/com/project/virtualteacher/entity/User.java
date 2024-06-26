package com.project.virtualteacher.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role_id",
        discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("3")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    @JsonIgnore
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "picture_url")
    private String pictureUrl;

    @Column(name = "date_of_birth")
    private LocalDate dob;

    @ManyToOne()
    @JoinColumn(name = "role_id",insertable=false, updatable=false)
    private Role role;

    @ManyToOne()
    @JoinColumn(name = "requested_role_id")
    private Role requestedRole;

    @Column(name = "blocked")
    private boolean isBlocked;

    @Column(name = "is_verified")
    private boolean isEmailVerified;

    @Column(name = "email_code")
    @JsonIgnore
    private String emailCode;

}


