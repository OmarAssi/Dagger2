package com.omaroid.dagger2.model;

import android.content.SharedPreferences;

import javax.inject.Inject;

public class SharedPrefModel {
    private SharedPreferences sharedPreferences;

    @Inject
    public SharedPrefModel(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }


    public void putData(String key, int data) {
        sharedPreferences.edit().putInt(key, data).apply();
    }

    public int getData(String key) {
        return sharedPreferences.getInt(key, 0);
    }


}
