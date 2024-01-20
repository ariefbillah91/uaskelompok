package com.uaskelompok.ujian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uaskelompok.R;

public class logout extends AppCompatActivity {
    Button logoutbtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        logoutbtn = (Button) findViewById(R.id.logoutbtn);

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaAct1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(BukaAct1);
            }
        });
    }
}