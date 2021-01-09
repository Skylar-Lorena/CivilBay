package com.skylar.civilbay;

import android.content.Context;
import android.widget.ArrayAdapter;

public class CivilBayArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private  String[] companies;
    private String[] contacts;

    public CivilBayArrayAdapter(Context mContext, int resource, String[] companies, String[] contacts) {
        super(mContext, resource);
        this.mContext = mContext;
        this.companies = companies;
        this.contacts = contacts;
    }

    @Override
    public Object getItem(int position) {
        String company = companies[position];
        String contact = contacts[position];
        return String.format("%s \nTop Rated: %s", company, contact);
    }

    @Override
    public int getCount() {
        return companies.length;
    }
}
