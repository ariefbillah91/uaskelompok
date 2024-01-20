package com.uaskelompok.ujian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.uaskelompok.R;

public class MainMenu extends AppCompatActivity {
    Button btnlinklist, btnlinklist1, btnlinklist2, btnlinklist3, btnlinklist4, btnlinklist5;
    ImageView btnlogout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        btnlinklist = (Button) findViewById(R.id.btnlinklist);
        btnlinklist1 = (Button) findViewById(R.id.btnlinklist1);
        btnlinklist2 = (Button) findViewById(R.id.btnlinklist2);
        btnlinklist3 = (Button) findViewById(R.id.btnlinklist3);
        btnlinklist4 = (Button) findViewById(R.id.btnlinklist4);
        btnlinklist5 = (Button) findViewById(R.id.btnlinklist5);
        btnlogout = (ImageView) findViewById(R.id.btnlogout);


        btnlinklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaAct1 = new Intent(getApplicationContext(), list_book.class);
                startActivity(BukaAct1);
            }
        });
        btnlinklist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaAct1 = new Intent(getApplicationContext(), list_book.class);
                startActivity(BukaAct1);
            }
        });
        btnlinklist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaAct1 = new Intent(getApplicationContext(), list_book.class);
                startActivity(BukaAct1);
            }
        });
        btnlinklist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaAct1 = new Intent(getApplicationContext(), list_book.class);
                startActivity(BukaAct1);
            }
        });
        btnlinklist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaAct1 = new Intent(getApplicationContext(), list_book.class);
                startActivity(BukaAct1);
            }
        });
        btnlinklist5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaAct1 = new Intent(getApplicationContext(), list_book.class);
                startActivity(BukaAct1);
            }
        });
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaAct2 = new Intent(getApplicationContext(), logout.class);
                startActivity(BukaAct2);
            }
        });
    }
}