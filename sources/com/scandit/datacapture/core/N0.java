package com.scandit.datacapture.core;

import android.hardware.camera2.CameraDevice;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class N0 extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f18349a = new AtomicBoolean(false);
    final /* synthetic */ L0 b;

    public N0(F f) {
        this.b = f;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice camera) {
        Intrinsics.h(camera, "camera");
        Log.e("sdc-core", "CameraDevice disconnected");
        if (this.f18349a.compareAndSet(false, true)) {
            ((F) this.b).b();
        } else {
            ((F) this.b).c();
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice camera, int i) {
        Intrinsics.h(camera, "camera");
        Log.e("sdc-core", "Failed to open camera with camera API 2");
        if (this.f18349a.compareAndSet(false, true)) {
            ((F) this.b).b();
        } else {
            ((F) this.b).c();
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice camera) {
        Intrinsics.h(camera, "camera");
        if (this.f18349a.compareAndSet(false, true)) {
            ((F) this.b).a(camera);
        }
    }
}
