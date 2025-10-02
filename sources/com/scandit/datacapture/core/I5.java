package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
public final class I5 extends E4 {
    public static final I5 d;
    private static final String e;
    private static final K6 f;
    private static final boolean g;

    static {
        I5 i5 = new I5();
        d = i5;
        e = "gt-i9500|gt-i9502|gt-i9505|sc-04e|sch-i545|sch-i959|sch-r970|sgh-i337|sgh-m919|shv-e300k|shv-e300s|sph-l720";
        f = K6.a(super.d(), false, -1.0f, false, false, 0, 119);
        g = true;
    }

    private I5() {
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
