package com.example.medul.math.Model;

import android.support.v7.app.AppCompatActivity;

public class RegistrationModel extends AppCompatActivity {
private int id;
    private String name;

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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(int confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    private int password;
    private int confirmPassword;
}
