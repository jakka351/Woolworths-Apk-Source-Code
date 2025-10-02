package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.splash.SngInitializerActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindSplashActivity {

    @ActivityScope
    @Subcomponent
    public interface SngInitializerActivitySubcomponent extends AndroidInjector<SngInitializerActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<SngInitializerActivity> {
        }
    }
}
