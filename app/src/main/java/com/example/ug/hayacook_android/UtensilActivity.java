package com.example.ug.hayacook_android;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by UG on 2016-01-03.
 */
public class UtensilActivity extends AppCompatActivity{

    ViewPager viewPager = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utensil);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        UtensilPagerAdapter adapter = new UtensilPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
