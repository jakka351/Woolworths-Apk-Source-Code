package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpRequest;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/http/HeadersInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HeadersInterceptor implements HttpInterceptor {
    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    public final Object a(HttpRequest httpRequest, DefaultHttpInterceptorChain defaultHttpInterceptorChain, ContinuationImpl continuationImpl) {
        HttpRequest.a(httpRequest).a(null);
        throw null;
    }
}
