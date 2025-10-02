package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "value", "Landroidx/compose/ui/unit/Constraints;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OrientationIndependentConstraints {
    public static long a(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.d;
        return ConstraintsKt.a(layoutOrientation == layoutOrientation2 ? Constraints.j(j) : Constraints.i(j), layoutOrientation == layoutOrientation2 ? Constraints.h(j) : Constraints.g(j), layoutOrientation == layoutOrientation2 ? Constraints.i(j) : Constraints.j(j), layoutOrientation == layoutOrientation2 ? Constraints.g(j) : Constraints.h(j));
    }

    public static long b(int i, long j) {
        return ConstraintsKt.a(0, Constraints.h(j), (i & 4) != 0 ? Constraints.i(j) : 0, Constraints.g(j));
    }

    public static final long c(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.d ? ConstraintsKt.a(Constraints.j(j), Constraints.h(j), Constraints.i(j), Constraints.g(j)) : ConstraintsKt.a(Constraints.i(j), Constraints.g(j), Constraints.j(j), Constraints.h(j));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.b(0L, 0L);
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.l(0L)) + ')';
    }
}
