package com.otaliastudios.opengl.program;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.otaliastudios.opengl.core.Egloo;
import com.otaliastudios.opengl.draw.Gl2dDrawable;
import com.otaliastudios.opengl.draw.GlDrawable;
import com.otaliastudios.opengl.internal.MiscKt;
import com.otaliastudios.opengl.program.GlProgram;
import com.otaliastudios.opengl.program.GlProgramLocation;
import com.otaliastudios.opengl.texture.GlTexture;
import com.otaliastudios.opengl.types.BuffersJvmKt;
import com.otaliastudios.opengl.types.Disposable;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/program/GlTextureProgram;", "Lcom/otaliastudios/opengl/program/GlProgram;", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public class GlTextureProgram extends GlProgram {
    public final float[] d;
    public final GlProgramLocation e;
    public FloatBuffer f;
    public final GlProgramLocation g;
    public final GlProgramLocation h;
    public final GlProgramLocation i;
    public final RectF j;
    public int k;
    public Gl2dDrawable l;
    public GlTexture m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/otaliastudios/opengl/program/GlTextureProgram$Companion;", "", "", "SIMPLE_FRAGMENT_SHADER", "Ljava/lang/String;", "SIMPLE_VERTEX_SHADER", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GlTextureProgram() {
        int iA = GlProgram.Companion.a(new GlShader(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n"), new GlShader(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"));
        super(iA, new GlShader[0]);
        this.d = MiscKt.a(Egloo.f16798a);
        GlProgramLocation.Type type = GlProgramLocation.Type.e;
        this.e = new GlProgramLocation(iA, type, "uTexMatrix");
        this.f = BuffersJvmKt.a(8);
        GlProgramLocation.Type type2 = GlProgramLocation.Type.d;
        this.g = new GlProgramLocation(iA, type2, "aTextureCoord");
        this.h = new GlProgramLocation(iA, type2, "aPosition");
        this.i = new GlProgramLocation(iA, type, "uMVPMatrix");
        this.j = new RectF();
        this.k = -1;
    }

    @Override // com.otaliastudios.opengl.program.GlProgram
    public final void b(GlDrawable drawable) {
        Intrinsics.h(drawable, "drawable");
        GLES20.glDisableVertexAttribArray(this.h.b);
        GlProgramLocation glProgramLocation = this.g;
        if (glProgramLocation != null) {
            GLES20.glDisableVertexAttribArray(glProgramLocation.b);
        }
        GlTexture glTexture = this.m;
        if (glTexture != null) {
            glTexture.b();
        }
        Egloo.a("onPostDraw end");
    }

    @Override // com.otaliastudios.opengl.program.GlProgram
    public final void c(GlDrawable drawable, float[] fArr) {
        Intrinsics.h(drawable, "drawable");
        if (!(drawable instanceof Gl2dDrawable)) {
            throw new RuntimeException("GlTextureProgram only supports 2D drawables.");
        }
        GlTexture glTexture = this.m;
        if (glTexture != null) {
            glTexture.a();
        }
        GLES20.glUniformMatrix4fv(this.i.f16805a, 1, false, fArr, 0);
        Egloo.a("glUniformMatrix4fv");
        GlProgramLocation glProgramLocation = this.e;
        if (glProgramLocation != null) {
            GLES20.glUniformMatrix4fv(glProgramLocation.f16805a, 1, false, this.d, 0);
            Egloo.a("glUniformMatrix4fv");
        }
        GlProgramLocation glProgramLocation2 = this.h;
        GLES20.glEnableVertexAttribArray(glProgramLocation2.b);
        Egloo.a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(glProgramLocation2.b, 2, 5126, false, drawable.getC() * 4, (Buffer) drawable.getD());
        Egloo.a("glVertexAttribPointer");
        GlProgramLocation glProgramLocation3 = this.g;
        if (glProgramLocation3 == null) {
            return;
        }
        if (!drawable.equals(this.l) || drawable.b != this.k) {
            Gl2dDrawable gl2dDrawable = (Gl2dDrawable) drawable;
            this.l = gl2dDrawable;
            this.k = drawable.b;
            RectF rect = this.j;
            Intrinsics.h(rect, "rect");
            float fMax = -3.4028235E38f;
            int i = 0;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            while (gl2dDrawable.getD().hasRemaining()) {
                float f = gl2dDrawable.getD().get();
                if (i % 2 == 0) {
                    fMin = Math.min(fMin, f);
                    fMax2 = Math.max(fMax2, f);
                } else {
                    fMax = Math.max(fMax, f);
                    fMin2 = Math.min(fMin2, f);
                }
                i++;
            }
            gl2dDrawable.getD().rewind();
            rect.set(fMin, fMax, fMax2, fMin2);
            int iLimit = (drawable.getD().limit() / drawable.getC()) * 2;
            if (this.f.capacity() < iLimit) {
                Comparable comparable = this.f;
                Intrinsics.h(comparable, "<this>");
                if (comparable instanceof Disposable) {
                    ((Disposable) comparable).dispose();
                }
                this.f = BuffersJvmKt.a(iLimit);
            }
            this.f.clear();
            this.f.limit(iLimit);
            if (iLimit > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    boolean z = i2 % 2 == 0;
                    float f2 = drawable.getD().get(i2);
                    float f3 = z ? rect.left : rect.bottom;
                    this.f.put((((f2 - f3) / ((z ? rect.right : rect.top) - f3)) * 1.0f) + BitmapDescriptorFactory.HUE_RED);
                    if (i3 >= iLimit) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
        }
        this.f.rewind();
        GLES20.glEnableVertexAttribArray(glProgramLocation3.b);
        Egloo.a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(glProgramLocation3.b, 2, 5126, false, drawable.getC() * 4, (Buffer) this.f);
        Egloo.a("glVertexAttribPointer");
    }

    @Override // com.otaliastudios.opengl.program.GlProgram
    public final void d() {
        super.d();
        Comparable comparable = this.f;
        Intrinsics.h(comparable, "<this>");
        if (comparable instanceof Disposable) {
            ((Disposable) comparable).dispose();
        }
        GlTexture glTexture = this.m;
        if (glTexture != null) {
            GLES20.glDeleteTextures(1, new int[]{glTexture.f16807a}, 0);
        }
        this.m = null;
    }
}
