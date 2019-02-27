package com.example.medul.math;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn1 = (Button) findViewById(R.id.btnAddition);
        btn2 = (Button) findViewById(R.id.btnSubtraction);
        btn3 = (Button) findViewById(R.id.btnMultiplication);
        btn4 = (Button) findViewById(R.id.btnDivision);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAddition:
                startActivity(new Intent(HomeActivity.this,AddLevelActivity.class));
                break;

            case R.id.btnSubtraction:
                startActivity(new Intent(HomeActivity.this,SubLevel.class));
                break;

            case R.id.btnMultiplication:
                startActivity(new Intent(HomeActivity.this,MultiLevel1.class));
                break;

            case R.id.btnDivision:
                startActivity(new Intent(HomeActivity.this,Division_Level1.class));
                break;

        }

    }


    public void clickExit(View view){
        final AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
        builder.setMessage("Are you sure want to do this?");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                 dialog.cancel();
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

//
//    public void clickExit(View view){
//        moveTaskToBack(true);
//        android.os.Process.killProcess(android.os.Process.myPid());
//        System.exit(1);
//    }

}
