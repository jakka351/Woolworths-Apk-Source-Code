package androidx.camera.camera2.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Log;
import android.util.Rational;
import androidx.annotation.OptIn;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

@OptIn
/* loaded from: classes2.dex */
class FocusMeteringControl {
    public static final MeteringRectangle[] v = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    public final Camera2CameraControlImpl f275a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final MeteringRegionCorrection f;
    public ScheduledFuture i;
    public ScheduledFuture j;
    public MeteringRectangle[] p;
    public MeteringRectangle[] q;
    public MeteringRectangle[] r;
    public CallbackToFutureAdapter.Completer s;
    public boolean t;
    public d0 u;
    public volatile boolean d = false;
    public volatile Rational e = null;
    public boolean g = false;
    public Integer h = 0;
    public long k = 0;
    public boolean l = false;
    public boolean m = false;
    public int n = 1;
    public e0 o = null;

    /* renamed from: androidx.camera.camera2.internal.FocusMeteringControl$1, reason: invalid class name */
    class AnonymousClass1 extends CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void a(int i) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void b(int i, CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void c(int i, CameraCaptureFailure cameraCaptureFailure) {
        }
    }

    public FocusMeteringControl(Camera2CameraControlImpl camera2CameraControlImpl, ScheduledExecutorService scheduledExecutorService, Executor executor, Quirks quirks) {
        MeteringRectangle[] meteringRectangleArr = v;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = null;
        this.t = false;
        this.u = null;
        this.f275a = camera2CameraControlImpl;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.f = new MeteringRegionCorrection(quirks);
    }

    public final void a(boolean z, boolean z2) {
        int iC;
        int iB;
        CameraCaptureResult cameraCaptureResult;
        if (this.d) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.f = true;
            builder.c = this.n;
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            if (z) {
                builder2.c(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z2) {
                builder2.c(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            builder.c(builder2.a());
            Camera2CameraControlImpl camera2CameraControlImpl = this.f275a;
            List<CaptureConfig> listSingletonList = Collections.singletonList(builder.d());
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            listSingletonList.getClass();
            ArrayList arrayList = new ArrayList();
            for (CaptureConfig captureConfig : listSingletonList) {
                CaptureConfig.Builder builder3 = new CaptureConfig.Builder(captureConfig);
                HashSet hashSet = builder3.f483a;
                if (captureConfig.c == 5 && (cameraCaptureResult = captureConfig.h) != null) {
                    builder3.h = cameraCaptureResult;
                }
                if (Collections.unmodifiableList(captureConfig.f482a).isEmpty() && captureConfig.f) {
                    if (hashSet.isEmpty()) {
                        UseCaseAttachState useCaseAttachState = camera2CameraImpl.d;
                        useCaseAttachState.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (Map.Entry entry : useCaseAttachState.b.entrySet()) {
                            UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) entry.getValue();
                            if (useCaseAttachInfo.f && useCaseAttachInfo.e) {
                                arrayList2.add(((UseCaseAttachState.UseCaseAttachInfo) entry.getValue()).f506a);
                            }
                        }
                        Iterator it = Collections.unmodifiableCollection(arrayList2).iterator();
                        while (it.hasNext()) {
                            CaptureConfig captureConfig2 = ((SessionConfig) it.next()).g;
                            List listUnmodifiableList = Collections.unmodifiableList(captureConfig2.f482a);
                            if (!listUnmodifiableList.isEmpty()) {
                                if (captureConfig2.b() != 0 && (iB = captureConfig2.b()) != 0) {
                                    builder3.b.G(UseCaseConfig.A, Integer.valueOf(iB));
                                }
                                if (captureConfig2.c() != 0 && (iC = captureConfig2.c()) != 0) {
                                    builder3.b.G(UseCaseConfig.B, Integer.valueOf(iC));
                                }
                                Iterator it2 = listUnmodifiableList.iterator();
                                while (it2.hasNext()) {
                                    hashSet.add((DeferrableSurface) it2.next());
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                            Logger.e("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                        }
                    } else {
                        Logger.e("Camera2CameraImpl", "The capture config builder already has surface inside.");
                    }
                }
                arrayList.add(builder3.d());
            }
            camera2CameraImpl.v("Issue capture request", null);
            camera2CameraImpl.p.e(arrayList);
        }
    }

    public final void b() {
        Camera2CameraControlImpl camera2CameraControlImpl = this.f275a;
        camera2CameraControlImpl.b.f229a.remove(null);
        camera2CameraControlImpl.b.f229a.remove(this.o);
        CallbackToFutureAdapter.Completer completer = this.s;
        if (completer != null) {
            completer.d(new CameraControl.OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
            this.s = null;
        }
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
        ScheduledFuture scheduledFuture2 = this.j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.j = null;
        }
        if (this.p.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = v;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.g = false;
        camera2CameraControlImpl.z();
    }

    public final ListenableFuture c(boolean z) {
        if (Camera2CameraControlImpl.t(this.f275a.e, 5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return Futures.g(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return CallbackToFutureAdapter.a(new g0(this, z, 0));
    }

    public final List d(List list, int i, Rational rational, Rect rect, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MeteringPoint meteringPoint = (MeteringPoint) it.next();
            if (arrayList.size() == i) {
                break;
            }
            float f = meteringPoint.f416a;
            float f2 = meteringPoint.c;
            if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
                float f3 = meteringPoint.b;
                if (f3 >= BitmapDescriptorFactory.HUE_RED && f3 <= 1.0f) {
                    Rational rational3 = meteringPoint.d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointF = (i2 == 1 && this.f.f356a.a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - f, f3) : new PointF(f, f3);
                    if (!rational3.equals(rational2)) {
                        if (rational3.compareTo(rational2) > 0) {
                            float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                            pointF.y = (1.0f / fDoubleValue) * (((float) ((fDoubleValue - 1.0d) / 2.0d)) + pointF.y);
                        } else {
                            float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                            pointF.x = (1.0f / fDoubleValue2) * (((float) ((fDoubleValue2 - 1.0d) / 2.0d)) + pointF.x);
                        }
                    }
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    int iWidth2 = ((int) (rect.width() * f2)) / 2;
                    int iHeight2 = ((int) (f2 * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                    rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                    rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                    rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                    rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                    MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                    if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                        arrayList.add(meteringRectangle);
                    }
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void e(final CallbackToFutureAdapter.Completer completer) {
        int iC;
        int iB;
        CameraCaptureResult cameraCaptureResult;
        Logger.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.d) {
            completer.d(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.c = this.n;
        builder.f = true;
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        builder2.c(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        builder.c(builder2.a());
        builder.b(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.FocusMeteringControl.2
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public final void a(int i) {
                CallbackToFutureAdapter.Completer completer2 = completer;
                if (completer2 != null) {
                    completer2.d(new CameraControl.OperationCanceledException("Camera is closed"));
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public final void b(int i, CameraCaptureResult cameraCaptureResult2) {
                Logger.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                completer.b(null);
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public final void c(int i, CameraCaptureFailure cameraCaptureFailure) {
                completer.d(new CameraControlInternal.CameraControlException());
            }
        });
        Camera2CameraControlImpl camera2CameraControlImpl = this.f275a;
        List<CaptureConfig> listSingletonList = Collections.singletonList(builder.d());
        Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
        listSingletonList.getClass();
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig captureConfig : listSingletonList) {
            CaptureConfig.Builder builder3 = new CaptureConfig.Builder(captureConfig);
            HashSet hashSet = builder3.f483a;
            if (captureConfig.c == 5 && (cameraCaptureResult = captureConfig.h) != null) {
                builder3.h = cameraCaptureResult;
            }
            if (Collections.unmodifiableList(captureConfig.f482a).isEmpty() && captureConfig.f) {
                if (hashSet.isEmpty()) {
                    UseCaseAttachState useCaseAttachState = camera2CameraImpl.d;
                    useCaseAttachState.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : useCaseAttachState.b.entrySet()) {
                        UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) entry.getValue();
                        if (useCaseAttachInfo.f && useCaseAttachInfo.e) {
                            arrayList2.add(((UseCaseAttachState.UseCaseAttachInfo) entry.getValue()).f506a);
                        }
                    }
                    Iterator it = Collections.unmodifiableCollection(arrayList2).iterator();
                    while (it.hasNext()) {
                        CaptureConfig captureConfig2 = ((SessionConfig) it.next()).g;
                        List listUnmodifiableList = Collections.unmodifiableList(captureConfig2.f482a);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (captureConfig2.b() != 0 && (iB = captureConfig2.b()) != 0) {
                                builder3.b.G(UseCaseConfig.A, Integer.valueOf(iB));
                            }
                            if (captureConfig2.c() != 0 && (iC = captureConfig2.c()) != 0) {
                                builder3.b.G(UseCaseConfig.B, Integer.valueOf(iC));
                            }
                            Iterator it2 = listUnmodifiableList.iterator();
                            while (it2.hasNext()) {
                                hashSet.add((DeferrableSurface) it2.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        Logger.e("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                } else {
                    Logger.e("Camera2CameraImpl", "The capture config builder already has surface inside.");
                }
            }
            arrayList.add(builder3.d());
        }
        camera2CameraImpl.v("Issue capture request", null);
        camera2CameraImpl.p.e(arrayList);
    }

    public final void f(boolean z) {
        int iC;
        int iB;
        CameraCaptureResult cameraCaptureResult;
        if (this.d) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.c = this.n;
            builder.f = true;
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.c(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z) {
                builder2.d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Camera2CameraControlImpl.t(this.f275a.e, 1)), Config.OptionPriority.e);
            }
            builder.c(builder2.a());
            builder.b(new AnonymousClass1());
            Camera2CameraControlImpl camera2CameraControlImpl = this.f275a;
            List<CaptureConfig> listSingletonList = Collections.singletonList(builder.d());
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            listSingletonList.getClass();
            ArrayList arrayList = new ArrayList();
            for (CaptureConfig captureConfig : listSingletonList) {
                CaptureConfig.Builder builder3 = new CaptureConfig.Builder(captureConfig);
                HashSet hashSet = builder3.f483a;
                if (captureConfig.c == 5 && (cameraCaptureResult = captureConfig.h) != null) {
                    builder3.h = cameraCaptureResult;
                }
                if (Collections.unmodifiableList(captureConfig.f482a).isEmpty() && captureConfig.f) {
                    if (hashSet.isEmpty()) {
                        UseCaseAttachState useCaseAttachState = camera2CameraImpl.d;
                        useCaseAttachState.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (Map.Entry entry : useCaseAttachState.b.entrySet()) {
                            UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) entry.getValue();
                            if (useCaseAttachInfo.f && useCaseAttachInfo.e) {
                                arrayList2.add(((UseCaseAttachState.UseCaseAttachInfo) entry.getValue()).f506a);
                            }
                        }
                        Iterator it = Collections.unmodifiableCollection(arrayList2).iterator();
                        while (it.hasNext()) {
                            CaptureConfig captureConfig2 = ((SessionConfig) it.next()).g;
                            List listUnmodifiableList = Collections.unmodifiableList(captureConfig2.f482a);
                            if (!listUnmodifiableList.isEmpty()) {
                                if (captureConfig2.b() != 0 && (iB = captureConfig2.b()) != 0) {
                                    builder3.b.G(UseCaseConfig.A, Integer.valueOf(iB));
                                }
                                if (captureConfig2.c() != 0 && (iC = captureConfig2.c()) != 0) {
                                    builder3.b.G(UseCaseConfig.B, Integer.valueOf(iC));
                                }
                                Iterator it2 = listUnmodifiableList.iterator();
                                while (it2.hasNext()) {
                                    hashSet.add((DeferrableSurface) it2.next());
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                            Logger.e("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                        }
                    } else {
                        Logger.e("Camera2CameraImpl", "The capture config builder already has surface inside.");
                    }
                }
                arrayList.add(builder3.d());
            }
            camera2CameraImpl.v("Issue capture request", null);
            camera2CameraImpl.p.e(arrayList);
        }
    }
}
