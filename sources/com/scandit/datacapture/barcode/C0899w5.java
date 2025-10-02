package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceListener;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.w5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0899w5 implements CameraManager {

    /* renamed from: a, reason: collision with root package name */
    private FrameSourceListener f18248a;
    private final Camera b;

    public C0899w5(CameraPosition cameraPosition, CameraSettings cameraSettings) {
        Intrinsics.h(cameraPosition, "cameraPosition");
        Intrinsics.h(cameraSettings, "cameraSettings");
        this.b = Camera.INSTANCE.getCamera(cameraPosition, cameraSettings);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager
    public final void a(Function1 action) {
        Camera camera;
        Intrinsics.h(action, "action");
        FrameSourceListener frameSourceListener = this.f18248a;
        if (frameSourceListener != null && (camera = this.b) != null) {
            camera.removeListener(frameSourceListener);
        }
        Camera camera2 = this.b;
        this.f18248a = camera2 != null ? Ee.a(camera2, new C0884v5(action, this)) : null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager
    public final void a(Function0 onDone) {
        Intrinsics.h(onDone, "onDone");
        Camera camera = this.b;
        if (camera != null) {
            camera._switchToDesiredTorchState(TorchState.OFF, onDone);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager
    public final void a(DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        FrameSource frameSource = dataCaptureContext.get_frameSource();
        if (frameSource != null) {
            FrameSourceState desiredState = frameSource.getDesiredState();
            FrameSourceState frameSourceState = FrameSourceState.OFF;
            if (desiredState != frameSourceState) {
                FrameSource.DefaultImpls.switchToDesiredState$default(frameSource, frameSourceState, null, 2, null);
            }
        }
        DataCaptureContext.setFrameSource$default(dataCaptureContext, this.b, null, 2, null);
    }
}
