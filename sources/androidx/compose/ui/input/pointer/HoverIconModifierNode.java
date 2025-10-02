package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.Density;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public DpTouchBoundsExpansion r;
    public AndroidPointerIconType s;
    public boolean t;

    public HoverIconModifierNode(AndroidPointerIconType androidPointerIconType, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.r = dpTouchBoundsExpansion;
        this.s = androidPointerIconType;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        w2();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.e) {
            ?? r3 = pointerEvent.f1851a;
            int size = ((Collection) r3).size();
            for (int i = 0; i < size; i++) {
                if (v2(((PointerInputChange) r3.get(i)).i)) {
                    int i2 = pointerEvent.e;
                    if (i2 == 4) {
                        this.t = true;
                        u2();
                        return;
                    } else {
                        if (i2 == 5) {
                            w2();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        w2();
    }

    public final void s2() {
        AndroidPointerIconType androidPointerIconType;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.b(this, new HoverIconModifierNode$findOverridingAncestorNode$1(1));
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) objectRef.d;
        if (hoverIconModifierNode == null || (androidPointerIconType = hoverIconModifierNode.s) == null) {
            androidPointerIconType = this.s;
        }
        t2(androidPointerIconType);
    }

    public abstract void t2(PointerIcon pointerIcon);

    public final void u2() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.d = true;
        TraversableNodeKt.c(this, new Function1<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                if (!((HoverIconModifierNode) obj).t) {
                    return TraversableNode.Companion.TraverseDescendantsAction.d;
                }
                booleanRef.d = false;
                return TraversableNode.Companion.TraverseDescendantsAction.f;
            }
        });
        if (booleanRef.d) {
            s2();
        }
    }

    public abstract boolean v2(int i);

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final long w0() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.r;
        if (dpTouchBoundsExpansion == null) {
            return TouchBoundsExpansion.f1933a;
        }
        Density density = DelegatableNodeKt.g(this).D;
        int i = TouchBoundsExpansion.b;
        return TouchBoundsExpansion.Companion.c(density.r1(dpTouchBoundsExpansion.f1909a), density.r1(dpTouchBoundsExpansion.b), density.r1(dpTouchBoundsExpansion.c), density.r1(dpTouchBoundsExpansion.d));
    }

    public final void w2() {
        Unit unit;
        if (this.t) {
            this.t = false;
            if (this.q) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                TraversableNodeKt.b(this, new Function1<HoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) obj;
                        Ref.ObjectRef objectRef2 = objectRef;
                        Object obj2 = objectRef2.d;
                        if (obj2 == null && hoverIconModifierNode.t) {
                            objectRef2.d = hoverIconModifierNode;
                        } else if (obj2 != null) {
                            hoverIconModifierNode.getClass();
                        }
                        return Boolean.TRUE;
                    }
                });
                HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) objectRef.d;
                if (hoverIconModifierNode != null) {
                    hoverIconModifierNode.s2();
                    unit = Unit.f24250a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    t2(null);
                }
            }
        }
    }
}
