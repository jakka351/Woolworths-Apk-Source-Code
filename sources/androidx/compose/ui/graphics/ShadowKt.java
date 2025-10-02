package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShadowKt {
    public static final Shadow a(Shadow shadow, Shadow shadow2, float f) {
        return new Shadow(ColorKt.h(shadow.f1782a, f, shadow2.f1782a), MathHelpersKt.b(shadow.c, shadow2.c, f), OffsetKt.b(shadow.b, f, shadow2.b));
    }
}
