package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutIdParentData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ConstraintLayoutParentData implements LayoutIdParentData {
    public final ConstrainedLayoutReference d;
    public final Function1 e;
    public final Object f;

    public ConstraintLayoutParentData(ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
        this.d = constrainedLayoutReference;
        this.e = function1;
        this.f = constrainedLayoutReference.b;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    /* renamed from: A1, reason: from getter */
    public final Object getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConstraintLayoutParentData)) {
            return false;
        }
        ConstraintLayoutParentData constraintLayoutParentData = (ConstraintLayoutParentData) obj;
        return Intrinsics.c(this.d.b, constraintLayoutParentData.d.b) && this.e == constraintLayoutParentData.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.b.hashCode() * 31);
    }
}
