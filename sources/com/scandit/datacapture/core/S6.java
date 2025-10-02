package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class S6 extends E4 {
    public static final S6 d;
    private static final String e;
    private static final K6 f;
    private static final boolean g;

    static {
        S6 s6 = new S6();
        d = s6;
        e = "501so|e6603|e6653|so-01h|sov32|e5803|e5823|so-02h|e6853|so-03h|e6833|e6883|e6633|e6683";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 121);
        g = true;
    }

    private S6() {
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
