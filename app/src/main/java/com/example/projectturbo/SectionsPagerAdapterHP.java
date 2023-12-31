package com.example.projectturbo;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapterHP extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.one,
            R.string.two,
            R.string.three,
            R.string.four,
            R.string.five,
            R.string.six,


    };
    private final Context mContext;

    public SectionsPagerAdapterHP(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position)
        {
            case 0:fragment=new vishrambag_wada();
                break;
            case 1:fragment=new shaniwar_wada();
                break;
            case 2:fragment=new lal_mahal();
                break;
            case 3:fragment=new nana_wada();
                break;
            case 4:fragment=new shitole_wada();
                break;
            case 5:fragment=new bhuleshwar_temple();
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

        return 6;
    }
}