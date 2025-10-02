package androidx.paging;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.paging.PagedList;
import com.woolworths.scanlibrary.ui.productsearch.datasource.ProductSearchItemDataSourceFactory;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/LivePagedListBuilder;", "", "Key", "Value", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LivePagedListBuilder<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f3545a;
    public final ProductSearchItemDataSourceFactory b;
    public final PagedList.Config c;
    public CoroutineDispatcher d;

    public LivePagedListBuilder(ProductSearchItemDataSourceFactory productSearchItemDataSourceFactory, PagedList.Config config) {
        Intrinsics.h(config, "config");
        this.d = ExecutorsKt.a(ArchTaskExecutor.d);
        this.f3545a = null;
        this.b = productSearchItemDataSourceFactory;
        this.c = config;
    }

    public final LivePagedList a() {
        Function0 suspendingPagingSourceFactory = this.f3545a;
        if (suspendingPagingSourceFactory == null) {
            final ProductSearchItemDataSourceFactory productSearchItemDataSourceFactory = this.b;
            if (productSearchItemDataSourceFactory != null) {
                final CoroutineDispatcher fetchDispatcher = this.d;
                Intrinsics.h(fetchDispatcher, "fetchDispatcher");
                suspendingPagingSourceFactory = new SuspendingPagingSourceFactory(fetchDispatcher, new Function0<PagingSource<Object, Object>>() { // from class: androidx.paging.DataSource$Factory$asPagingSourceFactory$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new LegacyPagingSource(fetchDispatcher, productSearchItemDataSourceFactory.a());
                    }
                });
            } else {
                suspendingPagingSourceFactory = null;
            }
        }
        if (suspendingPagingSourceFactory == null) {
            throw new IllegalStateException("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory");
        }
        return new LivePagedList(this.c, suspendingPagingSourceFactory, ExecutorsKt.a(ArchTaskExecutor.c), this.d);
    }

    public LivePagedListBuilder(Function0 function0, PagedList.Config config) {
        Intrinsics.h(config, "config");
        this.d = ExecutorsKt.a(ArchTaskExecutor.d);
        this.f3545a = function0;
        this.b = null;
        this.c = config;
    }
}
