package androidx.camera.camera2.interop;

import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.q;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(Object obj, boolean z, int i) {
        this.d = i;
        this.f = obj;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.f;
        boolean z = this.e;
        switch (i) {
            case 0:
                Camera2CameraControl camera2CameraControl = (Camera2CameraControl) obj;
                if (camera2CameraControl.f381a != z) {
                    camera2CameraControl.f381a = z;
                    if (!z) {
                        CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("The camera control has became inactive.");
                        CallbackToFutureAdapter.Completer completer = camera2CameraControl.g;
                        if (completer != null) {
                            completer.d(operationCanceledException);
                            camera2CameraControl.g = null;
                            break;
                        }
                    } else if (camera2CameraControl.b) {
                        Camera2CameraControlImpl camera2CameraControlImpl = camera2CameraControl.c;
                        camera2CameraControlImpl.getClass();
                        Futures.h(CallbackToFutureAdapter.a(new q(camera2CameraControlImpl, 8))).addListener(new d(camera2CameraControl, 0), camera2CameraControl.d);
                        camera2CameraControl.b = false;
                        break;
                    }
                }
                break;
            case 1:
                AudioRendererEventListener audioRendererEventListener = ((AudioRendererEventListener.EventDispatcher) obj).b;
                int i2 = Util.f2928a;
                audioRendererEventListener.o(z);
                break;
            default:
                ScannerActivityOld scannerActivityOld = (ScannerActivityOld) obj;
                int i3 = ScannerActivityOld.U;
                if (!z) {
                    scannerActivityOld.getWindow().clearFlags(16);
                    break;
                } else {
                    scannerActivityOld.getWindow().setFlags(16, 16);
                    break;
                }
        }
    }

    public /* synthetic */ b(boolean z, ScannerActivityOld scannerActivityOld) {
        this.d = 2;
        this.e = z;
        this.f = scannerActivityOld;
    }
}
