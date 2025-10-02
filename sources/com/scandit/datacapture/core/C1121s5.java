package com.scandit.datacapture.core;

import android.hardware.Camera;
import android.util.Range;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.s5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1121s5 extends AbstractC1171y1 {
    public static final C1121s5 c;
    private static final String d;
    private static final K6 e;
    private static final boolean f;

    static {
        C1121s5 c1121s5 = new C1121s5();
        c = c1121s5;
        d = "(sm-j3109|sm-j320).*";
        e = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 121);
        f = true;
    }

    private C1121s5() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
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

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean f() {
        return f;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f2) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        return AbstractC1001f2.c(frameRateRanges, f2);
    }
}
