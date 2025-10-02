package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CameraDeviceCompat.StateCallbackExecutorWrapper e;
    public final /* synthetic */ CameraDevice f;

    public /* synthetic */ d(CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraDevice cameraDevice, int i) {
        this.d = i;
        this.e = stateCallbackExecutorWrapper;
        this.f = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.f302a.onClosed(this.f);
                break;
            case 1:
                this.e.f302a.onDisconnected(this.f);
                break;
            default:
                this.e.f302a.onOpened(this.f);
                break;
        }
    }
}
