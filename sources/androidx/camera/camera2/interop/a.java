package androidx.camera.camera2.interop;

import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.q;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int d;
    public final /* synthetic */ Camera2CameraControl e;

    public /* synthetic */ a(Camera2CameraControl camera2CameraControl, int i) {
        this.d = i;
        this.e = camera2CameraControl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
        switch (this.d) {
            case 0:
                final Camera2CameraControl camera2CameraControl = this.e;
                final int i = 1;
                camera2CameraControl.d.execute(new Runnable() { // from class: androidx.camera.camera2.interop.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                Camera2CameraControl camera2CameraControl2 = camera2CameraControl;
                                camera2CameraControl2.b = true;
                                CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options.");
                                CallbackToFutureAdapter.Completer completer2 = camera2CameraControl2.g;
                                if (completer2 != null) {
                                    completer2.d(operationCanceledException);
                                    camera2CameraControl2.g = null;
                                }
                                camera2CameraControl2.g = completer;
                                if (camera2CameraControl2.f381a) {
                                    Camera2CameraControlImpl camera2CameraControlImpl = camera2CameraControl2.c;
                                    camera2CameraControlImpl.getClass();
                                    Futures.h(CallbackToFutureAdapter.a(new q(camera2CameraControlImpl, 8))).addListener(new d(camera2CameraControl2, 0), camera2CameraControl2.d);
                                    camera2CameraControl2.b = false;
                                    break;
                                }
                                break;
                            default:
                                Camera2CameraControl camera2CameraControl3 = camera2CameraControl;
                                camera2CameraControl3.b = true;
                                CameraControl.OperationCanceledException operationCanceledException2 = new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options.");
                                CallbackToFutureAdapter.Completer completer3 = camera2CameraControl3.g;
                                if (completer3 != null) {
                                    completer3.d(operationCanceledException2);
                                    camera2CameraControl3.g = null;
                                }
                                camera2CameraControl3.g = completer;
                                if (camera2CameraControl3.f381a) {
                                    Camera2CameraControlImpl camera2CameraControlImpl2 = camera2CameraControl3.c;
                                    camera2CameraControlImpl2.getClass();
                                    Futures.h(CallbackToFutureAdapter.a(new q(camera2CameraControlImpl2, 8))).addListener(new d(camera2CameraControl3, 0), camera2CameraControl3.d);
                                    camera2CameraControl3.b = false;
                                    break;
                                }
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final Camera2CameraControl camera2CameraControl2 = this.e;
                final int i2 = 0;
                camera2CameraControl2.d.execute(new Runnable() { // from class: androidx.camera.camera2.interop.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                Camera2CameraControl camera2CameraControl22 = camera2CameraControl2;
                                camera2CameraControl22.b = true;
                                CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options.");
                                CallbackToFutureAdapter.Completer completer2 = camera2CameraControl22.g;
                                if (completer2 != null) {
                                    completer2.d(operationCanceledException);
                                    camera2CameraControl22.g = null;
                                }
                                camera2CameraControl22.g = completer;
                                if (camera2CameraControl22.f381a) {
                                    Camera2CameraControlImpl camera2CameraControlImpl = camera2CameraControl22.c;
                                    camera2CameraControlImpl.getClass();
                                    Futures.h(CallbackToFutureAdapter.a(new q(camera2CameraControlImpl, 8))).addListener(new d(camera2CameraControl22, 0), camera2CameraControl22.d);
                                    camera2CameraControl22.b = false;
                                    break;
                                }
                                break;
                            default:
                                Camera2CameraControl camera2CameraControl3 = camera2CameraControl2;
                                camera2CameraControl3.b = true;
                                CameraControl.OperationCanceledException operationCanceledException2 = new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options.");
                                CallbackToFutureAdapter.Completer completer3 = camera2CameraControl3.g;
                                if (completer3 != null) {
                                    completer3.d(operationCanceledException2);
                                    camera2CameraControl3.g = null;
                                }
                                camera2CameraControl3.g = completer;
                                if (camera2CameraControl3.f381a) {
                                    Camera2CameraControlImpl camera2CameraControlImpl2 = camera2CameraControl3.c;
                                    camera2CameraControlImpl2.getClass();
                                    Futures.h(CallbackToFutureAdapter.a(new q(camera2CameraControlImpl2, 8))).addListener(new d(camera2CameraControl3, 0), camera2CameraControl3.d);
                                    camera2CameraControl3.b = false;
                                    break;
                                }
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
