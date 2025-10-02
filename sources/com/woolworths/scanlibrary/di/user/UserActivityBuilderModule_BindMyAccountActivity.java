package com.woolworths.scanlibrary.di.user;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class UserActivityBuilderModule_BindMyAccountActivity {

    @ActivityScope
    @Subcomponent
    public interface MyAccountActivitySubcomponent extends AndroidInjector<MyAccountActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<MyAccountActivity> {
        }
    }
}
