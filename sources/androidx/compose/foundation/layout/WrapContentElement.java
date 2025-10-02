package androidx.compose.foundation.layout;

import androidx.camera.core.impl.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/WrapContentNode;", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentElement extends ModifierNodeElement<WrapContentNode> {
    public final Direction d;
    public final boolean e;
    public final Lambda f;
    public final Object g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$Companion;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(Direction direction, boolean z, Function2 function2, Object obj) {
        this.d = direction;
        this.e = z;
        this.f = (Lambda) function2;
        this.g = obj;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        WrapContentNode wrapContentNode = new WrapContentNode();
        wrapContentNode.r = this.d;
        wrapContentNode.s = this.e;
        wrapContentNode.t = this.f;
        return wrapContentNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        WrapContentNode wrapContentNode = (WrapContentNode) node;
        wrapContentNode.r = this.d;
        wrapContentNode.s = this.e;
        wrapContentNode.t = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.d == wrapContentElement.d && this.e == wrapContentElement.e && Intrinsics.c(this.g, wrapContentElement.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b.e(this.d.hashCode() * 31, 31, this.e);
    }
}
