package com.example.felix_its.myapk.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.felix_its.myapk.R;

public class AddActivity extends AppCompatActivity {
    EditText edtename,edteaddress,edtephone;
    Button btnenext,btneview,btneupdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        edtename = findViewById(R.id.edtename);
        edteaddress = findViewById(R.id.edteaddress);
        edtephone = findViewById(R.id.edtephone);

        btnenext = findViewById(R.id.btnenext);
        btneview = findViewById(R.id.btneview);
        btneupdate = findViewById(R.id.btneupdate);


        btneview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddActivity.this,ViewActivity.class);
                startActivity(intent);
            }
        });


        btneupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddActivity.this,UpdateActivity.class);
                startActivity(intent);

            }
        });



        btnenext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Data added successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
