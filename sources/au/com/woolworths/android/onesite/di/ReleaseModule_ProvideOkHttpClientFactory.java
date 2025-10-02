package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.BaseUrlInterceptor;
import au.com.woolworths.android.onesite.network.PreemptiveTokenRefreshInterceptor;
import au.com.woolworths.shop.auth.ShopAuthenticator;
import com.google.common.collect.ImmutableSet;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ReleaseModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
    public static OkHttpClient a(ReleaseModule releaseModule, Cache cache, ShopAuthenticator shopAuthenticator, ImmutableSet interceptors, ImmutableSet baseUrlInterceptors, PreemptiveTokenRefreshInterceptor preemptiveTokenRefreshInterceptor, FeatureToggleManager featureToggleManager) {
        releaseModule.getClass();
        Intrinsics.h(cache, "cache");
        Intrinsics.h(interceptors, "interceptors");
        Intrinsics.h(baseUrlInterceptors, "baseUrlInterceptors");
        Intrinsics.h(preemptiveTokenRefreshInterceptor, "preemptiveTokenRefreshInterceptor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
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
        Iterator<E> it = baseUrlInterceptors.iterator();
        while (it.hasNext()) {
            builder.a((BaseUrlInterceptor) it.next());
        }
        Iterator<E> it2 = interceptors.iterator();
        while (it2.hasNext()) {
            builder.a((Interceptor) it2.next());
        }
        BaseFeature baseFeature = BaseFeature.i;
        if (featureToggleManager.c(baseFeature)) {
            builder.a(preemptiveTokenRefreshInterceptor);
        }
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        if (featureToggleManager.c(baseFeature)) {
            preemptiveTokenRefreshInterceptor.f4573a = okHttpClient;
        }
        return okHttpClient;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
