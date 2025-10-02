package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DepthSortedSetsForDifferentPasses {

    /* renamed from: a, reason: collision with root package name */
    public final DepthSortedSet f1908a = new DepthSortedSet();
    public final DepthSortedSet b = new DepthSortedSet();

    public final void a(LayoutNode layoutNode, boolean z) {
        DepthSortedSet depthSortedSet = this.b;
        DepthSortedSet depthSortedSet2 = this.f1908a;
        if (z) {
            depthSortedSet2.a(layoutNode);
            depthSortedSet.a(layoutNode);
        } else {
            if (depthSortedSet2.f1906a.contains(layoutNode)) {
                return;
            }
            depthSortedSet.a(layoutNode);
        }
    }

    public final boolean b(LayoutNode layoutNode) {
        return this.f1908a.f1906a.contains(layoutNode);
    }

    public final boolean c() {
        return !(this.b.f1906a.isEmpty() && this.f1908a.f1906a.isEmpty());
    }
}
