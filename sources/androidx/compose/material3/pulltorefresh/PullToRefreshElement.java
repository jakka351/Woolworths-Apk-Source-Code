package androidx.compose.material3.pulltorefresh;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PullToRefreshElement extends ModifierNodeElement<PullToRefreshModifierNode> {
    public final boolean d;
    public final Function0 e;
    public final PullToRefreshState f;
    public final float g;

    public PullToRefreshElement(boolean z, Function0 function0, PullToRefreshState pullToRefreshState, float f) {
        this.d = z;
        this.e = function0;
        this.f = pullToRefreshState;
        this.g = f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new PullToRefreshModifierNode(this.d, this.e, this.f, this.g);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        PullToRefreshModifierNode pullToRefreshModifierNode = (PullToRefreshModifierNode) node;
        pullToRefreshModifierNode.u = this.e;
        pullToRefreshModifierNode.v = true;
        pullToRefreshModifierNode.w = this.f;
        pullToRefreshModifierNode.x = this.g;
        boolean z = pullToRefreshModifierNode.t;
        boolean z2 = this.d;
        if (z != z2) {
            pullToRefreshModifierNode.t = z2;
            BuildersKt.c(pullToRefreshModifierNode.g2(), null, null, new PullToRefreshModifierNode$update$1(pullToRefreshModifierNode, null), 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.d == pullToRefreshElement.d && Intrinsics.c(this.e, pullToRefreshElement.e) && Intrinsics.c(this.f, pullToRefreshElement.f) && Dp.a(this.g, pullToRefreshElement.g);
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + ((this.f.hashCode() + b.e((this.e.hashCode() + (Boolean.hashCode(this.d) * 31)) * 31, 31, true)) * 31);
    }

    public final String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.d + ", onRefresh=" + this.e + ", enabled=true, state=" + this.f + ", threshold=" + ((Object) Dp.b(this.g)) + ')';
    }
}
