package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class CaptureSessionRepository {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f268a;
    public final Object b = new Object();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final CameraDevice.StateCallback f = new AnonymousClass1();

    /* renamed from: androidx.camera.camera2.internal.CaptureSessionRepository$1, reason: invalid class name */
    public class AnonymousClass1 extends CameraDevice.StateCallback {
        public static final /* synthetic */ int b = 0;

        public AnonymousClass1() {
        }

        public final void a() {
            ArrayList arrayListB;
            synchronized (CaptureSessionRepository.this.b) {
                arrayListB = CaptureSessionRepository.this.b();
                CaptureSessionRepository.this.e.clear();
                CaptureSessionRepository.this.c.clear();
                CaptureSessionRepository.this.d.clear();
            }
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                ((SynchronizedCaptureSession) it.next()).g();
            }
        }

        public final void b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (CaptureSessionRepository.this.b) {
                linkedHashSet.addAll(CaptureSessionRepository.this.e);
                linkedHashSet.addAll(CaptureSessionRepository.this.c);
            }
            CaptureSessionRepository.this.f268a.execute(new m(linkedHashSet, 4));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (CaptureSessionRepository.this.b) {
                linkedHashSet.addAll(CaptureSessionRepository.this.e);
                linkedHashSet.addAll(CaptureSessionRepository.this.c);
            }
            CaptureSessionRepository.this.f268a.execute(new c0(i, 0, linkedHashSet));
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
        }
    }

    public CaptureSessionRepository(Executor executor) {
        this.f268a = executor;
    }

    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.c);
        }
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(a());
            synchronized (this.b) {
                arrayList2 = new ArrayList(this.e);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
