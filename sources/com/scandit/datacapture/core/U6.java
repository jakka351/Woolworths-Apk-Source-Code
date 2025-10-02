package com.scandit.datacapture.core;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class U6 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W6 f18384a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(W6 w6) {
        super(0);
        this.f18384a = w6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        sSLContext.init(null, W6.a(this.f18384a), null);
        return sSLContext.getSocketFactory();
    }
}
