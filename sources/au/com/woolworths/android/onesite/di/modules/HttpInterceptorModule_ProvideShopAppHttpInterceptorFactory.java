package au.com.woolworths.android.onesite.di.modules;

import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.android.onesite.network.ShopAppHttpInterceptor;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class HttpInterceptorModule_ProvideShopAppHttpInterceptorFactory implements Factory<Interceptor> {
    public static ShopAppHttpInterceptor a(HttpInterceptorModule httpInterceptorModule, SharedHeaders sharedHeaders, ConnectionManager connectionManager) {
        httpInterceptorModule.getClass();
        Intrinsics.h(sharedHeaders, "sharedHeaders");
        Intrinsics.h(connectionManager, "connectionManager");
        return new ShopAppHttpInterceptor(sharedHeaders, connectionManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
