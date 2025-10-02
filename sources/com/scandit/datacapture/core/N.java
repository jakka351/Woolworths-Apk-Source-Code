package com.scandit.datacapture.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.Log;
import android.util.Size;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegateSettings;
import com.scandit.datacapture.core.internal.module.source.NativeCameraInfo;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.FrameSourceState;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.ranges.ClosedRange;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class N extends NativeCameraDelegate {
    static final /* synthetic */ KProperty[] v;

    /* renamed from: a, reason: collision with root package name */
    private final E0 f18348a;
    private final Function1 b;
    private final Function1 c;
    private final M0 d;
    private final InterfaceC1042j7 e;
    private final InterfaceC0954a0 f;
    private final I6 g;
    private final InterfaceC0983d2 h;
    private final C1155w3 i;
    private InterfaceC0979c7 j;
    private CameraDevice k;
    private W0 l;
    private NativeCameraDelegateSettings m;
    private Size2 n;
    private int o;
    private Rect p;
    private final C0959a5 q;
    private float r;
    private boolean s;
    private boolean t;
    private final Runnable u;

    static {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        v = new KProperty[]{reflectionFactory.h(new PropertyReference1Impl(reflectionFactory.b(N.class), "backgroundHandler", "getBackgroundHandler()Landroid/os/Handler;"))};
    }

    public N(F0 cameraInfo, Function1 frameDataCallback, Function1 priorityCameraSwitchStateCallback, O0 cameraProvider, C1069m7 surfaceProvider, C1008g0 cameraCapture, I6 sceneChangeDetector, InterfaceC0983d2 frameDataConverter, Function0 handlerProvider) {
        Intrinsics.h(cameraInfo, "cameraInfo");
        Intrinsics.h(frameDataCallback, "frameDataCallback");
        Intrinsics.h(priorityCameraSwitchStateCallback, "priorityCameraSwitchStateCallback");
        Intrinsics.h(cameraProvider, "cameraProvider");
        Intrinsics.h(surfaceProvider, "surfaceProvider");
        Intrinsics.h(cameraCapture, "cameraCapture");
        Intrinsics.h(sceneChangeDetector, "sceneChangeDetector");
        Intrinsics.h(frameDataConverter, "frameDataConverter");
        Intrinsics.h(handlerProvider, "handlerProvider");
        this.f18348a = cameraInfo;
        this.b = frameDataCallback;
        this.c = priorityCameraSwitchStateCallback;
        this.d = cameraProvider;
        this.e = surfaceProvider;
        this.f = cameraCapture;
        this.g = sceneChangeDetector;
        this.h = frameDataConverter;
        this.i = new C1155w3(handlerProvider);
        this.n = new Size2(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.q = new C0959a5(cameraInfo);
        if (((W4) cameraInfo.d()).f()) {
            O3.a("CameraApi2 delegate. Timestamp source is realtime");
        } else {
            O3.a("CameraApi2 delegate. Timestamp source is not realtime");
        }
        this.u = new com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f(this, 3);
    }

    public static final void h(N n) {
        InterfaceC0979c7 interfaceC0979c7 = n.j;
        if (interfaceC0979c7 != null) {
            ((C1024h7) interfaceC0979c7).a(false);
        }
        W0 w0 = n.l;
        if (w0 != null) {
            ((Y0) w0).a(false);
        }
        W0 w02 = n.l;
        if (w02 != null) {
            ((Y0) w02).a();
        }
        n.s = false;
    }

    public static final void l(N n) {
        if (n.o == 1) {
            n.startSingleShotFocusInArea(n.p);
        } else {
            n.startContinuousFocusInArea(n.p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(N this$0) {
        Intrinsics.h(this$0, "this$0");
        InterfaceC0979c7 interfaceC0979c7 = this$0.j;
        if (interfaceC0979c7 != null) {
            ((C1024h7) interfaceC0979c7).a(false);
        }
        W0 w0 = this$0.l;
        if (w0 != null) {
            ((Y0) w0).a(false);
        }
        W0 w02 = this$0.l;
        if (w02 != null) {
            ((Y0) w02).a();
        }
        this$0.s = false;
    }

    public static boolean n(N n) {
        L l = L.f18340a;
        if (n.k == null) {
            return false;
        }
        if (!n.q.c()) {
            return true;
        }
        W0 w0 = n.l;
        if (w0 == null) {
            return false;
        }
        return ((Y0) w0).a(n.q, new A(n, l));
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void bootUpWithSettings(NativeCameraDelegateSettings settings, NativeWrappedPromise whenDone) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(whenDone, "whenDone");
        a(settings, new D(whenDone));
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final NativeCameraApi getCameraApi() {
        return NativeCameraApi.CAMERA2;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final String getCameraId() {
        return ((F0) this.f18348a).e();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final NativeCameraInfo getCameraInfo() {
        ClosedRange closedRangeC = ((F0) this.f18348a).c();
        return new NativeCameraInfo(new NativeFloatRange(((Number) closedRangeC.getStart()).floatValue(), ((Number) closedRangeC.getEndInclusive()).floatValue()));
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final CameraPosition getCameraPosition() {
        return ((F0) this.f18348a).f();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final int getCameraToNativeDeviceOrientation() {
        return ((F0) this.f18348a).h();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final ArrayList getFrameResolutions() {
        ArrayList arrayListK = ((F0) this.f18348a).k();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListK, 10));
        Iterator it = arrayListK.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            arrayList.add(Size2UtilsKt.Size2(size.getWidth(), size.getHeight()));
        }
        return CollectionsExtensionsKt.toArrayList(arrayList);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final EnumSet getSupportedFocusModesBits() {
        return ((F0) this.f18348a).s();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean goToSleep() {
        if (this.r <= BitmapDescriptorFactory.HUE_RED) {
            InterfaceC0979c7 interfaceC0979c7 = this.j;
            if (interfaceC0979c7 != null) {
                ((C1024h7) interfaceC0979c7).a(false);
            }
            W0 w0 = this.l;
            if (w0 != null) {
                ((Y0) w0).a(false);
            }
            W0 w02 = this.l;
            boolean zA = w02 != null ? ((Y0) w02).a() : true;
            this.s = false;
            return zA;
        }
        InterfaceC0979c7 interfaceC0979c72 = this.j;
        if (interfaceC0979c72 != null) {
            ((C1024h7) interfaceC0979c72).a(false);
        }
        W0 w03 = this.l;
        if (w03 != null) {
            ((Y0) w03).a(false);
        }
        long j = (long) (this.r * 1000);
        Handler handler = (Handler) this.i.a(this, v[0]);
        if (handler != null) {
            handler.postDelayed(this.u, j);
        }
        this.q.b();
        return n(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean hasManualLensPositionControl() {
        return ((F0) this.f18348a).u();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean hasNoFocusSystem() {
        int[] iArrB = ((F0) this.f18348a).b();
        ArrayList arrayList = new ArrayList();
        for (int i : iArrB) {
            if (i != 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList.isEmpty();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean isTimestampRealtime() {
        return ((W4) ((F0) this.f18348a).d()).f();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean isTorchAvailable() {
        return ((F0) this.f18348a).v();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void setBatterySavingMode(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        try {
            this.q.a(z);
            n(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean setFixedLensPosition(float f) {
        if (hasManualLensPositionControl()) {
            this.q.a(f);
            return n(this);
        }
        Log.i("sdc-core", "setFixedLensPosition() has no effect on a device without manual lens position control");
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean shouldMirrorAroundYAxis() {
        return ((F0) this.f18348a).x();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean shouldUseContinuous(boolean z) {
        return ((F0) this.f18348a).a(z);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void shutDown() throws Exception {
        try {
            a();
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean startContinuousFocusInArea(Rect rect) {
        this.q.b(rect);
        this.p = rect;
        return n(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean startSingleShotFocusInArea(Rect rect) {
        W0 w0 = this.l;
        if (w0 == null) {
            return false;
        }
        this.q.a();
        Y0 y0 = (Y0) w0;
        if (!y0.a(this.q)) {
            return false;
        }
        this.q.c(rect);
        this.p = rect;
        if (!y0.a(this.q)) {
            return false;
        }
        this.q.d();
        return n(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void startWithSettings(NativeCameraDelegateSettings settings, NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(whenDone, "whenDone");
        try {
            a(settings, new I(whenDone, this));
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void updateSettings(NativeCameraDelegateSettings settings, FrameSourceState currentState) throws Exception {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(currentState, "currentState");
        try {
            this.m = settings;
            this.q.a(settings);
            ((J6) this.g).a(settings.getSceneChangeDetection());
            this.r = settings.getStageOneStandbyDuration();
            if (Intrinsics.c(settings.getFrameResolution(), this.n)) {
                if (currentState == FrameSourceState.ON) {
                    n(this);
                    return;
                }
                return;
            }
            int i = C.f18300a[currentState.ordinal()];
            if (i == 1) {
                this.c.invoke(FrameSourceState.OFF);
                this.c.invoke(FrameSourceState.ON);
            } else {
                if (i != 2) {
                    return;
                }
                this.c.invoke(FrameSourceState.OFF);
                this.c.invoke(FrameSourceState.STANDBY);
            }
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void wakeUp(NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.h(whenDone, "whenDone");
        try {
            a(new M(whenDone));
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Function1 function1) {
        try {
            Handler handler = (Handler) this.i.a(this, v[0]);
            if (handler != null) {
                handler.removeCallbacks(this.u);
            }
            InterfaceC0979c7 interfaceC0979c7 = this.j;
            if (interfaceC0979c7 != null) {
                ((C1024h7) interfaceC0979c7).a(true);
            }
            W0 w0 = this.l;
            if (w0 != null) {
                ((Y0) w0).a(true);
            }
            this.q.a(this.t);
            NativeCameraDelegateSettings nativeCameraDelegateSettings = this.m;
            if (nativeCameraDelegateSettings != null) {
                this.q.a(nativeCameraDelegateSettings);
            }
            n(this);
            if (this.s) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            W0 w02 = this.l;
            if (w02 != null) {
                ((Y0) w02).a(this.q, new A(this, function1));
            } else {
                Log.e("sdc-core", "No camera capture session to wake up");
                function1.invoke(Boolean.FALSE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            function1.invoke(Boolean.FALSE);
        }
    }

    private final void a(NativeCameraDelegateSettings nativeCameraDelegateSettings, Function1 function1) {
        if (this.k != null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        ((J6) this.g).a(nativeCameraDelegateSettings.getSceneChangeDetection());
        this.q.a(nativeCameraDelegateSettings);
        this.m = nativeCameraDelegateSettings;
        Size2 frameResolution = nativeCameraDelegateSettings.getFrameResolution();
        Intrinsics.g(frameResolution, "settings.frameResolution");
        this.n = frameResolution;
        this.r = nativeCameraDelegateSettings.getStageOneStandbyDuration();
        Handler handler = (Handler) this.i.a(this, v[0]);
        if (handler == null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        C1037j2 c1037j2 = new C1037j2((int) nativeCameraDelegateSettings.getFrameResolution().getWidth(), (int) nativeCameraDelegateSettings.getFrameResolution().getHeight(), nativeCameraDelegateSettings.getMinPreviewShortSide());
        ((C1069m7) this.e).a(handler, c1037j2, ((F0) this.f18348a).r(), new E(this, c1037j2, function1));
        ((O0) this.d).a(handler, ((F0) this.f18348a).e(), new F(this, c1037j2, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        W0 w0 = this.l;
        if (w0 != null) {
            ((Y0) w0).b();
        }
        this.l = null;
        CameraDevice cameraDevice = this.k;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        this.k = null;
        InterfaceC0979c7 interfaceC0979c7 = this.j;
        if (interfaceC0979c7 != null) {
            ((C1024h7) interfaceC0979c7).a();
        }
        this.j = null;
        this.s = false;
        this.m = null;
    }

    public static final void a(N n, C1037j2 c1037j2, Function1 function1) {
        CameraDevice cameraDevice = n.k;
        InterfaceC0979c7 interfaceC0979c7 = n.j;
        Handler handler = (Handler) n.i.a(n, v[0]);
        if (cameraDevice == null || interfaceC0979c7 == null || handler == null) {
            return;
        }
        W0 w0 = n.l;
        if (w0 != null) {
            ((Y0) w0).b();
        }
        ((C1008g0) n.f).a(handler, cameraDevice, n.f18348a, interfaceC0979c7, c1037j2, new K(function1, n, interfaceC0979c7));
    }
}
