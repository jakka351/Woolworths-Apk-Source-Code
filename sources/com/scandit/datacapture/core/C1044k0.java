package com.scandit.datacapture.core;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1044k0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    private final V0 f18788a;

    public C1044k0(V0 callback) {
        Intrinsics.h(callback, "callback");
        this.f18788a = callback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        Intrinsics.h(session, "session");
        Intrinsics.h(request, "request");
        Intrinsics.h(result, "result");
        this.f18788a.a(new C1035j0(result));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession session, CaptureRequest request, long j, long j2) {
        Intrinsics.h(session, "session");
        Intrinsics.h(request, "request");
        this.f18788a.a(j);
    }
}
