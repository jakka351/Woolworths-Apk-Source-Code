package androidx.compose.material.ripple;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/RippleAlpha;", "", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleAlpha {

    /* renamed from: a, reason: collision with root package name */
    public final float f1386a;
    public final float b;
    public final float c;
    public final float d;

    public RippleAlpha(float f, float f2, float f3, float f4) {
        this.f1386a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) obj;
        return this.f1386a == rippleAlpha.f1386a && this.b == rippleAlpha.b && this.c == rippleAlpha.c && this.d == rippleAlpha.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + android.support.v4.media.session.a.b(this.c, android.support.v4.media.session.a.b(this.b, Float.hashCode(this.f1386a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f1386a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return android.support.v4.media.session.a.r(sb, this.d, ')');
    }
}
