package com.scandit.datacapture.core;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Y6 implements X6 {

    /* renamed from: a, reason: collision with root package name */
    private final T6 f18399a;

    public Y6(T6 sslSocketFactoryCreator) {
        Intrinsics.h(sslSocketFactoryCreator, "sslSocketFactoryCreator");
        this.f18399a = sslSocketFactoryCreator;
    }

    public final void a(HttpsURLConnection connection) {
        Intrinsics.h(connection, "connection");
        connection.setSSLSocketFactory(((W6) this.f18399a).a());
    }

    public final void a(boolean z) {
        ((W6) this.f18399a).a(z);
    }

    public Y6() {
        this(AbstractC0961a7.a());
    }
}
