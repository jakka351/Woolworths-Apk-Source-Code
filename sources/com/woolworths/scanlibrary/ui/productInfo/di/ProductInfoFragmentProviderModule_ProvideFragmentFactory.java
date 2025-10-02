package com.woolworths.scanlibrary.ui.productInfo.di;

import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoFragment;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ProductInfoFragmentProviderModule_ProvideFragmentFactory {

    @Subcomponent
    public interface ProductInfoFragmentSubcomponent extends AndroidInjector<ProductInfoFragment> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ProductInfoFragment> {
        }
    }
}
