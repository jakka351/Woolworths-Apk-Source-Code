package au.com.woolworths.shop.auth.di;

import au.com.woolworths.shop.auth.AuthRepository;
import au.com.woolworths.shop.auth.network.TokenApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ShopAuthAppModule_ProvideAuthRepositoryFactory implements Factory<AuthRepository> {
    public static AuthRepository a(ShopAuthAppModule shopAuthAppModule, TokenApi tokenApi) {
        shopAuthAppModule.getClass();
        return new AuthRepository(tokenApi);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
