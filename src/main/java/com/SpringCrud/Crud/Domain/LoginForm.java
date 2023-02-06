package com.SpringCrud.Crud.Domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Data
@ToString
@Table(name = "login")

public class LoginForm {
@Id
@GeneratedValue(
        strategy = GenerationType.IDENTITY
)
  long id;
    public static String password;
    public static String username;
    //private String password;

    public LoginForm() {
        super();
    }

    public LoginForm(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public LoginForm setId(long id) {
        this.id = id;
        return this;
    }

    public static String getPassword() {
        return password;
    }

    public LoginForm setPassword(String password) {
        this.password = password;
        return this;
    }

    public static String getUsername() {
        return username;
    }

    public LoginForm setUsername(String username) {
        this.username = username;
        return this;
    }
}




