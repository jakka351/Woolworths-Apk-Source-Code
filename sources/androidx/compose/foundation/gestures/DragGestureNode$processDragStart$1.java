package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {534, 537}, m = "processDragStart")
/* loaded from: classes2.dex */
final class DragGestureNode$processDragStart$1 extends ContinuationImpl {
    public DragGestureNode p;
    public DragEvent.DragStarted q;
    public DragInteraction.Start r;
    public /* synthetic */ Object s;
    public final /* synthetic */ DragGestureNode t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStart$1(DragGestureNode dragGestureNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return DragGestureNode.w2(this.t, null, this);
    }
}
