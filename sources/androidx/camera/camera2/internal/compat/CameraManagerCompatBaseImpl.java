package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class CameraManagerCompatBaseImpl implements CameraManagerCompat.CameraManagerCompatImpl {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f306a;
    public final Object b;

    public static final class CameraManagerCompatParamsApi21 {
    }

    public CameraManagerCompatBaseImpl(Context context, Object obj) {
        this.f306a = (CameraManager) context.getSystemService("camera");
        this.b = obj;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManagerCompatParamsApi21) this.b).getClass();
        throw null;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void b(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        executor.getClass();
        stateCallback.getClass();
        CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new CameraDeviceCompat.StateCallbackExecutorWrapper(executor, stateCallback);
        CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (CameraManagerCompatParamsApi21) this.b;
        try {
            CameraManager cameraManager = this.f306a;
            cameraManagerCompatParamsApi21.getClass();
            cameraManager.openCamera(str, stateCallbackExecutorWrapper, (Handler) null);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraCharacteristics c(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f306a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public Set d() {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public final String[] e() throws CameraAccessExceptionCompat {
        try {
            return this.f306a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void f(CameraManager.AvailabilityCallback availabilityCallback) {
        if (availabilityCallback == null) {
            this.f306a.unregisterAvailabilityCallback(null);
        } else {
            ((CameraManagerCompatParamsApi21) this.b).getClass();
            throw null;
        }
    }
}
