package com.mzy.demosortout;

import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mzy.demosortout.yindao.Fragment1;
import com.mzy.demosortout.yindao.Fragment2;
import com.mzy.demosortout.yindao.Fragment3;
import com.mzy.demosortout.yindao.Fragment4;
import com.mzy.demosortout.yindao.ViewPagerAdapter;
import com.mzy.demosortout.yindao.animation.RotateDownPageTransformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager mVPActivity;
    private Fragment1 mFragment1;
    private Fragment2 mFragment2;
    private Fragment3 mFragment3;
    private Fragment4 mFragment4;
    private List<Fragment> mListFragment = new ArrayList<Fragment>();
    private PagerAdapter mPgAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        mVPActivity = (ViewPager) findViewById(R.id.vp_activity);
        mFragment1 = new Fragment1();
        mFragment2 = new Fragment2();
        mFragment3 = new Fragment3();
        mFragment4 = new Fragment4();
        mListFragment.add(mFragment1);
        mListFragment.add(mFragment2);
        mListFragment.add(mFragment3);
        mListFragment.add(mFragment4);
        /**
         * 传递两个参数
         */
        mPgAdapter = new ViewPagerAdapter(getSupportFragmentManager(),
                mListFragment);
        mVPActivity.setAdapter(mPgAdapter);
        mVPActivity.setPageTransformer(true, new RotateDownPageTransformer());
    }
}
