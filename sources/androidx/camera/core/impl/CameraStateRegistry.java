package androidx.camera.core.impl;

import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.Camera;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class CameraStateRegistry implements CameraCoordinator.ConcurrentCameraModeListener {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f479a = new StringBuilder();
    public final Object b;
    public int c;
    public final Camera2CameraCoordinator d;
    public final HashMap e;
    public int f;

    public static class CameraRegistration {

        /* renamed from: a, reason: collision with root package name */
        public CameraInternal.State f480a = null;
        public final Executor b;
        public final OnConfigureAvailableListener c;
        public final OnOpenAvailableListener d;

        public CameraRegistration(Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
            this.b = executor;
            this.c = onConfigureAvailableListener;
            this.d = onOpenAvailableListener;
        }
    }

    public interface OnConfigureAvailableListener {
        void a();
    }

    public interface OnOpenAvailableListener {
        void a();
    }

    public CameraStateRegistry(Camera2CameraCoordinator camera2CameraCoordinator) {
        Object obj = new Object();
        this.b = obj;
        this.e = new HashMap();
        this.c = 1;
        synchronized (obj) {
            this.d = camera2CameraCoordinator;
            this.f = this.c;
        }
    }

    public static void g(Camera camera, CameraInternal.State state) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Trace.d()) {
            Trace.e(state.ordinal(), "CX:State[" + camera + "]");
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    public final void a(int i, int i2) {
        synchronized (this.b) {
            boolean z = true;
            this.c = i2 == 2 ? 2 : 1;
            boolean z2 = i != 2 && i2 == 2;
            if (i != 2 || i2 == 2) {
                z = false;
            }
            if (z2 || z) {
                e();
            }
        }
    }

    public final CameraRegistration b(String str) {
        HashMap map = this.e;
        for (Camera camera : map.keySet()) {
            if (str.equals(((CameraInfoInternal) camera.b()).b())) {
                return (CameraRegistration) map.get(camera);
            }
        }
        return null;
    }

    public final boolean c() {
        synchronized (this.b) {
            try {
                Iterator it = this.e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((CameraRegistration) ((Map.Entry) it.next()).getValue()).f480a == CameraInternal.State.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.camera.core.Camera r8, androidx.camera.core.impl.CameraInternal.State r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.d(androidx.camera.core.Camera, androidx.camera.core.impl.CameraInternal$State, boolean):void");
    }

    public final void e() {
        boolean zD = Logger.d(3, "CameraStateRegistry");
        StringBuilder sb = this.f479a;
        if (zD) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.e.entrySet()) {
            if (Logger.d(3, "CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((Camera) entry.getKey()).toString(), ((CameraRegistration) entry.getValue()).f480a != null ? ((CameraRegistration) entry.getValue()).f480a.toString() : "UNKNOWN"));
            }
            CameraInternal.State state = ((CameraRegistration) entry.getValue()).f480a;
            if (state != null && state.d) {
                i++;
            }
        }
        if (Logger.d(3, "CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(b.j(i, this.c, "Open count: ", " (Max allowed: ", ")"));
            Logger.a("CameraStateRegistry", sb.toString());
        }
        this.f = Math.max(this.c - i, 0);
    }

    public final void f(Camera camera, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.b) {
            Preconditions.f("Camera is already registered: " + camera, !this.e.containsKey(camera));
            this.e.put(camera, new CameraRegistration(executor, onConfigureAvailableListener, onOpenAvailableListener));
        }
    }

    public final boolean h(Camera camera) {
        boolean z;
        synchronized (this.b) {
            try {
                CameraRegistration cameraRegistration = (CameraRegistration) this.e.get(camera);
                Preconditions.e(cameraRegistration, "Camera must first be registered with registerCamera()");
                z = true;
                if (Logger.d(3, "CameraStateRegistry")) {
                    this.f479a.setLength(0);
                    StringBuilder sb = this.f479a;
                    Locale locale = Locale.US;
                    Integer numValueOf = Integer.valueOf(this.f);
                    CameraInternal.State state = cameraRegistration.f480a;
                    sb.append(String.format(locale, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", camera, numValueOf, Boolean.valueOf(state != null && state.d), cameraRegistration.f480a));
                }
                if (this.f > 0) {
                    CameraInternal.State state2 = CameraInternal.State.OPENING;
                    cameraRegistration.f480a = state2;
                    g(camera, state2);
                } else {
                    CameraInternal.State state3 = cameraRegistration.f480a;
                    if (state3 != null && state3.d) {
                        CameraInternal.State state22 = CameraInternal.State.OPENING;
                        cameraRegistration.f480a = state22;
                        g(camera, state22);
                    } else {
                        z = false;
                    }
                }
                if (Logger.d(3, "CameraStateRegistry")) {
                    StringBuilder sb2 = this.f479a;
                    Locale locale2 = Locale.US;
                    sb2.append(" --> ".concat(z ? "SUCCESS" : "FAIL"));
                    Logger.a("CameraStateRegistry", this.f479a.toString());
                }
                if (z) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean i(String str, String str2) {
        synchronized (this.b) {
            try {
                boolean z = true;
                if (this.d.e != 2) {
                    return true;
                }
                CameraRegistration cameraRegistrationB = b(str);
                CameraInternal.State state = cameraRegistrationB != null ? cameraRegistrationB.f480a : null;
                CameraRegistration cameraRegistrationB2 = str2 != null ? b(str2) : null;
                CameraInternal.State state2 = cameraRegistrationB2 != null ? cameraRegistrationB2.f480a : null;
                CameraInternal.State state3 = CameraInternal.State.OPEN;
                boolean z2 = state3.equals(state) || CameraInternal.State.CONFIGURED.equals(state);
                boolean z3 = state3.equals(state2) || CameraInternal.State.CONFIGURED.equals(state2);
                if (!z2 || !z3) {
                    z = false;
                }
                return z;
            } finally {
            }
        }
    }
}
