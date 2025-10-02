package com.scandit.datacapture.core;

import android.hardware.camera2.CameraDevice;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F implements L0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18312a = true;
    final /* synthetic */ N b;
    final /* synthetic */ C1037j2 c;
    final /* synthetic */ Function1 d;

    public F(N n, C1037j2 c1037j2, Function1 function1) {
        this.b = n;
        this.c = c1037j2;
        this.d = function1;
    }

    public final void a(CameraDevice camera) {
        Intrinsics.h(camera, "camera");
        if (this.f18312a) {
            this.b.k = camera;
            N.a(this.b, this.c, this.d);
        }
    }

    public final void b() {
        if (this.f18312a) {
            N.h(this.b);
            this.b.a();
            this.d.invoke(Boolean.FALSE);
        }
    }

    public final void c() {
        if (this.f18312a) {
            this.b.c.invoke(FrameSourceState.OFF);
        }
    }

    public final void a() {
        this.f18312a = false;
    }
}
