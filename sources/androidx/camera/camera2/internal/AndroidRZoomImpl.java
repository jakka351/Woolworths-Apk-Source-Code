package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ZoomControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.Config;
import androidx.concurrent.futures.CallbackToFutureAdapter;

@RequiresApi
/* loaded from: classes2.dex */
final class AndroidRZoomImpl implements ZoomControl.ZoomImpl {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCharacteristicsCompat f224a;
    public final Range b;
    public CallbackToFutureAdapter.Completer d;
    public final boolean f;
    public float c = 1.0f;
    public float e = 1.0f;

    public AndroidRZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f = false;
        this.f224a = cameraCharacteristicsCompat;
        this.b = (Range) cameraCharacteristicsCompat.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f = cameraCharacteristicsCompat.c();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final void a(TotalCaptureResult totalCaptureResult) {
        if (this.d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.e == f.floatValue()) {
                this.d.b(null);
                this.d = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final void b(Camera2ImplConfig.Builder builder) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.c);
        Config.OptionPriority optionPriority = Config.OptionPriority.f;
        builder.d(key, fValueOf, optionPriority);
        if (!this.f || Build.VERSION.SDK_INT < 34) {
            return;
        }
        builder.d(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, optionPriority);
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final float c() {
        return ((Float) this.b.getLower()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final float d() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final void e(float f, CallbackToFutureAdapter.Completer completer) {
        this.c = f;
        CallbackToFutureAdapter.Completer completer2 = this.d;
        if (completer2 != null) {
            completer2.d(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.e = this.c;
        this.d = completer;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final void f() {
        this.c = 1.0f;
        CallbackToFutureAdapter.Completer completer = this.d;
        if (completer != null) {
            completer.d(new CameraControl.OperationCanceledException("Camera is not active."));
            this.d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final Rect g() {
        Rect rect = (Rect) this.f224a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }
}
