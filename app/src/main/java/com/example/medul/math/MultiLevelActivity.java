
package com.example.medul.math;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultiLevelActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addlevel);
        btn = (Button) findViewById(R.id.btnAddLvel1);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MultiLevelActivity.this,MultiLevel1.class));
    }
}
