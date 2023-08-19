package com.example.projectturbo;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapterFandC extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.ganesh_chaturti,
            R.string.Sawai_Gandharva_Sangeet_Mahotsav,
            R.string.Shivaji_Maharaj_Jayant,
            R.string.Music_and_Dance

    };
    private final Context mContext;

    public SectionsPagerAdapterFandC(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position)
        {
            case 0:fragment=new ganesh_chaturti();
                break;
            case 1:fragment=new Sawai_Gandharva_Sangeet_Mahotsav();
                break;
            case 2:fragment=new Shivaji_Maharaj_Jayant();
                break;
                case 3:fragment= new Music_and_Dance();
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

        return 4;
    }
}
