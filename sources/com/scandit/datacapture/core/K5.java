package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
public final class K5 extends E4 {
    public static final K5 d;
    private static final String e;
    private static final K6 f;

    static {
        K5 k5 = new K5();
        d = k5;
        e = "sm-g920.*|scv31|404sc|sm-g890a";
        f = K6.a(super.d(), false, -1.0f, false, false, 0, 119);
    }

    private K5() {
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
