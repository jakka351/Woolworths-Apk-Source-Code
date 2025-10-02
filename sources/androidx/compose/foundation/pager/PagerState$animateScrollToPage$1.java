package androidx.compose.foundation.pager;

import androidx.compose.animation.core.SpringSpec;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {610, 617}, m = "animateScrollToPage")
/* loaded from: classes2.dex */
final class PagerState$animateScrollToPage$1 extends ContinuationImpl {
    public PagerState p;
    public SpringSpec q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ PagerState t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$1(PagerState pagerState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.f(0, null, this);
    }
}
