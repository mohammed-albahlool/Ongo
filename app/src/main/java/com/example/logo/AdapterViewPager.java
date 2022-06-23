package com.example.logo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class AdapterViewPager extends FragmentStateAdapter {


    List<Fragment> fragmentList ;

    public AdapterViewPager(@NonNull FragmentActivity fragmentActivity , List<Fragment> fragmentList) {
        super(fragmentActivity);
        this.fragmentList=fragmentList ;
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }
}


