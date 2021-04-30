package com.mrizkimn.lat2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// Nama     : Moch Rizki Maulana N
// NIM      : 10118012
// Kelas    : IF-1
// Tanggal  : 30-04-2021

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
    }
}