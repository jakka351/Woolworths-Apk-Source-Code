package com.scandit.datacapture.core;

import android.hardware.Camera;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D2 extends AbstractC1171y1 {
    public static final D2 c;
    private static final String d;
    private static final K6 e;

    static {
        D2 d2 = new D2();
        c = d2;
        d = "glass 2 \\(oem\\)";
        e = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 121);
    }

    private D2() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        AbstractC1171y1.a(camParams, -1.5f);
        camParams.setPreviewSize(Math.max(camParams.getPreviewSize().width, camParams.getPreviewSize().height), Math.min(camParams.getPreviewSize().width, camParams.getPreviewSize().height));
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
