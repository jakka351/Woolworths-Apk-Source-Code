package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scandit.datacapture.core.b6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0969b6 extends E4 {
    public static final C0969b6 d;
    private static final String e;
    private static final K6 f;

    static {
        C0969b6 c0969b6 = new C0969b6();
        d = c0969b6;
        e = "scandit-default-continuous-custom_metering_disabled.*";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, true, false, 0, 109);
    }

    private C0969b6() {
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
