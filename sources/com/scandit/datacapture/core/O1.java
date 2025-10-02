package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class O1 {
    static {
        new N1(0);
    }

    public static final String a(int i) {
        return "EglError " + d(i) + '(' + N1.a(b(i)) + "): " + c(i);
    }

    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return 12288;
        }
        if (i == 2) {
            return 12289;
        }
        if (i == 3) {
            return 12290;
        }
        if (i == 4) {
            return 12291;
        }
        if (i == 5) {
            return 12292;
        }
        if (i == 6) {
            return 12293;
        }
        if (i == 7) {
            return 12294;
        }
        if (i == 8) {
            return 12295;
        }
        if (i == 9) {
            return 12296;
        }
        if (i == 10) {
            return 12297;
        }
        if (i == 11) {
            return 12298;
        }
        if (i == 12) {
            return 12299;
        }
        if (i == 13) {
            return 12300;
        }
        if (i == 14) {
            return 12301;
        }
        if (i == 15) {
            return 12302;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "The last function succeeded without error.";
        }
        if (i == 2) {
            return "EGL is not initialized, or could not be initialized, for the specified EGL display connection.";
        }
        if (i == 3) {
            return "EGL cannot access a requested resource (for example a context is bound in another thread).";
        }
        if (i == 4) {
            return "EGL failed to allocate resources for the requested operation.";
        }
        if (i == 5) {
            return "An unrecognized attribute or attribute value was passed in the attribute list.";
        }
        if (i == 6) {
            return "An EGLConfig argument does not name a valid EGL frame buffer configuration.";
        }
        if (i == 7) {
            return "An EGLContext argument does not name a valid EGL rendering context.";
        }
        if (i == 8) {
            return "The current surface of the calling thread is a window, pixel buffer or pixmap that is no longer valid.";
        }
        if (i == 9) {
            return "An EGLDisplay argument does not name a valid EGL display connection.";
        }
        if (i == 10) {
            return "Arguments are inconsistent (for example, a valid context requires buffers not supplied by a valid surface).";
        }
        if (i == 11) {
            return "A NativePixmapType argument does not refer to a valid native pixmap.";
        }
        if (i == 12) {
            return "A NativeWindowType argument does not refer to a valid native window.";
        }
        if (i == 13) {
            return "One or more argument values are invalid.";
        }
        if (i == 14) {
            return "An EGLSurface argument does not name a valid surface (window, pixel buffer or pixmap) configured for GL rendering.";
        }
        if (i == 15) {
            return "A power management event has occurred. The application must destroy all contexts and reinitialise OpenGL ES state and objects to continue rendering.";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "EGL_SUCCESS";
        }
        if (i == 2) {
            return "EGL_NOT_INITIALIZED";
        }
        if (i == 3) {
            return "EGL_BAD_ACCESS";
        }
        if (i == 4) {
            return "EGL_BAD_ALLOC";
        }
        if (i == 5) {
            return "EGL_BAD_ATTRIBUTE";
        }
        if (i == 6) {
            return "EGL_BAD_CONFIG";
        }
        if (i == 7) {
            return "EGL_BAD_CONTEXT";
        }
        if (i == 8) {
            return "EGL_BAD_CURRENT_SURFACE";
        }
        if (i == 9) {
            return "EGL_BAD_DISPLAY";
        }
        if (i == 10) {
            return "EGL_BAD_MATCH";
        }
        if (i == 11) {
            return "EGL_BAD_NATIVE_PIXMAP";
        }
        if (i == 12) {
            return "EGL_BAD_NATIVE_WINDOW";
        }
        if (i == 13) {
            return "EGL_BAD_PARAMETER";
        }
        if (i == 14) {
            return "EGL_BAD_SURFACE";
        }
        if (i == 15) {
            return "EGL_CONTEXT_LOST";
        }
        throw null;
    }
}
