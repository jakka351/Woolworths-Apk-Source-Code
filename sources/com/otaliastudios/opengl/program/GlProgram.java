package com.otaliastudios.opengl.program;

import android.opengl.GLES20;
import com.otaliastudios.opengl.core.Egloo;
import com.otaliastudios.opengl.core.GlBindable;
import com.otaliastudios.opengl.draw.GlDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/program/GlProgram;", "Lcom/otaliastudios/opengl/core/GlBindable;", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public class GlProgram implements GlBindable {

    /* renamed from: a, reason: collision with root package name */
    public final int f16804a;
    public final GlShader[] b;
    public boolean c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/program/GlProgram$Companion;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public static int a(GlShader... shaders) {
            Intrinsics.h(shaders, "shaders");
            int iGlCreateProgram = GLES20.glCreateProgram();
            Egloo.a("glCreateProgram");
            if (iGlCreateProgram == 0) {
                throw new RuntimeException("Could not create program");
            }
            for (GlShader glShader : shaders) {
                GLES20.glAttachShader(iGlCreateProgram, glShader.f16806a);
                Egloo.a("glAttachShader");
            }
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return iGlCreateProgram;
            }
            String strM = Intrinsics.m(GLES20.glGetProgramInfoLog(iGlCreateProgram), "Could not link program: ");
            GLES20.glDeleteProgram(iGlCreateProgram);
            throw new RuntimeException(strM);
        }
    }

    public GlProgram(int i, GlShader... shaders) {
        Intrinsics.h(shaders, "shaders");
        this.f16804a = i;
        this.b = shaders;
    }

    public static void a(final GlProgram glProgram, final GlDrawable drawable) {
        final float[] modelViewProjectionMatrix = drawable.f16799a;
        glProgram.getClass();
        Intrinsics.h(drawable, "drawable");
        Intrinsics.h(modelViewProjectionMatrix, "modelViewProjectionMatrix");
        Egloo.a("draw start");
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.otaliastudios.opengl.program.GlProgram$draw$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float[] fArr = modelViewProjectionMatrix;
                GlProgram glProgram2 = this.h;
                GlDrawable glDrawable = drawable;
                glProgram2.c(glDrawable, fArr);
                glDrawable.a();
                glProgram2.b(glDrawable);
                return Unit.f24250a;
            }
        };
        GLES20.glUseProgram(glProgram.f16804a);
        Egloo.a("glUseProgram");
        function0.invoke();
        GLES20.glUseProgram(0);
        Egloo.a("draw end");
    }

    public void b(GlDrawable drawable) {
        Intrinsics.h(drawable, "drawable");
    }

    public void c(GlDrawable drawable, float[] fArr) {
        Intrinsics.h(drawable, "drawable");
    }

    public void d() {
        if (this.c) {
            return;
        }
        GLES20.glDeleteProgram(this.f16804a);
        for (GlShader glShader : this.b) {
            GLES20.glDeleteShader(glShader.f16806a);
        }
        this.c = true;
    }
}
