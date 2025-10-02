package androidx.compose.ui.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BringIntoViewModifierNodeKt {
    public static final Object a(DelegatableNode delegatableNode, final Function0 function0, ContinuationImpl continuationImpl) {
        Object obj;
        final NodeCoordinator nodeCoordinatorF;
        Object objS0;
        NodeChain nodeChain;
        if (delegatableNode.getD().q) {
            if (!delegatableNode.getD().q) {
                InlineClassHelperKt.b("visitAncestors called on an unattached node");
            }
            Modifier.Node node = delegatableNode.getD().h;
            LayoutNode layoutNodeG = DelegatableNodeKt.g(delegatableNode);
            loop0: while (true) {
                obj = null;
                if (layoutNodeG == null) {
                    break;
                }
                if ((layoutNodeG.K.e.g & 524288) != 0) {
                    while (node != null) {
                        if ((node.f & 524288) != 0) {
                            Modifier.Node nodeB = node;
                            MutableVector mutableVector = null;
                            while (nodeB != null) {
                                if (nodeB instanceof BringIntoViewModifierNode) {
                                    obj = nodeB;
                                    break loop0;
                                }
                                if ((nodeB.f & 524288) != 0 && (nodeB instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node node2 = ((DelegatingNode) nodeB).s; node2 != null; node2 = node2.i) {
                                        if ((node2.f & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                nodeB = node2;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeB != null) {
                                                    mutableVector.c(nodeB);
                                                    nodeB = null;
                                                }
                                                mutableVector.c(node2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                nodeB = DelegatableNodeKt.b(mutableVector);
                            }
                        }
                        node = node.h;
                    }
                }
                layoutNodeG = layoutNodeG.K();
                node = (layoutNodeG == null || (nodeChain = layoutNodeG.K) == null) ? null : nodeChain.d;
            }
            BringIntoViewModifierNode bringIntoViewModifierNode = (BringIntoViewModifierNode) obj;
            if (bringIntoViewModifierNode != null && (objS0 = bringIntoViewModifierNode.S0((nodeCoordinatorF = DelegatableNodeKt.f(delegatableNode)), new Function0<Rect>() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Rect rect;
                    Function0 function02 = function0;
                    if (function02 != null && (rect = (Rect) function02.invoke()) != null) {
                        return rect;
                    }
                    NodeCoordinator nodeCoordinator = nodeCoordinatorF;
                    if (!nodeCoordinator.j1().q) {
                        nodeCoordinator = null;
                    }
                    if (nodeCoordinator != null) {
                        return RectKt.a(0L, IntSizeKt.d(nodeCoordinator.f));
                    }
                    return null;
                }
            }, continuationImpl)) == CoroutineSingletons.d) {
                return objS0;
            }
        }
        return Unit.f24250a;
    }
}
