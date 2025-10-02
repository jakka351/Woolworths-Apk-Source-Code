package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
public final class Z7 extends E4 {
    public static final Z7 d = new Z7();
    private static final String e = "(?:(?:mi 8).*)|M1803E1A";
    private static final boolean f = true;

    private Z7() {
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
