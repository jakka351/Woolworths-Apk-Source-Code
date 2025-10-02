package androidx.compose.foundation;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ClickableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableElement extends ModifierNodeElement<ClickableNode> {
    public final MutableInteractionSource d;
    public final IndicationNodeFactory e;
    public final boolean f;
    public final String g;
    public final Role h;
    public final Function0 i;

    public ClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, String str, Role role, Function0 function0) {
        this.d = mutableInteractionSource;
        this.e = indicationNodeFactory;
        this.f = z;
        this.g = str;
        this.h = role;
        this.i = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new ClickableNode(this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((ClickableNode) node).C2(this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.c(this.d, clickableElement.d) && Intrinsics.c(this.e, clickableElement.e) && this.f == clickableElement.f && Intrinsics.c(this.g, clickableElement.g) && Intrinsics.c(this.h, clickableElement.h) && this.i == clickableElement.i;
    }

    public final int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.d;
        int iHashCode = (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.e;
        int iE = b.e((iHashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.f);
        String str = this.g;
        int iHashCode2 = (iE + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.h;
        return this.i.hashCode() + ((iHashCode2 + (role != null ? Integer.hashCode(role.f2014a) : 0)) * 31);
    }
}
