package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/WrapperItemKeyedDataSource;", "", "K", "A", "B", "Landroidx/paging/ItemKeyedDataSource;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WrapperItemKeyedDataSource<K, A, B> extends ItemKeyedDataSource<K, B> {
    @Override // androidx.paging.DataSource
    public final void a(DataSource.InvalidatedCallback invalidatedCallback) {
        throw null;
    }

    @Override // androidx.paging.DataSource
    public final void c() {
        throw null;
    }

    @Override // androidx.paging.DataSource
    public final boolean d() {
        throw null;
    }

    @Override // androidx.paging.DataSource
    public final void f(DataSource.InvalidatedCallback invalidatedCallback) {
        throw null;
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public final Object g(Object item) {
        Intrinsics.h(item, "item");
        throw null;
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public final void h(ItemKeyedDataSource.LoadParams loadParams, ItemKeyedDataSource.LoadCallback loadCallback) {
        throw null;
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public final void i(ItemKeyedDataSource.LoadParams loadParams, ItemKeyedDataSource.LoadCallback loadCallback) {
        throw null;
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public final void j(ItemKeyedDataSource.LoadInitialParams loadInitialParams, ItemKeyedDataSource.LoadInitialCallback loadInitialCallback) {
        throw null;
    }
}
