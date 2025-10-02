package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ClockDialModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/ClockDialNode;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ClockDialModifier extends ModifierNodeElement<ClockDialNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new ClockDialNode(null, false, 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ClockDialNode clockDialNode = (ClockDialNode) node;
        clockDialNode.t = null;
        clockDialNode.u = false;
        if (clockDialNode.v == 0) {
            return;
        }
        clockDialNode.v = 0;
        BuildersKt.c(clockDialNode.g2(), null, null, new ClockDialNode$updateNode$1(null, null), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClockDialModifier) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ClockDialModifier(state=" + ((Object) null) + ", autoSwitchToMinute=false, selection=" + ((Object) "Hour") + ')';
    }
}
