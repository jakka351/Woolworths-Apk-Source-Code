package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.reward.SngRewardsSetupActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindSngRewardsSetupActivity {

    @ActivityScope
    @Subcomponent
    public interface SngRewardsSetupActivitySubcomponent extends AndroidInjector<SngRewardsSetupActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<SngRewardsSetupActivity> {
        }
    }
}
