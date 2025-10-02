package com.scandit.datacapture.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.z2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1181z2 {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f18999a;
    private final int b;
    private final int c;
    private final int d;

    public C1181z2(Function1 surfaceCallback, int i, int i2, int i3) {
        Intrinsics.h(surfaceCallback, "surfaceCallback");
        this.f18999a = surfaceCallback;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final Function1 c() {
        return this.f18999a;
    }

    public final int d() {
        return this.b;
    }
}
