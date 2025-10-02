package com.scandit.datacapture.core;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumDeserializer;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegateSettings;
import com.scandit.datacapture.core.internal.module.source.NativeEdgeEnhancement;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;
import com.scandit.datacapture.core.internal.module.source.NativeMacroAfMode;
import com.scandit.datacapture.core.internal.module.source.NativeNoiseReduction;
import com.scandit.datacapture.core.internal.module.source.NativeTonemapCurve;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.source.TorchState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: com.scandit.datacapture.core.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0959a5 {

    /* renamed from: a, reason: collision with root package name */
    private final E0 f18407a;
    private final Q0 b;
    private final C1018h1 c;
    private final S7 d;
    private NativeCameraDelegateSettings e;
    private Boolean f;
    private boolean g;
    private boolean h;
    private Integer i;
    private boolean j;
    private int k;
    private final C1162x1 l;

    public C0959a5(F0 cameraInfo, Q0 cameraTorchController) {
        Intrinsics.h(cameraInfo, "cameraInfo");
        Intrinsics.h(cameraTorchController, "cameraTorchController");
        this.f18407a = cameraInfo;
        this.b = cameraTorchController;
        this.c = new C1018h1();
        this.d = new S7();
        this.l = new C1162x1();
        a(cameraInfo.t());
    }

    private final void a(Boolean bool) {
        this.f = bool;
        if (bool != null) {
            CaptureRequest.Key FLASH_MODE = CaptureRequest.FLASH_MODE;
            Intrinsics.g(FLASH_MODE, "FLASH_MODE");
            a(FLASH_MODE, Integer.valueOf(bool.booleanValue() ? 2 : 0));
        }
    }

    public final void b() {
        a(Boolean.FALSE);
    }

    public final boolean c() {
        return this.l.hashCode() != this.k;
    }

    public final void d() {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        AbstractC1009g1.a(key, "CONTROL_AF_TRIGGER", 0, this, key);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0959a5)) {
            return false;
        }
        C0959a5 c0959a5 = (C0959a5) obj;
        return Intrinsics.c(c0959a5.l, this.l) && Intrinsics.c(c0959a5.f, this.f) && c0959a5.g == this.g && c0959a5.j == this.j && c0959a5.h == this.h && Intrinsics.c(c0959a5.i, this.i);
    }

    public final int hashCode() {
        return O2.a(O2.a(O2.a(O2.a(O2.a(O2.a(0, this.l), this.f), Boolean.valueOf(this.g)), Boolean.valueOf(this.j)), Boolean.valueOf(this.h)), this.i);
    }

    public final void b(Rect rect) {
        CaptureRequest.Key CONTROL_AF_REGIONS = CaptureRequest.CONTROL_AF_REGIONS;
        Intrinsics.g(CONTROL_AF_REGIONS, "CONTROL_AF_REGIONS");
        a(CONTROL_AF_REGIONS, a(rect, ((F0) this.f18407a).o()));
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        AbstractC1009g1.a(key, "CONTROL_AF_MODE", 4, this, key);
        a(rect);
        CaptureRequest.Key CONTROL_AF_TRIGGER = CaptureRequest.CONTROL_AF_TRIGGER;
        Intrinsics.g(CONTROL_AF_TRIGGER, "CONTROL_AF_TRIGGER");
        a(CONTROL_AF_TRIGGER, (Object) null);
    }

    public final void c(Rect rect) {
        CaptureRequest.Key CONTROL_AF_REGIONS = CaptureRequest.CONTROL_AF_REGIONS;
        Intrinsics.g(CONTROL_AF_REGIONS, "CONTROL_AF_REGIONS");
        a(CONTROL_AF_REGIONS, a(rect, ((F0) this.f18407a).o()));
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        AbstractC1009g1.a(key, "CONTROL_AF_MODE", 1, this, key);
        a(rect);
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_TRIGGER;
        AbstractC1009g1.a(key2, "CONTROL_AF_TRIGGER", 1, this, key2);
    }

    public final void a(CaptureRequest.Key key, Object obj) {
        Intrinsics.h(key, "key");
        if (obj == null) {
            this.l.remove(key);
        } else {
            this.l.put(key, obj);
        }
    }

    public /* synthetic */ C0959a5(F0 f0) {
        this(f0, new S0(f0));
    }

    public final void a(NativeCameraDelegateSettings delegateSettings) {
        int i;
        float zoomFactor;
        Intrinsics.h(delegateSettings, "delegateSettings");
        this.e = delegateSettings;
        E0 e0 = this.f18407a;
        float exposureTargetBias = delegateSettings.getExposureTargetBias();
        F0 f0 = (F0) e0;
        if (f0.g().j()) {
            Range rangeI = f0.i();
            Rational rationalJ = f0.j();
            Integer min = (Integer) rangeI.getLower();
            Integer max = (Integer) rangeI.getUpper();
            if ((min == null || min.intValue() != 0 || max == null || max.intValue() != 0) && !rationalJ.isZero() && rationalJ.isFinite()) {
                int iB = MathKt.b(exposureTargetBias / rationalJ.floatValue());
                Intrinsics.g(min, "min");
                int iIntValue = min.intValue();
                Intrinsics.g(max, "max");
                int iC = RangesKt.c(iB, iIntValue, max.intValue());
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
                AbstractC1009g1.a(key, "CONTROL_AE_EXPOSURE_COMPENSATION", iC, this, key);
            } else {
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
                AbstractC1009g1.a(key2, "CONTROL_AE_EXPOSURE_COMPENSATION", 0, this, key2);
            }
        } else {
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            AbstractC1009g1.a(key3, "CONTROL_AE_EXPOSURE_COMPENSATION", 0, this, key3);
        }
        NativeEdgeEnhancement edgeEnhancementMode = delegateSettings.getEdgeEnhancementMode();
        Intrinsics.g(edgeEnhancementMode, "delegateSettings.edgeEnhancementMode");
        int i2 = Z4.b[edgeEnhancementMode.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 1;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        CaptureRequest.Key key4 = CaptureRequest.EDGE_MODE;
        AbstractC1009g1.a(key4, "EDGE_MODE", i, this, key4);
        this.c.a(this, 1);
        if (delegateSettings.getDisablePostProcessing()) {
            AbstractC1009g1.a(key4, "EDGE_MODE", 0, this, key4);
            CaptureRequest.Key key5 = CaptureRequest.NOISE_REDUCTION_MODE;
            AbstractC1009g1.a(key5, "NOISE_REDUCTION_MODE", 0, this, key5);
            try {
                this.i = 0;
            } catch (Exception unused) {
            }
        }
        if (delegateSettings.getEnableSensorPixelModeMaximumResolution() && Build.VERSION.SDK_INT >= 31) {
            CaptureRequest.Key key6 = CaptureRequest.SENSOR_PIXEL_MODE;
            AbstractC1009g1.a(key6, "SENSOR_PIXEL_MODE", 1, this, key6);
        }
        CameraProfile cameraProfileG = f0.g();
        int sharpnessStrength = delegateSettings.getSharpnessStrength();
        if (sharpnessStrength < 0) {
            sharpnessStrength = cameraProfileG.d().a();
        }
        if (sharpnessStrength >= 0) {
            try {
                this.i = Integer.valueOf(sharpnessStrength);
            } catch (Exception unused2) {
            }
        }
        NativeNoiseReduction noiseReductionMode = delegateSettings.getNoiseReductionMode();
        Intrinsics.g(noiseReductionMode, "delegateSettings.noiseReductionMode");
        int i3 = Z4.c[noiseReductionMode.ordinal()];
        if (i3 == 1) {
            CaptureRequest.Key key7 = CaptureRequest.NOISE_REDUCTION_MODE;
            AbstractC1009g1.a(key7, "NOISE_REDUCTION_MODE", 0, this, key7);
        } else if (i3 == 2) {
            CaptureRequest.Key key8 = CaptureRequest.NOISE_REDUCTION_MODE;
            AbstractC1009g1.a(key8, "NOISE_REDUCTION_MODE", 1, this, key8);
        } else if (i3 == 3) {
            CaptureRequest.Key key9 = CaptureRequest.NOISE_REDUCTION_MODE;
            AbstractC1009g1.a(key9, "NOISE_REDUCTION_MODE", 2, this, key9);
        }
        int sensorSensitivity = delegateSettings.getSensorSensitivity();
        CaptureRequest.Key SENSOR_SENSITIVITY = CaptureRequest.SENSOR_SENSITIVITY;
        Intrinsics.g(SENSOR_SENSITIVITY, "SENSOR_SENSITIVITY");
        a(SENSOR_SENSITIVITY, sensorSensitivity > 0 ? Integer.valueOf(sensorSensitivity) : null);
        CameraProfile cameraProfileG2 = f0.g();
        NativeMacroAfMode macroAutofocusMode = delegateSettings.getMacroAutofocusMode();
        Intrinsics.g(macroAutofocusMode, "delegateSettings.macroAutofocusMode");
        if (macroAutofocusMode == NativeMacroAfMode.MACRO ? cameraProfileG2.h() : false) {
            NativeMacroAfMode macroAutofocusMode2 = delegateSettings.getMacroAutofocusMode();
            Intrinsics.g(macroAutofocusMode2, "delegateSettings.macroAutofocusMode");
            float fM = f0.m() - 1.5f;
            int i4 = Z4.d[macroAutofocusMode2.ordinal()];
            if (i4 == 1) {
                CaptureRequest.Key key10 = CaptureRequest.CONTROL_AF_MODE;
                AbstractC1009g1.a(key10, "CONTROL_AF_MODE", 2, this, key10);
                CaptureRequest.Key key11 = CaptureRequest.CONTROL_AF_TRIGGER;
                AbstractC1009g1.a(key11, "CONTROL_AF_TRIGGER", 1, this, key11);
            } else if (i4 != 2) {
                String message = "Macro Autofocus Mode is not supported: " + macroAutofocusMode2;
                Intrinsics.h(message, "message");
                Log.e("sdc-core", message);
            } else {
                CaptureRequest.Key key12 = CaptureRequest.CONTROL_AF_MODE;
                AbstractC1009g1.a(key12, "CONTROL_AF_MODE", 0, this, key12);
                CaptureRequest.Key LENS_FOCUS_DISTANCE = CaptureRequest.LENS_FOCUS_DISTANCE;
                Intrinsics.g(LENS_FOCUS_DISTANCE, "LENS_FOCUS_DISTANCE");
                a(LENS_FOCUS_DISTANCE, Float.valueOf(fM));
            }
        }
        NativeJsonValue properties = delegateSettings.getProperties();
        if (properties != null) {
            if (properties.contains("multiFrameNoiseReduction")) {
                int boolForKey = properties.getBoolForKey("multiFrameNoiseReduction");
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        a(com.google.android.material.textfield.h.o(), new int[]{boolForKey});
                    } catch (Exception unused3) {
                        O3.a("could not set ".concat("org.codeaurora.qcamera3.sessionParameters.enableMFNR"));
                    }
                }
            }
            if (properties.contains("contrastLevel")) {
                int intForKey = properties.getIntForKey("contrastLevel");
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        a(com.google.android.material.textfield.h.s(), new int[]{intForKey});
                    } catch (Exception unused4) {
                        O3.a("could not set ".concat("org.codeaurora.qcamera3.contrast.level"));
                    }
                }
            }
        }
        NativeJsonValue properties2 = delegateSettings.getProperties();
        if (properties2 != null ? properties2.getBoolForKeyOrDefault("ultraWideModeEnabled", false) : false) {
            zoomFactor = delegateSettings.getZoomFactor() * ((Number) f0.c().getStart()).floatValue();
        } else {
            zoomFactor = delegateSettings.getZoomFactor();
        }
        float fFloatValue = ((Number) RangesKt.g(Float.valueOf(zoomFactor), f0.c())).floatValue();
        if (Build.VERSION.SDK_INT >= 30) {
            CaptureRequest.Key CONTROL_ZOOM_RATIO = CaptureRequest.CONTROL_ZOOM_RATIO;
            Intrinsics.g(CONTROL_ZOOM_RATIO, "CONTROL_ZOOM_RATIO");
            a(CONTROL_ZOOM_RATIO, Float.valueOf(zoomFactor));
        } else {
            android.graphics.Rect rectQ = f0.q();
            int iWidth = (int) (rectQ.width() / fFloatValue);
            int iHeight = (int) (rectQ.height() / fFloatValue);
            int iWidth2 = (rectQ.width() - iWidth) / 2;
            int iHeight2 = (rectQ.height() - iHeight) / 2;
            if (f0.g().d().d() && rectQ.left - iWidth2 < 16 && rectQ.top - iHeight2 < 16 && rectQ.width() - iWidth < 32 && rectQ.height() - iHeight < 32) {
                iWidth = rectQ.width() - 32;
                iHeight = rectQ.height() - 32;
                iWidth2 = rectQ.left + 16;
                iHeight2 = rectQ.top + 16;
            }
            android.graphics.Rect rect = new android.graphics.Rect(iWidth2, iHeight2, iWidth + iWidth2, iHeight + iHeight2);
            CaptureRequest.Key SCALER_CROP_REGION = CaptureRequest.SCALER_CROP_REGION;
            Intrinsics.g(SCALER_CROP_REGION, "SCALER_CROP_REGION");
            a(SCALER_CROP_REGION, rect);
        }
        TorchState torchState = delegateSettings.getTorchState();
        Intrinsics.g(torchState, "delegateSettings.torchState");
        int i5 = Z4.e[torchState.ordinal()];
        if (i5 == 1) {
            this.g = false;
            a(Boolean.FALSE);
        } else if (i5 == 2) {
            this.g = false;
            a(Boolean.TRUE);
        } else if (i5 == 3) {
            this.g = true;
            if (this.f == null) {
                a(Boolean.FALSE);
            }
        }
        boolean colorCorrection = delegateSettings.getColorCorrection();
        this.j = colorCorrection;
        this.c.a(this, colorCorrection);
        NativeTonemapCurve toneMappingCurve = delegateSettings.getToneMappingCurve();
        Intrinsics.g(toneMappingCurve, "delegateSettings.toneMappingCurve");
        this.d.a(this, toneMappingCurve);
        a(delegateSettings, this.f18407a, this.h);
    }

    public final void a(boolean z) {
        this.h = z;
        NativeCameraDelegateSettings nativeCameraDelegateSettings = this.e;
        if (nativeCameraDelegateSettings != null) {
            a(nativeCameraDelegateSettings, this.f18407a, z);
        }
    }

    public final void a() {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        AbstractC1009g1.a(key, "CONTROL_AF_MODE", 1, this, key);
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_TRIGGER;
        AbstractC1009g1.a(key2, "CONTROL_AF_TRIGGER", 2, this, key2);
    }

    public final void a(float f) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        AbstractC1009g1.a(key, "CONTROL_AF_MODE", 0, this, key);
        CaptureRequest.Key LENS_FOCUS_DISTANCE = CaptureRequest.LENS_FOCUS_DISTANCE;
        Intrinsics.g(LENS_FOCUS_DISTANCE, "LENS_FOCUS_DISTANCE");
        a(LENS_FOCUS_DISTANCE, Float.valueOf(((F0) this.f18407a).l() + ((1.0f - f) * (((F0) this.f18407a).m() - ((F0) this.f18407a).l()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.Result$Failure] */
    public final void a(C1035j0 captureResult) {
        NativeFocusStrategy nativeFocusStrategyA;
        Intrinsics.h(captureResult, "captureResult");
        this.c.a(captureResult);
        boolean z = this.j;
        this.j = z;
        this.c.a(this, z);
        if (this.g) {
            Q0 q0 = this.b;
            NativeCameraDelegateSettings nativeCameraDelegateSettings = this.e;
            if (nativeCameraDelegateSettings != null) {
                NativeJsonValue properties = nativeCameraDelegateSettings.getProperties();
                String optionalStringForKeyOrDefault = properties != null ? properties.getOptionalStringForKeyOrDefault("focusStrategy", null) : null;
                if (optionalStringForKeyOrDefault != null) {
                    try {
                        NativeFocusStrategy nativeFocusStrategyFocusStrategyFromJsonString = NativeEnumDeserializer.focusStrategyFromJsonString(optionalStringForKeyOrDefault);
                        Intrinsics.g(nativeFocusStrategyFocusStrategyFromJsonString, "focusStrategyFromJsonString(json)");
                        nativeFocusStrategyA = nativeFocusStrategyFocusStrategyFromJsonString;
                    } catch (Throwable th) {
                        nativeFocusStrategyA = ResultKt.a(th);
                    }
                    nativeFocusStrategy = nativeFocusStrategyA instanceof Result.Failure ? null : nativeFocusStrategyA;
                }
            }
            int i = nativeFocusStrategy == null ? -1 : Z4.f18403a[nativeFocusStrategy.ordinal()];
            boolean z2 = true;
            if (i != 1 && i != 2) {
                z2 = false;
            }
            a(Boolean.valueOf(((S0) q0).a(captureResult, z2)));
        }
    }

    private final void a(int i) {
        if (i > 0) {
            a(AbstractC1169y.a(), Integer.valueOf(i));
        }
    }

    private final void a(NativeCameraDelegateSettings nativeCameraDelegateSettings, E0 e0, boolean z) {
        CaptureRequest.Key CONTROL_MODE = CaptureRequest.CONTROL_MODE;
        Intrinsics.g(CONTROL_MODE, "CONTROL_MODE");
        a(CONTROL_MODE, (Object) null);
        CaptureRequest.Key CONTROL_AE_MODE = CaptureRequest.CONTROL_AE_MODE;
        Intrinsics.g(CONTROL_AE_MODE, "CONTROL_AE_MODE");
        a(CONTROL_AE_MODE, (Object) null);
        CaptureRequest.Key SENSOR_EXPOSURE_TIME = CaptureRequest.SENSOR_EXPOSURE_TIME;
        Intrinsics.g(SENSOR_EXPOSURE_TIME, "SENSOR_EXPOSURE_TIME");
        a(SENSOR_EXPOSURE_TIME, (Object) null);
        CaptureRequest.Key SENSOR_FRAME_DURATION = CaptureRequest.SENSOR_FRAME_DURATION;
        Intrinsics.g(SENSOR_FRAME_DURATION, "SENSOR_FRAME_DURATION");
        a(SENSOR_FRAME_DURATION, (Object) null);
        CaptureRequest.Key CONTROL_AE_TARGET_FPS_RANGE = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        Intrinsics.g(CONTROL_AE_TARGET_FPS_RANGE, "CONTROL_AE_TARGET_FPS_RANGE");
        a(CONTROL_AE_TARGET_FPS_RANGE, (Object) null);
        if (nativeCameraDelegateSettings.getExposureDuration() <= 0 && nativeCameraDelegateSettings.getFrameDuration() <= 0) {
            if (nativeCameraDelegateSettings.getMinFrameRate() > BitmapDescriptorFactory.HUE_RED) {
                F0 f0 = (F0) e0;
                Range rangeA = AbstractC1028i2.a(f0.g(), nativeCameraDelegateSettings.getMaxFrameRate(), f0.a(), z, NativeCameraApi.CAMERA2, nativeCameraDelegateSettings.getPreferredFrameRateRange());
                if (rangeA != null) {
                    Intrinsics.g(CONTROL_AE_TARGET_FPS_RANGE, "CONTROL_AE_TARGET_FPS_RANGE");
                    a(CONTROL_AE_TARGET_FPS_RANGE, rangeA);
                    return;
                }
                return;
            }
            return;
        }
        long exposureDuration = nativeCameraDelegateSettings.getExposureDuration();
        long frameDuration = nativeCameraDelegateSettings.getFrameDuration();
        AbstractC1009g1.a(CONTROL_MODE, "CONTROL_MODE", 1, this, CONTROL_MODE);
        AbstractC1009g1.a(CONTROL_AE_MODE, "CONTROL_AE_MODE", 0, this, CONTROL_AE_MODE);
        if (exposureDuration > 0) {
            Intrinsics.g(SENSOR_EXPOSURE_TIME, "SENSOR_EXPOSURE_TIME");
            a(SENSOR_EXPOSURE_TIME, Long.valueOf(exposureDuration));
        }
        if (frameDuration > 0) {
            Intrinsics.g(SENSOR_FRAME_DURATION, "SENSOR_FRAME_DURATION");
            a(SENSOR_FRAME_DURATION, Long.valueOf(frameDuration));
        }
    }

    private final void a(Rect rect) {
        NativeCameraDelegateSettings nativeCameraDelegateSettings = this.e;
        if ((nativeCameraDelegateSettings != null ? nativeCameraDelegateSettings.getExposureDuration() : 0L) <= 0) {
            NativeCameraDelegateSettings nativeCameraDelegateSettings2 = this.e;
            if ((nativeCameraDelegateSettings2 != null ? nativeCameraDelegateSettings2.getFrameDuration() : 0L) <= 0) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                AbstractC1009g1.a(key, "CONTROL_AE_MODE", 1, this, key);
                CaptureRequest.Key CONTROL_AE_REGIONS = CaptureRequest.CONTROL_AE_REGIONS;
                Intrinsics.g(CONTROL_AE_REGIONS, "CONTROL_AE_REGIONS");
                a(CONTROL_AE_REGIONS, a(rect, ((F0) this.f18407a).n()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    public final CaptureRequest a(CaptureRequest.Builder requestBuilder) {
        CaptureRequest.Key next;
        CaptureRequest.Key keyF;
        Intrinsics.h(requestBuilder, "requestBuilder");
        Integer num = this.i;
        if (num != null) {
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= 29) {
                keyF = com.google.android.material.textfield.h.f();
            } else {
                CaptureRequest captureRequestBuild = requestBuilder.build();
                Intrinsics.g(captureRequestBuild, "builder.build()");
                List<CaptureRequest.Key<?>> keys = captureRequestBuild.getKeys();
                Intrinsics.g(keys, "keys");
                Iterator it = keys.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = 0;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.c(((CaptureRequest.Key) next).getName(), "org.codeaurora.qcamera3.sharpness.strength")) {
                        break;
                    }
                }
                keyF = next instanceof CaptureRequest.Key ? next : null;
            }
            if (keyF != null) {
                a(keyF, new int[]{iIntValue});
            }
        }
        for (Map.Entry entry : this.l.entrySet()) {
            requestBuilder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
        this.k = this.l.hashCode();
        CaptureRequest captureRequestBuild2 = requestBuilder.build();
        Intrinsics.g(captureRequestBuild2, "requestBuilder.build()");
        return captureRequestBuild2;
    }

    private final MeteringRectangle[] a(Rect rect, int i) {
        if (rect == null || i == 0) {
            return null;
        }
        android.graphics.Rect rectQ = ((F0) this.f18407a).q();
        NativeCameraDelegateSettings nativeCameraDelegateSettings = this.e;
        if (nativeCameraDelegateSettings != null && nativeCameraDelegateSettings.getZoomAffectsMeteringArea()) {
            CaptureRequest.Key SCALER_CROP_REGION = CaptureRequest.SCALER_CROP_REGION;
            Intrinsics.g(SCALER_CROP_REGION, "SCALER_CROP_REGION");
            Object obj = this.l.get(SCALER_CROP_REGION);
            android.graphics.Rect rect2 = (android.graphics.Rect) (obj != null ? obj : null);
            if (rect2 == null) {
                rect2 = rectQ;
            }
            float fWidth = rect2.width() / rectQ.width();
            return new MeteringRectangle[]{a(new Rect(new Point(((rect.getOrigin().getX() - 0.5f) * fWidth) + 0.5f, ((rect.getOrigin().getY() - 0.5f) * fWidth) + 0.5f), new Size2(rect.getSize().getWidth() * fWidth, rect.getSize().getHeight() * fWidth)), rectQ)};
        }
        return new MeteringRectangle[]{a(rect, rectQ)};
    }

    private static MeteringRectangle a(Rect rect, android.graphics.Rect rect2) {
        int i;
        int i2;
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        float f = iWidth;
        float x = rect.getOrigin().getX() * f;
        float f2 = iHeight;
        float y = rect.getOrigin().getY() * f2;
        float width = rect.getSize().getWidth() * f;
        float height = rect.getSize().getHeight() * f2;
        int i3 = (int) x;
        int i4 = (int) y;
        int i5 = (int) width;
        int i6 = (int) height;
        if (i3 == 0) {
            i5--;
            i = 1;
        } else {
            i = i3;
        }
        if (i4 == 0) {
            i6--;
            i2 = 1;
        } else {
            i2 = i4;
        }
        if (i5 + i == rect2.width()) {
            i5--;
        }
        int i7 = i5;
        if (i6 + i2 == rect2.height()) {
            i6--;
        }
        return new MeteringRectangle(i, i2, i7, i6, 1000);
    }
}
