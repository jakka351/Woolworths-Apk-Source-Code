package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements Function2<FocusState, FocusState, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m((FocusState) obj, (FocusState) obj2);
        return Unit.f24250a;
    }

    public final void m(FocusState focusState, FocusState focusState2) {
        boolean zA;
        FocusedBoundsObserverNode focusedBoundsObserverNodeW2;
        FocusableNode focusableNode = (FocusableNode) this.receiver;
        if (focusableNode.q && (zA = focusState2.a()) != focusState.a()) {
            Function1 function1 = focusableNode.u;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(zA));
            }
            if (zA) {
                BuildersKt.c(focusableNode.g2(), null, null, new FocusableNode$onFocusStateChange$1(focusableNode, null), 3);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ObserverModifierNodeKt.a(focusableNode, new FocusableNode$retrievePinnableContainer$1(objectRef, focusableNode));
                PinnableContainer pinnableContainer = (PinnableContainer) objectRef.d;
                focusableNode.w = pinnableContainer != null ? pinnableContainer.a() : null;
                NodeCoordinator nodeCoordinator = focusableNode.x;
                if (nodeCoordinator != null && nodeCoordinator.j1().q && (focusedBoundsObserverNodeW2 = focusableNode.w2()) != null) {
                    focusedBoundsObserverNodeW2.s2(focusableNode.x);
                }
            } else {
                PinnableContainer.PinnedHandle pinnedHandle = focusableNode.w;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
                focusableNode.w = null;
                FocusedBoundsObserverNode focusedBoundsObserverNodeW22 = focusableNode.w2();
                if (focusedBoundsObserverNodeW22 != null) {
                    focusedBoundsObserverNodeW22.s2(null);
                }
            }
            SemanticsModifierNodeKt.a(focusableNode);
            MutableInteractionSource mutableInteractionSource = focusableNode.t;
            if (mutableInteractionSource != null) {
                if (!zA) {
                    FocusInteraction.Focus focus = focusableNode.v;
                    if (focus != null) {
                        focusableNode.v2(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                        focusableNode.v = null;
                        return;
                    }
                    return;
                }
                FocusInteraction.Focus focus2 = focusableNode.v;
                if (focus2 != null) {
                    focusableNode.v2(mutableInteractionSource, new FocusInteraction.Unfocus(focus2));
                    focusableNode.v = null;
                }
                FocusInteraction.Focus focus3 = new FocusInteraction.Focus();
                focusableNode.v2(mutableInteractionSource, focus3);
                focusableNode.v = focus3;
            }
        }
    }
}
