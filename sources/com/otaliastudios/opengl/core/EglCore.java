package com.otaliastudios.opengl.core;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.otaliastudios.opengl.internal.EglContext;
import com.otaliastudios.opengl.internal.EglDisplay;
import com.otaliastudios.opengl.internal.EglKt;
import com.otaliastudios.opengl.internal.EglSurface;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/core/EglCore;", "Lcom/otaliastudios/opengl/core/EglNativeCore;", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class EglCore extends EglNativeCore {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/otaliastudios/opengl/core/EglCore$Companion;", "", "", "FLAG_RECORDABLE", "I", "FLAG_TRY_GLES3", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public final void finalize() {
        EglDisplay eglDisplay = this.f16797a;
        EglDisplay eglDisplay2 = EglKt.b;
        if (eglDisplay != eglDisplay2) {
            EglSurface eglSurface = EglKt.c;
            EglContext eglContext = EglKt.f16802a;
            EGLDisplay eGLDisplay = eglDisplay.f16801a;
            EGLSurface eGLSurface = eglSurface.f16803a;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglContext.f16800a);
            EGL14.eglDestroyContext(this.f16797a.f16801a, this.b.f16800a);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f16797a.f16801a);
        }
        this.f16797a = eglDisplay2;
        this.b = EglKt.f16802a;
    }
}
