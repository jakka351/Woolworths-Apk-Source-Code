package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/ClockDialNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ClockDialNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {
    public final SuspendingPointerInputModifierNode A;
    public AnalogTimePickerState t;
    public boolean u;
    public int v;
    public float w;
    public float x;
    public long y = 0;
    public final SuspendingPointerInputModifierNode z;

    public ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z, int i) {
        this.t = analogTimePickerState;
        this.u = z;
        this.v = i;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplB = SuspendingPointerInputFilterKt.b(new ClockDialNode$pointerInputTapNode$1(this, null));
        s2(suspendingPointerInputModifierNodeImplB);
        this.z = suspendingPointerInputModifierNodeImplB;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplB2 = SuspendingPointerInputFilterKt.b(new ClockDialNode$pointerInputDragNode$1(this, null));
        s2(suspendingPointerInputModifierNodeImplB2);
        this.A = suspendingPointerInputModifierNodeImplB2;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        this.z.D0();
        this.A.D0();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void G(long j) {
        this.y = IntSizeKt.b(j);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.z.f1(pointerEvent, pointerEventPass, j);
        this.A.f1(pointerEvent, pointerEventPass, j);
    }
}
