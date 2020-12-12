package com.example.odev.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.odev.R;
import com.example.odev.fragment;
import com.example.odev.fragment1;
import com.example.odev.fragment2;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final  int[] Drawable = new int[]{R.string.text_1,R.string.text_2, R.string.text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0: fragment = new fragment(); break;
            case 1: fragment = new fragment1(); break;
            case 2: fragment = new fragment2(); break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(Drawable[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}