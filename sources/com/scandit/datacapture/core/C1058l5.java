package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scandit.datacapture.core.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1058l5 extends O4 {
    public static final C1058l5 e;
    private static final String f;
    private static final K6 g;

    static {
        C1058l5 c1058l5 = new C1058l5();
        e = c1058l5;
        f = "(sm-a530|sm-a730).*";
        g = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 125);
    }

    private C1058l5() {
    }

    @Override // com.scandit.datacapture.core.O4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return f;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean c() {
        return true;
    }

    @Override // com.scandit.datacapture.core.O4, com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return g;
    }
}
