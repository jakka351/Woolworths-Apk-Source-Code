package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes6.dex */
public final class F5 extends AbstractC1171y1 {
    public static final F5 c = new F5();
    private static final String d = "sm-g991.*|sc-51b|scg09|sm-g998.*|sc-52b";

    private F5() {
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return d;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean g() {
        return true;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy i() {
        return NativeFocusStrategy.CONTINUOUS_UNTIL_NO_SCAN;
    }
}
