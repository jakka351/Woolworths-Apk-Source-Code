package com.woolworths.scanlibrary.di.user;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class UserActivityBuilderModule_BindUpdateCreditCardActivity {

    @ActivityScope
    @Subcomponent
    public interface UpdateCreditCardActivitySubcomponent extends AndroidInjector<UpdateCreditCardActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<UpdateCreditCardActivity> {
        }
    }
}
