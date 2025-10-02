package com.scandit.datacapture.core;

import android.hardware.Camera;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class O4 extends AbstractC1171y1 {
    private final String c = "scandit-phase_af|scandit-phase_af-initial_trigger";
    private final K6 d = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 125);

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        camParams.set("phase-af", "on");
        camParams.set("dynamic-range-control", "on");
        AbstractC1171y1.a(camParams, Math.max(d().e(), -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public String b() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public K6 d() {
        return this.d;
    }
}
