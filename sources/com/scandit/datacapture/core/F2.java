package com.scandit.datacapture.core;

import android.hardware.Camera;
import android.util.Range;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F2 extends AbstractC1171y1 {
    public static final F2 c;
    private static final String d;
    private static final K6 e;

    static {
        F2 f2 = new F2();
        c = f2;
        d = "nexus 5|nexus 6p";
        e = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 123);
    }

    private F2() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        AbstractC1171y1.a(camParams, Math.max(e.e(), -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return d;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f) {
        Integer num;
        Integer num2;
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        for (Range range : frameRateRanges) {
            Integer num3 = (Integer) range.getLower();
            if (num3 != null && num3.intValue() == 7000 && (num2 = (Integer) range.getUpper()) != null && num2.intValue() == 30000) {
                return new Range(7000, 30000);
            }
        }
        Range range2 = null;
        int iIntValue = 30000;
        for (Range range3 : frameRateRanges) {
            Object lower = range3.getLower();
            Intrinsics.g(lower, "range.lower");
            if (((Number) lower).intValue() < iIntValue && (num = (Integer) range3.getUpper()) != null && num.intValue() == 30000) {
                Object lower2 = range3.getLower();
                Intrinsics.g(lower2, "range.lower");
                iIntValue = ((Number) lower2).intValue();
                range2 = range3;
            }
        }
        if (range2 != null) {
            return new Range(range2.getLower(), range2.getUpper());
        }
        return AbstractC1001f2.b(frameRateRanges, f);
    }
}
