package com.scandit.datacapture.core;

import android.hardware.camera2.CameraManager;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public final class A0 {
    public /* synthetic */ A0(int i) {
        this();
    }

    public static final InterfaceC1125t0 a(A0 a0, NativeCameraApi nativeCameraApi) {
        a0.getClass();
        int i = AbstractC1179z0.f18997a[nativeCameraApi.ordinal()];
        if (i == 1) {
            return new C1088p(K0.a(), V4.f18386a);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        CameraManager cameraManager = (CameraManager) AppAndroidEnvironment.INSTANCE.getApplicationContext().getSystemService(CameraManager.class);
        if (cameraManager != null) {
            return new O(cameraManager, K0.a(), AbstractC1160x.a(cameraManager));
        }
        return null;
    }

    private A0() {
    }
}
