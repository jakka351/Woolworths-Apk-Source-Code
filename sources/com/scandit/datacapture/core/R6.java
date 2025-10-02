package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class R6 extends E4 {
    public static final R6 d;
    private static final String e;
    private static final K6 f;
    private static final boolean g;

    static {
        R6 r6 = new R6();
        d = r6;
        e = "xp8800";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, true, 0, 95);
        g = true;
    }

    private R6() {
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return f;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean f() {
        return g;
    }
}
