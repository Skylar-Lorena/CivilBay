package com.skylar.civilbay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.joinButton)
    Button joinButton;

    @BindView(R.id.loginButton)
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);

                startActivity(intent);
                Toast.makeText(MainActivity.this, "Welcome to Civil Bay!", Toast.LENGTH_LONG).show();

            }
        });

      loginButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);

            startActivity(intent);
            Toast.makeText(MainActivity.this, "Log in to continue..", Toast.LENGTH_LONG).show();

        }
    });
}
}
