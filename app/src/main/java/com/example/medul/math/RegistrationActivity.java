package com.example.medul.math;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {


    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        // button = (Button) findViewById(R.id.login_button);
        // button.setOnClickListener(this);
    }


    public void onSignUpClick(View view) {
        if (view.getId() == R.id.Bsignupbutton) {
            EditText name = (EditText) findViewById(R.id.TFName);
            EditText email = (EditText) findViewById(R.id.TFemail);
            EditText uname = (EditText) findViewById(R.id.TFuname);
            EditText pass1 = (EditText) findViewById(R.id.TFpass1);
            EditText pass2 = (EditText) findViewById(R.id.TFpass2);


            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String unamestr = uname.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if (!pass1str.equals(pass2str)) {

                Toast pass = Toast.makeText(RegistrationActivity.this, "Password Don't Match !", Toast.LENGTH_SHORT);
                pass.show();
            }
            else {
                Contact c = new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(pass1str);

                helper.insertContact(c);

               Toast temp = Toast.makeText(RegistrationActivity.this, "Data Saved", Toast.LENGTH_SHORT);
                      temp.show();
            }
        }
    }
}
