package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.CameraCaptureCallback;

/* loaded from: classes2.dex */
final class CaptureCallbackContainer extends CameraCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f263a;

    public CaptureCallbackContainer(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f263a = captureCallback;
    }
}
