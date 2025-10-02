package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper e;
    public final /* synthetic */ CameraCaptureSession f;

    public /* synthetic */ a(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, int i) {
        this.d = i;
        this.e = stateCallbackExecutorWrapper;
        this.f = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            default:
                throw null;
        }
    }
}
