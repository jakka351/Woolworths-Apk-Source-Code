package com.woolworths.scanlibrary.di.user;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class UserActivityBuilderModule_BindExitScanCodeActivity {

    @ActivityScope
    @Subcomponent
    public interface ExitScanCodeActivitySubcomponent extends AndroidInjector<ExitScanCodeActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ExitScanCodeActivity> {
        }
    }
}
