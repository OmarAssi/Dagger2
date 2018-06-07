package com.omaroid.dagger2.di;

import com.omaroid.dagger2.ui.MainActivity;

import dagger.Component;

@Component(modules = AppModule.class)
@AppScope
public interface AppComponent {
    void inject(MainActivity mainActivity);

}
