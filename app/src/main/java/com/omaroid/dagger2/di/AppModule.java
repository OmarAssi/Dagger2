package com.omaroid.dagger2.di;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
private Context context;
    public AppModule(Context context) {
        this.context = context;
    }
    @Provides
    @AppScope
    Context provideContext(){
        return context;
    }
    @Provides
    @AppScope
    @Inject
    SharedPreferences provideSharedPref(Context context){
        return context.getSharedPreferences("",Context.MODE_PRIVATE);
    }

}
