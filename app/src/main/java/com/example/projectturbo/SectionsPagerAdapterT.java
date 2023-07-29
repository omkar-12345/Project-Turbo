package com.example.projectturbo;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;




public class SectionsPagerAdapterT extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.Temples_one,
            R.string.Temples_two,
            R.string.Temples_three,
            R.string.Temples_four,
            R.string.Temples_five
    };

    private final Context mContext;

    public SectionsPagerAdapterT(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new GupchupGanpati();
                break;
            case 1:
                fragment = new ParvatiTemple();
                break;
            case 2:
                fragment = new Pataleshwar();
                break;
            case 3:
                fragment = new Trishunda();
                break;
            case 4:
                fragment = new Vishnu();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 5;
    }
}
