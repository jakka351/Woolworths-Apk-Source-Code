package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ZoomControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.Config;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* loaded from: classes2.dex */
final class CropRegionZoomImpl implements ZoomControl.ZoomImpl {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCharacteristicsCompat f270a;
    public CallbackToFutureAdapter.Completer c;
    public Rect b = null;
    public Rect d = null;

    public CropRegionZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f270a = cameraCharacteristicsCompat;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final void a(TotalCaptureResult totalCaptureResult) {
        if (this.c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.c.b(null);
            this.c = null;
            this.d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final void b(Camera2ImplConfig.Builder builder) {
        Rect rect = this.b;
        if (rect != null) {
            builder.d(CaptureRequest.SCALER_CROP_REGION, rect, Config.OptionPriority.f);
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final float c() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final float d() {
        Float f = (Float) this.f270a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final void e(float f, CallbackToFutureAdapter.Completer completer) {
        ((Rect) this.f270a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float fWidth = r0.width() / f;
        float fHeight = r0.height() / f;
        float fWidth2 = (r0.width() - fWidth) / 2.0f;
        float fHeight2 = (r0.height() - fHeight) / 2.0f;
        this.b = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        CallbackToFutureAdapter.Completer completer2 = this.c;
        if (completer2 != null) {
            completer2.d(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.d = this.b;
        this.c = completer;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final void f() {
        this.d = null;
        this.b = null;
        CallbackToFutureAdapter.Completer completer = this.c;
        if (completer != null) {
            completer.d(new CameraControl.OperationCanceledException("Camera is not active."));
            this.c = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public final Rect g() {
        Rect rect = this.b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) this.f270a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }
}
