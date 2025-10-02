package com.woolworths.scanlibrary.ui.productsearch;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.paging.PagedList;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ClickedProductSearch;
import com.woolworths.scanlibrary.base.mvvm.ApiDisposableObserver;
import com.woolworths.scanlibrary.base.mvvm.BaseViewModel;
import com.woolworths.scanlibrary.domain.productsearch.AutoCompleteUC;
import com.woolworths.scanlibrary.domain.productsearch.ProductSearchUC;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.ui.productsearch.datasource.ProductSearchItemDataSourceFactory;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/SearchViewModel;", "Lcom/woolworths/scanlibrary/base/mvvm/BaseViewModel;", "ProductSearchAutoSuggestObserver", "LiveDataHolder", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchViewModel extends BaseViewModel {
    public final ProductSearchUC h;
    public final AutoCompleteUC i;
    public final AnalyticsProvider j;
    public final ResourceResolverImpl k;
    public final PublishSubject l;
    public ProductSearchItemDataSourceFactory m;
    public final ExecutorService n;
    public final LiveDataHolder o;
    public final MutableLiveData p;
    public final MediatorLiveData q;
    public final MediatorLiveData r;
    public final MediatorLiveData s;
    public final MediatorLiveData t;
    public final PagedList.Config u;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/SearchViewModel$Companion;", "", "", "pageSize", "I", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/SearchViewModel$LiveDataHolder;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class LiveDataHolder {

        /* renamed from: a, reason: collision with root package name */
        public final MutableLiveData f21299a;

        public LiveDataHolder() {
            MutableLiveData mutableLiveData = new MutableLiveData();
            mutableLiveData.m(new Pair("", new ArrayList()));
            this.f21299a = mutableLiveData;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\b\u0082\u0004\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/SearchViewModel$ProductSearchAutoSuggestObserver;", "Lcom/woolworths/scanlibrary/base/mvvm/ApiDisposableObserver;", "Lkotlin/Pair;", "", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ProductSearchAutoSuggestObserver extends ApiDisposableObserver<Pair<? extends String, ? extends List<? extends String>>> {
        public ProductSearchAutoSuggestObserver() {
            super(SearchViewModel.this.f);
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiDisposableObserver
        public final void a(int i, ApigeeErrorResponse apigeeErrorResponse, int i2) {
            if (i != 404 && i != 500) {
                super.a(i, apigeeErrorResponse, i2);
                return;
            }
            LiveDataHolder liveDataHolder = SearchViewModel.this.o;
            Pair pair = new Pair("", new ArrayList());
            liveDataHolder.getClass();
            SearchViewModel.this.o.f21299a.j(pair);
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiDisposableObserver, io.reactivex.Observer
        public final void onNext(Object obj) {
            Pair data = (Pair) obj;
            Intrinsics.h(data, "data");
            LiveDataHolder liveDataHolder = SearchViewModel.this.o;
            liveDataHolder.getClass();
            SearchViewModel.this.o.f21299a.j(data);
        }
    }

    public SearchViewModel(ProductSearchUC productSearchUC, AutoCompleteUC autoCompleteUC, AnalyticsProvider analyticsAggregator, ResourceResolverImpl resourceResolverImpl) {
        Intrinsics.h(productSearchUC, "productSearchUC");
        Intrinsics.h(autoCompleteUC, "autoCompleteUC");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.h = productSearchUC;
        this.i = autoCompleteUC;
        this.j = analyticsAggregator;
        this.k = resourceResolverImpl;
        PublishSubject publishSubject = new PublishSubject();
        this.l = publishSubject;
        this.n = Executors.newFixedThreadPool(5);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Scheduler scheduler = Schedulers.b;
        ObjectHelper.b(timeUnit, "unit is null");
        ObjectHelper.b(scheduler, "scheduler is null");
        new ObservableMap(new ObservableDistinctUntilChanged(new ObservableDebounceTimed(publishSubject, 300L, scheduler)).j(new com.woolworths.scanlibrary.domain.login.c(new c(this, 1), 22)), new com.woolworths.scanlibrary.domain.login.c(new com.woolworths.scanlibrary.domain.productsearch.a(17), 23)).f(AndroidSchedulers.a()).a(new ProductSearchAutoSuggestObserver());
        this.o = new LiveDataHolder();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.p = mutableLiveData;
        MediatorLiveData mediatorLiveDataB = Transformations.b(mutableLiveData, new c(this, 0));
        this.q = mediatorLiveDataB;
        this.r = Transformations.c(mediatorLiveDataB, new com.woolworths.scanlibrary.domain.productsearch.a(12));
        this.s = Transformations.c(mediatorLiveDataB, new com.woolworths.scanlibrary.domain.productsearch.a(13));
        this.t = Transformations.c(mediatorLiveDataB, new com.woolworths.scanlibrary.domain.productsearch.a(14));
        PagedList.Config.Builder builder = new PagedList.Config.Builder();
        builder.d = false;
        builder.c = 40;
        builder.b(20);
        this.u = builder.a();
    }

    public final void r6(String query) {
        Intrinsics.h(query, "query");
        MutableLiveData mutableLiveData = this.p;
        if (Intrinsics.c(mutableLiveData.e(), query)) {
            return;
        }
        mutableLiveData.m(query);
        ClickedProductSearch clickedProductSearch = new ClickedProductSearch("Product Search");
        clickedProductSearch.a("product.search.item.key", query);
        this.j.b(clickedProductSearch);
    }
}
