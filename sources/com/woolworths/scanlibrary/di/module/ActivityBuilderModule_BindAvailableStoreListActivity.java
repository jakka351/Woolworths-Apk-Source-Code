package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreListActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindAvailableStoreListActivity {

    @ActivityScope
    @Subcomponent
    public interface AvailableStoreListActivitySubcomponent extends AndroidInjector<AvailableStoreListActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<AvailableStoreListActivity> {
        }
    }
}
