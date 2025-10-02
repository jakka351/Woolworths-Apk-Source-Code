package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {400}, m = "animateToThreshold")
/* loaded from: classes2.dex */
final class PullToRefreshModifierNode$animateToThreshold$1 extends ContinuationImpl {
    public PullToRefreshModifierNode p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PullToRefreshModifierNode r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$animateToThreshold$1(PullToRefreshModifierNode pullToRefreshModifierNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.w2(this);
    }
}
