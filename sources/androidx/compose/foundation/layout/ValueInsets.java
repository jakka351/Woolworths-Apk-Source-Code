package androidx.compose.foundation.layout;

import YU.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ValueInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final String f981a;
    public final MutableState b;

    public ValueInsets(InsetsValues insetsValues, String str) {
        this.f981a = str;
        this.b = SnapshotStateKt.f(insetsValues);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return e().b;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return e().c;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return e().d;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return e().f967a;
    }

    public final InsetsValues e() {
        return (InsetsValues) ((SnapshotMutableStateImpl) this.b).getD();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValueInsets) {
            return Intrinsics.c(e(), ((ValueInsets) obj).e());
        }
        return false;
    }

    public final void f(InsetsValues insetsValues) {
        ((SnapshotMutableStateImpl) this.b).setValue(insetsValues);
    }

    public final int hashCode() {
        return this.f981a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f981a);
        sb.append("(left=");
        sb.append(e().f967a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return a.l(sb, e().d, ')');
    }
}
