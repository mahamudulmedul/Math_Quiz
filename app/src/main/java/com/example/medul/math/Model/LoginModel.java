package com.example.medul.math.Model;

import android.support.v7.app.AppCompatActivity;

public class LoginModel extends AppCompatActivity {

    private int id;
    private int password;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

