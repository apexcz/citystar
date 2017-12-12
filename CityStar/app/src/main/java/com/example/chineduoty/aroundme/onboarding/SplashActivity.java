package com.example.chineduoty.aroundme.onboarding;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.example.chineduoty.aroundme.BaseActivity;
import com.example.chineduoty.aroundme.R;
import com.example.chineduoty.aroundme.routeplanner.MainActivity;

public class SplashActivity extends BaseActivity {

    private static final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_splash;
    }
}
