package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.GraphQlBaseUrlInterceptor;
import au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.network.OkHttpExtensionsKt;
import com.apollographql.apollo.network.http.DefaultHttpEngine;
import com.google.common.collect.ImmutableSet;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class BaseNetworkModule_ProvideAemContentApolloClientFactory implements Factory<ApolloClient> {
    public static ApolloClient a(BaseNetworkModule baseNetworkModule, OkHttpClient okHttpClient, SseNetworkTransport networkTransport, ImmutableSet customerScalarAdapters, ImmutableSet apolloInterceptors, AppConfig appConfig, FeatureToggleManager featureToggleManager) {
        baseNetworkModule.getClass();
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(networkTransport, "networkTransport");
        Intrinsics.h(customerScalarAdapters, "customerScalarAdapters");
        Intrinsics.h(apolloInterceptors, "apolloInterceptors");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        OkHttpClient.Builder builderC = okHttpClient.c();
        builderC.a(new GraphQlBaseUrlInterceptor(appConfig, "graphql", new au.com.woolworths.android.onesite.analytics.a11y.a(4)));
        OkHttpClient okHttpClient2 = new OkHttpClient(builderC);
        if (!featureToggleManager.c(BaseFeature.f)) {
            ApolloClient.Builder builder = new ApolloClient.Builder();
            OkHttpExtensionsKt.a(builder, okHttpClient2);
            builder.c(CollectionsKt.G0(apolloInterceptors));
            builder.d(appConfig.d() + "graphql");
            Iterator<E> it = customerScalarAdapters.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                builder.a((CustomScalarType) pair.d, (Adapter) pair.e);
            }
            builder.o = Boolean.TRUE;
            return builder.b();
        }
        ApolloClient.Builder builder2 = new ApolloClient.Builder();
        builder2.n = DefaultHttpEngine.a(okHttpClient2);
        builder2.l = networkTransport;
        builder2.c(CollectionsKt.G0(apolloInterceptors));
        builder2.d(appConfig.d() + "graphql");
        Iterator<E> it2 = customerScalarAdapters.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            builder2.a((CustomScalarType) pair2.d, (Adapter) pair2.e);
        }
        builder2.o = Boolean.TRUE;
        return builder2.b();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
