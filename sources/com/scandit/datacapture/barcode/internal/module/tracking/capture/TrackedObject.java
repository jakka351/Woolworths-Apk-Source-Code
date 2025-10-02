package com.scandit.datacapture.barcode.internal.module.tracking.capture;

import com.scandit.datacapture.barcode.C0738me;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TrackedObject {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C0738me f17799a;

    public TrackedObject(NativeTrackedObject impl) {
        Intrinsics.h(impl, "impl");
        this.f17799a = new C0738me(impl);
    }

    public final NativeTrackedObject a() {
        return this.f17799a.a();
    }

    public final String b() {
        return this.f17799a.b();
    }

    public final int c() {
        return this.f17799a.c();
    }

    public final Quadrilateral d() {
        return this.f17799a.d();
    }
}
