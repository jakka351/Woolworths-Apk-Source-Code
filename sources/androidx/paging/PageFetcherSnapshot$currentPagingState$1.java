package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646}, m = "currentPagingState")
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$currentPagingState$1 extends ContinuationImpl {
    public PageFetcherSnapshot p;
    public PageFetcherSnapshotState.Holder q;
    public MutexImpl r;
    public /* synthetic */ Object s;
    public final /* synthetic */ PageFetcherSnapshot t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$currentPagingState$1(PageFetcherSnapshot pageFetcherSnapshot, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.e(this);
    }
}
