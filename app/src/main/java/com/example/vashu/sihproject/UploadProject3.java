package com.example.vashu.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class UploadProject3 extends AppCompatActivity {
    private Spinner statusSpinner;
    private ArrayAdapter<CharSequence>  statusAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_project3);

        statusSpinner = findViewById(R.id.project_status);
        statusAdapter = ArrayAdapter.createFromResource(this, R.array.array_project_status, R.layout.spinner_layout);
        statusAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        statusSpinner.setAdapter(statusAdapter);
    }
}