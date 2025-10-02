package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes6.dex */
public final class L2 extends E4 {
    public static final L2 d = new L2();
    private static final String e = "Pixel 8 Pro";

    private L2() {
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy i() {
        return NativeFocusStrategy.FORCE_CONTINUOUS;
    }
}
