package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {103, 113}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes2.dex */
final class NestedScrollNode$onPostFling$1 extends ContinuationImpl {
    public NestedScrollNode p;
    public long q;
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ NestedScrollNode t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.V(0L, 0L, this);
    }
}
