package com.woolworths.scanlibrary.ui.checkout.di;

import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class CheckOutFragmentProviderModule_ProvideFragmentFactory {

    @Subcomponent
    public interface PayFragmentSubcomponent extends AndroidInjector<PayFragment> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<PayFragment> {
        }
    }
}
