package com.scandit.datacapture.core;

import android.hardware.Camera;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class A4 extends AbstractC1171y1 {
    public static final A4 c;
    private static final String d;
    private static final K6 e;

    static {
        A4 a4 = new A4();
        c = a4;
        d = "moto g \\(4\\)|motog3";
        e = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 125);
    }

    private A4() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        camParams.set("sharpness", "0");
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
