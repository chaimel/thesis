package com.example.outeam2.Activity.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.outeam2.R;

public class Registration extends AppCompatActivity implements View.OnClickListener {
    EditText firstname,lastname,organization,contactnumber,email,username,password;
    TextView organizer,facilitator;
    Button register;

    String userType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        organization = findViewById(R.id.organization);
        contactnumber = findViewById(R.id.contactnumber);
        email = findViewById(R.id.emailaddress);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        organizer = findViewById(R.id.organizer);
        facilitator = findViewById(R.id.facilitator);
        register = findViewById(R.id.btn_register);


        Intent intent = getIntent();
        organizer.setOnClickListener(this);
        facilitator.setOnClickListener(this);
        register.setOnClickListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Registration");

        Default();
    }

    public void Default(){
        int activeColor = getResources().getColor(R.color.colorDarkGreen);
        int deactiveColor =  getResources().getColor(R.color.colorGreen);
        organizer.setBackgroundColor(activeColor);
        facilitator.setBackgroundColor(deactiveColor);
        organization.setVisibility(View.VISIBLE);
        userType = "Organizer";
    }

    @Override
    public void onClick(View v) {
        int activeColor = getResources().getColor(R.color.colorDarkGreen);
        int deactiveColor =  getResources().getColor(R.color.colorGreen);
        switch (v.getId()){
            case R.id.facilitator:
                userType = "Facilitator";
                ((TextView)v).setBackgroundColor(activeColor);
                organizer.setBackgroundColor(deactiveColor);
                organization.setVisibility(View.GONE);
                break;
            case R.id.organizer:
                userType = "Organizer";
                ((TextView)v).setBackgroundColor(activeColor);
                facilitator.setBackgroundColor(deactiveColor);
                organization.setVisibility(View.VISIBLE);
                break;
            case R.id.btn_register:
                if (userType == "Organizer") {

                    Toast.makeText(this,"YAHYAH",Toast.LENGTH_SHORT).show();
                }
                else if(userType == "Facilitator"){

                    Toast.makeText(this,"YEEAH",Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
}
