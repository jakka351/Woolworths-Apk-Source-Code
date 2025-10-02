package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class SynchronizedCaptureSessionStateCallbacks extends SynchronizedCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f287a;

    public static class Adapter extends SynchronizedCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f288a;

        public Adapter(List list) {
            this.f288a = list.isEmpty() ? new CameraCaptureSessionStateCallbacks.NoOpSessionStateCallback() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new CameraCaptureSessionStateCallbacks.ComboSessionStateCallback(list);
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void j(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f288a.onActive(synchronizedCaptureSession.d().c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void k(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f288a.onCaptureQueueEmpty(synchronizedCaptureSession.d().c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void l(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f288a.onClosed(synchronizedCaptureSession.d().c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void m(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f288a.onConfigureFailed(synchronizedCaptureSession.d().c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void n(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f288a.onConfigured(synchronizedCaptureSession.d().c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void o(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f288a.onReady(synchronizedCaptureSession.d().c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void p(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void q(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
            this.f288a.onSurfacePrepared(synchronizedCaptureSession.d().c(), surface);
        }
    }

    public SynchronizedCaptureSessionStateCallbacks(List list) {
        ArrayList arrayList = new ArrayList();
        this.f287a = arrayList;
        arrayList.addAll(list);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void j(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f287a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).j(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void k(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f287a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).k(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void l(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f287a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).l(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void m(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f287a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).m(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void n(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f287a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).n(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void o(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f287a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).o(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void p(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f287a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).p(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void q(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        Iterator it = this.f287a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).q(synchronizedCaptureSession, surface);
        }
    }
}
