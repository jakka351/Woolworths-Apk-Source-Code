package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class CameraDeviceStateCallbacks {

    public static final class ComboDeviceStateCallback extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f259a = new ArrayList();

        public ComboDeviceStateCallback(ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
                if (!(stateCallback instanceof NoOpDeviceStateCallback)) {
                    this.f259a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            Iterator it = this.f259a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            Iterator it = this.f259a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            Iterator it = this.f259a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            Iterator it = this.f259a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
            }
        }
    }

    public static final class NoOpDeviceStateCallback extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
        }
    }

    public static CameraDevice.StateCallback a(ArrayList arrayList) {
        return arrayList.isEmpty() ? new NoOpDeviceStateCallback() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new ComboDeviceStateCallback(arrayList);
    }
}
