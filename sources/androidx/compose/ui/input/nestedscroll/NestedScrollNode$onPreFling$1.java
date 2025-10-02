package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {96, 97}, m = "onPreFling-QWom1Mo")
/* loaded from: classes2.dex */
final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {
    public NestedScrollNode p;
    public long q;
    public /* synthetic */ Object r;
    public final /* synthetic */ NestedScrollNode s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.J0(0L, this);
    }
}
