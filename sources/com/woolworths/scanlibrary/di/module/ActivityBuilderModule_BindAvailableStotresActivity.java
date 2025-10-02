package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.stores.AvailableStoresActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindAvailableStotresActivity {

    @ActivityScope
    @Subcomponent
    public interface AvailableStoresActivitySubcomponent extends AndroidInjector<AvailableStoresActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<AvailableStoresActivity> {
        }
    }
}
