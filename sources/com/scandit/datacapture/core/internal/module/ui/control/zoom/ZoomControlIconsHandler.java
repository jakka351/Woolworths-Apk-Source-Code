package com.scandit.datacapture.core.internal.module.ui.control.zoom;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.q8;
import com.scandit.datacapture.core.r8;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ZoomControlIconsHandler {

    /* renamed from: a, reason: collision with root package name */
    private final q8 f18630a;
    private r8 b;
    private Bitmap c;
    private Bitmap d;
    private Bitmap e;
    private Bitmap f;

    public ZoomControlIconsHandler(q8 defaults) {
        Intrinsics.h(defaults, "defaults");
        this.f18630a = defaults;
        this.c = BitmapExtensionsKt.bitmapFromResource(defaults.c());
        this.d = BitmapExtensionsKt.bitmapFromResource(defaults.d());
        this.e = BitmapExtensionsKt.bitmapFromResource(defaults.a());
        this.f = BitmapExtensionsKt.bitmapFromResource(defaults.b());
    }

    public final void a(ZoomSwitchControl.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public final void b(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.f)) {
            return;
        }
        this.f = value;
        r8 r8Var = this.b;
        if (r8Var != null) {
            r8Var.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedIn.INSTANCE, true);
        }
    }

    public final void c(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.c)) {
            return;
        }
        this.c = value;
        r8 r8Var = this.b;
        if (r8Var != null) {
            r8Var.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedOut.INSTANCE, false);
        }
    }

    public final void d(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.d)) {
            return;
        }
        this.d = value;
        r8 r8Var = this.b;
        if (r8Var != null) {
            r8Var.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedOut.INSTANCE, true);
        }
    }

    public final Bitmap e() {
        return this.e;
    }

    public final Bitmap f() {
        return this.f;
    }

    public final Bitmap g() {
        return this.c;
    }

    public final Bitmap h() {
        return this.d;
    }

    public final Bitmap a(ZoomSwitchControl.ZoomState state, boolean z) {
        Intrinsics.h(state, "state");
        boolean z2 = state instanceof ZoomSwitchControl.ZoomState.ZoomedOut;
        if (z2 && !z) {
            return this.c;
        }
        if (z2 && z) {
            return this.d;
        }
        boolean z3 = state instanceof ZoomSwitchControl.ZoomState.ZoomedIn;
        if (z3 && !z) {
            return this.e;
        }
        if (z3 && z) {
            return this.f;
        }
        return null;
    }

    public /* synthetic */ ZoomControlIconsHandler() {
        this(new q8());
    }

    public final Bitmap b() {
        return BitmapExtensionsKt.bitmapFromResource(this.f18630a.b());
    }

    public final Bitmap c() {
        return BitmapExtensionsKt.bitmapFromResource(this.f18630a.c());
    }

    public final Bitmap d() {
        return BitmapExtensionsKt.bitmapFromResource(this.f18630a.d());
    }

    public final void a(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.e)) {
            return;
        }
        this.e = value;
        r8 r8Var = this.b;
        if (r8Var != null) {
            r8Var.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedIn.INSTANCE, false);
        }
    }

    public final Bitmap a() {
        return BitmapExtensionsKt.bitmapFromResource(this.f18630a.a());
    }
}
