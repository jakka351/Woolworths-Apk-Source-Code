package com.apollographql.apollo;

import au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.EmptyExecutionContext;
import com.apollographql.apollo.api.ExecutionOptions;
import com.apollographql.apollo.api.MutableExecutionOptions;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.interceptor.NetworkInterceptor;
import com.apollographql.apollo.network.NetworkTransport;
import com.apollographql.apollo.network.OkHttpExtensionsKt;
import com.apollographql.apollo.network.http.HttpEngine;
import com.apollographql.apollo.network.http.HttpNetworkTransport;
import com.apollographql.apollo.network.ws.DefaultWebSocketEngine;
import com.apollographql.apollo.network.ws.SubscriptionWsProtocol;
import com.apollographql.apollo.network.ws.WebSocketNetworkTransport;
import com.medallia.digital.mobilesdk.l8;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/ApolloClient;", "Lcom/apollographql/apollo/api/ExecutionOptions;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Builder", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloClient implements ExecutionOptions, Closeable {
    public final ConcurrencyInfo d;
    public final NetworkTransport e;
    public final NetworkTransport f;
    public final ArrayList g;
    public final CustomScalarAdapters h;
    public final ArrayList i;
    public final EmptyExecutionContext j;
    public final NetworkInterceptor k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ApolloClient$Builder;", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder implements MutableExecutionOptions<Builder> {
        public final CustomScalarAdapters.Builder d = new CustomScalarAdapters.Builder();
        public final ArrayList e;
        public final ArrayList f;
        public final ArrayList g;
        public final ArrayList h;
        public final ArrayList i;
        public final ArrayList j;
        public EmptyExecutionContext k;
        public SseNetworkTransport l;
        public String m;
        public HttpEngine n;
        public Boolean o;
        public DefaultWebSocketEngine p;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            this.f = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.g = arrayList2;
            this.h = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.i = arrayList3;
            this.j = arrayList3;
            this.k = EmptyExecutionContext.f13513a;
        }

        public final void a(CustomScalarType customScalarType, Adapter customScalarAdapter) {
            Intrinsics.h(customScalarType, "customScalarType");
            Intrinsics.h(customScalarAdapter, "customScalarAdapter");
            CustomScalarAdapters.Builder builder = this.d;
            builder.getClass();
            builder.f13511a.put(customScalarType.f13509a, customScalarAdapter);
        }

        public final ApolloClient b() {
            Builder builder = new Builder();
            CustomScalarAdapters customScalarAdaptersA = this.d.a();
            CustomScalarAdapters.Builder builder2 = builder.d;
            builder2.f13511a.clear();
            builder2.f13511a.putAll(customScalarAdaptersA.e);
            builder.c(this.f);
            EmptyExecutionContext executionContext = this.k;
            Intrinsics.h(executionContext, "executionContext");
            builder.k = executionContext;
            builder.m = this.m;
            builder.n = this.n;
            builder.o = this.o;
            ArrayList httpInterceptors = this.h;
            Intrinsics.h(httpInterceptors, "httpInterceptors");
            ArrayList arrayList = builder.g;
            arrayList.clear();
            arrayList.addAll(httpInterceptors);
            builder.l = this.l;
            builder.p = this.p;
            ArrayList listeners = this.j;
            Intrinsics.h(listeners, "listeners");
            ArrayList arrayList2 = builder.i;
            arrayList2.clear();
            arrayList2.addAll(listeners);
            return new ApolloClient(builder);
        }

        public final void c(List interceptors) {
            Intrinsics.h(interceptors, "interceptors");
            ArrayList arrayList = this.e;
            arrayList.clear();
            CollectionsKt.h(interceptors, arrayList);
        }

        public final void d(String serverUrl) {
            Intrinsics.h(serverUrl, "serverUrl");
            this.m = serverUrl;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ApolloClient$Companion;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ApolloClient(Builder builder) {
        ArrayList arrayList = builder.f;
        ArrayList interceptors = builder.h;
        this.g = arrayList;
        this.h = builder.d.a();
        this.i = builder.j;
        this.j = builder.k;
        if (builder.m == null) {
            throw new IllegalStateException("Apollo: 'serverUrl' is required");
        }
        HttpNetworkTransport.Builder builder2 = new HttpNetworkTransport.Builder();
        String str = builder.m;
        Intrinsics.e(str);
        builder2.f13630a = str;
        HttpEngine httpEngine = builder.n;
        if (httpEngine != null) {
            builder2.b = httpEngine;
        }
        Boolean bool = builder.o;
        if (bool != null) {
            builder2.d = bool.booleanValue();
        }
        Intrinsics.h(interceptors, "interceptors");
        ArrayList arrayList2 = builder2.c;
        arrayList2.clear();
        arrayList2.addAll(interceptors);
        HttpNetworkTransport httpNetworkTransportA = builder2.a();
        this.e = httpNetworkTransportA;
        NetworkTransport webSocketNetworkTransport = builder.l;
        if (webSocketNetworkTransport == null) {
            String str2 = builder.m;
            if (str2 == null) {
                webSocketNetworkTransport = httpNetworkTransportA;
            } else {
                WebSocketNetworkTransport.Builder builder3 = new WebSocketNetworkTransport.Builder();
                ArrayList arrayList3 = new ArrayList();
                builder3.a(str2);
                DefaultWebSocketEngine defaultWebSocketEngine = builder.p;
                if (defaultWebSocketEngine != null) {
                    builder3.b = defaultWebSocketEngine;
                }
                Function1 function1 = builder3.f13638a;
                if (function1 == null) {
                    throw new IllegalStateException("No serverUrl specified");
                }
                DefaultWebSocketEngine defaultWebSocketEngine2 = builder3.b;
                if (defaultWebSocketEngine2 == null) {
                    OkHttpClient.Builder builder4 = (OkHttpClient.Builder) OkHttpExtensionsKt.f13624a.getD();
                    builder4.getClass();
                    defaultWebSocketEngine2 = new DefaultWebSocketEngine(new OkHttpClient(builder4));
                }
                webSocketNetworkTransport = new WebSocketNetworkTransport(function1, arrayList3, defaultWebSocketEngine2, l8.b.b, new SubscriptionWsProtocol.Factory());
            }
        } else if (builder.p != null) {
            throw new IllegalStateException("Apollo: 'webSocketEngine' or 'okHttpClient' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketEngine on the subscriptionNetworkTransport directly.");
        }
        this.f = webSocketNetworkTransport;
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
        this.d = new ConcurrencyInfo(defaultIoScheduler, CoroutineScopeKt.a(defaultIoScheduler));
        this.k = new NetworkInterceptor(httpNetworkTransportA, webSocketNetworkTransport);
    }

    public final ApolloCall a(Mutation mutation) {
        return new ApolloCall(this, mutation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CoroutineScopeKt.b(this.d.b, null);
        this.e.dispose();
        this.f.dispose();
    }
}
