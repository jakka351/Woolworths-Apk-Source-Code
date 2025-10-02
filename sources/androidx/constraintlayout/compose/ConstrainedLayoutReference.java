package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/LayoutReference;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConstrainedLayoutReference extends LayoutReference {
    public final Object b;
    public final ConstraintLayoutBaseScope.VerticalAnchor c;
    public final ConstraintLayoutBaseScope.HorizontalAnchor d;
    public final ConstraintLayoutBaseScope.VerticalAnchor e;
    public final ConstraintLayoutBaseScope.HorizontalAnchor f;
    public final ConstraintLayoutBaseScope.BaselineAnchor g;

    public ConstrainedLayoutReference(Object obj) {
        super(obj);
        this.b = obj;
        this.c = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -2, this);
        this.d = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 0, this);
        this.e = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -1, this);
        this.f = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 1, this);
        this.g = new ConstraintLayoutBaseScope.BaselineAnchor(obj, this);
    }

    @Override // androidx.constraintlayout.compose.LayoutReference
    /* renamed from: a, reason: from getter */
    public final Object getB() {
        return this.b;
    }
}
