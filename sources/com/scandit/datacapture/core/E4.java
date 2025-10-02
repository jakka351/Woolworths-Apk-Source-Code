package com.scandit.datacapture.core;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public class E4 extends AbstractC1171y1 {
    private final String c = ".*";

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        AbstractC1171y1.a(camParams, Math.max(d().e(), -1.0f));
        String str = camParams.get("min-sharpness");
        Integer numI0 = str != null ? StringsKt.i0(str) : null;
        String str2 = camParams.get("max-sharpness");
        Integer numI02 = str2 != null ? StringsKt.i0(str2) : null;
        if (numI0 == null || numI02 == null) {
            camParams.set("sharpness", "0");
        } else {
            if (numI0.intValue() > 0 || numI02.intValue() < 0) {
                return;
            }
            camParams.set("sharpness", "0");
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public String b() {
        return this.c;
    }
}
