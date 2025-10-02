package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {636, 641}, m = "scroll$suspendImpl")
/* loaded from: classes2.dex */
final class PagerState$scroll$1 extends ContinuationImpl {
    public PagerState p;
    public MutatePriority q;
    public SuspendLambda r;
    public /* synthetic */ Object s;
    public final /* synthetic */ PagerState t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scroll$1(PagerState pagerState, Continuation continuation) {
        super(continuation);
        this.t = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return PagerState.s(this.t, null, null, this);
    }
}
