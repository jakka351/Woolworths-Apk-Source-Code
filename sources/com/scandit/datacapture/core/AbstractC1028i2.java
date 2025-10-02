package com.scandit.datacapture.core;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativePreferredFrameRateRange;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.i2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1028i2 {
    public static final Range a(CameraProfile cameraProfile, float f, Range[] frameRateRanges, boolean z, NativeCameraApi cameraApi, NativePreferredFrameRateRange nativePreferredFrameRateRange) {
        Integer num;
        Intrinsics.h(cameraProfile, "cameraProfile");
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        Intrinsics.h(cameraApi, "cameraApi");
        int i = AbstractC1010g2.f18523a[cameraApi.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 1000;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        C1019h2 c1019h2 = new C1019h2(cameraProfile, cameraApi, nativePreferredFrameRateRange, frameRateRanges);
        if (!z) {
            return (Range) c1019h2.invoke(Float.valueOf(f));
        }
        float f2 = i2 * 20.0f;
        Object objInvoke = c1019h2.invoke(Float.valueOf(25.0f));
        Range range = (Range) objInvoke;
        if (f2 >= ((range == null || (num = (Integer) range.getUpper()) == null) ? 0 : num.intValue())) {
            objInvoke = null;
        }
        Range range2 = (Range) objInvoke;
        return range2 == null ? (Range) c1019h2.invoke(Float.valueOf(f)) : range2;
    }
}
