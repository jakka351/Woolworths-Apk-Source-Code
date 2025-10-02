package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.CameraBurstCaptureCallback;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements CallbackToFutureAdapter.Resolver, CameraBurstCaptureCallback.CaptureSequenceCallback {
    public final /* synthetic */ CaptureSession d;

    public void a() {
        CaptureSession captureSession = this.d;
        synchronized (captureSession.f264a) {
            try {
                if (captureSession.i == CaptureSession.State.h) {
                    captureSession.o(captureSession.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        String str;
        CaptureSession captureSession = this.d;
        synchronized (captureSession.f264a) {
            Preconditions.f("Release completer expected to be null", captureSession.k == null);
            captureSession.k = completer;
            str = "Release[session=" + captureSession + "]";
        }
        return str;
    }
}
