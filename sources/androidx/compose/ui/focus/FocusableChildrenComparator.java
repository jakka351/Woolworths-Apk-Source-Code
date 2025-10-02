package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {
    public static final FocusableChildrenComparator d = new FocusableChildrenComparator();

    @Override // java.util.Comparator
    public final int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        int i = 0;
        if (FocusTraversalKt.f(focusTargetNode3) && FocusTraversalKt.f(focusTargetNode4)) {
            LayoutNode layoutNodeG = DelegatableNodeKt.g(focusTargetNode3);
            LayoutNode layoutNodeG2 = DelegatableNodeKt.g(focusTargetNode4);
            if (!Intrinsics.c(layoutNodeG, layoutNodeG2)) {
                MutableVector mutableVector = new MutableVector(new LayoutNode[16], 0);
                while (layoutNodeG != null) {
                    mutableVector.b(0, layoutNodeG);
                    layoutNodeG = layoutNodeG.K();
                }
                MutableVector mutableVector2 = new MutableVector(new LayoutNode[16], 0);
                while (layoutNodeG2 != null) {
                    mutableVector2.b(0, layoutNodeG2);
                    layoutNodeG2 = layoutNodeG2.K();
                }
                int iMin = Math.min(mutableVector.f - 1, mutableVector2.f - 1);
                if (iMin >= 0) {
                    while (Intrinsics.c(mutableVector.d[i], mutableVector2.d[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return Intrinsics.j(((LayoutNode) mutableVector.d[i]).L(), ((LayoutNode) mutableVector2.d[i]).L());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (FocusTraversalKt.f(focusTargetNode3)) {
                return -1;
            }
            if (FocusTraversalKt.f(focusTargetNode4)) {
                return 1;
            }
        }
        return 0;
    }
}
