package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scandit.datacapture.core.l3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1056l3 extends E4 {
    public static final C1056l3 d;
    private static final String e;
    private static final K6 f;
    private static final boolean g;

    static {
        C1056l3 c1056l3 = new C1056l3();
        d = c1056l3;
        e = "ct60";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, true, 0, 95);
        g = true;
    }

    private C1056l3() {
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
