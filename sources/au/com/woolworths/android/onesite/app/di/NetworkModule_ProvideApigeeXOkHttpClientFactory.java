package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.network.CurlLoggingInterceptor;
import au.com.woolworths.base.shopapp.network.ApigeeXHttpInterceptor;
import au.com.woolworths.shop.auth.ShopAuthenticator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class NetworkModule_ProvideApigeeXOkHttpClientFactory implements Factory<OkHttpClient> {
    public static OkHttpClient a(NetworkModule networkModule, Cache cache, ShopAuthenticator shopAuthenticator, ApigeeXHttpInterceptor apigeeXHttpInterceptor, CurlLoggingInterceptor curlLoggingInterceptor) {
        networkModule.getClass();
        Intrinsics.h(cache, "cache");
        Intrinsics.h(apigeeXHttpInterceptor, "apigeeXHttpInterceptor");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.h = shopAuthenticator;
        builder.l = cache;
        Duration durationOfSeconds = Duration.ofSeconds(60L);
        Intrinsics.g(durationOfSeconds, "ofSeconds(...)");
        builder.b(durationOfSeconds);
        Duration durationOfSeconds2 = Duration.ofSeconds(60L);
        Intrinsics.g(durationOfSeconds2, "ofSeconds(...)");
        long millis = durationOfSeconds2.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.d(millis, timeUnit);
        Duration durationOfSeconds3 = Duration.ofSeconds(30L);
        Intrinsics.g(durationOfSeconds3, "ofSeconds(...)");
        builder.c(durationOfSeconds3.toMillis(), timeUnit);
        Duration durationOfSeconds4 = Duration.ofSeconds(60L);
        Intrinsics.g(durationOfSeconds4, "ofSeconds(...)");
        builder.e(durationOfSeconds4.toMillis(), timeUnit);
        builder.a(apigeeXHttpInterceptor);
        return new OkHttpClient(builder);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
