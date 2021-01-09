package com.skylar.civilbay;

import android.content.Context;
import android.widget.ArrayAdapter;

public class CivilBayArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private  String[] companies;
    private String[] skills;

    public CivilBayArrayAdapter(Context mContext, int resource, String[] companies, String[] skills) {
        super(mContext, resource);
        this.mContext = mContext;
        this.companies = companies;
        this.skills = skills;
    }

    @Override
    public Object getItem(int position) {
        String company = companies[position];
        String skill = skills[position];
        return String.format("%s \nProvides great: %s", company, skill);
    }

    @Override
    public int getCount() {
        return companies.length;
    }
}
