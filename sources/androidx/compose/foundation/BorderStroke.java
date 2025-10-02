package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/BorderStroke;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderStroke {

    /* renamed from: a, reason: collision with root package name */
    public final float f828a;
    public final SolidColor b;

    public BorderStroke(float f, SolidColor solidColor) {
        this.f828a = f;
        this.b = solidColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        return Dp.a(this.f828a, borderStroke.f828a) && this.b.equals(borderStroke.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.f828a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) Dp.b(this.f828a)) + ", brush=" + this.b + ')';
    }
}
