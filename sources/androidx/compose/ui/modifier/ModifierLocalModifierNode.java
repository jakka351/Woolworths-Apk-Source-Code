package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface ModifierLocalModifierNode extends ModifierLocalReadScope, DelegatableNode {
    default void I1(ModifierLocal modifierLocal, Object obj) {
        if (f0() == EmptyMap.f1898a) {
            InlineClassHelperKt.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!f0().a(modifierLocal)) {
            InlineClassHelperKt.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal + " was not found.");
        }
        f0().c(modifierLocal, obj);
    }

    default ModifierLocalMap f0() {
        return EmptyMap.f1898a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    default Object u(ModifierLocal modifierLocal) {
        NodeChain nodeChain;
        if (!getD().q) {
            InlineClassHelperKt.a("ModifierLocal accessed from an unattached node");
        }
        if (!getD().q) {
            InlineClassHelperKt.b("visitAncestors called on an unattached node");
        }
        Modifier.Node node = getD().h;
        LayoutNode layoutNodeG = DelegatableNodeKt.g(this);
        while (layoutNodeG != null) {
            if ((layoutNodeG.K.e.g & 32) != 0) {
                while (node != null) {
                    if ((node.f & 32) != 0) {
                        DelegatingNode delegatingNodeB = node;
                        ?? mutableVector = 0;
                        while (delegatingNodeB != 0) {
                            if (delegatingNodeB instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNodeB;
                                if (modifierLocalModifierNode.f0().a(modifierLocal)) {
                                    return modifierLocalModifierNode.f0().b(modifierLocal);
                                }
                            } else if ((delegatingNodeB.f & 32) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNodeB.s;
                                int i = 0;
                                delegatingNodeB = delegatingNodeB;
                                mutableVector = mutableVector;
                                while (node2 != null) {
                                    if ((node2.f & 32) != 0) {
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
                    node = node.h;
                }
            }
            layoutNodeG = layoutNodeG.K();
            node = (layoutNodeG == null || (nodeChain = layoutNodeG.K) == null) ? null : nodeChain.d;
        }
        return modifierLocal.f1899a.invoke();
    }
}
