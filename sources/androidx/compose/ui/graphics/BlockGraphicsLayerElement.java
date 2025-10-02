package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class BlockGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public final Function1 d;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.d = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new BlockGraphicsLayerModifier(this.d);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = (BlockGraphicsLayerModifier) node;
        blockGraphicsLayerModifier.r = this.d;
        NodeCoordinator nodeCoordinator = DelegatableNodeKt.e(blockGraphicsLayerModifier, 2).s;
        if (nodeCoordinator != null) {
            nodeCoordinator.d2(blockGraphicsLayerModifier.r, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && Intrinsics.c(this.d, ((BlockGraphicsLayerElement) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.d + ')';
    }
}
