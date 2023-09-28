package com.example.vashu.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UploadProject2 extends AppCompatActivity {
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_project2);

        button = findViewById(R.id.upage_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUploadPage3Activity();
            }
        });
    }
    public void openUploadPage3Activity(){
        Intent intent = new Intent(this, UploadProject3.class);
        startActivity(intent);
    }
}