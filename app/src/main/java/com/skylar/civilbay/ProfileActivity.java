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

    private static final String TAG = SearchActivity.class.getSimpleName();
    private EditText userName;
    private EditText occupation;
    private EditText password;
    private Button signUpButton;
    private TextView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_profile);

        userName = (EditText) findViewById(R.id.userName);
        occupation = (EditText) findViewById(R.id.occupation);
        password = (EditText) findViewById(R.id.password);
        signUpButton = (Button) findViewById(R.id.signUpButton);
        profile = (TextView) findViewById(R.id.profile);


        signUpButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String details = profile.getText().toString();
                Intent intent = new Intent(ProfileActivity.this, SearchActivity.class);
                intent.putExtra("details", details);
                startActivity(intent);

            }
        });
    }

}

