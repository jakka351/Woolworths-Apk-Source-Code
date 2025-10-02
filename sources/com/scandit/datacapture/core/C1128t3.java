package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.t3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1128t3 extends E4 {
    public static final C1128t3 d = new C1128t3();
    private static final String e = "(?:huawei )?(?:gra-).*";
    private static final boolean f = true;

    private C1128t3() {
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
