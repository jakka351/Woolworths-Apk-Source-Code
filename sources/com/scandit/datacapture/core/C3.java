package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
public final class C3 extends E4 {
    public static final C3 d = new C3();
    private static final String e = "(?:kyocera-)?(?:e6820|e6810)";
    private static final boolean f = true;

    private C3() {
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean f() {
        return f;
    }
}
