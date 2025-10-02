package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class P5 extends O4 {
    public static final P5 e;
    private static final String f;
    private static final K6 g;

    static {
        P5 p5 = new P5();
        e = p5;
        f = "sm-g955.*";
        g = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, true, false, 0, 111);
    }

    private P5() {
    }

    @Override // com.scandit.datacapture.core.O4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return f;
    }

    @Override // com.scandit.datacapture.core.O4, com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return g;
    }
}
