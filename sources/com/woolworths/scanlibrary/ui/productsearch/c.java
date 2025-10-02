package com.woolworths.scanlibrary.ui.productsearch;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.paging.LivePagedList;
import androidx.paging.LivePagedListBuilder;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.domain.productsearch.AutoCompleteUC;
import com.woolworths.scanlibrary.models.product.search.AutoCompleteRequest;
import com.woolworths.scanlibrary.ui.productsearch.datasource.ProductSearchItemDataSourceFactory;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableFlattenIterable;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.internal.operators.observable.ObservableOnErrorReturn;
import io.reactivex.internal.operators.observable.ObservableToListSingle;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SearchViewModel e;

    public /* synthetic */ c(SearchViewModel searchViewModel, int i) {
        this.d = i;
        this.e = searchViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.d) {
            case 0:
                if (it == null || it.length() == 0) {
                    return null;
                }
                SearchViewModel searchViewModel = this.e;
                ProductSearchItemDataSourceFactory productSearchItemDataSourceFactory = new ProductSearchItemDataSourceFactory(searchViewModel.h, searchViewModel.e, it, searchViewModel.k);
                searchViewModel.m = productSearchItemDataSourceFactory;
                LivePagedListBuilder livePagedListBuilder = new LivePagedListBuilder(productSearchItemDataSourceFactory, searchViewModel.u);
                ExecutorService NETWORK_IO = searchViewModel.n;
                Intrinsics.g(NETWORK_IO, "NETWORK_IO");
                livePagedListBuilder.d = ExecutorsKt.a(NETWORK_IO);
                LivePagedList livePagedListA = livePagedListBuilder.a();
                ProductSearchItemDataSourceFactory productSearchItemDataSourceFactory2 = searchViewModel.m;
                if (productSearchItemDataSourceFactory2 == null) {
                    Intrinsics.p("sourceFactory");
                    throw null;
                }
                MediatorLiveData mediatorLiveDataC = Transformations.c(productSearchItemDataSourceFactory2.e, new com.woolworths.scanlibrary.domain.productsearch.a(15));
                ProductSearchItemDataSourceFactory productSearchItemDataSourceFactory3 = searchViewModel.m;
                if (productSearchItemDataSourceFactory3 != null) {
                    return new NumericPageListing(livePagedListA, mediatorLiveDataC, Transformations.c(productSearchItemDataSourceFactory3.e, new com.woolworths.scanlibrary.domain.productsearch.a(16)), null, new MutableLiveData(), new MutableLiveData());
                }
                Intrinsics.p("sourceFactory");
                throw null;
            default:
                Intrinsics.h(it, "it");
                AutoCompleteUC autoCompleteUC = this.e.i;
                AutoCompleteUC.RequestValues requestValues = new AutoCompleteUC.RequestValues(it);
                autoCompleteUC.getClass();
                ScanNGoRepository scanNGoRepository = autoCompleteUC.b;
                ObservableMap observableMap = new ObservableMap(new ObservableFlattenIterable(new ObservableMap(new ObservableOnErrorReturn(scanNGoRepository.f21149a.f21163a.S(new AutoCompleteRequest(it).getSearchTerm()).i(scanNGoRepository.b), new com.woolworths.scanlibrary.domain.login.c(new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(28), 5)), new com.woolworths.scanlibrary.domain.login.c(new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(29), 6)), new com.woolworths.scanlibrary.domain.login.c(new com.woolworths.scanlibrary.domain.productsearch.a(0), 7)), new com.woolworths.scanlibrary.domain.login.c(new com.woolworths.scanlibrary.domain.productsearch.a(1), 8));
                ObjectHelper.c(16, "capacityHint");
                return new ObservableToListSingle(observableMap).i().c(new com.woolworths.scanlibrary.domain.login.c(new i(requestValues, 18), 9), Integer.MAX_VALUE).i(autoCompleteUC.f21140a);
        }
    }
}
