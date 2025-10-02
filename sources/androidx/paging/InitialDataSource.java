package androidx.paging;

import androidx.paging.PageKeyedDataSource;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/InitialDataSource;", "", "K", "V", "Landroidx/paging/PageKeyedDataSource;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InitialDataSource<K, V> extends PageKeyedDataSource<K, V> {
    @Override // androidx.paging.PageKeyedDataSource
    public final void g(PageKeyedDataSource.LoadParams loadParams, PageKeyedDataSource.LoadCallback loadCallback) {
        loadCallback.a(null, EmptyList.d);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public final void h(PageKeyedDataSource.LoadParams loadParams, PageKeyedDataSource.LoadCallback loadCallback) {
        loadCallback.a(null, EmptyList.d);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public final void i(PageKeyedDataSource.LoadInitialParams loadInitialParams, PageKeyedDataSource.LoadInitialCallback loadInitialCallback) {
        loadInitialCallback.b(EmptyList.d);
    }
}
