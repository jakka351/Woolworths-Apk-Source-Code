package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;

/* loaded from: classes5.dex */
public final class zzdj {
    public static boolean zza(Context context) throws zzdi {
        return zzg("EGL_EXT_protected_content");
    }

    public static boolean zzb() throws zzdi {
        return zzg("EGL_KHR_surfaceless_context");
    }

    public static boolean zzc(int i) throws zzdi {
        if (i == 6) {
            return zzd();
        }
        if (i == 7) {
            return zzg("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean zzd() throws zzdi {
        return Build.VERSION.SDK_INT >= 33 && zzg("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void zze() throws zzdi {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new zzdi(sb.toString());
        }
    }

    public static void zzf(boolean z, String str) throws zzdi {
        if (!z) {
            throw new zzdi(str);
        }
    }

    private static boolean zzg(String str) throws zzdi {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        zzf(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zzf(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        zze();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
