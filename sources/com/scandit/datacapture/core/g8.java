package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes6.dex */
public final class g8 extends E4 {
    public static final g8 d = new g8();
    private static final String e = "TC52.*";
    private static final boolean f = true;
    private static final boolean g = true;

    private g8() {
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean f() {
        return g;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean g() {
        return f;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy i() {
        return NativeFocusStrategy.FORCE_RETRIGGER;
    }
}
