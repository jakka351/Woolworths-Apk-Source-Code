package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.entry.SngEntryActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindSngEntryActivity {

    @ActivityScope
    @Subcomponent
    public interface SngEntryActivitySubcomponent extends AndroidInjector<SngEntryActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<SngEntryActivity> {
        }
    }
}
