package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.s5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0824s5 {
    private C0824s5() {
    }

    public static CameraManager a(CameraPosition cameraPosition, CameraSettings cameraSettings) {
        Intrinsics.h(cameraPosition, "cameraPosition");
        Intrinsics.h(cameraSettings, "cameraSettings");
        return new C0899w5(cameraPosition, cameraSettings);
    }
}
