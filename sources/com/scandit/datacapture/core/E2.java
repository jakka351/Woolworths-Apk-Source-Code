package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class E2 extends E4 {
    public static final E2 d;
    private static final String e;
    private static final K6 f;

    static {
        E2 e2 = new E2();
        d = e2;
        e = "nexus 4";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, true, false, 0, 111);
    }

    private E2() {
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
