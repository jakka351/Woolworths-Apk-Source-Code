package com.otaliastudios.opengl.program;

import YU.a;
import android.opengl.GLES20;
import com.otaliastudios.opengl.core.Egloo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/program/GlShader;", "", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class GlShader {

    /* renamed from: a, reason: collision with root package name */
    public final int f16806a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/program/GlShader$Companion;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public GlShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        Egloo.a(Intrinsics.m(Integer.valueOf(i), "glCreateShader type="));
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            this.f16806a = iGlCreateShader;
            return;
        }
        StringBuilder sbR = a.r(i, "Could not compile shader ", ": '");
        sbR.append((Object) GLES20.glGetShaderInfoLog(iGlCreateShader));
        sbR.append("' source: ");
        sbR.append(str);
        String string = sbR.toString();
        GLES20.glDeleteShader(iGlCreateShader);
        throw new RuntimeException(string);
    }
}
