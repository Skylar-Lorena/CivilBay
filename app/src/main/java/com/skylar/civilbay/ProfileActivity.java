package com.skylar.civilbay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.skylar.civilbay.R.layout.activity_profile;

public class ProfileActivity extends AppCompatActivity implements OnClickListener {

    //   Bind user name field
    @BindView(R.id.userNameEditText)
    EditText userNameEditText;

    //   Bind User occupation
    @BindView(R.id.occupation)
    EditText occupation;

    //   Bind User email
    @BindView(R.id.email)
    EditText email;

    //   Bind User password
    @BindView(R.id.password)
    EditText password;

    //    Do the same for sign Up button
    @BindView(R.id.signUpButton)
    Button signUpButton;

    @BindView(R.id.loginButton)
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_profile);

        ButterKnife.bind(this);

        signUpButton.setOnClickListener(this);
        loginButton.setOnClickListener(this);
    }
            @Override
            public void onClick (View v) {
                if (v == loginButton) {
                    Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);

                    startActivity(intent);

                }
               else if (v == signUpButton) {
                    String userName = userNameEditText.getText().toString();
                    Intent intent = new Intent(ProfileActivity.this, SearchActivity.class);
                    intent.putExtra("userName", userName);
                    startActivity(intent);

                    Toast.makeText(ProfileActivity.this, "Sign Up Successful!", Toast.LENGTH_LONG).show();
                }
            };
}

