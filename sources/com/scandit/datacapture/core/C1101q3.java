package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scandit.datacapture.core.q3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1101q3 extends E4 {
    public static final C1101q3 d;
    private static final String e;
    private static final K6 f;

    static {
        C1101q3 c1101q3 = new C1101q3();
        d = c1101q3;
        e = "mha-l29|mha-l09|mha-al00|mha-tl00";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, true, false, 0, 111);
    }

    private C1101q3() {
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean c() {
        return true;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return f;
    }
}
