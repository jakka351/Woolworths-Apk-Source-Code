package androidx.paging;

import androidx.paging.PagedList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/paging/AsyncPagedListDiffer$pagedListCallback$1", "Landroidx/paging/PagedList$Callback;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AsyncPagedListDiffer$pagedListCallback$1 extends PagedList.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AsyncPagedListDiffer f3526a;

    public AsyncPagedListDiffer$pagedListCallback$1(AsyncPagedListDiffer asyncPagedListDiffer) {
        this.f3526a = asyncPagedListDiffer;
    }

    @Override // androidx.paging.PagedList.Callback
    public final void a(int i, int i2) {
        this.f3526a.c().a(i, i2, null);
    }

    @Override // androidx.paging.PagedList.Callback
    public final void b(int i, int i2) {
        this.f3526a.c().d(i, i2);
    }

    @Override // androidx.paging.PagedList.Callback
    public final void c(int i, int i2) {
        this.f3526a.c().b(i, i2);
    }
}
