package com.mazibahrami.unit.di;

import androidx.lifecycle.ViewModelProvider;

import com.mazibahrami.unit.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelProviderFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);
}
