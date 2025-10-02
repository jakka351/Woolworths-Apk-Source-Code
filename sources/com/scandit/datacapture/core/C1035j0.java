package com.scandit.datacapture.core;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.RggbChannelVector;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.j0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1035j0 implements InterfaceC1026i0 {

    /* renamed from: a, reason: collision with root package name */
    private final TotalCaptureResult f18775a;

    public C1035j0(TotalCaptureResult totalCaptureResult) {
        Intrinsics.h(totalCaptureResult, "totalCaptureResult");
        this.f18775a = totalCaptureResult;
    }

    public final Integer a() {
        return (Integer) this.f18775a.get(CaptureResult.CONTROL_AF_MODE);
    }

    public final RggbChannelVector b() {
        return (RggbChannelVector) this.f18775a.get(CaptureResult.COLOR_CORRECTION_GAINS);
    }

    public final Integer c() {
        return (Integer) this.f18775a.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
    }

    public final Float d() {
        if (((Long) this.f18775a.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            return Float.valueOf((float) (r0.longValue() * 1.0E-9d));
        }
        return null;
    }

    public final Float e() {
        return (Float) this.f18775a.get(CaptureResult.LENS_APERTURE);
    }

    public final Integer f() {
        return (Integer) this.f18775a.get(CaptureResult.FLASH_STATE);
    }

    public final Float g() {
        TotalCaptureResult totalCaptureResult = this.f18775a;
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.CONTROL_AF_MODE);
                Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.LENS_STATE);
                Float f = (Float) totalCaptureResult.get(CaptureResult.LENS_FOCUS_DISTANCE);
                CaptureRequest request = totalCaptureResult.getRequest();
                CaptureRequest.Key key = CaptureRequest.LENS_FOCUS_DISTANCE;
                Float f2 = (Float) request.get(key);
                if (num2 != null && num3 != null && f != null && f2 != null && num2.intValue() == 0 && num3.intValue() != 1 && Math.abs(f2.floatValue() - f.floatValue()) < 0.05f) {
                    return (Float) this.f18775a.getRequest().get(key);
                }
            } else if (iIntValue == 3 || iIntValue != 4) {
            }
        }
        return (Float) this.f18775a.get(CaptureResult.LENS_FOCUS_DISTANCE);
    }

    public final Float h() {
        return (Float) this.f18775a.get(CaptureResult.LENS_FOCUS_DISTANCE);
    }

    public final Long i() {
        return (Long) this.f18775a.get(CaptureResult.SENSOR_EXPOSURE_TIME);
    }

    public final Integer j() {
        return (Integer) this.f18775a.get(CaptureResult.SENSOR_SENSITIVITY);
    }
}
