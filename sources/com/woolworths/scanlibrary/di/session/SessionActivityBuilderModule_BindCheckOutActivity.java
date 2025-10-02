package com.woolworths.scanlibrary.di.session;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.checkout.CheckOutActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class SessionActivityBuilderModule_BindCheckOutActivity {

    @ActivityScope
    @Subcomponent
    public interface CheckOutActivitySubcomponent extends AndroidInjector<CheckOutActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<CheckOutActivity> {
        }
    }
}
