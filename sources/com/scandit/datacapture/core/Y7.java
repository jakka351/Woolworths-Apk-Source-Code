package com.scandit.datacapture.core;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Y7 extends AbstractC1171y1 {
    public static final Y7 c = new Y7();
    private static final String d = "m100";

    private Y7() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        AbstractC1171y1.a(camParams, Math.max(d().e(), -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return d;
    }
}
