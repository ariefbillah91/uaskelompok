package com.uaskelompok.ujian;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.uaskelompok.R;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        TextView username = (TextView) findViewById(R.id.username_input);
        TextView password = (TextView) findViewById(R.id.password_input);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESFULL",Toast.LENGTH_SHORT).show();
                    Intent BukaActSatu = new Intent(getApplicationContext(), MainMenu.class);
                    startActivity(BukaActSatu);
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}