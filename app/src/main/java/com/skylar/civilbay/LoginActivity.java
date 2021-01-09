package com.skylar.civilbay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.emailAddress)
    EditText emailAddress;

    @BindView(R.id.password)
    EditText password;

    @BindView(R.id.signInButton)
    Button signInButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        signInButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            Intent intent = new Intent(LoginActivity.this, SearchActivity.class);

            startActivity(intent);
            Toast.makeText(LoginActivity.this, "Welcome to Civil Bay!", Toast.LENGTH_LONG).show();

        }
    }


