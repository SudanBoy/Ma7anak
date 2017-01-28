package com.devsuda.abubakr.ma7anak;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Abubakr on 26/01/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                LocationInfoFragment tab1 = new LocationInfoFragment();
                return tab1;
            case 1:
                RankInfoFragment tab2 = new RankInfoFragment();
                return tab2;
            case 2:
                WorkingHoursInfoFragment tab3 = new WorkingHoursInfoFragment();
                return tab3;
            case 3:
                WorkingHoursInfoFragment tab4 = new WorkingHoursInfoFragment();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}