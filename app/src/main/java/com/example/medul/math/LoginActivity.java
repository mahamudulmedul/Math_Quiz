package com.example.medul.math;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button button;

    DatabaseHelper db = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = (Button) findViewById(R.id.btnLogin);
    }


    public void onButtonClickLogin(View v){

            EditText a = (EditText)findViewById(R.id.txtUserName);
            String str = a.getText().toString();
            EditText b = (EditText)findViewById(R.id.txtPassword);
            String pass = b.getText().toString();

            String password = db.searchPass(str);
            if (pass.equals(password)){
                Intent i = new Intent(LoginActivity.this,HomeActivity.class);
                i.putExtra("UserName",str);
                startActivity(i);
            }

            else {
                Toast temp = Toast.makeText(LoginActivity.this,"Username & Password Don't Match !" , Toast.LENGTH_SHORT);
                temp.show();
            }


    }

    public void onButtonClickSignUp(View v){
        Intent  i = new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivity(i);
    }

}
