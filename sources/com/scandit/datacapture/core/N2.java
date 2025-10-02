package com.scandit.datacapture.core;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class N2 extends AbstractC1171y1 {
    public static final N2 c = new N2();
    private static final String d = "algiz_rt8";

    private N2() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        return AbstractC1001f2.c(frameRateRanges, f);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return d;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeCameraApi k() {
        return NativeCameraApi.CAMERA2;
    }
}
