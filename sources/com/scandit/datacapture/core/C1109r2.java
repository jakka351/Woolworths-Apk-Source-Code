package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.ui.GestureListener;
import com.scandit.datacapture.core.internal.module.ui.GestureRecognizer;
import com.scandit.datacapture.core.internal.module.ui.NativeGestureListener;
import com.scandit.datacapture.core.internal.module.ui.NativeGestureRecognizer;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: com.scandit.datacapture.core.r2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1109r2 extends NativeGestureRecognizer {

    /* renamed from: a, reason: collision with root package name */
    private final GestureRecognizer f18826a;
    private final ProxyCache b;

    public C1109r2(GestureRecognizer _GestureRecognizer, ProxyCache proxyCache) {
        Intrinsics.h(_GestureRecognizer, "_GestureRecognizer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18826a = _GestureRecognizer;
        this.b = proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeGestureRecognizer
    public final void setGestureListener(NativeGestureListener listener, EnumSet gestures) {
        Intrinsics.h(listener, "listener");
        Intrinsics.h(gestures, "gestures");
        this.f18826a.a((GestureListener) this.b.getOrPut(Reflection.f24268a.b(NativeGestureListener.class), null, listener, new C1100q2(listener)), gestures);
    }
}
