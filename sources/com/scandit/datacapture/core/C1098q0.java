package com.scandit.datacapture.core;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.SurfaceHolder;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1098q0 implements InterfaceC1080o0 {
    private static final Size[] b = {new Size(1920, 1080), new Size(1280, 720)};

    /* renamed from: a, reason: collision with root package name */
    private final CameraCharacteristics f18818a;

    public C1098q0(CameraCharacteristics cameraCharacteristics) {
        Intrinsics.h(cameraCharacteristics, "cameraCharacteristics");
        this.f18818a = cameraCharacteristics;
    }

    public final Object a(CameraCharacteristics.Key key) {
        Intrinsics.h(key, "key");
        return this.f18818a.get(key);
    }

    public final Size[] b() {
        Object objA;
        try {
            CameraCharacteristics.Key SCALER_STREAM_CONFIGURATION_MAP = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
            Intrinsics.g(SCALER_STREAM_CONFIGURATION_MAP, "SCALER_STREAM_CONFIGURATION_MAP");
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(SCALER_STREAM_CONFIGURATION_MAP);
            objA = streamConfigurationMap != null ? streamConfigurationMap.getHighResolutionOutputSizes(35) : null;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Size[] sizeArr = (Size[]) (objA instanceof Result.Failure ? null : objA);
        return sizeArr == null ? new Size[0] : sizeArr;
    }

    public List c() {
        Object objA;
        Size[] outputSizes;
        try {
            CameraCharacteristics.Key SCALER_STREAM_CONFIGURATION_MAP = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
            Intrinsics.g(SCALER_STREAM_CONFIGURATION_MAP, "SCALER_STREAM_CONFIGURATION_MAP");
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(SCALER_STREAM_CONFIGURATION_MAP);
            objA = (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceHolder.class)) == null) ? null : ArraysKt.f0(new C1089p0(), outputSizes);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        List list = (List) (objA instanceof Result.Failure ? null : objA);
        return list == null ? ArraysKt.l0(b) : list;
    }

    public Size[] d() {
        Object objA;
        try {
            CameraCharacteristics.Key SCALER_STREAM_CONFIGURATION_MAP = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
            Intrinsics.g(SCALER_STREAM_CONFIGURATION_MAP, "SCALER_STREAM_CONFIGURATION_MAP");
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(SCALER_STREAM_CONFIGURATION_MAP);
            objA = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(35) : null;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Size[] sizeArr = (Size[]) (objA instanceof Result.Failure ? null : objA);
        return sizeArr == null ? b : sizeArr;
    }

    public final Rational e() {
        CameraCharacteristics.Key CONTROL_AE_COMPENSATION_STEP = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
        Intrinsics.g(CONTROL_AE_COMPENSATION_STEP, "CONTROL_AE_COMPENSATION_STEP");
        Rational rational = (Rational) a(CONTROL_AE_COMPENSATION_STEP);
        if (rational != null) {
            return rational;
        }
        throw new IllegalArgumentException("Exposure compensation step should be non-null on all devices.");
    }

    public final Integer f() {
        CameraCharacteristics.Key LENS_INFO_FOCUS_DISTANCE_CALIBRATION = CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION;
        Intrinsics.g(LENS_INFO_FOCUS_DISTANCE_CALIBRATION, "LENS_INFO_FOCUS_DISTANCE_CALIBRATION");
        return (Integer) a(LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
    }

    public final int g() {
        CameraCharacteristics.Key LENS_FACING = CameraCharacteristics.LENS_FACING;
        Intrinsics.g(LENS_FACING, "LENS_FACING");
        Integer num = (Integer) a(LENS_FACING);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final Range[] a() {
        CameraCharacteristics.Key CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
        Intrinsics.g(CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES, "CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES");
        Range[] rangeArr = (Range[]) a(CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr == null ? new Range[0] : rangeArr;
    }
}
