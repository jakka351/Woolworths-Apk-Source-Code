package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", l = {251, 252}, m = "scroll")
/* loaded from: classes2.dex */
final class LazyStaggeredGridState$scroll$1 extends ContinuationImpl {
    public LazyStaggeredGridState p;
    public MutatePriority q;
    public SuspendLambda r;
    public /* synthetic */ Object s;
    public final /* synthetic */ LazyStaggeredGridState t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scroll$1(LazyStaggeredGridState lazyStaggeredGridState, Continuation continuation) {
        super(continuation);
        this.t = lazyStaggeredGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.e(null, null, this);
    }
}
