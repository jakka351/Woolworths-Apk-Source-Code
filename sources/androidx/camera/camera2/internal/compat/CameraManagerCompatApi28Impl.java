package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

@RequiresApi
/* loaded from: classes2.dex */
class CameraManagerCompatApi28Impl extends CameraManagerCompatBaseImpl {
    public static boolean g(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public final void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f306a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void b(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        try {
            this.f306a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        } catch (IllegalArgumentException e2) {
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (!g(e4)) {
                throw e4;
            }
            throw new CameraAccessExceptionCompat(e4);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraCharacteristics c(String str) throws CameraAccessExceptionCompat {
        try {
            return super.c(str);
        } catch (RuntimeException e) {
            if (g(e)) {
                throw new CameraAccessExceptionCompat(e);
            }
            throw e;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public final void f(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f306a.unregisterAvailabilityCallback(availabilityCallback);
    }
}
