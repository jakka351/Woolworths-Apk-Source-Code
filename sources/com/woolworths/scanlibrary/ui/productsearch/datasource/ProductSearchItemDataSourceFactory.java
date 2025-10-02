package com.woolworths.scanlibrary.ui.productsearch.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import com.woolworths.scanlibrary.domain.productsearch.ProductSearchUC;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.resource.ResourceResolver;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/datasource/ProductSearchItemDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/woolworths/scanlibrary/models/product/Item;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductSearchItemDataSourceFactory extends DataSource.Factory<String, Item> {

    /* renamed from: a, reason: collision with root package name */
    public final ProductSearchUC f21300a;
    public final CompositeDisposable b;
    public final String c;
    public final ResourceResolver d;
    public final MutableLiveData e;

    public ProductSearchItemDataSourceFactory(ProductSearchUC productSearchUC, CompositeDisposable compositeDisposable, String searchTerm, ResourceResolverImpl resourceResolver) {
        Intrinsics.h(productSearchUC, "productSearchUC");
        Intrinsics.h(compositeDisposable, "compositeDisposable");
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(resourceResolver, "resourceResolver");
        this.f21300a = productSearchUC;
        this.b = compositeDisposable;
        this.c = searchTerm;
        this.d = resourceResolver;
        this.e = new MutableLiveData();
    }

    @Override // androidx.paging.DataSource.Factory
    public final DataSource a() {
        PagedKeyProductSearchDataSource pagedKeyProductSearchDataSource = new PagedKeyProductSearchDataSource(this.f21300a, this.b, this.c, this.d);
        this.e.j(pagedKeyProductSearchDataSource);
        return pagedKeyProductSearchDataSource;
    }
}
