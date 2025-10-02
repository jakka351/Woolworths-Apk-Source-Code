package androidx.compose.foundation.layout;

import YU.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidWindowInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final int f933a;
    public final String b;
    public final MutableState c = SnapshotStateKt.f(Insets.e);
    public final MutableState d = SnapshotStateKt.f(Boolean.TRUE);

    public AndroidWindowInsets(int i, String str) {
        this.f933a = i;
        this.b = str;
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
        return e().f2430a;
    }

    public final Insets e() {
        return (Insets) ((SnapshotMutableStateImpl) this.c).getD();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidWindowInsets) {
            return this.f933a == ((AndroidWindowInsets) obj).f933a;
        }
        return false;
    }

    public final void f(WindowInsetsCompat windowInsetsCompat, int i) {
        int i2 = this.f933a;
        if (i == 0 || (i & i2) != 0) {
            ((SnapshotMutableStateImpl) this.c).setValue(windowInsetsCompat.e(i2));
            ((SnapshotMutableStateImpl) this.d).setValue(Boolean.valueOf(windowInsetsCompat.q(i2)));
        }
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF933a() {
        return this.f933a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().f2430a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return a.l(sb, e().d, ')');
    }
}
