package com.woolworths.scanlibrary.di.session;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class SessionActivityBuilderModule_BindScannerActivityOld {

    @ActivityScope
    @Subcomponent
    public interface ScannerActivityOldSubcomponent extends AndroidInjector<ScannerActivityOld> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ScannerActivityOld> {
        }
    }
}
