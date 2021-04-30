package com.mrizkimn.lat2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

// Nama     : Moch Rizki Maulana N
// NIM      : 10118012
// Kelas    : IF-1
// Tanggal  : 26-04-2021

public class Registrasi extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        getSupportActionBar().hide();

        ImageButton img_btn_back = findViewById(R.id.register_imb_panah);
        img_btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registrasi.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
    public void register(View view){
        Intent intent = new Intent(this, AlmostThere.class );
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Please Verify", Toast.LENGTH_SHORT).show();
        finish();

    }
}