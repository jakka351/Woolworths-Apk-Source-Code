package com.scandit.datacapture.core;

import android.hardware.Camera;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.n5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1076n5 extends AbstractC1171y1 {
    public static final C1076n5 c;
    private static final String d;
    private static final K6 e;

    static {
        C1076n5 c1076n5 = new C1076n5();
        c = c1076n5;
        d = "sm-t365.*";
        e = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, true, false, 0, 111);
    }

    private C1076n5() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        camParams.set("slow_ae", "on");
        camParams.set("sw-vdis", "off");
        camParams.set("sharpness", "0");
        camParams.set("video_recording_gamma", "on");
        camParams.set("denoise", "denoise-off");
        camParams.set("zsl", "off");
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
