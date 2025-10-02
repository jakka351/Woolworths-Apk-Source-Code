package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.menu.contactus.ContactUsActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindContactUsActivity {

    @ActivityScope
    @Subcomponent
    public interface ContactUsActivitySubcomponent extends AndroidInjector<ContactUsActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ContactUsActivity> {
        }
    }
}
