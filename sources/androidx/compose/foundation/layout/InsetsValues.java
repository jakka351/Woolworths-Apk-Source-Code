package androidx.compose.foundation.layout;

import YU.a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/InsetsValues;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InsetsValues {

    /* renamed from: a, reason: collision with root package name */
    public final int f967a;
    public final int b;
    public final int c;
    public final int d;

    public InsetsValues(int i, int i2, int i3, int i4) {
        this.f967a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsValues)) {
            return false;
        }
        InsetsValues insetsValues = (InsetsValues) obj;
        return this.f967a == insetsValues.f967a && this.b == insetsValues.b && this.c == insetsValues.c && this.d == insetsValues.d;
    }

    public final int hashCode() {
        return (((((this.f967a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f967a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return a.l(sb, this.d, ')');
    }
}
