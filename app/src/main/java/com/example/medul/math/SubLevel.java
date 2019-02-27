package com.example.medul.math;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubLevel extends AppCompatActivity implements View.OnClickListener{

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_level);
        btn = (Button) findViewById(R.id.btnSubLvel1);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(SubLevel.this,SubLevel1.class));
    }
}


