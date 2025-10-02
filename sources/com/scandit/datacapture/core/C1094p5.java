package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scandit.datacapture.core.p5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1094p5 extends E4 {
    public static final C1094p5 d;
    private static final String e;
    private static final K6 f;

    static {
        C1094p5 c1094p5 = new C1094p5();
        d = c1094p5;
        e = "sm-g355.*";
        f = K6.a(super.d(), true, BitmapDescriptorFactory.HUE_RED, false, false, 0, 120);
    }

    private C1094p5() {
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
