package com.mazibahrami.unit.di;

import android.app.Application;

import com.mazibahrami.unit.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(
        modules = {
                AndroidInjectionModule.class,
                AppModule.class,
                ActivityBuildersModule.class,
                ViewModelProviderFactoryModule.class
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
