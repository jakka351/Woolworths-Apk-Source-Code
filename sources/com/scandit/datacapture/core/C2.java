package com.scandit.datacapture.core;

import android.hardware.Camera;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C2 extends AbstractC1171y1 {
    public static final C2 c;
    private static final String d;
    private static final K6 e;

    static {
        C2 c2 = new C2();
        c = c2;
        d = "glass 2";
        e = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 121);
    }

    private C2() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        AbstractC1171y1.a(camParams, Math.max(e.e(), -1.0f));
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
