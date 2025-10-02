package com.scandit.datacapture.core;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1017h0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CaptureRequest.Builder b(CameraDevice cameraDevice, Surface surface, Surface surface2) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(1);
        Intrinsics.g(builderCreateCaptureRequest, "cameraDevice.createCaptu…aDevice.TEMPLATE_PREVIEW)");
        builderCreateCaptureRequest.addTarget(surface);
        builderCreateCaptureRequest.addTarget(surface2);
        return builderCreateCaptureRequest;
    }
}
