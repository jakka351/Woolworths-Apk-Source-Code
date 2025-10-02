package com.scandit.datacapture.core;

import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0998f extends AbstractC1171y1 {
    public static final C0998f c = new C0998f();
    private static final String d = "sh-m19";

    private C0998f() {
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
    public final Range b(Range[] frameRateRanges, float f) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        return AbstractC1001f2.c(frameRateRanges, f);
    }
}
