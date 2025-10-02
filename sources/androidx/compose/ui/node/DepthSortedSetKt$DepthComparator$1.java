package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"androidx/compose/ui/node/DepthSortedSetKt$DepthComparator$1", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DepthSortedSetKt$DepthComparator$1 implements Comparator<LayoutNode> {
    @Override // java.util.Comparator
    public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode layoutNode3 = layoutNode;
        LayoutNode layoutNode4 = layoutNode2;
        int iJ = Intrinsics.j(layoutNode3.u, layoutNode4.u);
        return iJ != 0 ? iJ : Intrinsics.j(layoutNode3.hashCode(), layoutNode4.hashCode());
    }
}
