package com.dynatrace.android.callback;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes.dex */
public class OkHeaderInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final OkHeaderInterceptor f14144a = new OkHeaderInterceptor();

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.e;
        request.c.h();
        Response responseC = realInterceptorChain.c(request);
        responseC.i.h();
        return responseC;
    }
}
