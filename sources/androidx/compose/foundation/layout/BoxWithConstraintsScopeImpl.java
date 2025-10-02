package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/foundation/layout/BoxScope;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final /* data */ class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {

    /* renamed from: a, reason: collision with root package name */
    public final Density f945a;
    public final long b;

    public BoxWithConstraintsScopeImpl(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        this.f945a = subcomposeMeasureScope;
        this.b = j;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: e, reason: from getter */
    public final long getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return Intrinsics.c(this.f945a, boxWithConstraintsScopeImpl.f945a) && Constraints.b(this.b, boxWithConstraintsScopeImpl.b);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public final float f() {
        long j = this.b;
        if (!Constraints.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f945a.B(Constraints.h(j));
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier g(Modifier modifier, Alignment alignment) {
        return BoxScopeInstance.f944a.g(modifier, alignment);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public final float h() {
        long j = this.b;
        if (!Constraints.c(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f945a.B(Constraints.g(j));
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f945a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f945a + ", constraints=" + ((Object) Constraints.l(this.b)) + ')';
    }
}
