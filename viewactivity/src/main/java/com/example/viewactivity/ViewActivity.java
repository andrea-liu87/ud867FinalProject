package com.example.viewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
    private TextView textView;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        if (getIntent().getStringExtra("JOKE") != null){
            text = getIntent().getStringExtra("JOKE");
        } else { text = "No jokes";}

        textView = findViewById(R.id.textView);
        textView.setText(text);
    }
}
