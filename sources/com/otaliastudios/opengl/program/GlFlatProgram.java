package com.otaliastudios.opengl.program;

import android.graphics.Color;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/program/GlFlatProgram;", "Lcom/otaliastudios/opengl/program/GlNativeFlatProgram;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class GlFlatProgram extends GlNativeFlatProgram {
    public final void e(int i) {
        this.g = new float[]{Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f};
    }
}
