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

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.pntuname);
        ed2=(EditText) findViewById(R.id.pntpass);
        bt1=(AppCompatButton) findViewById(R.id.logbtn);
        bt2=(AppCompatButton) findViewById(R.id.regbtn);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),SignUp.class);
                startActivity(in);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String getUsername=ed1.getText().toString();
               String getPassword=ed2.getText().toString();
               Toast.makeText(getApplicationContext(),getUsername+getPassword,Toast.LENGTH_LONG).show();

            }
        });


    }
}