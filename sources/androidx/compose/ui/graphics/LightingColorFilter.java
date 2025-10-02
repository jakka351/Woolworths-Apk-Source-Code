package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/LightingColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightingColorFilter extends ColorFilter {
    public final boolean equals(Object obj) {
        boolean zC = Color.c(0L, 0L);
        if (this == obj) {
            return true;
        }
        return (obj instanceof LightingColorFilter) && zC && zC;
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(0L) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LightingColorFilter(multiply=");
        android.support.v4.media.session.a.A(0L, ", add=", sb);
        sb.append((Object) Color.i(0L));
        sb.append(')');
        return sb.toString();
    }
}
