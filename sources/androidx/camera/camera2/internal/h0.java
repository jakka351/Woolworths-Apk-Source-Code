package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* loaded from: classes2.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ CallbackToFutureAdapter.Completer e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h0(FocusMeteringControl focusMeteringControl, boolean z, CallbackToFutureAdapter.Completer completer) {
        this.g = focusMeteringControl;
        this.f = z;
        this.e = completer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener, androidx.camera.camera2.internal.d0] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                final FocusMeteringControl focusMeteringControl = (FocusMeteringControl) this.g;
                boolean z = this.f;
                final CallbackToFutureAdapter.Completer completer = this.e;
                Camera2CameraControlImpl camera2CameraControlImpl = focusMeteringControl.f275a;
                camera2CameraControlImpl.b.f229a.remove(focusMeteringControl.u);
                focusMeteringControl.t = z;
                if (!focusMeteringControl.d) {
                    completer.d(new CameraControl.OperationCanceledException("Camera is not active."));
                    break;
                } else {
                    final long jZ = focusMeteringControl.f275a.z();
                    ?? r1 = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.d0
                        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
                        public final boolean a(TotalCaptureResult totalCaptureResult) {
                            boolean z2 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                            Logger.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z2);
                            if (z2 != focusMeteringControl.t || !Camera2CameraControlImpl.x(totalCaptureResult, jZ)) {
                                return false;
                            }
                            Logger.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z2);
                            completer.b(null);
                            return true;
                        }
                    };
                    focusMeteringControl.u = r1;
                    focusMeteringControl.f275a.p(r1);
                    break;
                }
            default:
                ((TorchControl) this.g).a(this.e, this.f);
                break;
        }
    }

    public /* synthetic */ h0(TorchControl torchControl, CallbackToFutureAdapter.Completer completer, boolean z) {
        this.g = torchControl;
        this.e = completer;
        this.f = z;
    }
}
