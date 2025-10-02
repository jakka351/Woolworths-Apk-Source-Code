package com.scandit.datacapture.core;

import android.hardware.Camera;
import com.scandit.datacapture.core.logger.CameraInfoProviderEvent;
import com.scandit.datacapture.core.logger.SdcLogger;
import java.util.ArrayList;
import kotlin.ExceptionsKt;

/* loaded from: classes6.dex */
final class V4 implements InterfaceC1133u {

    /* renamed from: a, reason: collision with root package name */
    public static final V4 f18386a = new V4();

    private V4() {
    }

    public final ArrayList a() {
        int numberOfCameras = Camera.getNumberOfCameras();
        ArrayList arrayList = new ArrayList();
        if (numberOfCameras == 0) {
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(1, 0, "No exception thrown, 0 cameras available", null, 8, null));
        }
        for (int i = 0; i < numberOfCameras; i++) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                arrayList.add(new U4(String.valueOf(i), cameraInfo));
            } catch (RuntimeException e) {
                e.printStackTrace();
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(1, numberOfCameras, ExceptionsKt.b(e), "Failed on camera index " + i + ';'));
            }
        }
        return arrayList;
    }
}
