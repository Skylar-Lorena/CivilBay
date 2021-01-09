package com.skylar.civilbay;

import android.content.Context;
import android.widget.ArrayAdapter;

public class CivilBayArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private  String[] mCompanies;
    private String[] mSkills;

    public CivilBayArrayAdapter(Context mContext, int resource, String[] mCompanies, String[] mSkills) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mCompanies = mCompanies;
        this.mSkills = mSkills;
    }

    @Override
    public Object getItem(int position) {
        String company = mCompanies[position];
        String skill = mSkills[position];
        return String.format("%s \nProvides great: %s", company, skill);
    }

    @Override
    public int getCount() {
        return mCompanies.length;
    }
}
