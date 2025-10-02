package androidx.camera.camera2.internal;

import androidx.camera.core.Logger;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl e;
    public final /* synthetic */ SynchronizedCaptureSession f;

    public /* synthetic */ m0(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, SynchronizedCaptureSession synchronizedCaptureSession, int i) {
        this.d = i;
        this.e = synchronizedCaptureSessionBaseImpl;
        this.f = synchronizedCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = this.e;
                SynchronizedCaptureSession synchronizedCaptureSession = this.f;
                CaptureSessionRepository captureSessionRepository = synchronizedCaptureSessionBaseImpl.b;
                synchronized (captureSessionRepository.b) {
                    captureSessionRepository.c.remove(synchronizedCaptureSessionBaseImpl);
                    captureSessionRepository.d.remove(synchronizedCaptureSessionBaseImpl);
                }
                synchronizedCaptureSessionBaseImpl.p(synchronizedCaptureSession);
                if (synchronizedCaptureSessionBaseImpl.f != null) {
                    Objects.requireNonNull(synchronizedCaptureSessionBaseImpl.e);
                    synchronizedCaptureSessionBaseImpl.e.l(synchronizedCaptureSession);
                    return;
                } else {
                    Logger.e("SyncCaptureSessionBase", "[" + synchronizedCaptureSessionBaseImpl + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                    return;
                }
            default:
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = this.e;
                SynchronizedCaptureSession synchronizedCaptureSession2 = this.f;
                Objects.requireNonNull(synchronizedCaptureSessionBaseImpl2.e);
                synchronizedCaptureSessionBaseImpl2.e.p(synchronizedCaptureSession2);
                return;
        }
    }
}
