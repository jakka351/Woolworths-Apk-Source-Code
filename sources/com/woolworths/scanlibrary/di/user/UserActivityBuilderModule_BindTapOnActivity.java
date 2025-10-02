package com.woolworths.scanlibrary.di.user;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class UserActivityBuilderModule_BindTapOnActivity {

    @ActivityScope
    @Subcomponent
    public interface TapActivitySubcomponent extends AndroidInjector<TapActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<TapActivity> {
        }
    }
}
