package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.tandc.TermsConditionsActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindTermsConditions {

    @ActivityScope
    @Subcomponent
    public interface TermsConditionsActivitySubcomponent extends AndroidInjector<TermsConditionsActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<TermsConditionsActivity> {
        }
    }
}
