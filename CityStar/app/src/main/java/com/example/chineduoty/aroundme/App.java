package com.example.chineduoty.aroundme;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by chineduoty on 26/11/2017.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Fabric.with(this, new Crashlytics());
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Titillium_Regular.otf")
                .setFontAttrId(R.attr.fontPath)
                //.addCustomViewWithSetTypeface(CustomViewWithTypefaceSupport.class)
                //.addCustomStyle(TextField.class, R.attr.textFieldStyle)
                .build()
        );
    }
}