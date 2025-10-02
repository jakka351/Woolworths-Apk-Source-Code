package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {210}, m = "generateNewPagingSource")
/* loaded from: classes2.dex */
final class PageFetcher$generateNewPagingSource$1 extends ContinuationImpl {
    public PageFetcher p;
    public PagingSource q;
    public /* synthetic */ Object r;
    public final /* synthetic */ PageFetcher s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$generateNewPagingSource$1(PageFetcher pageFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = pageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return PageFetcher.a(this.s, null, this);
    }
}
