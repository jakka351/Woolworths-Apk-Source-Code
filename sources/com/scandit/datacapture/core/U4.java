package com.scandit.datacapture.core;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U4 implements InterfaceC1124t {

    /* renamed from: a, reason: collision with root package name */
    private final String f18383a;
    private final boolean b;
    private final int c;
    private final int d;

    public U4(String cameraId, Camera.CameraInfo cameraInfo) {
        Intrinsics.h(cameraId, "cameraId");
        Intrinsics.h(cameraInfo, "cameraInfo");
        this.f18383a = cameraId;
        this.b = cameraInfo.canDisableShutterSound;
        this.c = cameraInfo.facing;
        this.d = cameraInfo.orientation;
    }

    public final String a() {
        return this.f18383a;
    }

    public final boolean b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }
}
