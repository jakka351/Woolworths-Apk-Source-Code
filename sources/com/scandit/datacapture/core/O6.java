package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.sdk.source.NativeSingleBitmapFrameDataCollection;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class O6 {

    /* renamed from: a, reason: collision with root package name */
    private final ProxyCache f18352a;

    public O6(NativeSingleBitmapFrameDataCollection _NativeSingleBitmapFrameDataCollection, ProxyCache proxyCache) {
        Intrinsics.h(_NativeSingleBitmapFrameDataCollection, "_NativeSingleBitmapFrameDataCollection");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18352a = proxyCache;
    }

    public /* synthetic */ O6(NativeSingleBitmapFrameDataCollection nativeSingleBitmapFrameDataCollection) {
        this(nativeSingleBitmapFrameDataCollection, ProxyCacheKt.getGlobalProxyCache());
    }
}
