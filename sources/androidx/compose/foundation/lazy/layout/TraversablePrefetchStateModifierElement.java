package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class TraversablePrefetchStateModifierElement extends ModifierNodeElement<TraversablePrefetchStateNode> {
    public final LazyLayoutPrefetchState d;

    public TraversablePrefetchStateModifierElement(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.d = lazyLayoutPrefetchState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        TraversablePrefetchStateNode traversablePrefetchStateNode = new TraversablePrefetchStateNode();
        traversablePrefetchStateNode.r = this.d;
        return traversablePrefetchStateNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((TraversablePrefetchStateNode) node).r = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && Intrinsics.c(this.d, ((TraversablePrefetchStateModifierElement) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.d + ')';
    }
}
