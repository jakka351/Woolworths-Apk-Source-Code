package com.woolworths.scanlibrary.ui.checkout.di;

import com.woolworths.scanlibrary.ui.checkout.stepup.StepUpDialogFragment;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class CheckOutFragmentProviderModule_ProvideStepUpDialogFragmentFactory {

    @Subcomponent
    public interface StepUpDialogFragmentSubcomponent extends AndroidInjector<StepUpDialogFragment> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<StepUpDialogFragment> {
        }
    }
}
