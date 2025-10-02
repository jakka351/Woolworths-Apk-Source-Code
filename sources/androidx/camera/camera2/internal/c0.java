package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.CaptureSessionRepository;
import androidx.camera.core.impl.CameraCaptureCallback;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c0(int i, int i2, Object obj) {
        this.d = i2;
        this.f = obj;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        int i2 = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                int i3 = CaptureSessionRepository.AnonymousClass1.b;
                Iterator it = ((LinkedHashSet) obj).iterator();
                while (it.hasNext()) {
                    ((SynchronizedCaptureSession) it.next()).b(i2);
                }
                break;
            default:
                ((CameraCaptureCallback) obj).a(i2);
                break;
        }
    }
}
