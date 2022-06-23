package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ViewPager2 viewPager2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.pager2);

        List<Fragment> fragmentList = new ArrayList<>();

        fragmentList.add(new Fragment_Splash1());
        fragmentList.add(new Fragment_Splash2());
       fragmentList.add(new Fragment_Splash3());

        AdapterViewPager ad = new AdapterViewPager(this , fragmentList);
        viewPager2.setAdapter(ad);

    }
}