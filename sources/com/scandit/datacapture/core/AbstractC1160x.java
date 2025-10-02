package com.scandit.datacapture.core;

import android.hardware.camera2.CameraManager;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1160x {
    static {
        Object systemService = AppAndroidEnvironment.INSTANCE.getApplicationContext().getSystemService("camera");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
    }

    public static final W a(CameraManager cameraManager) {
        Intrinsics.h(cameraManager, "cameraManager");
        return new X4(cameraManager);
    }
}
