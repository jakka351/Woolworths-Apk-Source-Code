package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/interceptor/DefaultInterceptorChain;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultInterceptorChain implements ApolloInterceptorChain {

    /* renamed from: a, reason: collision with root package name */
    public final List f13620a;
    public final int b;

    public DefaultInterceptorChain(List interceptors, int i) {
        Intrinsics.h(interceptors, "interceptors");
        this.f13620a = interceptors;
        this.b = i;
    }

    public final Flow a(ApolloRequest apolloRequest) {
        List list = this.f13620a;
        int size = list.size();
        int i = this.b;
        if (i < size) {
            return ((ApolloInterceptor) list.get(i)).a(apolloRequest, new DefaultInterceptorChain(list, i + 1));
        }
        throw new IllegalStateException("Check failed.");
    }
}
