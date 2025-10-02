package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {
    public static final TraverseKey A = new TraverseKey();
    public MutableInteractionSource t;
    public final Function1 u;
    public FocusInteraction.Focus v;
    public PinnableContainer.PinnedHandle w;
    public NodeCoordinator x;
    public final FocusTargetModifierNode y;
    public Function0 z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/FocusableNode$TraverseKey;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TraverseKey {
    }

    public FocusableNode(MutableInteractionSource mutableInteractionSource, int i, Function1 function1) {
        this.t = mutableInteractionSource;
        this.u = function1;
        FocusTargetNode focusTargetNode = new FocusTargetNode(i, 4, new FocusableNode$focusTargetNode$1(2, this, FocusableNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0));
        s2(focusTargetNode);
        this.y = focusTargetNode;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void Q(NodeCoordinator nodeCoordinator) {
        FocusedBoundsObserverNode focusedBoundsObserverNodeW2;
        this.x = nodeCoordinator;
        if (this.y.a1().a()) {
            if (!nodeCoordinator.j1().q) {
                FocusedBoundsObserverNode focusedBoundsObserverNodeW22 = w2();
                if (focusedBoundsObserverNodeW22 != null) {
                    focusedBoundsObserverNodeW22.s2(null);
                    return;
                }
                return;
            }
            NodeCoordinator nodeCoordinator2 = this.x;
            if (nodeCoordinator2 == null || !nodeCoordinator2.j1().q || (focusedBoundsObserverNodeW2 = w2()) == null) {
                return;
            }
            focusedBoundsObserverNodeW2.s2(this.x);
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* renamed from: W0 */
    public final Object getT() {
        return A;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        boolean zA = this.y.a1().a();
        KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.k;
        KProperty kProperty = SemanticsPropertiesKt.f2022a[4];
        Boolean boolValueOf = Boolean.valueOf(zA);
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, boolValueOf);
        if (this.z == null) {
            this.z = new Function0<Boolean>() { // from class: androidx.compose.foundation.FocusableNode$applySemantics$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(this.h.y.T0(7));
                }
            };
        }
        semanticsPropertyReceiver.b(SemanticsActions.v, new AccessibilityAction(null, this.z));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void m2() {
        PinnableContainer.PinnedHandle pinnedHandle = this.w;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.w = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void o1() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ObserverModifierNodeKt.a(this, new FocusableNode$retrievePinnableContainer$1(objectRef, this));
        PinnableContainer pinnableContainer = (PinnableContainer) objectRef.d;
        if (this.y.a1().a()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.w;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.w = pinnableContainer != null ? pinnableContainer.a() : null;
        }
    }

    public final void v2(final MutableInteractionSource mutableInteractionSource, final FocusInteraction focusInteraction) {
        if (!this.q) {
            mutableInteractionSource.a(focusInteraction);
        } else {
            Job job = (Job) ((ContextScope) g2()).d.get(Job.Key.d);
            BuildersKt.c(g2(), null, null, new FocusableNode$emitWithFallback$1(mutableInteractionSource, focusInteraction, job != null ? job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.FocusableNode$emitWithFallback$handler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    mutableInteractionSource.a(focusInteraction);
                    return Unit.f24250a;
                }
            }) : null, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    public final FocusedBoundsObserverNode w2() {
        TraversableNode traversableNode;
        NodeChain nodeChain;
        if (this.q) {
            if (!this.d.q) {
                InlineClassHelperKt.b("visitAncestors called on an unattached node");
            }
            Modifier.Node node = this.d.h;
            LayoutNode layoutNodeG = DelegatableNodeKt.g(this);
            loop0: while (true) {
                if (layoutNodeG == null) {
                    traversableNode = null;
                    break;
                }
                if ((layoutNodeG.K.e.g & 262144) != 0) {
                    while (node != null) {
                        if ((node.f & 262144) != 0) {
                            DelegatingNode delegatingNodeB = node;
                            ?? mutableVector = 0;
                            while (delegatingNodeB != 0) {
                                if (delegatingNodeB instanceof TraversableNode) {
                                    traversableNode = (TraversableNode) delegatingNodeB;
                                    if (FocusedBoundsObserverNode.s.equals(traversableNode.getT())) {
                                        break loop0;
                                    }
                                } else if ((delegatingNodeB.f & 262144) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                    Modifier.Node node2 = delegatingNodeB.s;
                                    int i = 0;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector = mutableVector;
                                    while (node2 != null) {
                                        if ((node2.f & 262144) != 0) {
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
            if (traversableNode instanceof FocusedBoundsObserverNode) {
                return (FocusedBoundsObserverNode) traversableNode;
            }
        }
        return null;
    }

    public final void x2(MutableInteractionSource mutableInteractionSource) {
        FocusInteraction.Focus focus;
        if (Intrinsics.c(this.t, mutableInteractionSource)) {
            return;
        }
        MutableInteractionSource mutableInteractionSource2 = this.t;
        if (mutableInteractionSource2 != null && (focus = this.v) != null) {
            mutableInteractionSource2.a(new FocusInteraction.Unfocus(focus));
        }
        this.v = null;
        this.t = mutableInteractionSource;
    }
}
