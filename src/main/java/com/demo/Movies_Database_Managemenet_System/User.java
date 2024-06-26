package com.demo.Movies_Database_Managemenet_System;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private int userId;

    @Column(name = "UserName", length = 10, nullable = false, unique = true)
    private String userName;

    @Column(name = "Email", length = 40, nullable = false, unique = true)
    private String email;

    @Column(name = "PhoNo", length = 10, nullable = false, unique = true)
    private String phoneNumber;

    // Constructors, Getters, and Setters
    

    public User(int userId, String userName, String email, String phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }
}
