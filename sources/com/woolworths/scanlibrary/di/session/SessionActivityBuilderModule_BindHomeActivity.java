package com.woolworths.scanlibrary.di.session;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.home.HomeActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class SessionActivityBuilderModule_BindHomeActivity {

    @ActivityScope
    @Subcomponent
    public interface HomeActivitySubcomponent extends AndroidInjector<HomeActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<HomeActivity> {
        }
    }
}
