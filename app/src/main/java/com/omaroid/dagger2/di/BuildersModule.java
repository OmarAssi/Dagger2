package com.omaroid.dagger2.di;

import com.omaroid.dagger2.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {
    @ContributesAndroidInjector
    abstract MainActivity bindMainActivity();

}
