package com.woolworths.scanlibrary.ui.productsearch.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PageKeyedDataSource;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.shop.cart.ui.cart.l;
import com.woolworths.scanlibrary.domain.login.c;
import com.woolworths.scanlibrary.domain.productsearch.ProductSearchUC;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.resource.ResourceResolver;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/datasource/PagedKeyProductSearchDataSource;", "Landroidx/paging/PageKeyedDataSource;", "", "Lcom/woolworths/scanlibrary/models/product/Item;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PagedKeyProductSearchDataSource extends PageKeyedDataSource<String, Item> {
    public final ProductSearchUC c;
    public final CompositeDisposable d;
    public final String e;
    public final ResourceResolver f;
    public final MutableLiveData g;
    public final MutableLiveData h;

    public PagedKeyProductSearchDataSource(ProductSearchUC productSearchUC, CompositeDisposable compositeDisposable, String searchTerm, ResourceResolver resourceResolver) {
        Intrinsics.h(productSearchUC, "productSearchUC");
        Intrinsics.h(compositeDisposable, "compositeDisposable");
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(resourceResolver, "resourceResolver");
        this.c = productSearchUC;
        this.d = compositeDisposable;
        this.e = searchTerm;
        this.f = resourceResolver;
        this.g = new MutableLiveData();
        this.h = new MutableLiveData();
    }

    @Override // androidx.paging.PageKeyedDataSource
    public final void g(PageKeyedDataSource.LoadParams loadParams, PageKeyedDataSource.LoadCallback loadCallback) {
        this.g.j(NetworkState.e);
        Object obj = loadParams.f3565a;
        if (((CharSequence) obj).length() == 0) {
            loadCallback.a(null, EmptyList.d);
            return;
        }
        Single singleB = this.c.b(new ProductSearchUC.RequestValues("", (String) obj));
        c cVar = new c(new l(27, this, loadCallback), 24);
        c cVar2 = new c(new a(this, loadParams, loadCallback, 0), 25);
        singleB.getClass();
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(cVar, cVar2);
        singleB.a(consumerSingleObserver);
        this.d.d(consumerSingleObserver);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public final void h(PageKeyedDataSource.LoadParams loadParams, PageKeyedDataSource.LoadCallback loadCallback) {
    }

    @Override // androidx.paging.PageKeyedDataSource
    public final void i(PageKeyedDataSource.LoadInitialParams loadInitialParams, PageKeyedDataSource.LoadInitialCallback loadInitialCallback) {
        NetworkState networkState = NetworkState.e;
        this.g.j(networkState);
        this.h.j(networkState);
        Single singleB = this.c.b(new ProductSearchUC.RequestValues(this.e, ""));
        c cVar = new c(new l(28, this, loadInitialCallback), 26);
        c cVar2 = new c(new a(this, loadInitialParams, loadInitialCallback, 1), 27);
        singleB.getClass();
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(cVar, cVar2);
        singleB.a(consumerSingleObserver);
        this.d.d(consumerSingleObserver);
    }
}
