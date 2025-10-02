package com.woolworths.scanlibrary.di.session;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.productInfo.ProductInfoActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class SessionActivityBuilderModule_BindProductInfoActivity {

    @ActivityScope
    @Subcomponent
    public interface ProductInfoActivitySubcomponent extends AndroidInjector<ProductInfoActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ProductInfoActivity> {
        }
    }
}
