package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LazyLayoutAnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {
    public final SpringSpec d;
    public final SpringSpec e;
    public final SpringSpec f;

    public LazyLayoutAnimateItemElement(SpringSpec springSpec, SpringSpec springSpec2, SpringSpec springSpec3) {
        this.d = springSpec;
        this.e = springSpec2;
        this.f = springSpec3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode = new LazyLayoutAnimationSpecsNode();
        lazyLayoutAnimationSpecsNode.r = this.d;
        lazyLayoutAnimationSpecsNode.s = this.e;
        lazyLayoutAnimationSpecsNode.t = this.f;
        return lazyLayoutAnimationSpecsNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode = (LazyLayoutAnimationSpecsNode) node;
        lazyLayoutAnimationSpecsNode.r = this.d;
        lazyLayoutAnimationSpecsNode.s = this.e;
        lazyLayoutAnimationSpecsNode.t = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return this.d.equals(lazyLayoutAnimateItemElement.d) && this.e.equals(lazyLayoutAnimateItemElement.e) && this.f.equals(lazyLayoutAnimateItemElement.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.d + ", placementSpec=" + this.e + ", fadeOutSpec=" + this.f + ')';
    }
}
