package com.example.demo.model;

import com.example.demo.repositories.UserDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.math.BigInteger;


@Data
@Document(collection = "user")
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger _id;
    private int myId;
    private String email;
    private String password;
    private String fullName;

    public User(int id, String email, String password, String fullName) {
        this.myId = id;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
    }

    public User(UserDTO userDto) {
        this.myId = userDto.getId();
        this.email = userDto.getEmail();
        this.password = userDto.getPassword();
        this.fullName = userDto.getFullName();
    }

    public User() {

    }
}
