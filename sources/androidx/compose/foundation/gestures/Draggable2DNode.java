package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class Draggable2DNode extends DragGestureNode {
    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void A2(long j) {
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void B2(long j) {
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: C2 */
    public final boolean getD() {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object z2(Function2 function2, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.d;
        new Draggable2DNode$drag$2(function2, this, null);
        throw null;
    }
}
