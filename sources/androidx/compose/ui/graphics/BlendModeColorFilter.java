package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlendModeColorFilter extends ColorFilter {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public BlendModeColorFilter(long j, int i) {
        android.graphics.ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            a.i();
            porterDuffColorFilter = a.c(ColorKt.j(j), AndroidBlendMode_androidKt.a(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(ColorKt.j(j), AndroidBlendMode_androidKt.b(i));
        }
        super(porterDuffColorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.c(this.b, blendModeColorFilter.b) && this.c == blendModeColorFilter.c;
    }

    public final int hashCode() {
        int i = Color.l;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        android.support.v4.media.session.a.A(this.b, ", blendMode=", sb);
        sb.append((Object) BlendMode.a(this.c));
        sb.append(')');
        return sb.toString();
    }
}
