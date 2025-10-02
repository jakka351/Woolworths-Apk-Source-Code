package com.woolworths.scanlibrary.ui.cart.shoppingcart.di;

import com.woolworths.scanlibrary.ui.cart.shoppingcart.ShoppingCartFragment;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class FragmentProviderModule_ProvideFragmentFactory {

    @Subcomponent
    public interface ShoppingCartFragmentSubcomponent extends AndroidInjector<ShoppingCartFragment> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ShoppingCartFragment> {
        }
    }
}
