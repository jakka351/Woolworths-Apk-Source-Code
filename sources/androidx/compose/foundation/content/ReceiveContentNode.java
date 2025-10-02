package androidx.compose.foundation.content;

import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.modifier.SingleLocalMap;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/content/ReceiveContentNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReceiveContentNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode {
    public final SingleLocalMap t;

    public ReceiveContentNode() {
        DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = new DynamicReceiveContentConfiguration(this);
        this.t = ModifierLocalModifierNodeKt.a(new Pair(ReceiveContentConfigurationKt.f853a, dynamicReceiveContentConfiguration));
        s2(ReceiveContentDragAndDropNode_androidKt.a(dynamicReceiveContentConfiguration, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.content.ReceiveContentNode.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DragAndDropRequestPermission_androidKt.a(ReceiveContentNode.this, (DragAndDropEvent) obj);
                return Unit.f24250a;
            }
        }));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final ModifierLocalMap f0() {
        return this.t;
    }
}
