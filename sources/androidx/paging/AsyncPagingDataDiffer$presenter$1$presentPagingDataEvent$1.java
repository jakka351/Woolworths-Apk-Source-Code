package androidx.paging;

import androidx.paging.PagingDataEvent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1", f = "AsyncPagingDataDiffer.kt", l = {183}, m = "presentPagingDataEvent")
/* loaded from: classes2.dex */
final class AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 extends ContinuationImpl {
    public AsyncPagingDataDiffer$presenter$1 p;
    public AsyncPagingDataDiffer q;
    public PagingDataEvent.Refresh r;
    public /* synthetic */ Object s;
    public final /* synthetic */ AsyncPagingDataDiffer$presenter$1 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1(AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = asyncPagingDataDiffer$presenter$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.d(null, this);
    }
}
