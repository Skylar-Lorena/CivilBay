package com.skylar.civilbay;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity {
    public static final String TAG = SearchActivity.class.getSimpleName();

    @BindView(R.id.userNameTextView)
    TextView userNameTextView;
    @BindView(R.id.listView)
    ListView mListView;


    private String[] companies = new String[] {"Mi Mero Mole", "Mother's Bistro",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};

    private String[] skills = new String[] {"Vegan Food", "Breakfast",
            "Fishs Dishs", "Scandinavian", "Coffee", "English Food", "Burgers", "Fast Food",
            "Noodle Soups", "Mexican", "BBQ", "Cuban", "Bar Food", "Sports Bar", "Breakfast", "Mexican" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ButterKnife.bind(this);

        CivilBayArrayAdapter adapter = new CivilBayArrayAdapter(this, android.R.layout.simple_list_item_1, companies, skills);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String companies = ((TextView)view).getText().toString();

                Toast.makeText(SearchActivity.this, companies, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        userNameTextView.setText("Here are some construction companies in your region " + userName);

    }
}