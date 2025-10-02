package com.scandit.datacapture.core;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Y0 implements W0 {

    /* renamed from: a, reason: collision with root package name */
    private final CameraDevice f18395a;
    private final CameraCaptureSession b;
    private final Surface c;
    private final ImageReader d;
    private final b8 e;
    private final Handler f;
    private final CaptureRequest g;

    public Y0(CameraDevice cameraDevice, CameraCaptureSession androidSession, Surface previewSurface, ImageReader yuvImageReader, b8 imageAvailableListener, Handler handler, CaptureRequest cleanupRequest) {
        Intrinsics.h(cameraDevice, "cameraDevice");
        Intrinsics.h(androidSession, "androidSession");
        Intrinsics.h(previewSurface, "previewSurface");
        Intrinsics.h(yuvImageReader, "yuvImageReader");
        Intrinsics.h(imageAvailableListener, "imageAvailableListener");
        Intrinsics.h(handler, "handler");
        Intrinsics.h(cleanupRequest, "cleanupRequest");
        this.f18395a = cameraDevice;
        this.b = androidSession;
        this.c = previewSurface;
        this.d = yuvImageReader;
        this.e = imageAvailableListener;
        this.f = handler;
        this.g = cleanupRequest;
    }

    public final boolean a(C0959a5 requestSettings) throws CameraAccessException {
        B callback = B.f18296a;
        Intrinsics.h(requestSettings, "requestSettings");
        Intrinsics.h(callback, "callback");
        try {
            CameraDevice cameraDevice = this.f18395a;
            Surface surface = this.c;
            Surface surface2 = this.d.getSurface();
            Intrinsics.g(surface2, "yuvImageReader.surface");
            this.b.capture(requestSettings.a(AbstractC1017h0.b(cameraDevice, surface, surface2)), new C1044k0(callback), this.f);
            return true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
            return false;
        } catch (SecurityException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final void b() {
        try {
            this.b.abortCaptures();
            this.b.close();
        } catch (CameraAccessException | IllegalStateException unused) {
        }
        this.d.getSurface().release();
    }

    public final boolean a() {
        try {
            this.b.abortCaptures();
            this.b.capture(this.g, new X0(), this.f);
            return true;
        } catch (CameraAccessException | IllegalStateException unused) {
            return false;
        }
    }

    public final void a(boolean z) {
        this.e.a(z);
    }

    public final boolean a(C0959a5 requestSettings, A callback) {
        Intrinsics.h(requestSettings, "requestSettings");
        Intrinsics.h(callback, "callback");
        try {
            CameraDevice cameraDevice = this.f18395a;
            Surface surface = this.c;
            Surface surface2 = this.d.getSurface();
            Intrinsics.g(surface2, "yuvImageReader.surface");
            this.b.setRepeatingRequest(requestSettings.a(AbstractC1017h0.b(cameraDevice, surface, surface2)), new C1044k0(callback), this.f);
            return true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
            return false;
        } catch (SecurityException e4) {
            e4.printStackTrace();
            return false;
        }
    }
}
