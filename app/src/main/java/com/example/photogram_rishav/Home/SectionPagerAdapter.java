package com.example.photogram_rishav.Home;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter extends FragmentPagerAdapter {
   private final List<Fragment> mfrglist = new ArrayList<>();
    public SectionPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mfrglist.get(position);
    }

    @Override
    public int getCount() {
        return mfrglist.size();
    }

    public void addFragment(Fragment fragment){
        mfrglist.add(fragment);
    }
}
