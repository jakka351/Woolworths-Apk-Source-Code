package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* loaded from: classes2.dex */
class CameraDeviceCompatBaseImpl implements CameraDeviceCompat.CameraDeviceCompatImpl {

    /* renamed from: a, reason: collision with root package name */
    public final CameraDevice f303a;
    public final Object b;

    public static class CameraDeviceCompatParamsApi21 {
    }

    public CameraDeviceCompatBaseImpl(CameraDevice cameraDevice, Object obj) {
        cameraDevice.getClass();
        this.f303a = cameraDevice;
        this.b = obj;
    }
}
