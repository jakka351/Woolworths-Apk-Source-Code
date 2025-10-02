package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* renamed from: com.scandit.datacapture.core.g5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1013g5 extends E4 {
    public static final C1013g5 d = new C1013g5();
    private static final String e = "SM-A528B";
    private static final boolean f = true;

    private C1013g5() {
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean g() {
        return f;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy i() {
        return NativeFocusStrategy.AUTO;
    }
}
