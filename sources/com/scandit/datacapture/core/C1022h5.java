package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.h5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1022h5 extends E4 {
    public static final C1022h5 d = new C1022h5();
    private static final String e = "^SM-((A536(B|U1?|0|E|V|W|N)(\\/DS)?)|(S536DL))$";
    private static final boolean f = true;
    private static final int g = 9000000;

    private C1022h5() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final int a() {
        return g;
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean g() {
        return f;
    }
}
