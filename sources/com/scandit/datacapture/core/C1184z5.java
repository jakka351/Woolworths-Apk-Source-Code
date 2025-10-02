package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scandit.datacapture.core.z5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1184z5 extends E4 {
    public static final C1184z5 d;
    private static final String e;
    private static final K6 f;
    private static final boolean g;

    static {
        C1184z5 c1184z5 = new C1184z5();
        d = c1184z5;
        e = "sm-n920.*";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, true, false, 0, 111);
        g = true;
    }

    private C1184z5() {
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
