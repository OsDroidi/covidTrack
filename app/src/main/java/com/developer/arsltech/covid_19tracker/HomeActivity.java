package com.developer.arsltech.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void cases(View view) {
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void symptoms(View view) {
        Intent intent = new Intent(HomeActivity.this, SymptomsActivity.class);
        startActivity(intent);
    }

    public void prevention(View view) {
        Intent intent = new Intent(HomeActivity.this, PreventionActivity.class);
        startActivity(intent);
    }

    public void faq(View view) {
        Intent intent = new Intent(HomeActivity.this, FaqsActivity.class);
        startActivity(intent);
    }

    public void myths(View view) {
        Intent intent = new Intent(HomeActivity.this, MythsActivity.class);
        startActivity(intent);
    }

    public void what(View view) {
        Intent intent = new Intent(HomeActivity.this, WhatActivity.class);
        startActivity(intent);
    }
}
