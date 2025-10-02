package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/SnapshotPagedList;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagedList;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotPagedList<T> extends PagedList<T> {
    public final PagedList n;
    public final boolean o;
    public final boolean p;

    /* JADX WARN: Illegal instructions before constructor call */
    public SnapshotPagedList(PagedList pagedList) {
        PagingSource n = pagedList.getN();
        CoroutineScope coroutineScope = pagedList.e;
        CoroutineDispatcher coroutineDispatcher = pagedList.f;
        PagedStorage pagedStorage = pagedList.g;
        pagedStorage.getClass();
        super(n, coroutineScope, coroutineDispatcher, new PagedStorage(pagedStorage), pagedList.h);
        this.n = pagedList;
        this.o = true;
        this.p = true;
    }

    @Override // androidx.paging.PagedList
    public final void d(Function2 callback) {
        Intrinsics.h(callback, "callback");
    }

    @Override // androidx.paging.PagedList
    public final Object g() {
        return this.n.g();
    }

    @Override // androidx.paging.PagedList
    /* renamed from: i, reason: from getter */
    public final boolean getP() {
        return this.p;
    }

    @Override // androidx.paging.PagedList
    /* renamed from: j, reason: from getter */
    public final boolean getO() {
        return this.o;
    }

    @Override // androidx.paging.PagedList
    public final void l(int i) {
    }
}
