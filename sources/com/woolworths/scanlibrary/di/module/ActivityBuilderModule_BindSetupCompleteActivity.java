package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.setupcomplete.SetupCompleteActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindSetupCompleteActivity {

    @ActivityScope
    @Subcomponent
    public interface SetupCompleteActivitySubcomponent extends AndroidInjector<SetupCompleteActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<SetupCompleteActivity> {
        }
    }
}
