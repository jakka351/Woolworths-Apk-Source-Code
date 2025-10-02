package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {98}, m = "onPreFling-QWom1Mo")
/* loaded from: classes2.dex */
final class PullRefreshNestedScrollConnection$onPreFling$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ PullRefreshNestedScrollConnection q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = pullRefreshNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.J0(0L, this);
    }
}
