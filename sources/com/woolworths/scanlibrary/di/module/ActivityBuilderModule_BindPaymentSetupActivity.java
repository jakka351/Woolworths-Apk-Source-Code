package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindPaymentSetupActivity {

    @ActivityScope
    @Subcomponent
    public interface AddPaymentSetupActivitySubcomponent extends AndroidInjector<AddPaymentSetupActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<AddPaymentSetupActivity> {
        }
    }
}
