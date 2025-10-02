package com.woolworths.scanlibrary.ui.message.singleAction.di;

import com.woolworths.scanlibrary.ui.message.singleAction.MessageSingleActionFragment;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class MessageFragmentProviderModule_ProvideFragmentFactory {

    @Subcomponent
    public interface MessageSingleActionFragmentSubcomponent extends AndroidInjector<MessageSingleActionFragment> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<MessageSingleActionFragment> {
        }
    }
}
