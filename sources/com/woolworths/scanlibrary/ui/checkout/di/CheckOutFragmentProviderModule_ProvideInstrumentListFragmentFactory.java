package com.woolworths.scanlibrary.ui.checkout.di;

import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListFragment;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class CheckOutFragmentProviderModule_ProvideInstrumentListFragmentFactory {

    @Subcomponent
    public interface InstrumentListFragmentSubcomponent extends AndroidInjector<InstrumentListFragment> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<InstrumentListFragment> {
        }
    }
}
