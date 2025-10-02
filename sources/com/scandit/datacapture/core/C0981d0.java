package com.scandit.datacapture.core;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0981d0 {
    public /* synthetic */ C0981d0(int i) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CaptureRequest b(CameraDevice cameraDevice, Surface surface) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(1);
        builderCreateCaptureRequest.addTarget(surface);
        builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
        Intrinsics.g(captureRequestBuild, "cameraDevice.createCaptu…DE_OFF)\n        }.build()");
        return captureRequestBuild;
    }

    private C0981d0() {
    }

    public static final ImageReader a(C1037j2 c1037j2) {
        ImageReader imageReaderNewInstance = ImageReader.newInstance(c1037j2.d(), c1037j2.b(), 35, 2);
        Intrinsics.g(imageReaderNewInstance, "newInstance(\n           …     MAX_IMAGES\n        )");
        return imageReaderNewInstance;
    }
}
