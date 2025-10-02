package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class N4 extends AbstractC1171y1 {
    public static final N4 c;
    private static final String d;
    private static final K6 e;
    private static final boolean f;

    static {
        N4 n4 = new N4();
        c = n4;
        d = "fz-n1";
        e = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 125);
        f = true;
    }

    private N4() {
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return d;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean f() {
        return f;
    }
}
