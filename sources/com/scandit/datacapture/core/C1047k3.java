package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scandit.datacapture.core.k3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1047k3 extends E4 {
    public static final C1047k3 d;
    private static final String e;
    private static final K6 f;

    static {
        C1047k3 c1047k3 = new C1047k3();
        d = c1047k3;
        e = "ct40";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, true, 0, 95);
    }

    private C1047k3() {
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
