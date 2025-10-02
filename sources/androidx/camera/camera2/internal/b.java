package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) obj;
                Camera2CameraControlImpl.CameraCaptureCallbackSet cameraCaptureCallbackSet = ((Camera2CameraControlImpl) obj2).z;
                cameraCaptureCallbackSet.f228a.remove(cameraCaptureCallback);
                cameraCaptureCallbackSet.b.remove(cameraCaptureCallback);
                break;
            case 1:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                int i2 = Camera2CameraControlImpl.CameraControlSessionCallback.c;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = ((Camera2CameraControlImpl.CameraControlSessionCallback) obj2).f229a;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    Camera2CameraControlImpl.CaptureResultListener captureResultListener = (Camera2CameraControlImpl.CaptureResultListener) it.next();
                    if (captureResultListener.a(totalCaptureResult)) {
                        hashSet.add(captureResultListener);
                    }
                }
                if (!hashSet.isEmpty()) {
                    hashSet2.removeAll(hashSet);
                    break;
                }
                break;
            case 2:
                Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) obj2;
                CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) obj;
                MeteringRepeatingSession meteringRepeatingSession = camera2CameraImpl.A;
                if (meteringRepeatingSession != null) {
                    completer.b(Boolean.valueOf(camera2CameraImpl.d.d(Camera2CameraImpl.y(meteringRepeatingSession))));
                    break;
                } else {
                    completer.b(Boolean.FALSE);
                    break;
                }
            case 3:
                Camera2CameraImpl camera2CameraImpl2 = (Camera2CameraImpl) obj2;
                String str = (String) obj;
                camera2CameraImpl2.v(YU.a.h("Use case ", str, " INACTIVE"), null);
                LinkedHashMap linkedHashMap = camera2CameraImpl2.d.b;
                if (linkedHashMap.containsKey(str)) {
                    UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) linkedHashMap.get(str);
                    useCaseAttachInfo.f = false;
                    if (!useCaseAttachInfo.e) {
                        linkedHashMap.remove(str);
                    }
                }
                camera2CameraImpl2.M();
                break;
            case 4:
                ((Camera2CameraControlImpl) obj2).b.f229a.remove((Camera2CapturePipeline.ResultListener) obj);
                break;
            case 5:
                ((FocusMeteringControl) obj2).e((CallbackToFutureAdapter.Completer) obj);
                break;
            case 6:
                DeferrableSurface deferrableSurface = (DeferrableSurface) obj;
                DeferrableSurfaces.a(((ProcessingCaptureSession) obj2).e);
                if (deferrableSurface != null) {
                    deferrableSurface.b();
                    break;
                }
                break;
            case 7:
                final Camera2CameraControlImpl camera2CameraControlImpl = (Camera2CameraControlImpl) obj2;
                final long jZ = camera2CameraControlImpl.z();
                Futures.i((CallbackToFutureAdapter.Completer) obj, CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.e
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(final CallbackToFutureAdapter.Completer completer2) {
                        final long j = jZ;
                        camera2CameraControlImpl.p(new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.f
                            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
                            public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                if (!Camera2CameraControlImpl.x(totalCaptureResult2, j)) {
                                    return false;
                                }
                                completer2.b(null);
                                return true;
                            }
                        });
                        return "waitForSessionUpdateId:" + j;
                    }
                }));
                break;
            case 8:
                ((Surface) obj2).release();
                ((SurfaceTexture) obj).release();
                break;
            default:
                ((SessionConfig.ErrorListener) obj2).a((SessionConfig) obj);
                break;
        }
    }
}
