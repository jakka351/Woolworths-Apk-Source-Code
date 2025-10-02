package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class CameraManagerCompat {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManagerCompatImpl f304a;
    public final ArrayMap b = new ArrayMap(4);

    public static final class AvailabilityCallbackExecutorWrapper extends CameraManager.AvailabilityCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f305a;
        public final CameraManager.AvailabilityCallback b;
        public final Object c = new Object();
        public boolean d = false;

        public AvailabilityCallbackExecutorWrapper(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f305a = executor;
            this.b = availabilityCallback;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.f305a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.d.b.onCameraAccessPrioritiesChanged();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.f305a.execute(new f(this, str, 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.f305a.execute(new f(this, str, 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface CameraManagerCompatImpl {
        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void b(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        CameraCharacteristics c(String str);

        Set d();

        String[] e();

        void f(CameraManager.AvailabilityCallback availabilityCallback);
    }

    public CameraManagerCompat(CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.f304a = cameraManagerCompatImpl;
    }

    public static CameraManagerCompat a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new CameraManagerCompat(i >= 30 ? new CameraManagerCompatApi30Impl(context, null) : i >= 29 ? new CameraManagerCompatApi29Impl(context, null) : new CameraManagerCompatApi28Impl(context, null));
    }

    public final CameraCharacteristicsCompat b(String str) {
        CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.b) {
            cameraCharacteristicsCompat = (CameraCharacteristicsCompat) this.b.get(str);
            if (cameraCharacteristicsCompat == null) {
                try {
                    CameraCharacteristicsCompat cameraCharacteristicsCompat2 = new CameraCharacteristicsCompat(str, this.f304a.c(str));
                    this.b.put(str, cameraCharacteristicsCompat2);
                    cameraCharacteristicsCompat = cameraCharacteristicsCompat2;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e.getMessage(), e);
                }
            }
        }
        return cameraCharacteristicsCompat;
    }
}
