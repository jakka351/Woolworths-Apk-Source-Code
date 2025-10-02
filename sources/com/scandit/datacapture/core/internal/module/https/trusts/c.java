package com.scandit.datacapture.core.internal.module.https.trusts;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ X509Certificate[] f18555a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(X509Certificate[] x509CertificateArr, String str, String str2) {
        super(1);
        this.f18555a = x509CertificateArr;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws CertificateException {
        X509TrustManager trust = (X509TrustManager) obj;
        Intrinsics.h(trust, "trust");
        new X509TrustManagerExtensions(trust).checkServerTrusted(this.f18555a, this.b, this.c);
        return Unit.f24250a;
    }
}
