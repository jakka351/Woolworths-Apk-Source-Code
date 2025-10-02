package com.woolworths.scanlibrary.ui.home.di;

import com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class HomeActivityFragmentProviderModule_ProvideItemViewFragmentFactory {

    @Subcomponent
    public interface ItemViewFragmentSubcomponent extends AndroidInjector<ItemViewFragment> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ItemViewFragment> {
        }
    }
}
