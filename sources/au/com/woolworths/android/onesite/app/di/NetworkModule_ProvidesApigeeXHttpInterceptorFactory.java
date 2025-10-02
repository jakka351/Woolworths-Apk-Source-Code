package au.com.woolworths.android.onesite.app.di;

import android.app.Application;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.base.shopapp.network.ApigeeXHttpInterceptor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class NetworkModule_ProvidesApigeeXHttpInterceptorFactory implements Factory<ApigeeXHttpInterceptor> {
    public static ApigeeXHttpInterceptor a(NetworkModule networkModule, Application application, ConnectionManager connectionManager, Auth0AuthManager authManager, ShopAccountInteractor accountInteractor) {
        networkModule.getClass();
        Intrinsics.h(connectionManager, "connectionManager");
        Intrinsics.h(authManager, "authManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        return new ApigeeXHttpInterceptor(application, connectionManager, authManager, accountInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
