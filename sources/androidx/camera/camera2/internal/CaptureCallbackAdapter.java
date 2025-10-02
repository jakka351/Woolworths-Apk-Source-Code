package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.TagBundle;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
final class CaptureCallbackAdapter extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureCallback f262a;

    public CaptureCallbackAdapter(CameraCaptureCallback cameraCaptureCallback) {
        if (cameraCaptureCallback == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f262a = cameraCaptureCallback;
    }

    public static int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof TagBundle) && (num = (Integer) ((TagBundle) captureRequest.getTag()).f504a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        TagBundle tagBundle;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            Preconditions.a("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof TagBundle);
            tagBundle = (TagBundle) tag;
        } else {
            tagBundle = TagBundle.b;
        }
        this.f262a.b(a(captureRequest), new Camera2CameraCaptureResult(tagBundle, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f262a.c(a(captureRequest), new CameraCaptureFailure());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        this.f262a.d(a(captureRequest));
    }
}
