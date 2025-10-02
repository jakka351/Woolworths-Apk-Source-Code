package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {525}, m = "anchoredDrag")
/* loaded from: classes2.dex */
final class AnchoredDraggableState$anchoredDrag$1 extends ContinuationImpl {
    public AnchoredDraggableState p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AnchoredDraggableState r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$1(AnchoredDraggableState anchoredDraggableState, Continuation continuation) {
        super(continuation);
        this.r = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, this);
    }
}
