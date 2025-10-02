package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CameraCaptureCallback e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h(CameraCaptureCallback cameraCaptureCallback, int i, Object obj, int i2) {
        this.d = i2;
        this.e = cameraCaptureCallback;
        this.f = i;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.c(this.f, (CameraCaptureFailure) this.g);
                break;
            default:
                this.e.b(this.f, (CameraCaptureResult) this.g);
                break;
        }
    }
}
