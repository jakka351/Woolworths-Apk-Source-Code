package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.trusts.AllowExpiredCertificatesTrustManager;
import com.scandit.datacapture.core.internal.module.https.trusts.ExtendedX509TrustManager;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class W6 implements T6 {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f18391a;
    private final Lazy b;

    public W6(X7 trustFactory) {
        Intrinsics.h(trustFactory, "trustFactory");
        this.f18391a = LazyKt.b(new V6(trustFactory));
        this.b = LazyKt.b(new U6(this));
    }

    public static final ExtendedX509TrustManager[] a(W6 w6) {
        return (ExtendedX509TrustManager[]) w6.f18391a.getD();
    }

    public final void a(boolean z) {
        ExtendedX509TrustManager[] extendedX509TrustManagerArr = (ExtendedX509TrustManager[]) this.f18391a.getD();
        ArrayList arrayList = new ArrayList();
        for (ExtendedX509TrustManager extendedX509TrustManager : extendedX509TrustManagerArr) {
            if (extendedX509TrustManager instanceof AllowExpiredCertificatesTrustManager) {
                arrayList.add(extendedX509TrustManager);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AllowExpiredCertificatesTrustManager) it.next()).a(z);
        }
    }

    public final SSLSocketFactory a() {
        Object d = this.b.getD();
        Intrinsics.g(d, "<get-sslSocketFactory>(...)");
        return (SSLSocketFactory) d;
    }
}
