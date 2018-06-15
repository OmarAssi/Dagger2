package com.omaroid.dagger2.di;

import android.content.Context;
import android.content.SharedPreferences;

import com.omaroid.dagger2.App;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    Context provideContext(App application) {
        return application.getApplicationContext();
    }
    @Singleton
    @Provides
    @Inject
    SharedPreferences provideSharedPref(Context context){
        return context.getSharedPreferences("",Context.MODE_PRIVATE);
    }

}
