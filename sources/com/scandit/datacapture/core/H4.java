package com.scandit.datacapture.core;

import android.util.Range;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class H4 extends AbstractC1171y1 {
    public static final H4 c;
    private static final String d;
    private static final K6 e;

    static {
        H4 h4 = new H4();
        c = h4;
        d = "nokia 7\\.2";
        e = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 125);
    }

    private H4() {
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
    public final K6 d() {
        return e;
    }
}
