package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener, androidx.camera.camera2.internal.e0] */
    @Override // java.lang.Runnable
    public final void run() {
        Rational rational;
        final long jZ;
        switch (this.d) {
            case 0:
                Camera2CameraControlImpl camera2CameraControlImpl = (Camera2CameraControlImpl) this.e;
                Executor executor = (Executor) this.f;
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) this.g;
                Camera2CameraControlImpl.CameraCaptureCallbackSet cameraCaptureCallbackSet = camera2CameraControlImpl.z;
                cameraCaptureCallbackSet.f228a.add(cameraCaptureCallback);
                cameraCaptureCallbackSet.b.put(cameraCaptureCallback, executor);
                break;
            case 1:
                Camera2CapturePipeline.ScreenFlashTask screenFlashTask = (Camera2CapturePipeline.ScreenFlashTask) this.e;
                AtomicReference atomicReference = (AtomicReference) this.f;
                CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.g;
                int i = Camera2CapturePipeline.ScreenFlashTask.g;
                Logger.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
                screenFlashTask.d.a(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (ImageCapture.ScreenFlashListener) atomicReference.get());
                completer.b(null);
                break;
            default:
                final FocusMeteringControl focusMeteringControl = (FocusMeteringControl) this.e;
                CallbackToFutureAdapter.Completer completer2 = (CallbackToFutureAdapter.Completer) this.f;
                FocusMeteringAction focusMeteringAction = (FocusMeteringAction) this.g;
                if (!focusMeteringControl.d) {
                    completer2.d(new CameraControl.OperationCanceledException("Camera is not active."));
                    break;
                } else {
                    Rect rectG = focusMeteringControl.f275a.i.e.g();
                    if (focusMeteringControl.e != null) {
                        rational = focusMeteringControl.e;
                    } else {
                        Rect rectG2 = focusMeteringControl.f275a.i.e.g();
                        rational = new Rational(rectG2.width(), rectG2.height());
                    }
                    List list = focusMeteringAction.f401a;
                    Integer num = (Integer) focusMeteringControl.f275a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                    int i2 = 0;
                    List listD = focusMeteringControl.d(list, num == null ? 0 : num.intValue(), rational, rectG, 1);
                    List list2 = focusMeteringAction.b;
                    Integer num2 = (Integer) focusMeteringControl.f275a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                    List listD2 = focusMeteringControl.d(list2, num2 == null ? 0 : num2.intValue(), rational, rectG, 2);
                    List list3 = focusMeteringAction.c;
                    Integer num3 = (Integer) focusMeteringControl.f275a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                    List listD3 = focusMeteringControl.d(list3, num3 == null ? 0 : num3.intValue(), rational, rectG, 4);
                    if (!listD.isEmpty() || !listD2.isEmpty() || !listD3.isEmpty()) {
                        focusMeteringControl.f275a.b.f229a.remove(focusMeteringControl.o);
                        CallbackToFutureAdapter.Completer completer3 = focusMeteringControl.s;
                        if (completer3 != null) {
                            completer3.d(new CameraControl.OperationCanceledException("Cancelled by another startFocusAndMetering()"));
                            focusMeteringControl.s = null;
                        }
                        focusMeteringControl.f275a.b.f229a.remove(null);
                        ScheduledFuture scheduledFuture = focusMeteringControl.i;
                        int i3 = 1;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(true);
                            focusMeteringControl.i = null;
                        }
                        focusMeteringControl.s = completer2;
                        MeteringRectangle[] meteringRectangleArr = FocusMeteringControl.v;
                        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) listD.toArray(meteringRectangleArr);
                        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) listD2.toArray(meteringRectangleArr);
                        MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) listD3.toArray(meteringRectangleArr);
                        ScheduledExecutorService scheduledExecutorService = focusMeteringControl.c;
                        Camera2CameraControlImpl camera2CameraControlImpl2 = focusMeteringControl.f275a;
                        camera2CameraControlImpl2.b.f229a.remove(focusMeteringControl.o);
                        ScheduledFuture scheduledFuture2 = focusMeteringControl.i;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(true);
                            focusMeteringControl.i = null;
                        }
                        ScheduledFuture scheduledFuture3 = focusMeteringControl.j;
                        if (scheduledFuture3 != null) {
                            scheduledFuture3.cancel(true);
                            focusMeteringControl.j = null;
                        }
                        focusMeteringControl.p = meteringRectangleArr2;
                        focusMeteringControl.q = meteringRectangleArr3;
                        focusMeteringControl.r = meteringRectangleArr4;
                        if (meteringRectangleArr2.length > 0) {
                            focusMeteringControl.g = true;
                            focusMeteringControl.l = false;
                            focusMeteringControl.m = false;
                            jZ = camera2CameraControlImpl2.z();
                            focusMeteringControl.f(true);
                        } else {
                            focusMeteringControl.g = false;
                            focusMeteringControl.l = true;
                            focusMeteringControl.m = false;
                            jZ = camera2CameraControlImpl2.z();
                        }
                        focusMeteringControl.h = 0;
                        final boolean z = camera2CameraControlImpl2.u(1) == 1;
                        ?? r6 = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.e0
                            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
                            public final boolean a(TotalCaptureResult totalCaptureResult) {
                                FocusMeteringControl focusMeteringControl2 = focusMeteringControl;
                                focusMeteringControl2.getClass();
                                Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                                if (focusMeteringControl2.p.length > 0) {
                                    if (!z || num4 == null) {
                                        focusMeteringControl2.m = true;
                                        focusMeteringControl2.l = true;
                                    } else if (focusMeteringControl2.h.intValue() == 3) {
                                        if (num4.intValue() == 4) {
                                            focusMeteringControl2.m = true;
                                            focusMeteringControl2.l = true;
                                        } else if (num4.intValue() == 5) {
                                            focusMeteringControl2.m = false;
                                            focusMeteringControl2.l = true;
                                        }
                                    }
                                }
                                if (!focusMeteringControl2.l || !Camera2CameraControlImpl.x(totalCaptureResult, jZ)) {
                                    if (!focusMeteringControl2.h.equals(num4) && num4 != null) {
                                        focusMeteringControl2.h = num4;
                                    }
                                    return false;
                                }
                                boolean z2 = focusMeteringControl2.m;
                                ScheduledFuture scheduledFuture4 = focusMeteringControl2.j;
                                if (scheduledFuture4 != null) {
                                    scheduledFuture4.cancel(true);
                                    focusMeteringControl2.j = null;
                                }
                                CallbackToFutureAdapter.Completer completer4 = focusMeteringControl2.s;
                                if (completer4 != null) {
                                    completer4.b(new FocusMeteringResult(z2));
                                    focusMeteringControl2.s = null;
                                }
                                return true;
                            }
                        };
                        focusMeteringControl.o = r6;
                        camera2CameraControlImpl2.p(r6);
                        long j = focusMeteringControl.k + 1;
                        focusMeteringControl.k = j;
                        f0 f0Var = new f0(focusMeteringControl, j, i2);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        focusMeteringControl.j = scheduledExecutorService.schedule(f0Var, 5000L, timeUnit);
                        long j2 = focusMeteringAction.d;
                        if (j2 > 0) {
                            focusMeteringControl.i = scheduledExecutorService.schedule(new f0(focusMeteringControl, j, i3), j2, timeUnit);
                            break;
                        }
                    } else {
                        completer2.d(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                        break;
                    }
                }
                break;
        }
    }
}
