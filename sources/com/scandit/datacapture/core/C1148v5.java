package com.scandit.datacapture.core;

import android.util.Range;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.v5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1148v5 extends E4 {
    public static final C1148v5 d;
    private static final String e;
    private static final K6 f;

    static {
        C1148v5 c1148v5 = new C1148v5();
        d = c1148v5;
        e = "(sm-j50|sm-j51).*";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, true, false, 0, 111);
    }

    private C1148v5() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f2) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        return AbstractC1001f2.c(frameRateRanges, f2);
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return f;
    }
}
