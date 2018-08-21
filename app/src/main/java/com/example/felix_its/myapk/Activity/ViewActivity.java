package com.example.felix_its.myapk.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.felix_its.myapk.R;

public class ViewActivity extends AppCompatActivity {
    RecyclerView review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        review = findViewById(R.id.review);
    }
}
