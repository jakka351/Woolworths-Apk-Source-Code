package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.C1073n2;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C1073n2 f18593a;

    public GestureListener(NativeGestureListener impl) {
        Intrinsics.h(impl, "impl");
        this.f18593a = new C1073n2(impl);
    }

    public final boolean a(Point point) {
        Intrinsics.h(point, "point");
        return this.f18593a.a(point);
    }

    public final boolean b() {
        return this.f18593a.b();
    }

    public final boolean c() {
        return this.f18593a.c();
    }

    public final boolean d() {
        return this.f18593a.d();
    }

    public final boolean a() {
        return this.f18593a.a();
    }

    public final boolean b(Point point) {
        Intrinsics.h(point, "point");
        return this.f18593a.b(point);
    }
}
