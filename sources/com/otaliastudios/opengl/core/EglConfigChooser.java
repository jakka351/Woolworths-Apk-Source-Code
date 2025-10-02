package com.otaliastudios.opengl.core;

import android.opengl.GLSurfaceView;
import com.otaliastudios.opengl.internal.EglKt;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/core/EglConfigChooser;", "Lcom/otaliastudios/opengl/core/EglNativeConfigChooser;", "Chooser", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class EglConfigChooser extends EglNativeConfigChooser {

    /* renamed from: a, reason: collision with root package name */
    public static final GLSurfaceView.EGLConfigChooser f16795a = new Chooser();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/core/EglConfigChooser$Chooser;", "Landroid/opengl/GLSurfaceView$EGLConfigChooser;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Chooser implements GLSurfaceView.EGLConfigChooser {
        public static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            int[] iArr = new int[1];
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
                return iArr[0];
            }
            return 0;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public final EGLConfig chooseConfig(EGL10 egl, EGLDisplay display) {
            EGLConfig eGLConfig;
            Intrinsics.h(egl, "egl");
            Intrinsics.h(display, "display");
            int[] iArr = new int[1];
            int[] iArr2 = {EglKt.f, 8, EglKt.g, 8, EglKt.h, 8, EglKt.i, 8, EglKt.j, EglKt.k | EglKt.l, EglKt.m, EglKt.e, 12610, 1, EglKt.d};
            if (!egl.eglChooseConfig(display, iArr2, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = 0;
            int i2 = iArr[0];
            if (i2 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i2];
            if (!egl.eglChooseConfig(display, iArr2, eGLConfigArr, i2, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            Object[] array = ArraysKt.F(eGLConfigArr).toArray(new EGLConfig[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            EGLConfig[] eGLConfigArr2 = (EGLConfig[]) array;
            int length = eGLConfigArr2.length;
            while (true) {
                if (i >= length) {
                    eGLConfig = null;
                    break;
                }
                eGLConfig = eGLConfigArr2[i];
                i++;
                int iA = a(egl, display, eGLConfig, 12325);
                int iA2 = a(egl, display, eGLConfig, 12326);
                if (iA >= 0 && iA2 >= 0) {
                    int iA3 = a(egl, display, eGLConfig, 12324);
                    int iA4 = a(egl, display, eGLConfig, 12323);
                    int iA5 = a(egl, display, eGLConfig, 12322);
                    int iA6 = a(egl, display, eGLConfig, 12321);
                    if (iA3 == 8 && iA4 == 8 && iA5 == 8 && iA6 == 8) {
                        break;
                    }
                }
            }
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }
}
