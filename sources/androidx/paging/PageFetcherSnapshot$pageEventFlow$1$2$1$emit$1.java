package androidx.paging;

import androidx.paging.PageFetcherSnapshot$pageEventFlow$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", l = {95}, m = "emit")
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2.AnonymousClass1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.q = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.emit(null, this);
    }
}
