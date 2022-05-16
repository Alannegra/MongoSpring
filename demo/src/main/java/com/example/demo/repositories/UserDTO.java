package com.example.demo.repositories;

import com.example.demo.model.User;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigInteger;


@Data
    public class UserDTO {
        private BigInteger id;
        private String email;
        private String password;
        private String fullName;

        public UserDTO(BigInteger id, String email, String password, String fullName) {
            this.id = id;
            this.email = email;
            this.password = password;
            this.fullName = fullName;
        }

        public UserDTO(User u) {
            this.id = u.getId();
            this.email = u.getEmail();
            this.password = u.getPassword();
            this.fullName = u.getFullName();
        }
    }

