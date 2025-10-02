package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.network.NetworkTransport;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/interceptor/NetworkInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkInterceptor implements ApolloInterceptor {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTransport f13621a;
    public final NetworkTransport b;

    public NetworkInterceptor(NetworkTransport networkTransport, NetworkTransport networkTransport2) {
        this.f13621a = networkTransport;
        this.b = networkTransport2;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final Flow a(ApolloRequest apolloRequest, DefaultInterceptorChain defaultInterceptorChain) {
        Operation operation = apolloRequest.d;
        boolean z = operation instanceof Query;
        NetworkTransport networkTransport = this.f13621a;
        if (!z && !(operation instanceof Mutation)) {
            if (operation instanceof Subscription) {
                return this.b.a(apolloRequest);
            }
            throw new IllegalStateException("");
        }
        return networkTransport.a(apolloRequest);
    }
}
