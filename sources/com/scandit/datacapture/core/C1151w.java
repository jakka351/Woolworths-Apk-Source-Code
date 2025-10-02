package com.scandit.datacapture.core;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1151w {

    /* renamed from: a, reason: collision with root package name */
    private Camera f18981a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private Camera.Parameters c;

    public final void a(Camera camera) {
        Camera.Parameters parameters;
        this.f18981a = camera;
        if (camera == null) {
            this.b.set(false);
            return;
        }
        try {
            parameters = camera.getParameters();
        } catch (Exception unused) {
            Log.e("sdc-core", "Failed to get camera parameters");
            parameters = null;
        }
        this.c = parameters;
    }

    public final Camera b() {
        return this.f18981a;
    }

    public final Camera.Parameters c() {
        return this.c;
    }

    public final boolean d() {
        return this.f18981a != null;
    }

    public final void e() {
        Camera camera = this.f18981a;
        this.f18981a = null;
        this.c = null;
        if (camera != null) {
            camera.release();
        }
        this.b.set(false);
    }

    public final boolean f() {
        if (this.f18981a == null) {
            return false;
        }
        try {
            if (this.b.get()) {
                return true;
            }
            Camera camera = this.f18981a;
            if (camera != null) {
                camera.startPreview();
            }
            this.b.set(true);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (RuntimeException e2) {
            O3.a("Either the Camera object has been released or a hardware or other low-level error occurred", e2);
            return false;
        }
    }

    public final void g() {
        Camera camera = this.f18981a;
        if (camera != null) {
            camera.stopPreview();
        }
        this.b.set(false);
    }

    public final boolean a(SurfaceTexture texture) throws IOException {
        Intrinsics.h(texture, "texture");
        Camera camera = this.f18981a;
        if (camera == null) {
            return false;
        }
        try {
            camera.setPreviewTexture(texture);
            camera.setDisplayOrientation(0);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (RuntimeException e2) {
            O3.a("Either the Camera object has been released or a hardware or other low-level error occurred", e2);
            return false;
        }
    }

    public final boolean a() {
        try {
            Camera camera = this.f18981a;
            if (camera != null) {
                camera.cancelAutoFocus();
            }
        } catch (Exception unused) {
            Log.i("sdc-core", "cancelAutoFocus failed");
        }
        try {
            Camera camera2 = this.f18981a;
            if (camera2 != null) {
                camera2.autoFocus(null);
            }
            return true;
        } catch (Exception unused2) {
            Log.e("sdc-core", "autoFocus failed");
            return false;
        }
    }

    public final boolean a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        Camera camera = this.f18981a;
        if (camera == null) {
            Log.e("sdc-core", "No camera. failed to set camera parameters");
            return false;
        }
        try {
            camera.setParameters(camParams);
            this.c = camParams;
            return true;
        } catch (Exception unused) {
            Log.e("sdc-core", "Failed to set camera parameters");
            return false;
        }
    }
}
