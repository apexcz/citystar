package com.example.chineduoty.aroundme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chineduoty.aroundme.routeplanner.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.pick_city_btn)
    Button btnPickCity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
//                startActivity(intent);
//            }
//        },SPLASH_TIME_OUT);

        btnPickCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_login;
    }
}
