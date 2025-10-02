package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Locale;

@UnstableApi
/* loaded from: classes2.dex */
public final class PlaceholderSurface extends Surface {
    public static int g;
    public static boolean h;
    public final boolean d;
    public final PlaceholderSurfaceThread e;
    public boolean f;

    public static class PlaceholderSurfaceThread extends HandlerThread implements Handler.Callback {
        public EGLSurfaceTexture d;
        public Handler e;
        public Error f;
        public RuntimeException g;
        public PlaceholderSurface h;

        public final void a(int i) throws GlUtil.GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.d.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.d;
            int[] iArr = eGLSurfaceTexture.e;
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
            int[] iArr2 = new int[2];
            GlUtil.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
            eGLSurfaceTexture.f = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr3 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, EGLSurfaceTexture.j, 0, eGLConfigArr, 0, 1, iArr3, 0);
            boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
            Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
            int i2 = Util.f2928a;
            GlUtil.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.f, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            GlUtil.c("eglCreateContext failed", eGLContextEglCreateContext != null);
            eGLSurfaceTexture.g = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = eGLSurfaceTexture.f;
            if (i == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                GlUtil.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
            }
            GlUtil.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
            eGLSurfaceTexture.h = eGLSurfaceEglCreatePbufferSurface;
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            eGLSurfaceTexture.i = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
            SurfaceTexture surfaceTexture2 = this.d.i;
            surfaceTexture2.getClass();
            this.h = new PlaceholderSurface(this, surfaceTexture2, i != 0);
        }

        public final void b() {
            this.d.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.d;
            eGLSurfaceTexture.d.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.i;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.e, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.h;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f, eGLSurfaceTexture.h);
                }
                EGLContext eGLContext = eGLSurfaceTexture.g;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f);
                }
                eGLSurfaceTexture.f = null;
                eGLSurfaceTexture.g = null;
                eGLSurfaceTexture.h = null;
                eGLSurfaceTexture.i = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i == 1) {
                    try {
                        a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (GlUtil.GlException e) {
                        Log.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.g = new IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e2) {
                        Log.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.f = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e3) {
                        Log.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                        this.g = e3;
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i == 2) {
                    try {
                        b();
                        return true;
                    } catch (Throwable th) {
                        try {
                            Log.d("PlaceholderSurface", "Failed to release placeholder surface", th);
                            return true;
                        } finally {
                            quit();
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public PlaceholderSurface(PlaceholderSurfaceThread placeholderSurfaceThread, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.e = placeholderSurfaceThread;
        this.d = z;
    }

    public static synchronized boolean a(Context context) {
        String strEglQueryString;
        int i;
        try {
            if (!h) {
                int i2 = Util.f2928a;
                if (i2 >= 24 && ((i2 >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
                g = i;
                h = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return g != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.e) {
            try {
                if (!this.f) {
                    PlaceholderSurfaceThread placeholderSurfaceThread = this.e;
                    placeholderSurfaceThread.e.getClass();
                    placeholderSurfaceThread.e.sendEmptyMessage(2);
                    this.f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
