package com.scandit.datacapture.core;

import android.hardware.Camera;
import android.util.Range;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J5 extends E4 {
    public static final J5 d;
    private static final String e;
    private static final K6 f;

    static {
        J5 j5 = new J5();
        d = j5;
        e = "(sm-g900|gt-i9600|sm-g870|sm-g800).*";
        f = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, true, false, 0, 107);
    }

    private J5() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f2) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        return AbstractC1001f2.a(frameRateRanges, f2);
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return f;
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        super.a(camParams);
        camParams.set("slow_ae", "off");
        camParams.set("sw-vdis", "off");
        camParams.set("dynamic-range-control", "on");
        camParams.set("phase-af", "on");
        AbstractC1171y1.a(camParams, Math.max(f.e(), -1.0f));
    }
}
