package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/TabPosition;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TabPosition {

    /* renamed from: a, reason: collision with root package name */
    public final float f1511a;
    public final float b;
    public final float c;

    public TabPosition(float f, float f2, float f3) {
        this.f1511a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.a(this.f1511a, tabPosition.f1511a) && Dp.a(this.b, tabPosition.b) && Dp.a(this.c, tabPosition.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + android.support.v4.media.session.a.b(this.b, Float.hashCode(this.f1511a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.f1511a;
        sb.append((Object) Dp.b(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) Dp.b(f + f2));
        sb.append(", width=");
        sb.append((Object) Dp.b(f2));
        sb.append(", contentWidth=");
        sb.append((Object) Dp.b(this.c));
        sb.append(')');
        return sb.toString();
    }
}
