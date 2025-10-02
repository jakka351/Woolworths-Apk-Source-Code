package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/Pager;", "", "Key", "Value", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Pager<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    public final Flow f3571a;

    public Pager(PagingConfig pagingConfig, Function0 function0) {
        this.f3571a = new PageFetcher(function0 instanceof SuspendingPagingSourceFactory ? new Pager$flow$1(1, function0, SuspendingPagingSourceFactory.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0) : new Pager$flow$2(function0, null), pagingConfig).e;
    }
}
