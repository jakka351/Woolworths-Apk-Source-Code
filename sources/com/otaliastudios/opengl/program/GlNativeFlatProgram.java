package com.otaliastudios.opengl.program;

import android.opengl.GLES20;
import com.otaliastudios.opengl.core.Egloo;
import com.otaliastudios.opengl.draw.GlDrawable;
import com.otaliastudios.opengl.program.GlProgram;
import com.otaliastudios.opengl.program.GlProgramLocation;
import java.nio.Buffer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/program/GlNativeFlatProgram;", "Lcom/otaliastudios/opengl/program/GlProgram;", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public class GlNativeFlatProgram extends GlProgram {
    public final GlProgramLocation d;
    public final GlProgramLocation e;
    public final GlProgramLocation f;
    public float[] g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/otaliastudios/opengl/program/GlNativeFlatProgram$Companion;", "", "", "FRAGMENT_SHADER", "Ljava/lang/String;", "VERTEX_SHADER", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GlNativeFlatProgram() {
        GlShader[] glShaderArr = {new GlShader(35633, "uniform mat4 uMVPMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n}\n"), new GlShader(35632, "precision mediump float;\nuniform vec4 uColor;\nvoid main() {\n    gl_FragColor = uColor;\n}\n")};
        int iA = GlProgram.Companion.a((GlShader[]) Arrays.copyOf(glShaderArr, 2));
        super(iA, (GlShader[]) Arrays.copyOf(glShaderArr, 2));
        this.d = new GlProgramLocation(iA, GlProgramLocation.Type.d, "aPosition");
        GlProgramLocation.Type type = GlProgramLocation.Type.e;
        this.e = new GlProgramLocation(iA, type, "uMVPMatrix");
        this.f = new GlProgramLocation(iA, type, "uColor");
        this.g = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    }

    @Override // com.otaliastudios.opengl.program.GlProgram
    public final void b(GlDrawable drawable) {
        Intrinsics.h(drawable, "drawable");
        GLES20.glDisableVertexAttribArray(this.d.b);
    }

    @Override // com.otaliastudios.opengl.program.GlProgram
    public final void c(GlDrawable drawable, float[] fArr) {
        Intrinsics.h(drawable, "drawable");
        GLES20.glUniformMatrix4fv(this.e.f16805a, 1, false, fArr, 0);
        Egloo.a("glUniformMatrix4fv");
        GLES20.glUniform4fv(this.f.f16805a, 1, this.g, 0);
        Egloo.a("glUniform4fv");
        GlProgramLocation glProgramLocation = this.d;
        GLES20.glEnableVertexAttribArray(glProgramLocation.b);
        Egloo.a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(glProgramLocation.b, drawable.getC(), 5126, false, drawable.getC() * 4, (Buffer) drawable.c());
        Egloo.a("glVertexAttribPointer");
    }
}
