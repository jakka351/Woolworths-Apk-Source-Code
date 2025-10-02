package com.otaliastudios.opengl.core;

import YU.a;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/core/Egloo;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class Egloo {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f16798a;

    static {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        f16798a = fArr;
    }

    public static final void a(String opName) {
        Intrinsics.h(opName, "opName");
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbU = a.u("Error during ", opName, ": glError 0x");
        String hexString = Integer.toHexString(iGlGetError);
        Intrinsics.g(hexString, "toHexString(value)");
        sbU.append(hexString);
        sbU.append(": ");
        String strGluErrorString = GLU.gluErrorString(iGlGetError);
        Intrinsics.g(strGluErrorString, "gluErrorString(value)");
        sbU.append(strGluErrorString);
        String string = sbU.toString();
        Log.e("Egloo", string);
        throw new RuntimeException(string);
    }
}
