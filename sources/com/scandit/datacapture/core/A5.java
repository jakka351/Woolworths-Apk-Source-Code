package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class A5 extends O4 {
    public static final A5 e;
    private static final String f;
    private static final K6 g;

    static {
        A5 a5 = new A5();
        e = a5;
        f = "sm-n950.*";
        g = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 125);
    }

    private A5() {
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
