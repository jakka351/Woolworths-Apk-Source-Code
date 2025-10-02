package com.scandit.datacapture.core;

import android.hardware.Camera;
import android.util.Range;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Z5 extends AbstractC1171y1 {
    public static final Z5 c;
    private static final String d;
    private static final K6 e;

    static {
        Z5 z5 = new Z5();
        c = z5;
        d = "(sm-g388|sm-g389).*";
        e = K6.a(super.d(), false, -2.0f, true, false, 0, 103);
    }

    private Z5() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        return AbstractC1001f2.a(frameRateRanges, f);
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
    public final NativeCameraApi k() {
        return NativeCameraApi.CAMERA2;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        camParams.set("slow_ae", "off");
        camParams.set("sw-vdis", "off");
        camParams.set("dynamic-range-control", "on");
        camParams.set("phase-af", "on");
        AbstractC1171y1.a(camParams, -1.0f);
    }
}
