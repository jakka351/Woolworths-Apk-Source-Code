package androidx.compose.material;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    public static final float a(long j, long j2, long j3, float f) {
        long jG = ColorKt.g(Color.b(j, f), j3);
        float fI = ColorKt.i(ColorKt.g(j2, jG)) + 0.05f;
        float fI2 = ColorKt.i(jG) + 0.05f;
        return Math.max(fI, fI2) / Math.min(fI, fI2);
    }
}
