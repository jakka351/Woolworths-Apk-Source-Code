package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {782}, m = "doFlingAnimation-QWom1Mo")
/* loaded from: classes2.dex */
final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {
    public ScrollingLogic p;
    public Ref.LongRef q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ScrollingLogic s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(0L, this);
    }
}
