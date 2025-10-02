package com.otaliastudios.opengl.draw;

import com.otaliastudios.opengl.core.Egloo;
import com.otaliastudios.opengl.core.GlViewportAware;
import com.otaliastudios.opengl.internal.MiscKt;
import java.nio.FloatBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/draw/GlDrawable;", "Lcom/otaliastudios/opengl/core/GlViewportAware;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class GlDrawable extends GlViewportAware {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f16799a = MiscKt.a(Egloo.f16798a);
    public int b;

    public abstract void a();

    /* renamed from: b */
    public abstract int getC();

    public abstract FloatBuffer c();
}
