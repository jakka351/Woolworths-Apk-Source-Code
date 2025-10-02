package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager;
import com.scandit.datacapture.core.internal.module.source.NativeCameraInfo;
import com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0789q0 implements BarcodeFindCameraManager {
    private final CameraSettings b;
    private final Lazy c;

    public C0789q0(CameraSettings cameraSettings) {
        Intrinsics.h(cameraSettings, "cameraSettings");
        this.b = cameraSettings;
        this.c = LazyKt.b(new C0771p0(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final void a(float f) {
        this.b.setZoomFactor(f);
        Camera camera = (Camera) this.c.getD();
        if (camera != null) {
            Camera.applySettings$default(camera, this.b, null, 2, null);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final void b() {
        Camera camera = (Camera) this.c.getD();
        if (camera == null) {
            return;
        }
        FrameSourceState currentState = camera.getCurrentState();
        FrameSourceState frameSourceState = FrameSourceState.OFF;
        if (currentState != frameSourceState) {
            camera.switchToDesiredState(frameSourceState);
            camera.getF18831a().flushPendingTasks();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final Float c() {
        NativeAndroidCamera f18831a;
        NativeCameraInfo cameraInfo;
        NativeFloatRange availableZoomRange;
        Camera camera = (Camera) this.c.getD();
        if (camera == null || (f18831a = camera.getF18831a()) == null || (cameraInfo = f18831a.getCameraInfo()) == null || (availableZoomRange = cameraInfo.getAvailableZoomRange()) == null) {
            return null;
        }
        float min = availableZoomRange.getMin();
        Float fValueOf = Float.valueOf(min);
        if (min < 1.0f) {
            return fValueOf;
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final void d() {
        Camera camera = (Camera) this.c.getD();
        if (camera != null) {
            camera.switchToDesiredState(FrameSourceState.ON);
        }
    }

    public final CameraSettings e() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final Camera a() {
        return (Camera) this.c.getD();
    }
}
