package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindOnBoardingActivity {

    @ActivityScope
    @Subcomponent
    public interface OnBoardingActivitySubcomponent extends AndroidInjector<OnBoardingActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<OnBoardingActivity> {
        }
    }
}
