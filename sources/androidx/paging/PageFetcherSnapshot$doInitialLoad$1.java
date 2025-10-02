package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646, 284, 290, 667, 688, 326, 709, 730, 354}, m = "doInitialLoad")
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$doInitialLoad$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public Object r;
    public MutexImpl s;
    public /* synthetic */ Object t;
    public final /* synthetic */ PageFetcherSnapshot u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$doInitialLoad$1(PageFetcherSnapshot pageFetcherSnapshot, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.f(this);
    }
}
