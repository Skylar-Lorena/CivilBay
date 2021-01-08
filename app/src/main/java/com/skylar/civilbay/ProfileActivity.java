package com.skylar.civilbay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {


    //    Bind user name field
    @BindView(R.id.userName)
    EditText userName;

    //   Bind User age
    @BindView(R.id.password)
    EditText password;

    //   Bind User occupation
    @BindView(R.id.password)
    EditText password;

    //   Bind User email
    @BindView(R.id.password)
    EditText password;

    //   Bind User skills
    @BindView(R.id.password)
    EditText password;

    //   Bind User location
    @BindView(R.id.password)
    EditText password;

    //   Bind User password
    @BindView(R.id.password)
    EditText password;

    //    Do the same for sign Up button
    @BindView(R.id.signUpButton)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}