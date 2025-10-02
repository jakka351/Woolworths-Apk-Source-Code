package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/TabPosition;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TabPosition {

    /* renamed from: a, reason: collision with root package name */
    public final float f1336a;
    public final float b;

    public TabPosition(float f, float f2) {
        this.f1336a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.a(this.f1336a, tabPosition.f1336a) && Dp.a(this.b, tabPosition.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f1336a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.f1336a;
        sb.append((Object) Dp.b(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) Dp.b(f + f2));
        sb.append(", width=");
        sb.append((Object) Dp.b(f2));
        sb.append(')');
        return sb.toString();
    }
}
