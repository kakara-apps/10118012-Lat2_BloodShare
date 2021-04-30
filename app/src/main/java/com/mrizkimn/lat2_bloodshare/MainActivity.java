package com.mrizkimn.lat2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


// Nama     : Moch Rizki Maulana N
// NIM      : 10118012
// Kelas    : IF-1
// Tanggal  : 26-04-2021

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        button = findViewById(R.id.main_btn_register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Registrasi.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void login(View view){
        Intent i = new Intent(this, Home.class);
        startActivity(i);
        finish();
    }
}