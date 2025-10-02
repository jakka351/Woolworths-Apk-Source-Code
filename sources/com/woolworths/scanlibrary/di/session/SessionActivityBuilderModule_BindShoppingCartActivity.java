package com.woolworths.scanlibrary.di.session;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.cart.ShoppingCartActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class SessionActivityBuilderModule_BindShoppingCartActivity {

    @ActivityScope
    @Subcomponent
    public interface ShoppingCartActivitySubcomponent extends AndroidInjector<ShoppingCartActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ShoppingCartActivity> {
        }
    }
}
