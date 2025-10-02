package com.woolworths.scanlibrary.di.module;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21166a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.f21166a = i;
        this.b = obj;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        switch (this.f21166a) {
            case 0:
                DefaultLocalTokenProvider defaultLocalTokenProvider = (DefaultLocalTokenProvider) this.b;
                Request request = realInterceptorChain.e;
                HttpUrl httpUrlD = request.f26690a.g().d();
                Request.Builder builderB = request.b();
                builderB.f26691a = httpUrlD;
                if (!StringsKt.D(defaultLocalTokenProvider.a())) {
                    builderB.a("authorization", " Bearer ".concat(defaultLocalTokenProvider.a()));
                }
                return realInterceptorChain.c(new Request(builderB));
            default:
                FeatureToggleManager featureToggleManager = (FeatureToggleManager) this.b;
                Request request2 = realInterceptorChain.e;
                HttpUrl httpUrlD2 = request2.f26690a.g().d();
                Request.Builder builderB2 = request2.b();
                builderB2.f26691a = httpUrlD2;
                builderB2.a("disable-inapp-payment", String.valueOf(featureToggleManager.c(ScanAndGoFeature.e)));
                return realInterceptorChain.c(new Request(builderB2));
        }
    }
}
