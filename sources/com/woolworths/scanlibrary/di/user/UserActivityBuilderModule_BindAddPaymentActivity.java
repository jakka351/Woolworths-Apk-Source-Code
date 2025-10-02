package com.woolworths.scanlibrary.di.user;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class UserActivityBuilderModule_BindAddPaymentActivity {

    @ActivityScope
    @Subcomponent
    public interface AddPaymentActivitySubcomponent extends AndroidInjector<AddPaymentActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<AddPaymentActivity> {
        }
    }
}
