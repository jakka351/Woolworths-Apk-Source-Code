package com.scandit.datacapture.core;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1142v {
    public static final int a(InterfaceC1124t info) {
        U4 u4;
        Intrinsics.h(info, "info");
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i = 0; i < numberOfCameras; i++) {
            try {
                Camera.getCameraInfo(i, cameraInfo);
                u4 = (U4) info;
            } catch (Error e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (cameraInfo.canDisableShutterSound == u4.b() && cameraInfo.orientation == u4.d() && cameraInfo.facing == u4.c()) {
                return i;
            }
        }
        return -1;
    }
}
