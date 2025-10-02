package com.woolworths.scanlibrary.ui.tap.di;

import com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class TapFragmentProviderModule_ProvideFragmentFactory {

    @Subcomponent
    public interface TapOnFragmentSubcomponent extends AndroidInjector<TapOnFragment> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<TapOnFragment> {
        }
    }
}
