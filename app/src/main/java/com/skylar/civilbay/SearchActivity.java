package com.skylar.civilbay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {
    private TextView profileTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        profileTextView = (TextView) findViewById(R.id.profileTextView);

        Intent intent = getIntent();
        String profile = intent.getStringExtra("profile");
        profileTextView.setText("Welcome: " + profile);
    }
}