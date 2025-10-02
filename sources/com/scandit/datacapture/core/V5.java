package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes6.dex */
public final class V5 extends AbstractC1171y1 {
    public static final V5 c;
    private static final String d;
    private static final K6 e;

    static {
        V5 v5 = new V5();
        c = v5;
        d = "sm-g736u|sm-g736u1|sm-g736b";
        e = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 1, 63);
    }

    private V5() {
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return d;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return e;
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
