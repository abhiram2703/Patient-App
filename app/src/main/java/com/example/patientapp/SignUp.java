package com.example.patientapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {
    EditText re1,re2,re3,re4,re5,re6,re7,re8;
    AppCompatButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        rb1=(AppCompatButton) findViewById(R.id.regbtn2);
        rb2=(AppCompatButton) findViewById(R.id.gotologbtn);
        re1=(EditText) findViewById(R.id.regname);
        re2=(EditText) findViewById(R.id.regage);
        re3=(EditText) findViewById(R.id.reghname);
       
        re5=(EditText) findViewById(R.id.regmob);
        re6=(EditText) findViewById(R.id.reguname);
        re7=(EditText) findViewById(R.id.regpass);
        re8=(EditText) findViewById(R.id.regcpass);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String RegPass=re7.getText().toString();
                String RegCpass=re8.getText().toString();
                if (RegPass.equals(RegCpass))
                    Toast.makeText(getApplicationContext(),"Action Successfull",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"Passwords dont match",Toast.LENGTH_LONG).show();

            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(back);
            }
        });

    }
}