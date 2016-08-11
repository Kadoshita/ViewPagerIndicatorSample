package com.example.viewpagerindicatorsample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.viewpagerindicator.PageIndicator;
import com.viewpagerindicator.TitlePageIndicator;


public class MainActivity extends AppCompatActivity {

    TestFragmentAdapter mAdapter;
    ViewPager mPager;
    TitlePageIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (TitlePageIndicator)findViewById(R.id.title);
        mIndicator.setViewPager(mPager);

//        CirclePageIndicator indicator = (CirclePageIndicator)findViewById(R.id.indicator);
//        mIndicator = indicator;
//        indicator.setViewPager(mPager);

//        final float density = getResources().getDisplayMetrics().density;
//        indicator.setBackgroundColor(0xFFCCCCCC);
//        indicator.setRadius(10 * density);
//        indicator.setPageColor(0xFF888888);
//        indicator.setFillColor(0x880000FF);
//        indicator.setStrokeColor(0xFF000000);
//        indicator.setStrokeWidth(2 * density);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
}
