package au.com.woolworths.shop.cart.di;

import au.com.woolworths.shop.cart.ui.productreview.ReplaceProductResultRouter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopCartAppModule_ProvideReplaceProductResultRouterFactory implements Factory<ReplaceProductResultRouter> {

    public static final class InstanceHolder {
    }

    public static ReplaceProductResultRouter a() {
        return new ReplaceProductResultRouter();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ReplaceProductResultRouter();
    }
}
