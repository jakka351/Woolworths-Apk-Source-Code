package au.com.woolworths.pagingutils;

import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.pagingutils.PageKeyedPagingSource", f = "PageKeyedPagingSource.kt", l = {41}, m = "load")
/* loaded from: classes4.dex */
final class PageKeyedPagingSource$load$1 extends ContinuationImpl {
    public PagingSource.LoadParams p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PageKeyedPagingSource r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageKeyedPagingSource$load$1(PageKeyedPagingSource pageKeyedPagingSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = pageKeyedPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(null, this);
    }
}
