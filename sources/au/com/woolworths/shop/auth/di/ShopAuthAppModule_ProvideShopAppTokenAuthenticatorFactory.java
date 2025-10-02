package au.com.woolworths.shop.auth.di;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import com.google.gson.Gson;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ShopAuthAppModule_ProvideShopAppTokenAuthenticatorFactory implements Factory<ShopAppTokenAuthenticator> {
    public static ShopAppTokenAuthenticator a(ShopAuthAppModule shopAuthAppModule, Gson gson, Lazy okHttpClientLazy, AppConfig appConfig, FirebasePerfMonitor firebasePerfMonitor, ShopAccountInteractor accountInteractor, Lazy authInteractor, Auth0AuthManager auth0Manager, NetworkExceptions networkExceptions, DispatcherProvider dispatcherProvider) {
        shopAuthAppModule.getClass();
        Intrinsics.h(gson, "gson");
        Intrinsics.h(okHttpClientLazy, "okHttpClientLazy");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(authInteractor, "authInteractor");
        Intrinsics.h(auth0Manager, "auth0Manager");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        return new ShopAppTokenAuthenticator(gson, okHttpClientLazy, appConfig, firebasePerfMonitor, accountInteractor, authInteractor, auth0Manager, networkExceptions, dispatcherProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
