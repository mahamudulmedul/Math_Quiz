package com.example.medul.math.Model;

import android.support.v7.app.AppCompatActivity;

public class EnterScreenModel extends AppCompatActivity {
private  String enter;
    private String login;

    public String getEnter() {
        return enter;
    }

    public void setEnter(String enter) {
        this.enter = enter;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSignUp() {
        return signUp;
    }

    public void setSignUp(String signUp) {
        this.signUp = signUp;
    }

    private String signUp;
}
