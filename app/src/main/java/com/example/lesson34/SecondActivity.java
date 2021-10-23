package com.example.lesson34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initText();
        inenrGet();
    }

    private void inenrGet() {
        String text = getIntent().getStringExtra("key");
        textView.setText(text);
    }

    private void initText() {
        textView = findViewById(R.id.tv_name);
    }
}