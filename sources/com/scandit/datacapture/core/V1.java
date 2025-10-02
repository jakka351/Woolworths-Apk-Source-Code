package com.scandit.datacapture.core;

import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class V1 extends AbstractC1171y1 {
    public static final V1 c = new V1();
    private static final String d = "st-5i";

    private V1() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return d;
    }
}
