package au.com.woolworths.android.onesite.di.modules;

import au.com.woolworths.android.onesite.network.PreemptiveTokenRefreshInterceptor;
import au.com.woolworths.android.onesite.network.ShopAppPreemptiveTokenRefreshInterceptor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class NetworkModule_ProvideRefreshTokenInterceptorFactory implements Factory<PreemptiveTokenRefreshInterceptor> {
    public static ShopAppPreemptiveTokenRefreshInterceptor a(NetworkModule networkModule, ShopAccountInteractor shopAccountInteractor) {
        networkModule.getClass();
        Intrinsics.h(shopAccountInteractor, "shopAccountInteractor");
        return new ShopAppPreemptiveTokenRefreshInterceptor(shopAccountInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
