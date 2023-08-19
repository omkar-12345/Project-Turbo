package com.example.projectturbo;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapterHandH extends FragmentPagerAdapter {
    @NonNull
    private static final int[] TAB_TITLES = new int[]{
            R.string.HH_one,
            R.string.HH_secound,
            R.string.HH_third,
            R.string.HH_four,
            R.string.HH_five,
            R.string.HH_six,


    };
    private final Context mContext;

    public SectionsPagerAdapterHandH(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position)
        {
            case 0:fragment=new ancient_and_medival();
                break;
            case 1:fragment=new Maratha_Empire();
                break;
            case 2:fragment=new Peshwa_Era();
                break;
            case 3:fragment=new Agarkar_Wada();
                break;
            case 4:fragment=new Educational_Legacy();
                break;
            case 5:fragment=new Freedom_Struggle();
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