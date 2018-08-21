package com.example.felix_its.myapk.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.felix_its.myapk.R;

public class MainActivity extends AppCompatActivity {
    SeekBar seekbar;
    EditText edtname,edtphone,edtaddress;
    Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = findViewById(R.id.seekbar);
        edtaddress = findViewById(R.id.edtaddress);
        edtname = findViewById(R.id.edtname);
        edtphone = findViewById(R.id.edtphone);


        edtname.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    if(TextUtils.isEmpty(edtname.getText())){
                        edtname.setError("Required");
                        edtname.requestFocus();
                        return;
                    }
                    seekbar.setProgress(2);
                }
            }
        });
        edtphone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    if (TextUtils.isEmpty(edtphone.getText())){
                        edtphone.setError("Required");
                        return;
                    }
                    seekbar.setProgress(3);
                }
            }
        });


        btnnext = findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Welcome to the menu",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });

    }
}
