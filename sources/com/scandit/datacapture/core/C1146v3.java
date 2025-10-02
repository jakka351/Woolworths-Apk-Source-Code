package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.v3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1146v3 extends E4 {
    public static final C1146v3 d = new C1146v3();
    private static final String e = "(?:huawei )?(?:vns-l).+";
    private static final boolean f = true;

    private C1146v3() {
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
