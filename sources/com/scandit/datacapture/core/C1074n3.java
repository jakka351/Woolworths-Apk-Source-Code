package com.scandit.datacapture.core;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.n3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1074n3 implements InterfaceC1065m3 {
    public final void a(URL originalUrl, URL connectionUrl) throws C1167x6 {
        Intrinsics.h(originalUrl, "originalUrl");
        Intrinsics.h(connectionUrl, "connectionUrl");
        String originalHost = originalUrl.getHost();
        String connectionHost = connectionUrl.getHost();
        if (Intrinsics.c(originalUrl.getHost(), connectionUrl.getHost())) {
            return;
        }
        Intrinsics.g(originalHost, "originalHost");
        Intrinsics.g(connectionHost, "connectionHost");
        throw new C1167x6(originalHost, connectionHost);
    }
}
