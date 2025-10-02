package androidx.camera.core.processing;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.WorkerThread;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.core.processing.util.GraphicDeviceInfo;
import androidx.camera.core.processing.util.OutputSurface;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

@WorkerThread
/* loaded from: classes2.dex */
public class OpenGlRenderer {
    public Thread c;
    public EGLConfig g;
    public Surface i;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f549a = new AtomicBoolean(false);
    public final HashMap b = new HashMap();
    public EGLDisplay d = EGL14.EGL_NO_DISPLAY;
    public EGLContext e = EGL14.EGL_NO_CONTEXT;
    public int[] f = GLUtils.f561a;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public Map j = Collections.EMPTY_MAP;
    public GLUtils.Program2D k = null;
    public GLUtils.InputFormat l = GLUtils.InputFormat.d;
    public int m = -1;

    public final void a(DynamicRange dynamicRange, GraphicDeviceInfo.Builder builder) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.d, iArr, 0, iArr, 1)) {
            this.d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (builder != null) {
            builder.c(iArr[0] + "." + iArr[1]);
        }
        int i = dynamicRange.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.d, new int[]{12324, i, 12323, i, 12322, i, 12321, dynamicRange.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, dynamicRange.a() ? 64 : 4, 12610, dynamicRange.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, dynamicRange.a() ? 3 : 2, 12344}, 0);
        GLUtils.a("eglCreateContext");
        this.g = eGLConfig;
        this.e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public final OutputSurface b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.d;
            EGLConfig eGLConfig = this.g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceI = GLUtils.i(eGLDisplay, eGLConfig, surface, this.f);
            EGLDisplay eGLDisplay2 = this.d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return OutputSurface.d(eGLSurfaceI, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            Logger.f("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.d;
        EGLConfig eGLConfig = this.g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = GLUtils.f561a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        GLUtils.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.h = eGLSurfaceEglCreatePbufferSurface;
    }

    public final Pair d(DynamicRange dynamicRange) {
        GLUtils.d(this.f549a, false);
        try {
            a(dynamicRange, null);
            c();
            f(this.h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new Pair(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            Logger.f("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new Pair("", "");
        } finally {
            h();
        }
    }

    public GraphicDeviceInfo e(DynamicRange dynamicRange) throws Throwable {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = this.f549a;
        GLUtils.d(atomicBoolean, false);
        GraphicDeviceInfo.Builder builderA = GraphicDeviceInfo.a();
        try {
            if (dynamicRange.a()) {
                Pair pairD = d(dynamicRange);
                String str = (String) pairD.f2463a;
                str.getClass();
                String str2 = (String) pairD.b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    Logger.e("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    dynamicRange = DynamicRange.d;
                }
                this.f = GLUtils.f(str2, dynamicRange);
                builderA.d(str);
                builderA.b(str2);
            }
            a(dynamicRange, builderA);
            c();
            f(this.h);
            builderA.e(GLUtils.j());
            this.j = GLUtils.g(dynamicRange);
            int iH = GLUtils.h();
            this.m = iH;
            k(iH);
            this.c = Thread.currentThread();
            atomicBoolean.set(true);
            return builderA.a();
        } catch (IllegalArgumentException e) {
            e = e;
            h();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            h();
            throw e;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        this.d.getClass();
        this.e.getClass();
        if (!EGL14.eglMakeCurrent(this.d, eGLSurface, eGLSurface, this.e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void g(Surface surface) {
        GLUtils.d(this.f549a, true);
        GLUtils.c(this.c);
        HashMap map = this.b;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, GLUtils.j);
    }

    public final void h() {
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((GLUtils.Program2D) it.next()).f562a);
        }
        this.j = Collections.EMPTY_MAP;
        this.k = null;
        if (!Objects.equals(this.d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = this.b;
            for (OutputSurface outputSurface : map.values()) {
                if (!Objects.equals(outputSurface.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.d, outputSurface.a())) {
                    try {
                        GLUtils.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        Logger.c("GLUtils", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!Objects.equals(this.h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.d, this.h);
                this.h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.d, this.e);
                this.e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.d);
            this.d = EGL14.EGL_NO_DISPLAY;
        }
        this.g = null;
        this.m = -1;
        this.l = GLUtils.InputFormat.d;
        this.i = null;
        this.c = null;
    }

    public final void i(Surface surface, boolean z) {
        if (this.i == surface) {
            this.i = null;
            f(this.h);
        }
        HashMap map = this.b;
        OutputSurface outputSurface = z ? (OutputSurface) map.remove(surface) : (OutputSurface) map.put(surface, GLUtils.j);
        if (outputSurface == null || outputSurface == GLUtils.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.d, outputSurface.a());
        } catch (RuntimeException e) {
            Logger.f("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    public final void j(long j, float[] fArr, Surface surface) {
        GLUtils.d(this.f549a, true);
        GLUtils.c(this.c);
        HashMap map = this.b;
        Preconditions.f("The surface is not registered.", map.containsKey(surface));
        OutputSurface outputSurfaceB = (OutputSurface) map.get(surface);
        Objects.requireNonNull(outputSurfaceB);
        if (outputSurfaceB == GLUtils.j) {
            outputSurfaceB = b(surface);
            if (outputSurfaceB == null) {
                return;
            } else {
                map.put(surface, outputSurfaceB);
            }
        }
        if (surface != this.i) {
            f(outputSurfaceB.a());
            this.i = surface;
            GLES20.glViewport(0, 0, outputSurfaceB.c(), outputSurfaceB.b());
            GLES20.glScissor(0, 0, outputSurfaceB.c(), outputSurfaceB.b());
        }
        GLUtils.Program2D program2D = this.k;
        program2D.getClass();
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            GLES20.glUniformMatrix4fv(((GLUtils.SamplerShaderProgram) program2D).f, 1, false, fArr, 0);
            GLUtils.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.d, outputSurfaceB.a(), j);
        if (EGL14.eglSwapBuffers(this.d, outputSurfaceB.a())) {
            return;
        }
        Logger.e("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        i(surface, false);
    }

    public final void k(int i) {
        GLUtils.Program2D program2D = (GLUtils.Program2D) this.j.get(this.l);
        if (program2D == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.l);
        }
        if (this.k != program2D) {
            this.k = program2D;
            program2D.b();
            Log.d("OpenGlRenderer", "Using program for input format " + this.l + ": " + this.k);
        }
        GLES20.glActiveTexture(33984);
        GLUtils.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        GLUtils.b("glBindTexture");
    }
}
