package com.skylar.civilbay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.skylar.civilbay.R.layout.activity_profile;

public class ProfileActivity extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_profile);

        ButterKnife.bind(this);

        signUpButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String userName = userNameEditText.getText().toString();
                Intent intent = new Intent(ProfileActivity.this, SearchActivity.class);
                intent.putExtra("userName", userName);
                startActivity(intent);

                Toast.makeText(ProfileActivity.this, "Sign Up Successful!", Toast.LENGTH_LONG).show();

            }
        });
    }

}

