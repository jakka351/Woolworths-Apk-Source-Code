package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.network.GraphQlBaseUrlInterceptor;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.network.OkHttpExtensionsKt;
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
public final class BaseNetworkModule_ProvidePaymentApolloClientFactory implements Factory<ApolloClient> {
    public static ApolloClient a(BaseNetworkModule baseNetworkModule, OkHttpClient okHttpClient, ImmutableSet customerScalarAdapters, ImmutableSet apolloInterceptors, AppConfig appConfig) {
        baseNetworkModule.getClass();
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(customerScalarAdapters, "customerScalarAdapters");
        Intrinsics.h(apolloInterceptors, "apolloInterceptors");
        Intrinsics.h(appConfig, "appConfig");
        OkHttpClient.Builder builderC = okHttpClient.c();
        builderC.a(new GraphQlBaseUrlInterceptor(appConfig, "graphql", new androidx.navigation.a(20)));
        OkHttpClient okHttpClient2 = new OkHttpClient(builderC);
        ApolloClient.Builder builder = new ApolloClient.Builder();
        OkHttpExtensionsKt.a(builder, okHttpClient2);
        builder.c(CollectionsKt.G0(apolloInterceptors));
        builder.d(appConfig.z() + "graphql");
        Iterator<E> it = customerScalarAdapters.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            builder.a((CustomScalarType) pair.d, (Adapter) pair.e);
        }
        return builder.b();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
