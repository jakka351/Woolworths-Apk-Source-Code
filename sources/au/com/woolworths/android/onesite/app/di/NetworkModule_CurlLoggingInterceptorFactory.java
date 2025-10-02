package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.network.CurlLoggingInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class NetworkModule_CurlLoggingInterceptorFactory implements Factory<CurlLoggingInterceptor> {
    public static CurlLoggingInterceptor a(NetworkModule networkModule) {
        networkModule.getClass();
        return new CurlLoggingInterceptor();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
