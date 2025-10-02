package au.com.woolworths.shop.auth.di;

import au.com.woolworths.shop.auth.KeycloakTokenAuthenticator;
import au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ShopAuthAppModule_ProvideKeycloakTokenAuthenticatorFactory implements Factory<KeycloakTokenAuthenticator> {
    public static KeycloakTokenAuthenticator a(ShopAuthAppModule shopAuthAppModule, KeycloakAuthManager authManagerApi) {
        shopAuthAppModule.getClass();
        Intrinsics.h(authManagerApi, "authManagerApi");
        return new KeycloakTokenAuthenticator(authManagerApi);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
