package com.example.outeam2.Activity.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

import com.example.outeam2.Activity.Registration.Registration;
import com.example.outeam2.Activity.Main.MainActivity;
import com.example.outeam2.R;
import com.example.outeam2.Utils.Tools;

public class Login extends AppCompatActivity implements View.OnClickListener {
Button login,register;
EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);


        findViewById(R.id.img_header).startAnimation(
                AnimationUtils
                        .loadAnimation(getApplicationContext(), R.anim.header_animate)
        );

        Buttons();

    }

    public void Buttons(){
        login = findViewById(R.id.btn_login);
        register = findViewById(R.id.btn_register);

        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btn_register){

            Tools.open(Login.this,Registration.class);
        }

        else{
            Tools.open(Login.this, MainActivity.class);
        }
    }
}
