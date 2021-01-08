package com.skylar.civilbay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;

public class ProfileActivity extends AppCompatActivity {


    //    Bind user name field
    @BindView(R.id.userName)
    EditText userName;

    //   Bind User age
    @BindView(R.id.password)
    EditText age;

    //   Bind User occupation
    @BindView(R.id.password)
    EditText occupation;

    //   Bind User email
    @BindView(R.id.password)
    EditText email;

    //   Bind User skills
    @BindView(R.id.password)
    EditText skills;

    //   Bind User location
    @BindView(R.id.password)
    EditText location;

    //   Bind User password
    @BindView(R.id.password)
    EditText password;

    //    Do the same for sign Up button
    @BindView(R.id.signUpButton)
    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}