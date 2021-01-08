package com.skylar.civilbay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {
    public static final String TAG = SearchActivity.class.getSimpleName();
    private TextView userNameTextView;
    private ListView mListView;

    private String[] companies = new String[] {"Mi Mero Mole", "Mother's Bistro",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        userNameTextView = (TextView) findViewById(R.id.userNameTextView);
        mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, companies);
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
        userNameTextView.setText("Here are construction companies in your region " + userName);
    }
}