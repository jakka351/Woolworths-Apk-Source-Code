package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* renamed from: com.scandit.datacapture.core.f5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1004f5 extends E4 {
    public static final C1004f5 d = new C1004f5();
    private static final String e = "sm-a525f(/ds)?|sm-a525m(/ds)?|sm-a526b(/ds)?|sm-a5260|sm-a526w|sm-a526u1?";
    private static final boolean f = true;

    private C1004f5() {
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean c() {
        return true;
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
