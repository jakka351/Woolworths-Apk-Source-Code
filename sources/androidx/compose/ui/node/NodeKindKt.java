package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.semantics.SemanticsModifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class NodeKindKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MutableObjectIntMap f1929a;

    static {
        MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.f693a;
        f1929a = new MutableObjectIntMap();
    }

    public static final void a(Modifier.Node node, int i, int i2) {
        if (!(node instanceof DelegatingNode)) {
            b(node, i & node.f, i2);
            return;
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int i3 = delegatingNode.r;
        b(node, i3 & i, i2);
        int i4 = (~i3) & i;
        for (Modifier.Node node2 = delegatingNode.s; node2 != null; node2 = node2.i) {
            a(node2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Modifier.Node node, int i, int i2) {
        if (i2 != 0 || node.h2()) {
            if ((i & 2) != 0 && (node instanceof LayoutModifierNode)) {
                DelegatableNodeKt.g((LayoutModifierNode) node).W();
                if (i2 == 2) {
                    NodeCoordinator nodeCoordinatorE = DelegatableNodeKt.e(node, 2);
                    nodeCoordinatorE.u = true;
                    ((NodeCoordinator$invalidateParentLayer$1) nodeCoordinatorE.J).invoke();
                    if (nodeCoordinatorE.L != null) {
                        if (nodeCoordinatorE.M != null) {
                            nodeCoordinatorE.M = null;
                        }
                        nodeCoordinatorE.d2(null, false);
                        nodeCoordinatorE.p.l0(false);
                    }
                }
            }
            if ((i & 128) != 0 && (node instanceof LayoutAwareModifierNode) && i2 != 2) {
                DelegatableNodeKt.g(node).W();
            }
            if ((i & 256) != 0 && (node instanceof GlobalPositionAwareModifierNode) && i2 != 2) {
                LayoutNode layoutNodeG = DelegatableNodeKt.g(node);
                if (!layoutNodeG.F() && !layoutNodeG.G() && !layoutNodeG.T) {
                    LayoutNodeKt.a(layoutNodeG).b(layoutNodeG);
                }
            }
            if ((i & 4) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.a((DrawModifierNode) node);
            }
            if ((i & 8) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNodeKt.g(node).w = true;
            }
            if ((i & 64) != 0 && (node instanceof ParentDataModifierNode)) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = DelegatableNodeKt.g((ParentDataModifierNode) node).L;
                layoutNodeLayoutDelegate.p.u = true;
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.F0();
                }
            }
            if ((i & 2048) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                CanFocusChecker.f();
                focusPropertiesModifierNode.E1(CanFocusChecker.f1904a);
                if (CanFocusChecker.e()) {
                    if (!focusPropertiesModifierNode.getD().q) {
                        InlineClassHelperKt.b("visitChildren called on an unattached node");
                    }
                    MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
                    Modifier.Node node2 = focusPropertiesModifierNode.getD().i;
                    if (node2 == null) {
                        DelegatableNodeKt.a(mutableVector, focusPropertiesModifierNode.getD());
                    } else {
                        mutableVector.c(node2);
                    }
                    while (true) {
                        int i3 = mutableVector.f;
                        if (i3 == 0) {
                            break;
                        }
                        Modifier.Node nodeB = (Modifier.Node) mutableVector.l(i3 - 1);
                        if ((nodeB.g & 1024) == 0) {
                            DelegatableNodeKt.a(mutableVector, nodeB);
                        } else {
                            while (true) {
                                if (nodeB == null) {
                                    break;
                                }
                                if ((nodeB.f & 1024) != 0) {
                                    MutableVector mutableVector2 = null;
                                    while (nodeB != null) {
                                        if (nodeB instanceof FocusTargetNode) {
                                            FocusTargetNodeKt.b((FocusTargetNode) nodeB);
                                        } else if ((nodeB.f & 1024) != 0 && (nodeB instanceof DelegatingNode)) {
                                            int i4 = 0;
                                            for (Modifier.Node node3 = ((DelegatingNode) nodeB).s; node3 != null; node3 = node3.i) {
                                                if ((node3.f & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        nodeB = node3;
                                                    } else {
                                                        if (mutableVector2 == null) {
                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (nodeB != null) {
                                                            mutableVector2.c(nodeB);
                                                            nodeB = null;
                                                        }
                                                        mutableVector2.c(node3);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        nodeB = DelegatableNodeKt.b(mutableVector2);
                                    }
                                } else {
                                    nodeB = nodeB.i;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNodeKt.a((FocusEventModifierNode) node);
        }
    }

    public static final void c(Modifier.Node node) {
        if (!node.q) {
            InlineClassHelperKt.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(node, -1, 0);
    }

    public static final int d(Modifier.Element element) {
        int i = element instanceof LayoutModifier ? 3 : 1;
        if (element instanceof DrawModifier) {
            i |= 4;
        }
        if (element instanceof SemanticsModifier) {
            i |= 8;
        }
        if (element instanceof PointerInputModifier) {
            i |= 16;
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            i |= 32;
        }
        if (element instanceof FocusEventModifier) {
            i |= 4096;
        }
        if (element instanceof FocusOrderModifier) {
            i |= 2048;
        }
        if (element instanceof OnGloballyPositionedModifier) {
            i |= 256;
        }
        if (element instanceof ParentDataModifier) {
            i |= 64;
        }
        if ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) {
            i |= 128;
        }
        return element instanceof BringIntoViewModifierNode ? 524288 | i : i;
    }

    public static final int e(Modifier.Node node) {
        int i = node.f;
        if (i != 0) {
            return i;
        }
        Class<?> cls = node.getClass();
        MutableObjectIntMap mutableObjectIntMap = f1929a;
        int iA = mutableObjectIntMap.a(cls);
        if (iA >= 0) {
            return mutableObjectIntMap.c[iA];
        }
        int i2 = node instanceof LayoutModifierNode ? 3 : 1;
        if (node instanceof DrawModifierNode) {
            i2 |= 4;
        }
        if (node instanceof SemanticsModifierNode) {
            i2 |= 8;
        }
        if (node instanceof PointerInputModifierNode) {
            i2 |= 16;
        }
        if (node instanceof ModifierLocalModifierNode) {
            i2 |= 32;
        }
        if (node instanceof ParentDataModifierNode) {
            i2 |= 64;
        }
        if (node instanceof LayoutAwareModifierNode) {
            i2 |= 128;
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            i2 |= 256;
        }
        if (node instanceof ApproachLayoutModifierNode) {
            i2 |= 512;
        }
        if (node instanceof FocusTargetNode) {
            i2 |= 1024;
        }
        if (node instanceof FocusPropertiesModifierNode) {
            i2 |= 2048;
        }
        if (node instanceof FocusEventModifierNode) {
            i2 |= 4096;
        }
        if (node instanceof KeyInputModifierNode) {
            i2 |= 8192;
        }
        if (node instanceof RotaryInputModifierNode) {
            i2 |= 16384;
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            i2 |= 32768;
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            i2 |= 131072;
        }
        if (node instanceof TraversableNode) {
            i2 |= 262144;
        }
        if (node instanceof BringIntoViewModifierNode) {
            i2 |= 524288;
        }
        if (node instanceof OnUnplacedModifierNode) {
            i2 |= 1048576;
        }
        mutableObjectIntMap.h(i2, cls);
        return i2;
    }

    public static final int f(Modifier.Node node) {
        if (!(node instanceof DelegatingNode)) {
            return e(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int iF = delegatingNode.r;
        for (Modifier.Node node2 = delegatingNode.s; node2 != null; node2 = node2.i) {
            iF |= f(node2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return (i & 128) != 0;
    }
}
