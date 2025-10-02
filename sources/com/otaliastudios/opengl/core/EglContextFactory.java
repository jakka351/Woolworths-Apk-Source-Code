package com.otaliastudios.opengl.core;

import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/core/EglContextFactory;", "", "Factory", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class EglContextFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final GLSurfaceView.EGLContextFactory f16796a = new Factory();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/core/EglContextFactory$Factory;", "Landroid/opengl/GLSurfaceView$EGLContextFactory;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Factory implements GLSurfaceView.EGLContextFactory {
        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public final EGLContext createContext(EGL10 egl, EGLDisplay display, EGLConfig eglConfig) {
            Intrinsics.h(egl, "egl");
            Intrinsics.h(display, "display");
            Intrinsics.h(eglConfig, "eglConfig");
            EGLContext eGLContextEglCreateContext = egl.eglCreateContext(display, eglConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            Intrinsics.g(eGLContextEglCreateContext, "egl.eglCreateContext(display, eglConfig, EGL10.EGL_NO_CONTEXT, attributes)");
            return eGLContextEglCreateContext;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public final void destroyContext(EGL10 egl, EGLDisplay display, EGLContext context) {
            Intrinsics.h(egl, "egl");
            Intrinsics.h(display, "display");
            Intrinsics.h(context, "context");
            if (egl.eglDestroyContext(display, context)) {
                return;
            }
            Log.e("EglContextFactory", "display:" + display + " context:" + context);
            throw new RuntimeException(Intrinsics.m(Integer.valueOf(egl.eglGetError()), "eglDestroyContex"));
        }
    }
}
