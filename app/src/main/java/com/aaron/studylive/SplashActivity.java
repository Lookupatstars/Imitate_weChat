package com.aaron.studylive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.aaron.studylive.Fragment.SplashFragment;
import com.aaron.studylive.view.transformer.ScaleTransformer;


public class SplashActivity extends AppCompatActivity {

    private ViewPager mVpMain;
    private int[] mResIds = new int[]{
            R.mipmap.start1,
            R.mipmap.start2,
            R.mipmap.start3,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mVpMain = findViewById(R.id.vp_main);
        mVpMain.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return SplashFragment.newInstance(mResIds[i]);
            }
            @Override
            public int getCount() {
                return mResIds.length;
            }
        });

        mVpMain.setPageTransformer(true,new ScaleTransformer());

    }

}
