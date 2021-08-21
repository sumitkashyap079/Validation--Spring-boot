package com.validation.DtoValidation.entity;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    // user name should not be null or empty
    // user name should have at least 2 characters

   // @NotNull
    // @NotBlank
    @Column(name = "name", nullable = false)
    @NotEmpty//property is not null or empty, can be applied to string ,Collection ,Map, Array;
   @Size(min = 2,max=8,message = "User name should have at least 2 characters and Maximum 8 Charaters")
    private String name;

    // email should be a valid email format
    // email should not be null or empty
    //@NotEmpty//property is not null or empty, can be applied to string ,Collection ,Map, Array;


    @NotBlank// Can be applied only text value and validation that the property;
    @Email
    private String email;

    // password should not be null or empty
    // password should have at least 8 characters

    //@NotBlank
    @NotEmpty
   // @NotNull
    @Size(min = 8,max=10,message = "password should have at least 8 charactor and max 10 Charactor")
    private String password;

    public User() {
    }

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
//    String name = null;
//@NotNull: false
//@NotEmpty: false
//@NotBlank: false
//
//        String name = "";
//@NotNull: true
//@NotEmpty: false
//@NotBlank: false
//
//        String name = " ";
//@NotNull: true
//@NotEmpty: true
//@NotBlank: false
//
//        String name = "Great answer!";
//@NotNull: true
//@NotEmpty: true
//@NotBlank: true