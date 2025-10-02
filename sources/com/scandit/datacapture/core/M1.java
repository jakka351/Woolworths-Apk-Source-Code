package com.scandit.datacapture.core;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.scandit.datacapture.core.logger.CreateDummySurface;
import com.scandit.datacapture.core.logger.SdcLogger;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    private final EGLDisplay f18345a;
    private final EGLContext b;
    private final EGLConfig c;
    private final EGLSurface d;

    public M1() {
        EGLSurface eGLSurfaceA;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        Intrinsics.g(eGLDisplayEglGetDisplay, "eglGetDisplay(EGL_DEFAULT_DISPLAY)");
        this.f18345a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new IllegalStateException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            throw new IllegalStateException("unable to initialize EGL14");
        }
        EGLConfig eGLConfigC = c();
        if (eGLConfigC == null) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        this.c = eGLConfigC;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigC, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        Intrinsics.g(eGLContextEglCreateContext, "eglCreateContext(display…_CONTEXT, attrib2List, 0)");
        this.b = eGLContextEglCreateContext;
        a("eglCreateContext");
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        List list = EmptyList.d;
        List listT = strEglQueryString != null ? StringsKt.T(strEglQueryString, new String[]{" "}, 6) : list;
        if (listT.contains("EGL_KHR_surfaceless_context")) {
            eGLSurfaceA = null;
        } else {
            String strEglQueryString2 = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12371);
            String strEglQueryString3 = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12372);
            String strEglQueryString4 = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12429);
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CreateDummySurface(strEglQueryString2, strEglQueryString3, strEglQueryString4 != null ? StringsKt.T(strEglQueryString4, new String[]{" "}, 6) : list, listT));
            eGLSurfaceA = a();
        }
        this.d = eGLSurfaceA;
    }

    private static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbT = YU.a.t(str, ": ");
        int[] iArrB = P1.b(15);
        int length = iArrB.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = iArrB[i2];
            if (O1.b(i3) == iEglGetError) {
                i = i3;
                break;
            }
            i2++;
        }
        if (i != 0) {
            sbT.append(O1.a(i));
            throw new IllegalStateException(sbT.toString().toString());
        }
        StringBuilder sb = new StringBuilder("Unknown EGL error code: ");
        sb.append("0x" + Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sb.toString().toString());
    }

    private final EGLConfig c() {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f18345a, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public final void b() {
        EGLSurface eGLSurface = this.d;
        if (eGLSurface != null) {
            EGL14.eglDestroySurface(this.f18345a, eGLSurface);
        }
        EGL14.eglDestroyContext(this.f18345a, this.b);
    }

    public final void d() {
        EGLSurface eGLSurface = this.d;
        if (eGLSurface == null) {
            EGLDisplay eGLDisplay = this.f18345a;
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.b);
        } else {
            EGL14.eglMakeCurrent(this.f18345a, eGLSurface, eGLSurface, this.b);
        }
        a("makeCurrentWithoutSurface");
    }

    public final boolean b(EGLSurface readAndWriteSurface) {
        Intrinsics.h(readAndWriteSurface, "readAndWriteSurface");
        EGL14.eglMakeCurrent(this.f18345a, readAndWriteSurface, readAndWriteSurface, this.b);
        return EGL14.eglGetError() == 12288;
    }

    public final void c(EGLSurface surface) {
        Intrinsics.h(surface, "surface");
        EGL14.eglSwapBuffers(this.f18345a, surface);
    }

    private final EGLSurface a() {
        EGLSurface surface = EGL14.eglCreatePbufferSurface(this.f18345a, this.c, new int[]{12375, 32, 12374, 32, 12344}, 0);
        a("createOffscreenSurface");
        Intrinsics.g(surface, "surface");
        return surface;
    }

    public final EGLSurface a(SurfaceTexture surface) {
        Intrinsics.h(surface, "surface");
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f18345a, this.c, surface, new int[]{12344}, 0);
        a("createWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("returned EGL surface is null");
    }

    public final void a(EGLSurface eGLSurface) {
        if (eGLSurface != null) {
            EGL14.eglDestroySurface(this.f18345a, eGLSurface);
            a("destroySurface");
        }
    }
}
