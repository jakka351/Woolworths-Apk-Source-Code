package com.scandit.datacapture.core;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class O0 implements M0 {

    /* renamed from: a, reason: collision with root package name */
    private final CameraManager f18351a;
    private WeakReference b;

    public O0(CameraManager cameraManager) {
        Intrinsics.h(cameraManager, "cameraManager");
        this.f18351a = cameraManager;
        this.b = new WeakReference(null);
    }

    public final void a(Handler handler, String cameraId, F callback) {
        Intrinsics.h(handler, "handler");
        Intrinsics.h(cameraId, "cameraId");
        Intrinsics.h(callback, "callback");
        try {
            L0 l0 = (L0) this.b.get();
            if (l0 != null) {
                ((F) l0).a();
            }
            this.b = new WeakReference(callback);
            this.f18351a.openCamera(cameraId, new N0(callback), handler);
        } catch (CameraAccessException e) {
            e.printStackTrace();
            callback.b();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            callback.b();
        } catch (SecurityException e3) {
            e3.printStackTrace();
            callback.b();
        }
    }
}
