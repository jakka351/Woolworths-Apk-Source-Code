package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class ZoomControl {

    /* renamed from: a, reason: collision with root package name */
    public final Camera2CameraControlImpl f292a;
    public final Executor b;
    public final ZoomStateImpl c;
    public final MutableLiveData d;
    public final ZoomImpl e;
    public boolean f = false;
    public final Camera2CameraControlImpl.CaptureResultListener g;

    public interface ZoomImpl {
        void a(TotalCaptureResult totalCaptureResult);

        void b(Camera2ImplConfig.Builder builder);

        float c();

        float d();

        void e(float f, CallbackToFutureAdapter.Completer completer);

        void f();

        Rect g();
    }

    public ZoomControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.ZoomControl.1
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                ZoomControl.this.e.a(totalCaptureResult);
                return false;
            }
        };
        this.g = captureResultListener;
        this.f292a = camera2CameraControlImpl;
        this.b = executor;
        ZoomImpl zoomImplA = a(cameraCharacteristicsCompat);
        this.e = zoomImplA;
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(zoomImplA.d(), zoomImplA.c());
        this.c = zoomStateImpl;
        zoomStateImpl.f(1.0f);
        this.d = new MutableLiveData(ImmutableZoomState.f(zoomStateImpl));
        camera2CameraControlImpl.p(captureResultListener);
    }

    public static ZoomImpl a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) cameraCharacteristicsCompat.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError e) {
                Logger.f("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
                range = null;
            }
            if (range != null) {
                return new AndroidRZoomImpl(cameraCharacteristicsCompat);
            }
        }
        return new CropRegionZoomImpl(cameraCharacteristicsCompat);
    }

    public final void b(CallbackToFutureAdapter.Completer completer, ZoomState zoomState) {
        ZoomState zoomStateF;
        if (this.f) {
            this.e.e(zoomState.d(), completer);
            this.f292a.z();
            return;
        }
        synchronized (this.c) {
            this.c.f(1.0f);
            zoomStateF = ImmutableZoomState.f(this.c);
        }
        c(zoomStateF);
        completer.d(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    public final void c(ZoomState zoomState) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        MutableLiveData mutableLiveData = this.d;
        if (looperMyLooper == mainLooper) {
            mutableLiveData.m(zoomState);
        } else {
            mutableLiveData.j(zoomState);
        }
    }
}
