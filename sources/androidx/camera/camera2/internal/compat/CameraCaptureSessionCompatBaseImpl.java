package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* loaded from: classes2.dex */
class CameraCaptureSessionCompatBaseImpl implements CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession f298a;
    public final Object b;

    public static class CameraCaptureSessionCompatParamsApi21 {
    }

    public CameraCaptureSessionCompatBaseImpl(CameraCaptureSession cameraCaptureSession, Object obj) {
        cameraCaptureSession.getClass();
        this.f298a = cameraCaptureSession;
        this.b = obj;
    }
}
