package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {327}, m = "onPreFling-QWom1Mo")
/* loaded from: classes2.dex */
final class PullToRefreshModifierNode$onPreFling$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ PullToRefreshModifierNode q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onPreFling$1(PullToRefreshModifierNode pullToRefreshModifierNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.J0(0L, this);
    }
}
