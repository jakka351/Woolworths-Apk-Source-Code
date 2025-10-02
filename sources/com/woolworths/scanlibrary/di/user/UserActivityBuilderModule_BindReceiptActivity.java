package com.woolworths.scanlibrary.di.user;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.receipt.ReceiptActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class UserActivityBuilderModule_BindReceiptActivity {

    @ActivityScope
    @Subcomponent
    public interface ReceiptActivitySubcomponent extends AndroidInjector<ReceiptActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ReceiptActivity> {
        }
    }
}
