package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View r;
    public ViewTreeObserver s;
    public final Function1 t = new Function1<FocusEnterExitScope, Unit>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            FocusEnterExitScope focusEnterExitScope = (FocusEnterExitScope) obj;
            FocusGroupPropertiesNode focusGroupPropertiesNode = this.h;
            View viewC = FocusGroupNode_androidKt.c(focusGroupPropertiesNode);
            if (!viewC.isFocused() && !viewC.hasFocus()) {
                if (!FocusInteropUtils_androidKt.b(viewC, FocusInteropUtils_androidKt.c(focusEnterExitScope.getF1743a()), FocusGroupNode_androidKt.b(DelegatableNodeKt.h(focusGroupPropertiesNode).getFocusOwner(), DelegatableNode_androidKt.a(focusGroupPropertiesNode), viewC))) {
                    focusEnterExitScope.a();
                }
            }
            return Unit.f24250a;
        }
    };
    public final Function1 u = new Function1<FocusEnterExitScope, Unit>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            FocusEnterExitScope focusEnterExitScope = (FocusEnterExitScope) obj;
            FocusGroupPropertiesNode focusGroupPropertiesNode = this.h;
            View viewC = FocusGroupNode_androidKt.c(focusGroupPropertiesNode);
            if (viewC.hasFocus()) {
                FocusOwner focusOwner = DelegatableNodeKt.h(focusGroupPropertiesNode).getFocusOwner();
                View viewA = DelegatableNode_androidKt.a(focusGroupPropertiesNode);
                if (viewC instanceof ViewGroup) {
                    Rect rectB = FocusGroupNode_androidKt.b(focusOwner, viewA, viewC);
                    Integer numC = FocusInteropUtils_androidKt.c(focusEnterExitScope.getF1743a());
                    int iIntValue = numC != null ? numC.intValue() : 130;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View view = focusGroupPropertiesNode.r;
                    View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewA, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectB, iIntValue);
                    if (viewFindNextFocus != null && FocusGroupNode_androidKt.a(viewC, viewFindNextFocus)) {
                        viewFindNextFocus.requestFocus(iIntValue, rectB);
                        focusEnterExitScope.a();
                    } else if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else if (!viewA.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
            }
            return Unit.f24250a;
        }
    };

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void E1(FocusProperties focusProperties) {
        focusProperties.a(false);
        focusProperties.b(this.t);
        focusProperties.d(this.u);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        ViewTreeObserver viewTreeObserver = DelegatableNode_androidKt.a(this).getViewTreeObserver();
        this.s = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        ViewTreeObserver viewTreeObserver = this.s;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.s = null;
        DelegatableNode_androidKt.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.r = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (DelegatableNodeKt.g(this).s == null) {
            return;
        }
        View viewC = FocusGroupNode_androidKt.c(this);
        FocusOwner focusOwner = DelegatableNodeKt.h(this).getFocusOwner();
        Owner ownerH = DelegatableNodeKt.h(this);
        boolean z = (view == null || view.equals(ownerH) || !FocusGroupNode_androidKt.a(viewC, view)) ? false : true;
        boolean z2 = (view2 == null || view2.equals(ownerH) || !FocusGroupNode_androidKt.a(viewC, view2)) ? false : true;
        if (z && z2) {
            this.r = view2;
            return;
        }
        if (z2) {
            this.r = view2;
            FocusTargetNode focusTargetNodeS2 = s2();
            if (focusTargetNodeS2.a1().b()) {
                return;
            }
            FocusTransactionsKt.e(focusTargetNodeS2);
            return;
        }
        if (!z) {
            this.r = null;
            return;
        }
        this.r = null;
        if (s2().a1().a()) {
            focusOwner.r(8, false, false);
        }
    }

    public final FocusTargetNode s2() {
        if (!this.d.q) {
            InlineClassHelperKt.b("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = this.d;
        if ((node.g & 1024) != 0) {
            boolean z = false;
            for (Modifier.Node node2 = node.i; node2 != null; node2 = node2.i) {
                if ((node2.f & 1024) != 0) {
                    Modifier.Node nodeB = node2;
                    MutableVector mutableVector = null;
                    while (nodeB != null) {
                        if (nodeB instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) nodeB;
                            if (z) {
                                return focusTargetNode;
                            }
                            z = true;
                        } else if ((nodeB.f & 1024) != 0 && (nodeB instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node node3 = ((DelegatingNode) nodeB).s; node3 != null; node3 = node3.i) {
                                if ((node3.f & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodeB = node3;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodeB != null) {
                                            mutableVector.c(nodeB);
                                            nodeB = null;
                                        }
                                        mutableVector.c(node3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        nodeB = DelegatableNodeKt.b(mutableVector);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }
}
