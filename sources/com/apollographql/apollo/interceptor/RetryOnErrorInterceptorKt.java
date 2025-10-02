package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.OfflineException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RetryOnErrorInterceptorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13622a = 0;

    static {
        new ApolloNetworkException("The device is offline", OfflineException.d);
    }

    public static final ApolloInterceptor a() {
        return new DefaultRetryOnErrorInterceptorImpl();
    }
}
