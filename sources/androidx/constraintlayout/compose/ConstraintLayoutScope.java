package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@LayoutScopeMarker
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "ConstrainAsModifier", "ConstrainedLayoutReferences", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {
    public ConstrainedLayoutReferences b;
    public int c = 0;
    public final ArrayList d = new ArrayList();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Stable
    @SourceDebugExtension
    public static final class ConstrainAsModifier extends InspectorValueInfo implements ParentDataModifier {
        public final ConstrainedLayoutReference e;
        public final Function1 f;

        public ConstrainAsModifier(ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
            super(InspectableValueKt.a());
            this.e = constrainedLayoutReference;
            this.f = function1;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public final Object D(Density density, Object obj) {
            return new ConstraintLayoutParentData(this.e, this.f);
        }

        public final boolean equals(Object obj) {
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            return this.f == (constrainAsModifier != null ? constrainAsModifier.f : null);
        }

        public final int hashCode() {
            return this.f.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ConstrainedLayoutReferences {
        public ConstrainedLayoutReferences() {
        }
    }

    public static Modifier a(Modifier modifier, ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
        return modifier.x0(new ConstrainAsModifier(constrainedLayoutReference, function1));
    }

    public final ConstrainedLayoutReference b() {
        int i = this.c;
        this.c = i + 1;
        ArrayList arrayList = this.d;
        ConstrainedLayoutReference constrainedLayoutReference = (ConstrainedLayoutReference) CollectionsKt.J(i, arrayList);
        if (constrainedLayoutReference != null) {
            return constrainedLayoutReference;
        }
        ConstrainedLayoutReference constrainedLayoutReference2 = new ConstrainedLayoutReference(Integer.valueOf(this.c));
        arrayList.add(constrainedLayoutReference2);
        return constrainedLayoutReference2;
    }

    public final ConstrainedLayoutReferences c() {
        ConstrainedLayoutReferences constrainedLayoutReferences = this.b;
        if (constrainedLayoutReferences != null) {
            return constrainedLayoutReferences;
        }
        ConstrainedLayoutReferences constrainedLayoutReferences2 = new ConstrainedLayoutReferences();
        this.b = constrainedLayoutReferences2;
        return constrainedLayoutReferences2;
    }

    public final void d() {
        this.f2236a.h.clear();
        this.c = 0;
    }
}
