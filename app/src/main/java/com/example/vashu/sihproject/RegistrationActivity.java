package com.example.vashu.sihproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    Button button;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

       button = findViewById(R.id.signup_btn);
       login = findViewById(R.id.sign_In);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openHomeActivity();
           }
       });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
            }
        });
    }

    public void openHomeActivity(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}