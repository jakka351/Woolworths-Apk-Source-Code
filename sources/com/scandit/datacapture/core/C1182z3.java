package com.scandit.datacapture.core;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.z3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1182z3 extends AbstractC1171y1 {
    public static final C1182z3 c = new C1182z3();
    private static final String d = "901kc";

    private C1182z3() {
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
