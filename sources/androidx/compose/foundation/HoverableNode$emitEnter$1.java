package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {106}, m = "emitEnter")
/* loaded from: classes2.dex */
final class HoverableNode$emitEnter$1 extends ContinuationImpl {
    public Object p;
    public HoverInteraction.Enter q;
    public /* synthetic */ Object r;
    public final /* synthetic */ HoverableNode s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitEnter$1(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return HoverableNode.s2(this.s, this);
    }
}
