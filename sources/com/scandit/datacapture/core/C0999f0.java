package com.scandit.datacapture.core;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0999f0 extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z f18494a;
    final /* synthetic */ CameraDevice b;
    final /* synthetic */ Surface c;
    final /* synthetic */ ImageReader d;
    final /* synthetic */ b8 e;
    final /* synthetic */ Handler f;
    final /* synthetic */ CaptureRequest g;

    public C0999f0(Z z, CameraDevice cameraDevice, Surface surface, ImageReader imageReader, b8 b8Var, Handler handler, CaptureRequest captureRequest) {
        this.f18494a = z;
        this.b = cameraDevice;
        this.c = surface;
        this.d = imageReader;
        this.e = b8Var;
        this.f = handler;
        this.g = captureRequest;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession session) {
        Intrinsics.h(session, "session");
        ((K) this.f18494a).a(C1053l0.f18794a);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession session) {
        Intrinsics.h(session, "session");
        ((K) this.f18494a).a(new C1062m0(new Y0(this.b, session, this.c, this.d, this.e, this.f, this.g)));
    }
}
