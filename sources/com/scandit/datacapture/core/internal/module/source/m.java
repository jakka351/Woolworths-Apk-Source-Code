package com.scandit.datacapture.core.internal.module.source;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import android.util.Range;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.AbstractC1028i2;
import com.scandit.datacapture.core.AbstractC1070n;
import com.scandit.datacapture.core.AbstractC1142v;
import com.scandit.datacapture.core.C1115s;
import com.scandit.datacapture.core.C1145v2;
import com.scandit.datacapture.core.C1151w;
import com.scandit.datacapture.core.InterfaceC1124t;
import com.scandit.datacapture.core.O3;
import com.scandit.datacapture.core.U4;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import com.scandit.datacapture.core.internal.sdk.data.DisposableResource;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.GraphicsExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.TorchState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
public final class m extends NativeCameraDelegate {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1124t f18588a;
    private final CameraProfile b;
    private final Function1 c;
    private final C1151w d;
    private a e;
    private DisposableResource f;
    private C1115s g;
    private Subscription h;
    private Size2 i;
    private WeakReference j;
    private float k;
    private NativeCameraDelegateSettings l;
    private boolean m;

    public m(InterfaceC1124t cameraInfo, CameraProfile cameraProfile, Function1 frameDataCallback) {
        Intrinsics.h(cameraInfo, "cameraInfo");
        Intrinsics.h(cameraProfile, "cameraProfile");
        Intrinsics.h(frameDataCallback, "frameDataCallback");
        this.f18588a = cameraInfo;
        this.b = cameraProfile;
        this.c = frameDataCallback;
        this.d = new C1151w();
        this.f = C1145v2.b();
        this.i = new Size2(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.j = new WeakReference(null);
    }

    public static final void c(m mVar, Function1 function1) {
        function1.invoke(Boolean.valueOf(mVar.d.f()));
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void bootUpWithSettings(NativeCameraDelegateSettings settings, NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(whenDone, "whenDone");
        try {
            a(settings, new d(this, whenDone));
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final NativeCameraApi getCameraApi() {
        return NativeCameraApi.CAMERA1;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final String getCameraId() {
        return ((U4) this.f18588a).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.scandit.datacapture.core.internal.module.source.NativeCameraInfo getCameraInfo() {
        /*
            r4 = this;
            com.scandit.datacapture.core.internal.module.source.NativeCameraInfo r0 = new com.scandit.datacapture.core.internal.module.source.NativeCameraInfo
            com.scandit.datacapture.core.w r1 = r4.d
            android.hardware.Camera$Parameters r1 = r1.c()
            if (r1 == 0) goto L3a
            boolean r2 = r1.isZoomSupported()
            if (r2 == 0) goto L3a
            java.util.List r1 = r1.getZoomRatios()
            int r2 = r1.size()
            if (r2 <= 0) goto L3a
            java.lang.Object r2 = kotlin.collections.CollectionsKt.D(r1)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float r2 = (float) r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            java.lang.Object r1 = kotlin.collections.CollectionsKt.O(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            float r1 = (float) r1
            float r1 = r1 / r3
            com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange r3 = new com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange
            r3.<init>(r2, r1)
            goto L41
        L3a:
            com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange r3 = new com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r1, r1)
        L41:
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.source.m.getCameraInfo():com.scandit.datacapture.core.internal.module.source.NativeCameraInfo");
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final CameraPosition getCameraPosition() {
        int iC = ((U4) this.f18588a).c();
        if (iC == 0) {
            return CameraPosition.WORLD_FACING;
        }
        if (iC == 1) {
            return CameraPosition.USER_FACING;
        }
        throw new AssertionError("Unsupported Camera API 1 facing " + ((U4) this.f18588a).c());
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final int getCameraToNativeDeviceOrientation() {
        return ((U4) this.f18588a).c() == 0 ? ((U4) this.f18588a).d() : -((U4) this.f18588a).d();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final ArrayList getFrameResolutions() throws Exception {
        try {
            Camera.Parameters parametersC = this.d.c();
            List<Camera.Size> supportedPreviewSizes = parametersC != null ? parametersC.getSupportedPreviewSizes() : null;
            if (supportedPreviewSizes == null) {
                supportedPreviewSizes = EmptyList.d;
            }
            ArrayList arrayList = new ArrayList();
            for (Camera.Size size : supportedPreviewSizes) {
                Size2 Size2 = size.width * size.height <= this.b.a() ? Size2UtilsKt.Size2(size.width, size.height) : null;
                if (Size2 != null) {
                    arrayList.add(Size2);
                }
            }
            return CollectionsExtensionsKt.toArrayList(arrayList);
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0020 A[SYNTHETIC] */
    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.EnumSet getSupportedFocusModesBits() {
        /*
            r6 = this;
            java.lang.Class<com.scandit.datacapture.core.internal.module.source.NativeFocusMode> r0 = com.scandit.datacapture.core.internal.module.source.NativeFocusMode.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile r1 = r6.b
            com.scandit.datacapture.core.K6 r1 = r1.d()
            boolean r1 = r1.b()
            com.scandit.datacapture.core.w r2 = r6.d
            android.hardware.Camera$Parameters r2 = r2.c()
            if (r2 == 0) goto L8c
            java.util.List r2 = r2.getSupportedFocusModes()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L20
            int r4 = r3.hashCode()
            r5 = -194628547(0xfffffffff466343d, float:-7.2954577E31)
            if (r4 == r5) goto L6e
            r5 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r4 == r5) goto L5f
            r5 = 97445748(0x5cee774, float:1.945717E-35)
            if (r4 == r5) goto L50
            r5 = 910005312(0x363d9440, float:2.8249488E-6)
            if (r4 == r5) goto L47
            goto L20
        L47:
            java.lang.String r4 = "continuous-picture"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L20
            goto L77
        L50:
            java.lang.String r4 = "fixed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L59
            goto L20
        L59:
            com.scandit.datacapture.core.internal.module.source.NativeFocusMode r3 = com.scandit.datacapture.core.internal.module.source.NativeFocusMode.FIXED
            r0.add(r3)
            goto L20
        L5f:
            java.lang.String r4 = "auto"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L68
            goto L20
        L68:
            com.scandit.datacapture.core.internal.module.source.NativeFocusMode r3 = com.scandit.datacapture.core.internal.module.source.NativeFocusMode.AUTO
            r0.add(r3)
            goto L20
        L6e:
            java.lang.String r4 = "continuous-video"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L77
            goto L20
        L77:
            if (r1 != 0) goto L20
            com.scandit.datacapture.core.internal.module.source.NativeFocusMode r3 = com.scandit.datacapture.core.internal.module.source.NativeFocusMode.AUTO
            r0.add(r3)
            goto L20
        L7f:
            com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile r1 = r6.b
            boolean r1 = r1.c()
            if (r1 == 0) goto L8c
            com.scandit.datacapture.core.internal.module.source.NativeFocusMode r1 = com.scandit.datacapture.core.internal.module.source.NativeFocusMode.FIXED
            r0.add(r1)
        L8c:
            java.lang.String r1 = "result"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.source.m.getSupportedFocusModesBits():java.util.EnumSet");
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean goToSleep() throws Exception {
        try {
            if (this.k <= BitmapDescriptorFactory.HUE_RED) {
                try {
                    Camera.Parameters parametersC = this.d.c();
                    if (parametersC != null) {
                        parametersC.setFlashMode(a(parametersC, false));
                        a(parametersC);
                    }
                    this.d.g();
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
            try {
                Subscription subscription = this.h;
                if (subscription != null) {
                    subscription.use(new e(false));
                }
                C1115s c1115s = this.g;
                if (c1115s != null) {
                    c1115s.a(false);
                }
                long j = (long) (this.k * 1000);
                a aVar = this.e;
                if (aVar != null) {
                    aVar.sendMessageDelayed(aVar.obtainMessage(4), j);
                }
                Camera.Parameters parametersC2 = this.d.c();
                if (parametersC2 != null) {
                    parametersC2.setFlashMode(a(parametersC2, false));
                    a(parametersC2);
                }
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        } catch (Exception e3) {
            O3.a("Exception caught in listener method. Rethrowing...", e3);
            throw e3;
        }
        O3.a("Exception caught in listener method. Rethrowing...", e3);
        throw e3;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean hasManualLensPositionControl() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean hasNoFocusSystem() throws Exception {
        Camera.Parameters parametersC;
        try {
            if (!a() || (parametersC = this.d.c()) == null) {
                return false;
            }
            List<String> supportedFocusModes = parametersC.getSupportedFocusModes();
            Intrinsics.g(supportedFocusModes, "camParams.supportedFocusModes");
            String str = "continuous-picture";
            if (!supportedFocusModes.contains("continuous-picture")) {
                str = "continuous-video";
                if (!supportedFocusModes.contains("continuous-video")) {
                    str = null;
                }
            }
            return str == null;
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean isTimestampRealtime() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean isTorchAvailable() {
        Camera.Parameters parametersC = this.d.c();
        return (parametersC != null ? parametersC.getFlashMode() : null) != null;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void setBatterySavingMode(boolean z) throws Exception {
        try {
            if (this.m == z) {
                return;
            }
            this.m = z;
            Camera.Parameters parametersC = this.d.c();
            if (parametersC == null) {
                return;
            }
            NativeCameraDelegateSettings nativeCameraDelegateSettings = this.l;
            a(parametersC, z, nativeCameraDelegateSettings != null ? nativeCameraDelegateSettings.preferredFrameRateRange : null);
            a(parametersC);
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean setFixedLensPosition(float f) {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean shouldMirrorAroundYAxis() {
        return ((U4) this.f18588a).c() == 1;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean shouldUseContinuous(boolean z) throws Exception {
        try {
            if (!this.b.d().b()) {
                return true;
            }
            if (z) {
                return this.b.f();
            }
            return false;
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void shutDown() throws Exception {
        try {
            try {
                a aVar = this.e;
                if (aVar != null) {
                    aVar.removeMessages(4);
                }
                C1115s c1115s = this.g;
                if (c1115s != null) {
                    c1115s.c();
                }
                this.g = null;
                this.d.e();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Subscription subscription = this.h;
            if (subscription != null) {
                subscription.dispose();
            }
            this.l = null;
        } catch (Exception e2) {
            O3.a("Exception caught in listener method. Rethrowing...", e2);
            throw e2;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean startContinuousFocusInArea(Rect rect) throws Exception {
        Camera.Parameters parametersC;
        try {
            if (!a() || (parametersC = this.d.c()) == null) {
                return false;
            }
            List<String> supportedFocusModes = parametersC.getSupportedFocusModes();
            Intrinsics.g(supportedFocusModes, "camParams.supportedFocusModes");
            String str = "continuous-picture";
            if (!supportedFocusModes.contains("continuous-picture")) {
                str = "continuous-video";
                if (!supportedFocusModes.contains("continuous-video")) {
                    str = null;
                }
            }
            if (str == null) {
                return false;
            }
            parametersC.setFocusMode(str);
            a(parametersC, rect);
            return a(parametersC);
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean startSingleShotFocusInArea(Rect rect) throws Exception {
        Camera.Parameters parametersC;
        try {
            if (!a() || (parametersC = this.d.c()) == null) {
                return false;
            }
            List<String> supportedFocusModes = parametersC.getSupportedFocusModes();
            Intrinsics.g(supportedFocusModes, "camParams.supportedFocusModes");
            if (!supportedFocusModes.contains(CameraSettings.FOCUS_STRATEGY_AUTO)) {
                return false;
            }
            parametersC.setFocusMode(CameraSettings.FOCUS_STRATEGY_AUTO);
            a(parametersC, rect);
            a(parametersC);
            return this.d.a();
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void startWithSettings(NativeCameraDelegateSettings settings, NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(whenDone, "whenDone");
        try {
            a(settings, new j(whenDone, this, settings));
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void updateSettings(NativeCameraDelegateSettings settings, FrameSourceState currentState) throws Exception {
        Camera.Parameters parametersC;
        Camera.Parameters parametersC2;
        Intrinsics.h(settings, "settings");
        Intrinsics.h(currentState, "currentState");
        this.l = settings;
        try {
            Size2 size2 = settings.frameResolution;
            boolean zC = Intrinsics.c(size2, this.i);
            boolean z = !zC && currentState == FrameSourceState.ON;
            if (z) {
                try {
                    Camera.Parameters parametersC3 = this.d.c();
                    if (parametersC3 != null) {
                        parametersC3.setFlashMode(a(parametersC3, false));
                        a(parametersC3);
                    }
                    this.d.g();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.k = settings.stageOneStandbyDuration;
            C1115s c1115s = this.g;
            if (c1115s != null) {
                c1115s.a((int) size2.getWidth(), (int) size2.getHeight());
            }
            Camera.Parameters parametersC4 = this.d.c();
            if (parametersC4 != null) {
                if (!zC) {
                    Size2 size22 = settings.frameResolution;
                    Intrinsics.g(size22, "settings.frameResolution");
                    a(parametersC4, size22);
                }
                a(parametersC4, settings.zoomFactor);
                b(parametersC4, settings.exposureTargetBias);
                a(parametersC4, this.m, settings.preferredFrameRateRange);
                a(parametersC4);
            }
            TorchState torchState = settings.torchState;
            Intrinsics.g(torchState, "settings.torchState");
            int i = AbstractC1070n.f18808a[torchState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    Log.e("sdc-core", "Automatic torch is not implemented in Camera 1");
                } else if (isTorchAvailable() && (parametersC2 = this.d.c()) != null) {
                    try {
                        parametersC2.setFlashMode(a(parametersC2, true));
                        a(parametersC2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } else if (isTorchAvailable() && (parametersC = this.d.c()) != null) {
                try {
                    parametersC.setFlashMode(a(parametersC, false));
                    a(parametersC);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            if (z) {
                a(k.f18586a);
            }
        } catch (Exception e4) {
            O3.a("Exception caught in listener method. Rethrowing...", e4);
            throw e4;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void wakeUp(NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.h(whenDone, "whenDone");
        try {
            a(new l(this, whenDone));
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    public static final void a(m mVar, boolean z) {
        Subscription subscription = mVar.h;
        if (subscription != null) {
            subscription.use(new e(z));
        }
        C1115s c1115s = mVar.g;
        if (c1115s == null) {
            return;
        }
        c1115s.a(z);
    }

    public static final void b(m mVar, SurfaceTexture surfaceTexture, Function1 function1) {
        mVar.getClass();
        Pair pair = new Pair(surfaceTexture, function1);
        a aVar = mVar.e;
        if (aVar != null) {
            aVar.sendMessage(aVar.obtainMessage(1, pair));
        }
    }

    public static final void a(m mVar, Function1 function1) {
        a aVar = mVar.e;
        if (aVar != null) {
            aVar.sendMessage(aVar.obtainMessage(3, function1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Function1 function1) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.removeMessages(4);
        }
        Camera.Parameters parametersC = this.d.c();
        if (parametersC != null) {
            boolean z = this.m;
            NativeCameraDelegateSettings nativeCameraDelegateSettings = this.l;
            a(parametersC, z, nativeCameraDelegateSettings != null ? nativeCameraDelegateSettings.preferredFrameRateRange : null);
            NativeCameraDelegateSettings nativeCameraDelegateSettings2 = this.l;
            if ((nativeCameraDelegateSettings2 != null ? nativeCameraDelegateSettings2.torchState : null) == TorchState.ON) {
                parametersC.setFlashMode(a(parametersC, true));
            }
            a(parametersC);
        }
        C1115s c1115s = this.g;
        if (c1115s != null) {
            c1115s.a();
        }
        a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.sendMessage(aVar2.obtainMessage(2, function1));
        }
    }

    public static final void b(m mVar) {
        a aVar = mVar.e;
        if (aVar != null) {
            aVar.sendMessageDelayed(aVar.obtainMessage(4), 2000L);
        }
    }

    private final void b(Camera.Parameters parameters, float f) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        parameters.setExposureCompensation((!this.b.j() || (minExposureCompensation == 0 && maxExposureCompensation == 0) || exposureCompensationStep == BitmapDescriptorFactory.HUE_RED || Float.isInfinite(exposureCompensationStep) || Float.isNaN(exposureCompensationStep)) ? 0 : RangesKt.c(MathKt.b(f / exposureCompensationStep), minExposureCompensation, maxExposureCompensation));
    }

    public static final void a(m mVar, SurfaceTexture surfaceTexture, Function1 function1) {
        function1.invoke(Boolean.valueOf(mVar.d.a(surfaceTexture)));
    }

    private final boolean a(Camera.Parameters parameters) {
        try {
            if (!this.d.a(parameters)) {
                return false;
            }
            Camera.Size previewSize = parameters.getPreviewSize();
            this.i = new Size2(previewSize.width, previewSize.height);
            return true;
        } catch (Exception unused) {
            Log.e("sdc-core", "Failed to set camera parameters");
            return false;
        }
    }

    private static void a(Camera.Parameters parameters, float f) {
        Object obj;
        if (f < 1.0f || !parameters.isZoomSupported()) {
            return;
        }
        int i = (int) (f * 100.0f);
        List<Integer> zoomRatios = parameters.getZoomRatios();
        Intrinsics.g(zoomRatios, "camParams.zoomRatios");
        IndexingIterator indexingIterator = (IndexingIterator) CollectionsKt.P0(zoomRatios).iterator();
        Iterator it = indexingIterator.d;
        if (it.hasNext()) {
            Object next = indexingIterator.next();
            if (it.hasNext()) {
                int iAbs = Math.abs(((Number) ((IndexedValue) next).b).intValue() - i);
                do {
                    Object next2 = indexingIterator.next();
                    int iAbs2 = Math.abs(((Number) ((IndexedValue) next2).b).intValue() - i);
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        if (indexedValue != null) {
            parameters.setZoom(indexedValue.f24254a);
        }
    }

    private final boolean a() throws Exception {
        Camera cameraOpen;
        try {
            if (this.d.d()) {
                return true;
            }
            int iA = AbstractC1142v.a(this.f18588a);
            if (iA < 0) {
                return false;
            }
            try {
                cameraOpen = Camera.open(iA);
            } catch (Exception unused) {
                Log.e("sdc-core", "failed to open camera");
                cameraOpen = null;
            }
            this.d.a(cameraOpen);
            return this.d.d();
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    private static boolean a(Camera.Parameters parameters, Size2 size2) {
        Object next;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            return false;
        }
        Iterator<T> it = supportedPreviewSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Camera.Size size = (Camera.Size) next;
            if (size.height == size2.getHeight() && size.width == size2.getWidth()) {
                break;
            }
        }
        Camera.Size size3 = (Camera.Size) next;
        if (size3 == null) {
            return false;
        }
        parameters.setPreviewSize(size3.width, size3.height);
        return true;
    }

    private final void a(NativeCameraDelegateSettings nativeCameraDelegateSettings, Function1 function1) throws Exception {
        this.l = nativeCameraDelegateSettings;
        a();
        if (!this.d.d()) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        Camera.Parameters parametersC = this.d.c();
        if (parametersC == null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        Size2 size2 = nativeCameraDelegateSettings.frameResolution;
        Intrinsics.g(size2, "settings.frameResolution");
        if (!a(parametersC, size2)) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        Camera.Size previewSize = parametersC.getPreviewSize();
        C1115s c1115s = new C1115s(this.d, this.f18588a, previewSize.width, previewSize.height, this.c, this);
        c1115s.a(false);
        this.g = c1115s;
        parametersC.setPreviewFormat(17);
        if (!a(parametersC)) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        if (this.e == null) {
            this.e = new a(this);
        }
        Subscription subscriptionStart = this.f.start();
        subscriptionStart.use(new g(nativeCameraDelegateSettings, this, function1));
        this.h = subscriptionStart;
        a(parametersC, this.m, nativeCameraDelegateSettings.preferredFrameRateRange);
        this.b.a(parametersC);
        a(parametersC, nativeCameraDelegateSettings.zoomFactor);
        if (nativeCameraDelegateSettings.torchState == TorchState.ON) {
            parametersC.setFlashMode(a(parametersC, true));
        }
        b(parametersC, nativeCameraDelegateSettings.exposureTargetBias);
        a(parametersC);
        this.k = nativeCameraDelegateSettings.stageOneStandbyDuration;
    }

    public static final void a(m mVar, NativeWrappedPromise nativeWrappedPromise) throws Exception {
        Unit unit;
        NativeCameraDelegateSettings nativeCameraDelegateSettings = (NativeCameraDelegateSettings) mVar.j.get();
        if (nativeCameraDelegateSettings != null) {
            mVar.shutDown();
            mVar.startWithSettings(nativeCameraDelegateSettings, nativeWrappedPromise);
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            WrappedPromiseUtilsKt.synchronizedSetValueIfNoValue(nativeWrappedPromise, false);
        }
    }

    public static final void a(m mVar) {
        try {
            Camera.Parameters parametersC = mVar.d.c();
            if (parametersC != null) {
                parametersC.setFlashMode(a(parametersC, false));
                mVar.a(parametersC);
            }
            mVar.d.g();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void a(Camera.Parameters parameters, Rect rect) {
        ArrayList arrayList;
        if (this.b.d().c()) {
            return;
        }
        if (rect == null) {
            arrayList = null;
        } else {
            List listQ = CollectionsKt.Q(rect);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(listQ, 10));
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                arrayList2.add(GraphicsExtensionsKt.toGraphicRect((Rect) it.next(), -1000, 1000));
            }
            arrayList = new ArrayList(CollectionsKt.s(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new Camera.Area((android.graphics.Rect) it2.next(), 1000));
            }
        }
        if (parameters.getMaxNumFocusAreas() > 0) {
            parameters.setFocusAreas(arrayList);
        }
        if (parameters.getMaxNumMeteringAreas() > 0) {
            parameters.setMeteringAreas(arrayList);
        }
    }

    private static String a(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes;
        if (!z || (supportedFlashModes = parameters.getSupportedFlashModes()) == null) {
            return "off";
        }
        if (supportedFlashModes.contains("torch")) {
            return "torch";
        }
        return supportedFlashModes.contains("on") ? "on" : "off";
    }

    private final void a(Camera.Parameters parameters, boolean z, NativePreferredFrameRateRange nativePreferredFrameRateRange) {
        NativeCameraDelegateSettings nativeCameraDelegateSettings = this.l;
        if (nativeCameraDelegateSettings != null) {
            float f = nativeCameraDelegateSettings.maxFrameRate;
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            Intrinsics.g(supportedPreviewFpsRange, "cameraParameters.supportedPreviewFpsRange");
            ArrayList arrayList = new ArrayList(CollectionsKt.s(supportedPreviewFpsRange, 10));
            Iterator<T> it = supportedPreviewFpsRange.iterator();
            while (true) {
                int iIntValue = 0;
                if (!it.hasNext()) {
                    break;
                }
                int[] it2 = (int[]) it.next();
                Intrinsics.g(it2, "it");
                Integer numY = ArraysKt.Y(it2);
                Integer numValueOf = Integer.valueOf(numY != null ? numY.intValue() : 0);
                Integer numW = ArraysKt.W(it2);
                if (numW != null) {
                    iIntValue = numW.intValue();
                }
                arrayList.add(new Range(numValueOf, Integer.valueOf(iIntValue)));
            }
            Range rangeA = AbstractC1028i2.a(this.b, f, (Range[]) arrayList.toArray(new Range[0]), z, NativeCameraApi.CAMERA1, nativePreferredFrameRateRange);
            if (rangeA == null) {
                return;
            }
            Object lower = rangeA.getLower();
            Intrinsics.g(lower, "profile.lower");
            int iIntValue2 = ((Number) lower).intValue();
            Object upper = rangeA.getUpper();
            Intrinsics.g(upper, "profile.upper");
            parameters.setPreviewFpsRange(iIntValue2, ((Number) upper).intValue());
        }
    }
}
