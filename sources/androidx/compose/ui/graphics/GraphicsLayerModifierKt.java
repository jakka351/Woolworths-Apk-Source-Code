package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GraphicsLayerModifierKt {
    public static final Modifier a(Modifier modifier, Function1 function1) {
        return modifier.x0(new BlockGraphicsLayerElement(function1));
    }

    public static Modifier b(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, Shape shape, boolean z, int i) {
        float f7 = (i & 1) != 0 ? 1.0f : f;
        float f8 = (i & 2) != 0 ? 1.0f : f2;
        float f9 = (i & 4) != 0 ? 1.0f : f3;
        float f10 = (i & 8) != 0 ? 0.0f : f4;
        float f11 = (i & 32) != 0 ? 0.0f : f5;
        float f12 = (i & 256) != 0 ? 0.0f : f6;
        long j = TransformOrigin.b;
        Shape shape2 = (i & 2048) != 0 ? RectangleShapeKt.f1779a : shape;
        boolean z2 = (i & 4096) != 0 ? false : z;
        long j2 = GraphicsLayerScopeKt.f1769a;
        return modifier.x0(new GraphicsLayerElement(f7, f8, f9, f10, f11, f12, j, shape2, z2, j2, j2));
    }
}
