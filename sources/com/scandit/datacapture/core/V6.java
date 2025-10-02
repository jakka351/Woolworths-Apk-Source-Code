package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.trusts.AllowExpiredCertificatesTrustManager;
import com.scandit.datacapture.core.internal.module.https.trusts.ExtendedX509TrustManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class V6 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W7 f18387a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(X7 x7) {
        super(0);
        this.f18387a = x7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((X7) this.f18387a).getClass();
        return new ExtendedX509TrustManager[]{new R4(), new AllowExpiredCertificatesTrustManager()};
    }
}
