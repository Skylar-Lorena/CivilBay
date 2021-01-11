package com.skylar.civilbay;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.widget.Toast.makeText;

public class SearchActivity extends AppCompatActivity {

    public static final String TAG = SearchActivity.class.getSimpleName();

    @BindView(R.id.userNameTextView)
    TextView userNameTextView;

    @BindView(R.id.listView)
    ListView mListView;

    private String[] companies = new String[] {"Kenya Builders & Concrete Co Ltd", "Ujenzibora Investment Limited",
            "Interways Works Ltd", "Sobetra Kenya", "H YOUNG & CO (E.A) LTD", "Eldad Engineering & Construction Limited",
            "Laxmanbhai Construction Ltd", "Associated Construction Co (K) Ltd", "Rhombus Concrete", "Eco - homes ltd",
            "Institution of Surveyors of Kenya", "TVET Authority", "Vee Vee Enterprises Limited",
            "Famio Services Ltd", "Oaks Construction Co. Ltd"};

    private String[] contacts = new String[] {"0722 205133", "0720 578632",
            "0719 582761", "0798 886256", "020 6688000", "0721 209319", "020 2664865", "0733 271272",
            "0705 900000", "0722 202338", "020 2214770", "020 2392140", "0712 652679 ", "0718 052042", "0769 358368" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        FragmentManager fm = getSupportFragmentManager();
        LoginDialogFragment LoginDialogFragment = new LoginDialogFragment ();
        LoginDialogFragment.show(fm, "Sample Fragment");

        ButterKnife.bind(this);

        CivilBayArrayAdapter adapter = new CivilBayArrayAdapter(this, android.R.layout.simple_list_item_1, companies, contacts);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String companies = ((TextView)view).getText().toString();

                makeText(SearchActivity.this, companies, Toast.LENGTH_LONG).show();
            }
        });

        userNameTextView.setText("Welcome! Here are some construction companies in your region: " );

    }

}