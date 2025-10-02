package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OnPositionedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f1930a = new MutableVector(new LayoutNode[16], 0);
    public LayoutNode[] b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher$Companion;", "", "", "MinArraySize", "I", "DepthComparator", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher$Companion$DepthComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DepthComparator implements Comparator<LayoutNode> {
            public static final DepthComparator d = new DepthComparator();

            @Override // java.util.Comparator
            public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                LayoutNode layoutNode3 = layoutNode;
                LayoutNode layoutNode4 = layoutNode2;
                int iJ = Intrinsics.j(layoutNode4.u, layoutNode3.u);
                return iJ != 0 ? iJ : Intrinsics.j(layoutNode3.hashCode(), layoutNode4.hashCode());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void a(LayoutNode layoutNode) {
        if (layoutNode.L.d == LayoutNode.LayoutState.h && !layoutNode.F() && !layoutNode.G() && !layoutNode.U && layoutNode.u()) {
            Modifier.Node node = layoutNode.K.e;
            if ((node.g & 256) != 0) {
                while (node != null) {
                    if ((node.f & 256) != 0) {
                        DelegatingNode delegatingNodeB = node;
                        ?? mutableVector = 0;
                        while (delegatingNodeB != 0) {
                            if (delegatingNodeB instanceof GlobalPositionAwareModifierNode) {
                                GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) delegatingNodeB;
                                globalPositionAwareModifierNode.Q(DelegatableNodeKt.e(globalPositionAwareModifierNode, 256));
                            } else if ((delegatingNodeB.f & 256) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNodeB.s;
                                int i = 0;
                                delegatingNodeB = delegatingNodeB;
                                mutableVector = mutableVector;
                                while (node2 != null) {
                                    if ((node2.f & 256) != 0) {
                                        i++;
                                        mutableVector = mutableVector;
                                        if (i == 1) {
                                            delegatingNodeB = node2;
                                        } else {
                                            if (mutableVector == 0) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodeB != 0) {
                                                mutableVector.c(delegatingNodeB);
                                                delegatingNodeB = 0;
                                            }
                                            mutableVector.c(node2);
                                        }
                                    }
                                    node2 = node2.i;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector = mutableVector;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNodeB = DelegatableNodeKt.b(mutableVector);
                        }
                    }
                    if ((node.g & 256) == 0) {
                        break;
                    } else {
                        node = node.i;
                    }
                }
            }
        }
        layoutNode.T = false;
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i2 = mutableVectorN.f;
        for (int i3 = 0; i3 < i2; i3++) {
            a((LayoutNode) objArr[i3]);
        }
    }
}
