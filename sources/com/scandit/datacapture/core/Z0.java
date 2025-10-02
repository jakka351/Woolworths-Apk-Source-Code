package com.scandit.datacapture.core;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Z0 extends AbstractC1171y1 {
    public static final Z0 c;
    private static final String d;
    private static final K6 e;

    static {
        Z0 z0 = new Z0();
        c = z0;
        d = "carbon mobile 5";
        e = K6.a(super.d(), false, -1.0f, false, false, 0, 115);
    }

    private Z0() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        camParams.set("sharpness", 0);
        camParams.set("mce", "disable");
        camParams.set("contrast", 0);
        AbstractC1171y1.a(camParams, Math.max(e.e(), -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return d;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return e;
    }
}
