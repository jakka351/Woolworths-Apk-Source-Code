package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DraggableNode extends DragGestureNode {
    public DraggableState B;
    public Orientation C;
    public boolean D;
    public Function3 E;
    public Function3 F;
    public boolean G;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void A2(long j) {
        if (!this.q || Intrinsics.c(this.E, DraggableKt.f890a)) {
            return;
        }
        BuildersKt.c(g2(), null, CoroutineStart.g, new DraggableNode$onDragStarted$1(this, j, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void B2(long j) {
        if (!this.q || Intrinsics.c(this.F, DraggableKt.b)) {
            return;
        }
        BuildersKt.c(g2(), null, CoroutineStart.g, new DraggableNode$onDragStopped$1(this, j, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: C2, reason: from getter */
    public final boolean getD() {
        return this.D;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object z2(Function2 function2, Continuation continuation) {
        Object objA = this.B.a(MutatePriority.e, new DraggableNode$drag$2(function2, this, null), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
