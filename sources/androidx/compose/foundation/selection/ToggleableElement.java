package androidx.compose.foundation.selection;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import com.dynatrace.android.compose.ToggleableComposeCallback_1_7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/selection/ToggleableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ToggleableElement extends ModifierNodeElement<ToggleableNode> {
    public final boolean d;
    public final MutableInteractionSource e;
    public final IndicationNodeFactory f;
    public final boolean g;
    public final Role h;
    public final ToggleableComposeCallback_1_7 i;

    public ToggleableElement(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, ToggleableComposeCallback_1_7 toggleableComposeCallback_1_7) {
        this.d = z;
        this.e = mutableInteractionSource;
        this.f = indicationNodeFactory;
        this.g = z2;
        this.h = role;
        this.i = toggleableComposeCallback_1_7;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new ToggleableNode(this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ToggleableNode toggleableNode = (ToggleableNode) node;
        boolean z = toggleableNode.K;
        boolean z2 = this.d;
        if (z != z2) {
            toggleableNode.K = z2;
            SemanticsModifierNodeKt.a(toggleableNode);
        }
        toggleableNode.L = this.i;
        toggleableNode.C2(this.e, this.f, this.g, null, this.h, toggleableNode.M);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.d == toggleableElement.d && Intrinsics.c(this.e, toggleableElement.e) && Intrinsics.c(this.f, toggleableElement.f) && this.g == toggleableElement.g && Intrinsics.c(this.h, toggleableElement.h) && this.i == toggleableElement.i;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.d) * 31;
        MutableInteractionSource mutableInteractionSource = this.e;
        int iHashCode2 = (iHashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f;
        int iE = b.e((iHashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.g);
        Role role = this.h;
        return this.i.hashCode() + ((iE + (role != null ? Integer.hashCode(role.f2014a) : 0)) * 31);
    }
}
