package com.scandit.datacapture.core.internal.module.ui.control.camera;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.C1107r0;
import com.scandit.datacapture.core.InterfaceC1116s0;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CameraControlIconsHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Camera f18624a;
    private final Camera b;
    private final C1107r0 c;
    private InterfaceC1116s0 d;
    private Bitmap e;
    private Bitmap f;
    private Bitmap g;
    private Bitmap h;

    public CameraControlIconsHandler(Camera primaryCamera, Camera secondaryCamera, C1107r0 defaults) {
        Intrinsics.h(primaryCamera, "primaryCamera");
        Intrinsics.h(secondaryCamera, "secondaryCamera");
        Intrinsics.h(defaults, "defaults");
        this.f18624a = primaryCamera;
        this.b = secondaryCamera;
        this.c = defaults;
        this.e = BitmapExtensionsKt.bitmapFromResource(defaults.a());
        this.f = BitmapExtensionsKt.bitmapFromResource(defaults.b());
        this.g = BitmapExtensionsKt.bitmapFromResource(defaults.c());
        this.h = BitmapExtensionsKt.bitmapFromResource(defaults.d());
    }

    public final void a(CameraSwitchControl.AnonymousClass1 anonymousClass1) {
        this.d = anonymousClass1;
    }

    public final void b(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.f)) {
            return;
        }
        this.f = value;
        InterfaceC1116s0 interfaceC1116s0 = this.d;
        if (interfaceC1116s0 != null) {
            interfaceC1116s0.onIconsChanged(this.f18624a, value, true);
        }
    }

    public final void c(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.g)) {
            return;
        }
        this.g = value;
        InterfaceC1116s0 interfaceC1116s0 = this.d;
        if (interfaceC1116s0 != null) {
            interfaceC1116s0.onIconsChanged(this.b, value, false);
        }
    }

    public final void d(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.h)) {
            return;
        }
        this.h = value;
        InterfaceC1116s0 interfaceC1116s0 = this.d;
        if (interfaceC1116s0 != null) {
            interfaceC1116s0.onIconsChanged(this.b, value, true);
        }
    }

    public final Bitmap e() {
        return this.e;
    }

    public final Bitmap f() {
        return this.f;
    }

    public final Bitmap g() {
        return this.g;
    }

    public final Bitmap h() {
        return this.h;
    }

    public final Bitmap a(Camera camera, boolean z) {
        Intrinsics.h(camera, "camera");
        if (camera.equals(this.f18624a) && !z) {
            return this.e;
        }
        if (camera.equals(this.f18624a) && z) {
            return this.f;
        }
        if (camera.equals(this.b) && !z) {
            return this.g;
        }
        if (camera.equals(this.b) && z) {
            return this.h;
        }
        return null;
    }

    public final Bitmap b() {
        return BitmapExtensionsKt.bitmapFromResource(this.c.b());
    }

    public final Bitmap c() {
        return BitmapExtensionsKt.bitmapFromResource(this.c.c());
    }

    public final Bitmap d() {
        return BitmapExtensionsKt.bitmapFromResource(this.c.d());
    }

    public /* synthetic */ CameraControlIconsHandler(Camera camera, Camera camera2) {
        this(camera, camera2, new C1107r0());
    }

    public final void a(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.e)) {
            return;
        }
        this.e = value;
        InterfaceC1116s0 interfaceC1116s0 = this.d;
        if (interfaceC1116s0 != null) {
            interfaceC1116s0.onIconsChanged(this.f18624a, value, false);
        }
    }

    public final Bitmap a() {
        return BitmapExtensionsKt.bitmapFromResource(this.c.a());
    }
}
