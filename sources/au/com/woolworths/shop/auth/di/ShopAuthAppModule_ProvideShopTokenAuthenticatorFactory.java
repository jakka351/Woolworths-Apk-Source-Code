package au.com.woolworths.shop.auth.di;

import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.shop.auth.KeycloakTokenAuthenticator;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import au.com.woolworths.shop.auth.ShopAuthenticator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ShopAuthAppModule_ProvideShopTokenAuthenticatorFactory implements Factory<ShopAuthenticator> {
    public static ShopAuthenticator a(ShopAuthAppModule shopAuthAppModule, ShopAppTokenAuthenticator auth0Authenticator, KeycloakTokenAuthenticator keycloakAuthenticator, ShopAppRegionInteractor shopAppRegionInteractor) {
        shopAuthAppModule.getClass();
        Intrinsics.h(auth0Authenticator, "auth0Authenticator");
        Intrinsics.h(keycloakAuthenticator, "keycloakAuthenticator");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        return new ShopAuthenticator(auth0Authenticator, keycloakAuthenticator, shopAppRegionInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
