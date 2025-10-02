package androidx.paging;

import androidx.camera.camera2.interop.d;
import androidx.lifecycle.LiveData;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004¨\u0006\u0006"}, d2 = {"Landroidx/paging/LivePagedList;", "", "Key", "Value", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LivePagedList<Key, Value> extends LiveData<PagedList<Value>> {
    public final GlobalScope l;
    public final PagedList.Config m;
    public final Function0 n;
    public final CoroutineDispatcher o;
    public final CoroutineDispatcher p;
    public PagedList q;
    public Job r;
    public final Function0 s;
    public final d t;

    public LivePagedList(PagedList.Config config, Function0 pagingSourceFactory, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher fetchDispatcher) {
        Intrinsics.h(config, "config");
        Intrinsics.h(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.h(fetchDispatcher, "fetchDispatcher");
        LegacyPagingSource legacyPagingSource = new LegacyPagingSource(coroutineDispatcher, new InitialDataSource());
        PagingSource.LoadResult.Page page = PagingSource.LoadResult.Page.i;
        Intrinsics.f(page, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
        GlobalScope globalScope = GlobalScope.d;
        super(new InitialPagedList(legacyPagingSource, globalScope, coroutineDispatcher, fetchDispatcher, config, page, null));
        this.l = globalScope;
        this.m = config;
        this.n = pagingSourceFactory;
        this.o = coroutineDispatcher;
        this.p = fetchDispatcher;
        this.s = new Function0<Unit>() { // from class: androidx.paging.LivePagedList$callback$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.h.n(true);
                return Unit.f24250a;
            }
        };
        d dVar = new d(this, 12);
        this.t = dVar;
        Object objE = e();
        Intrinsics.e(objE);
        PagedList pagedList = (PagedList) objE;
        this.q = pagedList;
        pagedList.i = dVar;
    }

    @Override // androidx.lifecycle.LiveData
    public final void h() {
        n(false);
    }

    public final void n(boolean z) {
        Job job = this.r;
        if (job == null || z) {
            if (job != null) {
                ((JobSupport) job).cancel((CancellationException) null);
            }
            this.r = BuildersKt.c(this.l, this.p, null, new LivePagedList$invalidate$1(this, null), 2);
        }
    }
}
