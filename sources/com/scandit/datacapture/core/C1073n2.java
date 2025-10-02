package com.scandit.datacapture.core;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.module.ui.NativeGestureListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.n2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1073n2 {

    /* renamed from: a, reason: collision with root package name */
    private final NativeGestureListener f18809a;
    private final ProxyCache b;

    public C1073n2(NativeGestureListener _NativeGestureListener, ProxyCache proxyCache) {
        Intrinsics.h(_NativeGestureListener, "_NativeGestureListener");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18809a = _NativeGestureListener;
        this.b = proxyCache;
    }

    public final boolean a(Point point) {
        Intrinsics.h(point, "point");
        return this.f18809a.onDoubleTap(point);
    }

    public final boolean b(Point point) {
        Intrinsics.h(point, "point");
        return this.f18809a.onTap(point);
    }

    public final boolean c() {
        return this.f18809a.onSwipeRight();
    }

    public final boolean d() {
        return this.f18809a.onSwipeUp();
    }

    public final boolean a() {
        return this.f18809a.onSwipeDown();
    }

    public final boolean b() {
        return this.f18809a.onSwipeLeft();
    }

    public /* synthetic */ C1073n2(NativeGestureListener nativeGestureListener) {
        this(nativeGestureListener, ProxyCacheKt.getGlobalProxyCache());
    }
}
