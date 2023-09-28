package com.example.vashu.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class UploadProject1 extends AppCompatActivity {
    private String selected_type, selected_status;
    private TextView no_type, no_status;
    private Spinner typeSpinner;
    private ArrayAdapter<CharSequence> typeAdapter, statusAdapter;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_project1);

        button = findViewById(R.id.upage_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUploadPage2Activity();
            }
        });

        typeSpinner = findViewById(R.id.project_type);
        typeAdapter = ArrayAdapter.createFromResource(this, R.array.array_project_type, R.layout.spinner_layout);
        typeAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        typeSpinner.setAdapter(typeAdapter);


    }
    public void openUploadPage2Activity(){
        Intent intent = new Intent(this, UploadProject2.class);
        startActivity(intent);
    }
}