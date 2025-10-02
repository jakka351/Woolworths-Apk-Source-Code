package com.woolworths.scanlibrary.di.user;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.transaction.TransactionListActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class UserActivityBuilderModule_BindTransactionListActivity {

    @ActivityScope
    @Subcomponent
    public interface TransactionListActivitySubcomponent extends AndroidInjector<TransactionListActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<TransactionListActivity> {
        }
    }
}
