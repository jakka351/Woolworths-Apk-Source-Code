package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutAnimationSpecsNode extends Modifier.Node implements ParentDataModifierNode {
    public SpringSpec r;
    public SpringSpec s;
    public SpringSpec t;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object D(Density density, Object obj) {
        return this;
    }
}
