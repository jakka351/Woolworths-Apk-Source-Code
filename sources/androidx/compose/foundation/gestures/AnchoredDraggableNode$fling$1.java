package androidx.compose.foundation.gestures;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", l = {455, 458}, m = "fling")
/* loaded from: classes2.dex */
final class AnchoredDraggableNode$fling$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ AnchoredDraggableNode q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$1(AnchoredDraggableNode anchoredDraggableNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = anchoredDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return AnchoredDraggableNode.E2(this.q, BitmapDescriptorFactory.HUE_RED, this);
    }
}
