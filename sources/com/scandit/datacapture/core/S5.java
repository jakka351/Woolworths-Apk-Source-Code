package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class S5 extends E4 {
    public static final S5 d;
    private static final String e;
    private static final K6 f;

    static {
        S5 s5 = new S5();
        d = s5;
        e = "gt-p1000";
        f = K6.a(super.d(), true, BitmapDescriptorFactory.HUE_RED, false, false, 0, 122);
    }

    private S5() {
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
