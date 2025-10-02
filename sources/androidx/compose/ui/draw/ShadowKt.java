package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShadowKt {
    public static Modifier a(Modifier modifier, float f, Shape shape, boolean z, long j, long j2, int i) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.f1779a;
        }
        Shape shape2 = shape;
        if ((i & 4) != 0) {
            z = Float.compare(f, (float) 0) > 0;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = GraphicsLayerScopeKt.f1769a;
        }
        return (Float.compare(f, (float) 0) > 0 || z2) ? modifier.x0(new ShadowGraphicsLayerElement(f, shape2, z2, j, (i & 16) != 0 ? GraphicsLayerScopeKt.f1769a : j2)) : modifier;
    }
}
