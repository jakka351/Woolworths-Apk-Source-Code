package com.woolworths.scanlibrary.ui.home.di;

import com.woolworths.scanlibrary.ui.home.homeview.HomeFragment;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class HomeActivityFragmentProviderModule_ProvideFragmentFactory {

    @Subcomponent
    public interface HomeFragmentSubcomponent extends AndroidInjector<HomeFragment> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<HomeFragment> {
        }
    }
}
