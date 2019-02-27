package com.example.medul.math.Model;

import android.support.v7.app.AppCompatActivity;

public class ComponentModel extends AppCompatActivity {
    private String addition;
    private String substract;
    private String division;

    public String getSubstract() {
        return substract;
    }

    public void setSubstract(String substract) {
        this.substract = substract;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public String getMultiply() {
        return multiply;
    }

    public void setMultiply(String multiply) {
        this.multiply = multiply;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    private String multiply;
}
