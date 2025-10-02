package com.scandit.datacapture.core;

import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1144v1 extends AbstractC1171y1 {
    public static final C1144v1 c = new C1144v1();
    private static final String d = "core-x4";

    private C1144v1() {
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
}
