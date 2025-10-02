package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpRequest;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/http/DefaultHttpInterceptorChain;", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultHttpInterceptorChain implements HttpInterceptorChain {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13627a;
    public final int b;

    public DefaultHttpInterceptorChain(int i, ArrayList arrayList) {
        this.f13627a = arrayList;
        this.b = i;
    }

    public final Object a(HttpRequest httpRequest, ContinuationImpl continuationImpl) {
        ArrayList arrayList = this.f13627a;
        int size = arrayList.size();
        int i = this.b;
        if (i < size) {
            return ((HttpInterceptor) arrayList.get(i)).a(httpRequest, new DefaultHttpInterceptorChain(i + 1, arrayList), continuationImpl);
        }
        throw new IllegalStateException("Check failed.");
    }
}
