package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scandit.datacapture.core.c6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0978c6 extends E4 {
    public static final C0978c6 d;
    private static final String e;
    private static final K6 f;

    static {
        C0978c6 c0978c6 = new C0978c6();
        d = c0978c6;
        e = "scandit-default-continuous.*";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 125);
    }

    private C0978c6() {
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
