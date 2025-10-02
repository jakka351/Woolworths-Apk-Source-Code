package com.woolworths.scanlibrary.di.module;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21165a;
    public final /* synthetic */ ScanAndGoConfig b;

    public /* synthetic */ a(ScanAndGoConfig scanAndGoConfig, int i) {
        this.f21165a = i;
        this.b = scanAndGoConfig;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        switch (this.f21165a) {
            case 0:
                Request request = realInterceptorChain.e;
                HttpUrl httpUrlD = request.f26690a.g().d();
                Request.Builder builderB = request.b();
                builderB.f26691a = httpUrlD;
                builderB.a("X-Api-Key", this.b.getP());
                return realInterceptorChain.c(new Request(builderB));
            default:
                Request request2 = realInterceptorChain.e;
                HttpUrl httpUrlD2 = request2.f26690a.g().d();
                Request.Builder builderB2 = request2.b();
                builderB2.f26691a = httpUrlD2;
                builderB2.a("X-Api-Key", this.b.getM());
                return realInterceptorChain.c(new Request(builderB2));
        }
    }
}
