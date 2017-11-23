package com.veryworks.iyeongjun.hkapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by iyeongjun on 2017. 10. 14..
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> datas;

    public MyPagerAdapter(FragmentManager fm, List<Fragment> datas) {
        super(fm);
        this.datas = datas;
    }
    @Override
    public Fragment getItem(int position) {
        return datas.get(position);
    }
    @Override
    public int getCount() {
        return datas.size();
    }
}
