package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scandit.datacapture.core.o3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1083o3 extends E4 {
    public static final C1083o3 d;
    private static final String e;
    private static final K6 f;

    static {
        C1083o3 c1083o3 = new C1083o3();
        d = c1083o3;
        e = "htc one x";
        f = K6.a(super.d(), true, BitmapDescriptorFactory.HUE_RED, false, false, 0, 122);
    }

    private C1083o3() {
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
