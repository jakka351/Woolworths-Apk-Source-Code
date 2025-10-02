package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {544}, m = "processDragStop")
/* loaded from: classes2.dex */
final class DragGestureNode$processDragStop$1 extends ContinuationImpl {
    public DragGestureNode p;
    public DragEvent.DragStopped q;
    public /* synthetic */ Object r;
    public final /* synthetic */ DragGestureNode s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStop$1(DragGestureNode dragGestureNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return DragGestureNode.x2(this.s, null, this);
    }
}
