package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/JSONConstraintSet;", "Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JSONConstraintSet extends EditableJSONLayout implements DerivedConstraintSet {
    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public final float b() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final boolean d(List list) {
        return false;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public final ConstraintSet e() {
        return null;
    }

    public final boolean equals(Object obj) {
        return obj instanceof JSONConstraintSet;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final void f(androidx.constraintlayout.core.state.Transition transition, int i) {
        new ConstraintSetParser.LayoutVariables();
        throw null;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public final void h(State state) {
        new ConstraintSetParser.LayoutVariables();
        throw null;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public final void i() {
    }
}
