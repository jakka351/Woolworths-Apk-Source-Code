package com.otaliastudios.opengl.draw;

import android.opengl.GLES20;
import com.otaliastudios.opengl.core.Egloo;
import com.otaliastudios.opengl.types.BuffersJvmKt;
import java.nio.FloatBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/draw/GlRect;", "Lcom/otaliastudios/opengl/draw/Gl2dDrawable;", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public class GlRect extends Gl2dDrawable {
    public static final float[] e = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public final FloatBuffer d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/opengl/draw/GlRect$Companion;", "", "", "FULL_RECTANGLE_COORDS", "[F", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public GlRect() {
        FloatBuffer floatBufferA = BuffersJvmKt.a(8);
        floatBufferA.put(e);
        floatBufferA.clear();
        this.d = floatBufferA;
    }

    @Override // com.otaliastudios.opengl.draw.GlDrawable
    public final void a() {
        Egloo.a("glDrawArrays start");
        GLES20.glDrawArrays(5, 0, getD().limit() / getC());
        Egloo.a("glDrawArrays end");
    }

    @Override // com.otaliastudios.opengl.draw.GlDrawable
    /* renamed from: c, reason: from getter */
    public final FloatBuffer getD() {
        return this.d;
    }
}
