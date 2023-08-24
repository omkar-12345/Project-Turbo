package com.example.projectturbo;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapterLandL extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.lang_page,
            R.string.literature_page
    };
    private final Context mContext;

    public SectionsPagerAdapterLandL(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position)
        {
            case 0:fragment=new language_page();
                break;
            case 1:fragment=new literature_page();
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
        return 2;
    }
}
