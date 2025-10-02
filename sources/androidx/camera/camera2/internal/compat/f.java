package androidx.camera.camera2.internal.compat;

import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CameraManagerCompat.AvailabilityCallbackExecutorWrapper e;
    public final /* synthetic */ String f;

    public /* synthetic */ f(CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper, String str, int i) {
        this.d = i;
        this.e = availabilityCallbackExecutorWrapper;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.b.onCameraAvailable(this.f);
                break;
            default:
                this.e.b.onCameraUnavailable(this.f);
                break;
        }
    }
}
