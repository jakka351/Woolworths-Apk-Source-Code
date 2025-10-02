package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OffsetEffect extends RenderEffect {
    @Override // androidx.compose.ui.graphics.RenderEffect
    public final android.graphics.RenderEffect b() {
        int i = (int) 0;
        return android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat(i), Float.intBitsToFloat(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OffsetEffect) && Offset.c(0L, 0L);
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "OffsetEffect(renderEffect=null, offset=" + ((Object) Offset.j(0L)) + ')';
    }
}
