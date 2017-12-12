package com.example.chineduoty.aroundme.util;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import static android.support.v4.util.Preconditions.checkNotNull;

/**
 * Created by chineduoty on 02/12/2017.
 */

public class ActivityUtils {
    @SuppressLint("RestrictedApi")
    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                             @NonNull Fragment fragment, int frameId){
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.add(frameId,fragment);
        ft.commit();
    }
}
