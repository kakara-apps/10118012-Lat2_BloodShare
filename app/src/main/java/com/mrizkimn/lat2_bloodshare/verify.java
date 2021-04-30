package com.mrizkimn.lat2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Nama     : Moch Rizki Maulana N
// NIM      : 10118012
// Kelas    : IF-1
// Tanggal  : 28-04-2021

public class verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        getSupportActionBar().hide();

        Button btn = findViewById(R.id.btn_verify_send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(verify.this, Home.class);
                startActivity(i);
                finish();
            }
        });
    }
}