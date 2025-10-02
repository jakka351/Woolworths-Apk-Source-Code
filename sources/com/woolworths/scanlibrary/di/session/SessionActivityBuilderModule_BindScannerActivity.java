package com.woolworths.scanlibrary.di.session;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class SessionActivityBuilderModule_BindScannerActivity {

    @ActivityScope
    @Subcomponent
    public interface ScannerActivitySubcomponent extends AndroidInjector<ScannerActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ScannerActivity> {
        }
    }
}
