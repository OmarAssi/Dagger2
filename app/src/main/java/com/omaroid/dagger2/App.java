package com.omaroid.dagger2;

import android.app.Application;

import com.omaroid.dagger2.di.AppComponent;
import com.omaroid.dagger2.di.AppModule;
import com.omaroid.dagger2.di.DaggerAppComponent;

public class App extends Application {

    private static App app;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();
    }

    public static App getApp() {
        return app;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
