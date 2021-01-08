package com.skylar.civilbay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.skylar.civilbay.R.layout.activity_profile;

public class ProfileActivity extends AppCompatActivity {


    //    Bind user name field
    @BindView(R.id.userName)
    EditText userName;

    //   Bind User age
    @BindView(R.id.age)
    EditText age;

    //   Bind User occupation
    @BindView(R.id.occupation)
    EditText occupation;

    //   Bind User email
    @BindView(R.id.email)
    EditText email;

    //   Bind User skills
    @BindView(R.id.skills)
    EditText skills;

    //   Bind User location
    @BindView(R.id.location)
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
        setContentView(activity_profile);

        ButterKnife.bind(this);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, SearchActivity.class);

                startActivity(intent);

//        Toast.makeText(this,"Username:"+userName + ", age:"+age +" ,email:"+email+ ",  occupation:"+occupation+ "skills:"+skills + ", Location:", Toast.LENGTH_LONG)
//                .show();
            }
        });
    }
}