package com.example.ichinomiyashiori.lightsample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ichinomiyashiori.lightsample.Fragments.Fragment_1;
import com.example.ichinomiyashiori.lightsample.Fragments.Fragment_2;
import com.example.ichinomiyashiori.lightsample.Fragments.Fragment_3;
import com.example.ichinomiyashiori.lightsample.Fragments.Fragment_4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabLayout);

        //放入頁面資訊
        tab_fragment = new Fragment[]{fragment1, fragment2, fragment3, fragment4};

        for (String s : tab_item) {
            //for迴圈產生標籤名稱
            tabLayout.addTab(tabLayout.newTab().setText(s));
        }

        viewPager.setAdapter(new CreatFragment_adp(getSupportFragmentManager()));
        tabLayout.addOnTabSelectedListener(new Tablayout_selectListener());
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }

    private class CreatFragment_adp extends FragmentPagerAdapter {
        public CreatFragment_adp(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int i) {
            //回傳取得的fragment
            return tab_fragment[i];
        }
        @Override
        public int getCount() {
            //Viewpager的頁面有幾個
            return tab_item.length;
        }
    }

    private class Tablayout_selectListener implements TabLayout.OnTabSelectedListener{
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            //選擇tablayout時的分頁切換
            viewPager.setCurrentItem(tab.getPosition());
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    }


    //
    String[] tab_item = {"標籤1","標籤2","標籤3","標籤4"};

    //建立頁面的陣列
    Fragment[]    tab_fragment;

    //建立四個fragment頁面
    Fragment_1    fragment1  = new Fragment_1();
    Fragment_2    fragment2  = new Fragment_2();
    Fragment_3    fragment3  = new Fragment_3();
    Fragment_4    fragment4  = new Fragment_4();
    ViewPager     viewPager ;
    TabLayout     tabLayout ;



}
