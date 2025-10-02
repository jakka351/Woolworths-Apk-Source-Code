package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutTag;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/constraintlayout/compose/ConstraintLayoutTagParentData;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ConstraintLayoutTag extends InspectorValueInfo implements ParentDataModifier, ConstraintLayoutTagParentData {
    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object D(Density density, Object obj) {
        return this;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    public final String a() {
        return null;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConstraintLayoutTag ? (ConstraintLayoutTag) obj : null) != null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ConstraintLayoutTag(id=null)";
    }
}
