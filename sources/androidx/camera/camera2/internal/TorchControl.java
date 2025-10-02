package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.utils.Threads;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class TorchControl {

    /* renamed from: a, reason: collision with root package name */
    public final Camera2CameraControlImpl f290a;
    public final MutableLiveData b = new MutableLiveData(0);
    public final boolean c;
    public final Executor d;
    public boolean e;
    public CallbackToFutureAdapter.Completer f;
    public boolean g;

    public TorchControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.f290a = camera2CameraControlImpl;
        this.d = executor;
        this.c = FlashAvailabilityChecker.a(new q(cameraCharacteristicsCompat, 9));
        camera2CameraControlImpl.p(new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.n0
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                TorchControl torchControl = this.f377a;
                if (torchControl.f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == torchControl.g) {
                        torchControl.f.b(null);
                        torchControl.f = null;
                    }
                }
                return false;
            }
        });
    }

    public static void b(MutableLiveData mutableLiveData, Integer num) {
        if (Threads.b()) {
            mutableLiveData.m(num);
        } else {
            mutableLiveData.j(num);
        }
    }

    public final void a(CallbackToFutureAdapter.Completer completer, boolean z) {
        if (!this.c) {
            if (completer != null) {
                completer.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z2 = this.e;
        MutableLiveData mutableLiveData = this.b;
        if (!z2) {
            b(mutableLiveData, 0);
            if (completer != null) {
                completer.d(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.g = z;
        this.f290a.r(z);
        b(mutableLiveData, Integer.valueOf(z ? 1 : 0));
        CallbackToFutureAdapter.Completer completer2 = this.f;
        if (completer2 != null) {
            completer2.d(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f = completer;
    }
}
