package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.me, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0738me {

    /* renamed from: a, reason: collision with root package name */
    private final NativeTrackedObject f17853a;

    public C0738me(NativeTrackedObject _NativeTrackedObject, ProxyCache proxyCache) {
        Intrinsics.h(_NativeTrackedObject, "_NativeTrackedObject");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17853a = _NativeTrackedObject;
    }

    public final NativeTrackedObject a() {
        return this.f17853a;
    }

    public final String b() {
        return this.f17853a.getUtf8String();
    }

    public final int c() {
        return this.f17853a.getIdentifier();
    }

    public final Quadrilateral d() {
        Quadrilateral _0 = this.f17853a.getLocationIgnoringLicense();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ C0738me(NativeTrackedObject nativeTrackedObject) {
        this(nativeTrackedObject, ProxyCacheKt.getGlobalProxyCache());
    }
}
