package com.example.googleloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Coupon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);

        TextView textView = findViewById(R.id.textView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView1 = findViewById(R.id.textView1);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView2 = findViewById(R.id.textView3);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}