package au.com.woolworths.feature.product.list.legacy;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.state.ToggleableState;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.paging.LivePagedList;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.data.FilterOptionsManager;
import au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch;
import au.com.woolworths.feature.product.list.legacy.data.ProductListChip;
import au.com.woolworths.feature.product.list.legacy.data.ProductListData;
import au.com.woolworths.feature.product.list.legacy.data.ProductListOptions;
import au.com.woolworths.feature.product.list.legacy.data.SortOption;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOption;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOptionKt;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetRepository;
import au.com.woolworths.pagingutils.NumericPageKeyedPagingSourceFactory;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import au.com.woolworths.product.interactor.ProductsInteractor;
import au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater;
import au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs;
import au.com.woolworths.shop.graphql.type.RewardsOfferStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListInteractor;", "", "ProductFetchRequestModel", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ProductsListRepository f5328a;
    public final ProductsInteractor b;
    public final RepositoryManager c;
    public final GoogleAdManagerInteractor d;
    public final TrolleyInteractor e;
    public final EducationBottomSheetRepository f;
    public final FirebasePerfMonitor g;
    public NumericPageKeyedPagingSourceFactory h;
    public int i;
    public Integer j;
    public final MutableLiveData k;
    public List l;
    public List m;
    public final MutableStateFlow n;
    public final MutableStateFlow o;
    public final SharedFlowImpl p;
    public List q;
    public final FilterOptionsManager r;
    public final PagedList.Config s;
    public BottomSheetContent.Marketplace t;
    public InfoSection u;
    public final ProductFetchRequestModel[] v;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListInteractor$Companion;", "", "", "PRODUCT_PAGING_LOAD_SIZE", "I", "PRODUCT_PAGING_PRELOAD_SIZE", "", "FOR_YOU_FILTER_CHIP_ID", "Ljava/lang/String;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListInteractor$ProductFetchRequestModel;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductFetchRequestModel {

        /* renamed from: a, reason: collision with root package name */
        public final Activities.ProductList.Extras f5329a;
        public final Boolean b;
        public final List c;
        public final Map d;
        public final List e;
        public final List f;

        public ProductFetchRequestModel(Activities.ProductList.Extras extras, Boolean bool, List list, Map map, List list2, List list3) {
            Intrinsics.h(extras, "extras");
            this.f5329a = extras;
            this.b = bool;
            this.c = list;
            this.d = map;
            this.e = list2;
            this.f = list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductFetchRequestModel)) {
                return false;
            }
            ProductFetchRequestModel productFetchRequestModel = (ProductFetchRequestModel) obj;
            return Intrinsics.c(this.f5329a, productFetchRequestModel.f5329a) && Intrinsics.c(this.b, productFetchRequestModel.b) && Intrinsics.c(this.c, productFetchRequestModel.c) && Intrinsics.c(this.d, productFetchRequestModel.d) && Intrinsics.c(this.e, productFetchRequestModel.e) && Intrinsics.c(this.f, productFetchRequestModel.f);
        }

        public final int hashCode() {
            int iHashCode = this.f5329a.hashCode() * 31;
            Boolean bool = this.b;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            List list = this.c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Map map = this.d;
            int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            List list2 = this.e;
            int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.f;
            return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
        }

        public final String toString() {
            return "ProductFetchRequestModel(extras=" + this.f5329a + ", isMarketplaceChecked=" + this.b + ", sortList=" + this.c + ", appliedFilters=" + this.d + ", chips=" + this.e + ", facetChips=" + this.f + ")";
        }
    }

    public ProductListInteractor(ProductsListRepository productsListRepository, ProductsInteractor productsInteractor, RepositoryManager repositoryManager, GoogleAdManagerInteractor googleAdManagerInteractor, TrolleyInteractor trolleyInteractor, EducationBottomSheetRepository educationBottomSheetRepository, FirebasePerfMonitor firebasePerfMonitor) {
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        this.f5328a = productsListRepository;
        this.b = productsInteractor;
        this.c = repositoryManager;
        this.d = googleAdManagerInteractor;
        this.e = trolleyInteractor;
        this.f = educationBottomSheetRepository;
        this.g = firebasePerfMonitor;
        this.k = new MutableLiveData();
        EmptyList emptyList = EmptyList.d;
        this.l = emptyList;
        this.m = emptyList;
        this.n = StateFlowKt.a(new ProductListContract.ProductListFlow(null, emptyList, emptyList, null, null, new ProductListContract.ProductListFilterState(0, false), emptyList));
        this.o = StateFlowKt.a(null);
        this.p = SharedFlowKt.b(0, 2, BufferOverflow.e, 1);
        FilterOptionsManager filterOptionsManager = new FilterOptionsManager();
        filterOptionsManager.c = emptyList;
        this.r = filterOptionsManager;
        PagedList.Config.Builder builder = new PagedList.Config.Builder();
        builder.d = false;
        builder.b = 10;
        builder.c = 50;
        builder.b(50);
        this.s = builder.a();
        this.v = new ProductFetchRequestModel[2];
    }

    public static void E(MutableStateFlow mutableStateFlow, List updatedFilters, List updatedSortOptions, List originalSortOptions, ProductFilterSwitch productFilterSwitch, int i, InsetBannerData insetBannerData) {
        Intrinsics.h(mutableStateFlow, "<this>");
        Intrinsics.h(updatedFilters, "updatedFilters");
        Intrinsics.h(updatedSortOptions, "updatedSortOptions");
        Intrinsics.h(originalSortOptions, "originalSortOptions");
        mutableStateFlow.setValue(new ProductListOptions(updatedFilters, updatedSortOptions, originalSortOptions, insetBannerData, productFilterSwitch, i));
    }

    public static void F(ProductListInteractor productListInteractor, MutableStateFlow mutableStateFlow, ArrayList arrayList, List list, List list2, ProductFilterSwitch productFilterSwitch, int i, InsetBannerData insetBannerData, int i2) {
        List list3;
        List list4;
        ProductFilterSwitch productFilterSwitch2;
        int i3;
        List list5;
        int i4 = i2 & 1;
        List list6 = EmptyList.d;
        if (i4 != 0) {
            ProductListOptions productListOptions = (ProductListOptions) productListInteractor.o.getValue();
            if (productListOptions == null || (list3 = productListOptions.d) == null) {
                list3 = list6;
            }
        } else {
            list3 = arrayList;
        }
        if ((i2 & 2) != 0) {
            ProductListOptions productListOptions2 = (ProductListOptions) productListInteractor.o.getValue();
            if (productListOptions2 == null || (list4 = productListOptions2.e) == null) {
                list4 = list6;
            }
        } else {
            list4 = list;
        }
        if ((i2 & 4) != 0) {
            ProductListOptions productListOptions3 = (ProductListOptions) productListInteractor.o.getValue();
            if (productListOptions3 != null && (list5 = productListOptions3.f) != null) {
                list6 = list5;
            }
        } else {
            list6 = list2;
        }
        InsetBannerData insetBannerData2 = null;
        if ((i2 & 8) != 0) {
            ProductListOptions productListOptions4 = (ProductListOptions) productListInteractor.o.getValue();
            productFilterSwitch2 = productListOptions4 != null ? productListOptions4.h : null;
        } else {
            productFilterSwitch2 = productFilterSwitch;
        }
        if ((i2 & 16) != 0) {
            ProductListOptions productListOptions5 = (ProductListOptions) productListInteractor.o.getValue();
            i3 = productListOptions5 != null ? productListOptions5.i : 0;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            ProductListOptions productListOptions6 = (ProductListOptions) productListInteractor.o.getValue();
            if (productListOptions6 != null) {
                insetBannerData2 = productListOptions6.g;
            }
        } else {
            insetBannerData2 = insetBannerData;
        }
        productListInteractor.getClass();
        E(mutableStateFlow, list3, list4, list6, productFilterSwitch2, i3, insetBannerData2);
    }

    public static final ProductListData a(ProductListInteractor productListInteractor, ProductListData productListData) {
        TrolleyResult trolleyResult;
        TrolleyInteractor trolleyInteractor = productListInteractor.e;
        Result result = (Result) trolleyInteractor.getP().getValue();
        if (result.b()) {
            trolleyResult = (TrolleyResult) result.f4591a;
        } else {
            trolleyInteractor.d();
            trolleyResult = (TrolleyResult) ((Result) trolleyInteractor.getP().getValue()).f4591a;
        }
        return trolleyResult != null ? ProductListData.a(productListData, ProductListFeedTrolleyUpdater.b(productListData.getC(), trolleyResult)) : productListData;
    }

    public static void h(ProductListInteractor productListInteractor, String str) {
        List listQ = CollectionsKt.Q(RewardsOfferStatus.g);
        productListInteractor.getClass();
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(null, new ProductListInteractor$fetchProductListByBoostedOffers$1(productListInteractor, str, listQ, null));
        productListInteractor.h = numericPageKeyedPagingSourceFactory;
        MutableLiveData mutableLiveData = productListInteractor.k;
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByBoostedOffers$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, productListInteractor.s).a();
        ProductListInteractor$fetchProductListByBoostedOffers$$inlined$getPageListing$2 productListInteractor$fetchProductListByBoostedOffers$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListByBoostedOffers$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData2 = numericPageKeyedPagingSourceFactory.c;
        mutableLiveData.m(new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData2, productListInteractor$fetchProductListByBoostedOffers$$inlined$getPageListing$2), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByBoostedOffers$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByBoostedOffers$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByBoostedOffers$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByBoostedOffers$$inlined$getPageListing$6.d)));
    }

    public static void i(ProductListInteractor productListInteractor, Activities.ProductList.Extras extras, String categoryPath, ProductListData productListData, String str, String str2, Map map, boolean z, int i) {
        if ((i & 4) != 0) {
            productListData = null;
        }
        String str3 = (i & 16) != 0 ? null : str2;
        Map map2 = (i & 32) != 0 ? null : map;
        productListInteractor.getClass();
        Intrinsics.h(extras, "extras");
        Intrinsics.h(categoryPath, "categoryPath");
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(productListData, new ProductListInteractor$fetchProductListByCategory$1(productListInteractor, categoryPath, map2, str, str3, extras, z, null));
        productListInteractor.h = numericPageKeyedPagingSourceFactory;
        MutableLiveData mutableLiveData = productListInteractor.k;
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByCategory$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, productListInteractor.s).a();
        ProductListInteractor$fetchProductListByCategory$$inlined$getPageListing$2 productListInteractor$fetchProductListByCategory$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListByCategory$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData2 = numericPageKeyedPagingSourceFactory.c;
        mutableLiveData.m(new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData2, productListInteractor$fetchProductListByCategory$$inlined$getPageListing$2), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByCategory$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByCategory$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByCategory$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByCategory$$inlined$getPageListing$6.d)));
        if (productListData != null) {
            productListInteractor.A(productListData);
        }
    }

    public static void k(ProductListInteractor productListInteractor, Activities.ProductList.Extras extras, String argument, boolean z, String type, boolean z2, String str, List list, ProductListData productListData, Map map, String str2, String str3, int i) {
        ProductListData productListData2 = (i & 128) != 0 ? null : productListData;
        Map map2 = (i & 256) != 0 ? null : map;
        String str4 = (i & 512) != 0 ? null : str2;
        String str5 = (i & 1024) != 0 ? null : str3;
        productListInteractor.getClass();
        Intrinsics.h(extras, "extras");
        Intrinsics.h(argument, "argument");
        Intrinsics.h(type, "type");
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(productListData2, new ProductListInteractor$fetchProductListByProductGroup$1(productListInteractor, str4, str5, type, argument, str, list, z, extras, map2, z2, null));
        productListInteractor.h = numericPageKeyedPagingSourceFactory;
        MutableLiveData mutableLiveData = productListInteractor.k;
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, productListInteractor.s).a();
        ProductListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$2 productListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData2 = numericPageKeyedPagingSourceFactory.c;
        mutableLiveData.m(new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData2, productListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$2), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$6.d)));
        if (productListData2 != null) {
            productListInteractor.A(productListData2);
        }
    }

    public static void l(ProductListInteractor productListInteractor, Activities.ProductList.Extras extras, String searchTerm, String type, ProductListData productListData, String str, List list, Map map, String str2, boolean z, List list2, boolean z2, int i) {
        ProductListData productListData2 = (i & 16) != 0 ? null : productListData;
        String str3 = (i & 32) != 0 ? null : str;
        List list3 = (i & 64) != 0 ? null : list;
        Map map2 = (i & 128) != 0 ? null : map;
        String str4 = (i & 256) != 0 ? null : str2;
        boolean z3 = (i & 2048) != 0 ? false : z2;
        productListInteractor.getClass();
        Intrinsics.h(extras, "extras");
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(type, "type");
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(productListData2, new ProductListInteractor$fetchProductListBySearch$1(productListInteractor, map2, list3, str3, str4, type, searchTerm, list2, z3, extras, z, null));
        productListInteractor.h = numericPageKeyedPagingSourceFactory;
        MutableLiveData mutableLiveData = productListInteractor.k;
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearch$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, productListInteractor.s).a();
        ProductListInteractor$fetchProductListBySearch$$inlined$getPageListing$2 productListInteractor$fetchProductListBySearch$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListBySearch$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData2 = numericPageKeyedPagingSourceFactory.c;
        mutableLiveData.m(new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData2, productListInteractor$fetchProductListBySearch$$inlined$getPageListing$2), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListBySearch$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearch$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListBySearch$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListBySearch$$inlined$getPageListing$6.d)));
        if (productListData2 != null) {
            productListInteractor.A(productListData2);
        }
    }

    public static void m(ProductListInteractor productListInteractor, Activities.ProductList.Extras extras, String type, String searchTerm, ProductListData productListData, String str, Map map, String str2, List list, int i) {
        ProductListData productListData2 = (i & 16) != 0 ? null : productListData;
        String str3 = (i & 32) != 0 ? null : str;
        Map map2 = (i & 64) != 0 ? null : map;
        String str4 = (i & 128) != 0 ? null : str2;
        productListInteractor.getClass();
        Intrinsics.h(extras, "extras");
        Intrinsics.h(type, "type");
        Intrinsics.h(searchTerm, "searchTerm");
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(productListData2, new ProductListInteractor$fetchProductListBySearchAlternative$1(productListInteractor, map2, str3, str4, type, searchTerm, list, extras, null));
        productListInteractor.h = numericPageKeyedPagingSourceFactory;
        MutableLiveData mutableLiveData = productListInteractor.k;
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearchAlternative$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, productListInteractor.s).a();
        ProductListInteractor$fetchProductListBySearchAlternative$$inlined$getPageListing$2 productListInteractor$fetchProductListBySearchAlternative$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListBySearchAlternative$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData2 = numericPageKeyedPagingSourceFactory.c;
        mutableLiveData.m(new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData2, productListInteractor$fetchProductListBySearchAlternative$$inlined$getPageListing$2), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListBySearchAlternative$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearchAlternative$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListBySearchAlternative$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListBySearchAlternative$$inlined$getPageListing$6.d)));
        if (productListData2 != null) {
            productListInteractor.A(productListData2);
        }
    }

    public static boolean u(Integer num) {
        return num == null || num.intValue() <= 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01ce A[LOOP:2: B:78:0x01c8->B:80:0x01ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(au.com.woolworths.feature.product.list.legacy.data.ProductListData r39) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor.A(au.com.woolworths.feature.product.list.legacy.data.ProductListData):void");
    }

    public final void B(String filterId) {
        ToggleableState toggleableState;
        int iD;
        Intrinsics.h(filterId, "filterId");
        FilterOptionsManager filterOptionsManager = this.r;
        filterOptionsManager.getClass();
        FilterMenuItem filterMenuItemB = filterOptionsManager.b(filterId);
        if (filterMenuItemB.g.length() > 0) {
            String str = filterMenuItemB.l;
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str);
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.addLast(str);
            while (!arrayDeque.isEmpty()) {
                String str2 = (String) arrayDeque.removeFirst();
                LinkedHashMap linkedHashMap = filterOptionsManager.f5354a;
                if (linkedHashMap == null) {
                    Intrinsics.p("filterParentToChildMap");
                    throw null;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((List) entry.getValue()).contains(str2)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                String str3 = (String) CollectionsKt.E(linkedHashMap2.keySet());
                if (str3 != null) {
                    arrayList2.add(str3);
                    arrayDeque.addLast(str3);
                }
            }
            arrayList.addAll(arrayList2);
            LinkedHashMap linkedHashMap3 = filterOptionsManager.b;
            if (linkedHashMap3 == null) {
                Intrinsics.p("filterDescendantToAncestorMap");
                throw null;
            }
            String str4 = (String) linkedHashMap3.get(str);
            for (FilterOption filterOption : filterOptionsManager.c) {
                if (Intrinsics.c(filterOption.d, str4)) {
                    List list = filterOption.f;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str5 = (String) it.next();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list) {
                            if (Intrinsics.c(str5, ((FilterMenuItem) obj).k)) {
                                arrayList4.add(obj);
                            }
                        }
                        arrayList3.addAll(arrayList4);
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        FilterMenuItem filterMenuItem = (FilterMenuItem) it2.next();
                        boolean z = filterMenuItem.h;
                        String str6 = filterMenuItem.k;
                        if (z) {
                            List listC = filterOptionsManager.c(str6);
                            if ((listC instanceof Collection) && listC.isEmpty()) {
                                toggleableState = ToggleableState.d;
                            } else {
                                Iterator it3 = listC.iterator();
                                while (it3.hasNext()) {
                                    if (((FilterMenuItem) it3.next()).i != ToggleableState.d) {
                                        toggleableState = ToggleableState.e;
                                        break;
                                    }
                                }
                                toggleableState = ToggleableState.d;
                            }
                        } else {
                            toggleableState = filterMenuItem.i;
                        }
                        if (toggleableState == ToggleableState.d || !filterMenuItem.h) {
                            iD = 0;
                        } else {
                            iD = filterOptionsManager.d(str6);
                            if (iD > 0) {
                                toggleableState = ToggleableState.f;
                            }
                        }
                        Intrinsics.h(toggleableState, "<set-?>");
                        filterMenuItem.i = toggleableState;
                        filterMenuItem.j = iD;
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        LinkedHashMap linkedHashMap4 = filterOptionsManager.b;
        if (linkedHashMap4 == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str7 = (String) linkedHashMap4.get(filterMenuItemB.k);
        for (FilterOption filterOption2 : filterOptionsManager.c) {
            if (Intrinsics.c(filterOption2.d, str7)) {
                filterOption2.g = filterOptionsManager.d(filterOption2.d);
                F(this, this.o, FilterOptionKt.a(filterOptionsManager.c), null, null, null, 0, null, 62);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void C(String filterId, ToggleableState newState) {
        Intrinsics.h(filterId, "filterId");
        Intrinsics.h(newState, "newState");
        FilterOptionsManager filterOptionsManager = this.r;
        filterOptionsManager.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(filterId);
        FilterMenuItem filterMenuItemB = filterOptionsManager.b(filterId);
        if (filterMenuItemB.h) {
            arrayList.addAll(filterOptionsManager.a(filterMenuItemB.k));
        }
        LinkedHashMap linkedHashMap = filterOptionsManager.b;
        if (linkedHashMap == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str = (String) linkedHashMap.get(filterId);
        for (FilterOption filterOption : filterOptionsManager.c) {
            if (Intrinsics.c(filterOption.d, str)) {
                List list = filterOption.f;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (arrayList.contains(((FilterMenuItem) obj).k)) {
                        arrayList2.add(obj);
                    }
                }
                int iOrdinal = newState.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        FilterMenuItem filterMenuItem = (FilterMenuItem) it.next();
                        if (filterMenuItem.i != newState) {
                            filterMenuItem.i = newState;
                            filterMenuItem.j = 0;
                        }
                        arrayList3.add(Unit.f24250a);
                    }
                }
                F(this, this.o, FilterOptionKt.a(filterOptionsManager.c), null, null, null, 0, null, 62);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void D(List list) {
        this.q = list;
        NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = this.h;
        if (numericPageKeyedPagingSourceFactory == null) {
            Intrinsics.p("productsPagingSourceFactory");
            throw null;
        }
        PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
        if (pageKeyedPagingSource != null) {
            pageKeyedPagingSource.c();
        }
    }

    public final void G(Activities.ProductList.Extras extras, Boolean bool, List sortList, Map map, List list, List list2) {
        Intrinsics.h(extras, "extras");
        Intrinsics.h(sortList, "sortList");
        ProductFetchRequestModel productFetchRequestModel = new ProductFetchRequestModel(extras, bool, sortList, map, list, list2);
        ProductFetchRequestModel[] productFetchRequestModelArr = this.v;
        ProductFetchRequestModel productFetchRequestModel2 = productFetchRequestModelArr[0];
        if (productFetchRequestModel2 == null) {
            productFetchRequestModelArr[0] = productFetchRequestModel;
        } else {
            productFetchRequestModelArr[1] = productFetchRequestModel2;
            productFetchRequestModelArr[0] = productFetchRequestModel;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r26, kotlin.jvm.functions.Function1 r27, kotlin.coroutines.Continuation r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r28
            boolean r2 = r1 instanceof au.com.woolworths.feature.product.list.legacy.ProductListInteractor$buildProductListSource$1
            if (r2 == 0) goto L17
            r2 = r1
            au.com.woolworths.feature.product.list.legacy.ProductListInteractor$buildProductListSource$1 r2 = (au.com.woolworths.feature.product.list.legacy.ProductListInteractor$buildProductListSource$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.product.list.legacy.ProductListInteractor$buildProductListSource$1 r2 = new au.com.woolworths.feature.product.list.legacy.ProductListInteractor$buildProductListSource$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            kotlin.ResultKt.b(r1)
            goto L72
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            kotlin.ResultKt.b(r1)
            if (r26 != 0) goto L67
            java.util.List r8 = r0.q
            if (r8 != 0) goto L3d
            goto L67
        L3d:
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r6 = new au.com.woolworths.feature.product.list.legacy.data.ProductListData
            int r10 = r0.i
            java.lang.Integer r11 = r0.j
            java.util.List r12 = r0.l
            java.util.List r13 = r0.m
            r23 = 0
            r24 = 126848(0x1ef80, float:1.77752E-40)
            r7 = 0
            r9 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6.r = r5
            r1 = 0
            r0.q = r1
            return r6
        L67:
            r2.r = r5
            r1 = r27
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 != r3) goto L72
            return r3
        L72:
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r1 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r1
            r0.A(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor.b(boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r18, java.lang.String r19, java.lang.String r20, boolean r21, java.lang.String r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor.c(au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r17, java.lang.String r18, boolean r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchFirstPageProductListByCategory$1
            if (r2 == 0) goto L18
            r2 = r1
            au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchFirstPageProductListByCategory$1 r2 = (au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchFirstPageProductListByCategory$1) r2
            int r3 = r2.t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.t = r3
        L16:
            r12 = r2
            goto L1e
        L18:
            au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchFirstPageProductListByCategory$1 r2 = new au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchFirstPageProductListByCategory$1
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r12.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r13 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r12.t
            r14 = 2
            r3 = 1
            r15 = 0
            if (r2 == 0) goto L4c
            if (r2 == r3) goto L3e
            if (r2 != r14) goto L36
            java.lang.Object r2 = r12.p
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r2 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r2
            kotlin.ResultKt.b(r1)
            goto La5
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            boolean r2 = r12.q
            java.lang.Object r3 = r12.p
            au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras r3 = (au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras) r3
            kotlin.ResultKt.b(r1)
            r7 = r3
            r3 = r1
            r1 = r7
        L4a:
            r7 = r2
            goto L7c
        L4c:
            kotlin.ResultKt.b(r1)
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r1 = r0.c
            java.lang.String r5 = r1.f()
            java.lang.String r7 = r0.t()
            java.util.LinkedHashMap r8 = r0.p()
            java.lang.Boolean r9 = r0.v()
            au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs r11 = r0.q(r15, r15)
            r1 = r17
            r12.p = r1
            r2 = r19
            r12.q = r2
            r12.t = r3
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository r3 = r0.f5328a
            r6 = 0
            r10 = 0
            r4 = r18
            java.lang.Object r3 = r3.c(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r13) goto L4a
            goto La3
        L7c:
            r8 = r3
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r8 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r8
            java.util.List r2 = r8.b
            if (r2 == 0) goto Lab
            au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch r2 = r8.i
            if (r2 == 0) goto L8d
            boolean r2 = r2.g
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r2)
        L8d:
            r2 = r15
            java.util.List r3 = r8.g
            java.util.LinkedHashMap r4 = r0.p()
            r5 = 0
            r6 = 0
            r0.G(r1, r2, r3, r4, r5, r6)
            r12.p = r8
            r12.t = r14
            java.lang.Object r1 = r0.w(r8, r7, r12)
            if (r1 != r13) goto La4
        La3:
            return r13
        La4:
            r2 = r8
        La5:
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r1 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r1
            if (r1 != 0) goto Laa
            return r2
        Laa:
            return r1
        Lab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor.d(au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r18, java.lang.String r19, java.lang.String r20, boolean r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor.e(au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r19, java.lang.String r20, java.lang.String r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor.f(au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r17, java.lang.String r18, boolean r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchFirstPageProductOnSpecialListByCategory$1
            if (r2 == 0) goto L18
            r2 = r1
            au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchFirstPageProductOnSpecialListByCategory$1 r2 = (au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchFirstPageProductOnSpecialListByCategory$1) r2
            int r3 = r2.t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.t = r3
        L16:
            r12 = r2
            goto L1e
        L18:
            au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchFirstPageProductOnSpecialListByCategory$1 r2 = new au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchFirstPageProductOnSpecialListByCategory$1
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r12.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r13 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r12.t
            r14 = 2
            r3 = 1
            r15 = 0
            if (r2 == 0) goto L4c
            if (r2 == r3) goto L3e
            if (r2 != r14) goto L36
            java.lang.Object r2 = r12.p
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r2 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r2
            kotlin.ResultKt.b(r1)
            goto La5
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            boolean r2 = r12.q
            java.lang.Object r3 = r12.p
            au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras r3 = (au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras) r3
            kotlin.ResultKt.b(r1)
            r7 = r3
            r3 = r1
            r1 = r7
        L4a:
            r7 = r2
            goto L7c
        L4c:
            kotlin.ResultKt.b(r1)
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r1 = r0.c
            java.lang.String r5 = r1.f()
            java.lang.String r7 = r0.t()
            java.util.LinkedHashMap r8 = r0.p()
            java.lang.Boolean r9 = r0.v()
            au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs r11 = r0.q(r15, r15)
            r1 = r17
            r12.p = r1
            r2 = r19
            r12.q = r2
            r12.t = r3
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository r3 = r0.f5328a
            r6 = 0
            r10 = 0
            r4 = r18
            java.lang.Object r3 = r3.i(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r13) goto L4a
            goto La3
        L7c:
            r8 = r3
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r8 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r8
            java.util.List r2 = r8.b
            if (r2 == 0) goto Lab
            au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch r2 = r8.i
            if (r2 == 0) goto L8d
            boolean r2 = r2.g
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r2)
        L8d:
            r2 = r15
            java.util.List r3 = r8.g
            java.util.LinkedHashMap r4 = r0.p()
            r5 = 0
            r6 = 0
            r0.G(r1, r2, r3, r4, r5, r6)
            r12.p = r8
            r12.t = r14
            java.lang.Object r1 = r0.w(r8, r7, r12)
            if (r1 != r13) goto La4
        La3:
            return r13
        La4:
            r2 = r8
        La5:
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r1 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r1
            if (r1 != 0) goto Laa
            return r2
        Laa:
            return r1
        Lab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor.g(au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void j(String str, String name, String channel, String facet, String str2, Map map, ProductListData productListData) {
        Intrinsics.h(name, "name");
        Intrinsics.h(channel, "channel");
        Intrinsics.h(facet, "facet");
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(productListData, new ProductListInteractor$fetchProductListByFacet$1(this, str, name, channel, facet, str2, map, null));
        this.h = numericPageKeyedPagingSourceFactory;
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByFacet$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, this.s).a();
        ProductListInteractor$fetchProductListByFacet$$inlined$getPageListing$2 productListInteractor$fetchProductListByFacet$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListByFacet$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData = numericPageKeyedPagingSourceFactory.c;
        this.k.m(new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData, productListInteractor$fetchProductListByFacet$$inlined$getPageListing$2), Transformations.c(mutableLiveData, ProductListInteractor$fetchProductListByFacet$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByFacet$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData, ProductListInteractor$fetchProductListByFacet$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData, ProductListInteractor$fetchProductListByFacet$$inlined$getPageListing$6.d)));
        if (productListData != null) {
            A(productListData);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Integer r6, java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListDataByPastShop$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListDataByPastShop$1 r0 = (au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListDataByPastShop$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListDataByPastShop$1 r0 = new au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListDataByPastShop$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r6 = r0.p
            kotlin.ResultKt.b(r8)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.ResultKt.b(r8)
            goto L4c
        L38:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r8 = r5.c
            java.lang.String r8 = r8.f()
            r0.s = r4
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository r2 = r5.f5328a
            java.lang.Object r8 = r2.f(r8, r7, r6, r0)
            if (r8 != r1) goto L4c
            goto L5e
        L4c:
            r6 = r8
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r6 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r6
            java.util.List r7 = r6.b
            if (r7 == 0) goto L65
            r0.p = r6
            r0.s = r3
            r7 = 0
            java.lang.Object r8 = r5.w(r6, r7, r0)
            if (r8 != r1) goto L5f
        L5e:
            return r1
        L5f:
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r8 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r8
            if (r8 != 0) goto L64
            return r6
        L64:
            return r8
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor.n(java.lang.Integer, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void o(Activities.ProductList.Extras extras, String categoryPath, ProductListData productListData, String str, String str2, Map map, boolean z) {
        Intrinsics.h(extras, "extras");
        Intrinsics.h(categoryPath, "categoryPath");
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(productListData, new ProductListInteractor$fetchProductListOnSpecialByCategory$1(this, categoryPath, map, str, str2, extras, z, null));
        this.h = numericPageKeyedPagingSourceFactory;
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListOnSpecialByCategory$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, this.s).a();
        ProductListInteractor$fetchProductListOnSpecialByCategory$$inlined$getPageListing$2 productListInteractor$fetchProductListOnSpecialByCategory$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListOnSpecialByCategory$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData = numericPageKeyedPagingSourceFactory.c;
        this.k.m(new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData, productListInteractor$fetchProductListOnSpecialByCategory$$inlined$getPageListing$2), Transformations.c(mutableLiveData, ProductListInteractor$fetchProductListOnSpecialByCategory$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListOnSpecialByCategory$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData, ProductListInteractor$fetchProductListOnSpecialByCategory$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData, ProductListInteractor$fetchProductListOnSpecialByCategory$$inlined$getPageListing$6.d)));
        if (productListData != null) {
            A(productListData);
        }
    }

    public final LinkedHashMap p() {
        FilterOptionsManager filterOptionsManager = this.r;
        filterOptionsManager.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FilterOption filterOption : filterOptionsManager.c) {
            List list = filterOption.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((FilterMenuItem) obj).i == ToggleableState.d) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((FilterMenuItem) it.next()).d);
            }
            if (!arrayList2.isEmpty()) {
                linkedHashMap.put(filterOption.d, arrayList2);
            }
        }
        return linkedHashMap;
    }

    public final ChipsProductListInputArgs q(Integer num, String str) {
        Object obj = null;
        if (!u(num)) {
            str = null;
        }
        List list = ((ProductListContract.ProductListFlow) this.n.getValue()).b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ProductListChip) obj2).b) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ProductListChip) it.next()).f5364a);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (str != null) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.c((String) next, str)) {
                    obj = next;
                    break;
                }
            }
            if (((String) obj) != null) {
                arrayList4.add(str);
            } else {
                arrayList3.add(str);
            }
        }
        return new ChipsProductListInputArgs(arrayList2, arrayList3, arrayList4);
    }

    public final String r() {
        Object next;
        Iterator it = ((ProductListContract.ProductListFlow) this.n.getValue()).c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProductListChip) next).b) {
                break;
            }
        }
        ProductListChip productListChip = (ProductListChip) next;
        if (productListChip != null) {
            return productListChip.f5364a;
        }
        return null;
    }

    public final String s(String filterId) {
        Intrinsics.h(filterId, "filterId");
        FilterOptionsManager filterOptionsManager = this.r;
        filterOptionsManager.getClass();
        FilterMenuItem filterMenuItemB = filterOptionsManager.b(filterId);
        String str = filterMenuItemB.g;
        if (str.length() != 0) {
            return str;
        }
        LinkedHashMap linkedHashMap = filterOptionsManager.b;
        if (linkedHashMap != null) {
            String str2 = (String) linkedHashMap.get(filterMenuItemB.k);
            return str2 == null ? "" : str2;
        }
        Intrinsics.p("filterDescendantToAncestorMap");
        throw null;
    }

    public final String t() {
        List list;
        Object next;
        ProductListOptions productListOptions = (ProductListOptions) this.o.getValue();
        if (productListOptions != null && (list = productListOptions.e) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((SortOption) next).g) {
                    break;
                }
            }
            SortOption sortOption = (SortOption) next;
            if (sortOption != null) {
                return sortOption.d;
            }
        }
        return null;
    }

    public final Boolean v() {
        ProductFilterSwitch productFilterSwitch;
        ProductListOptions productListOptions = (ProductListOptions) this.o.getValue();
        if (productListOptions == null || (productFilterSwitch = productListOptions.h) == null) {
            return null;
        }
        return Boolean.valueOf(productFilterSwitch.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(au.com.woolworths.feature.product.list.legacy.data.ProductListData r20, boolean r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor.w(au.com.woolworths.feature.product.list.legacy.data.ProductListData, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void x(String chipId) {
        Intrinsics.h(chipId, "chipId");
        ProductsListRepository productsListRepository = this.f5328a;
        List listL = productsListRepository.l();
        if (listL == null) {
            listL = EmptyList.d;
        }
        ArrayList arrayListJ0 = CollectionsKt.J0(listL);
        arrayListJ0.remove(chipId);
        SharedPreferences.Editor editorEdit = productsListRepository.f5342a.edit();
        editorEdit.putStringSet("product_list_persisted_chip_ids", CollectionsKt.L0(arrayListJ0));
        editorEdit.apply();
    }

    public final void y(ProductListOptions productListOptions) {
        F(this, this.o, FilterOptionKt.a(this.r.e(productListOptions.d)), productListOptions.e, productListOptions.f, productListOptions.h, productListOptions.i, null, 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    public final Activities.ProductList.Extras z() {
        EmptyList emptyList;
        MutableStateFlow mutableStateFlow;
        Object value;
        ProductListOptions productListOptions;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        ProductListContract.ProductListFlow productListFlow;
        EmptyList emptyList2;
        ?? r3;
        ProductFilterSwitch productFilterSwitchA;
        ProductFetchRequestModel productFetchRequestModel = this.v[1];
        if (productFetchRequestModel == null) {
            return null;
        }
        Map map = productFetchRequestModel.d;
        FilterOptionsManager filterOptionsManager = this.r;
        filterOptionsManager.getClass();
        Iterator it = filterOptionsManager.c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            emptyList = EmptyList.d;
            if (!zHasNext) {
                break;
            }
            FilterOption filterOption = (FilterOption) it.next();
            ?? r6 = (List) map.get(filterOption.d);
            if (r6 != 0) {
                emptyList = r6;
            }
            for (FilterMenuItem filterMenuItem : filterOption.f) {
                filterMenuItem.i = emptyList.contains(filterMenuItem.d) ? ToggleableState.d : ToggleableState.e;
            }
        }
        do {
            mutableStateFlow = this.o;
            value = mutableStateFlow.getValue();
            ProductListOptions productListOptions2 = (ProductListOptions) value;
            if (productListOptions2 != null) {
                ProductFilterSwitch productFilterSwitch = productListOptions2.h;
                if (productFilterSwitch != null) {
                    Boolean bool = productFetchRequestModel.b;
                    productFilterSwitchA = ProductFilterSwitch.a(productFilterSwitch, bool != null ? bool.booleanValue() : false);
                } else {
                    productFilterSwitchA = null;
                }
                ?? r62 = productFetchRequestModel.c;
                EmptyList emptyList3 = r62 == 0 ? emptyList : r62;
                List filterList = productListOptions2.d;
                List originalSortList = productListOptions2.f;
                InsetBannerData insetBannerData = productListOptions2.g;
                int i = productListOptions2.i;
                Intrinsics.h(filterList, "filterList");
                Intrinsics.h(originalSortList, "originalSortList");
                productListOptions = new ProductListOptions(filterList, emptyList3, originalSortList, insetBannerData, productFilterSwitchA, i);
            } else {
                productListOptions = null;
            }
        } while (!mutableStateFlow.d(value, productListOptions));
        do {
            mutableStateFlow2 = this.n;
            value2 = mutableStateFlow2.getValue();
            productListFlow = (ProductListContract.ProductListFlow) value2;
            ?? r32 = productFetchRequestModel.e;
            emptyList2 = r32 == 0 ? emptyList : r32;
            r3 = productFetchRequestModel.f;
        } while (!mutableStateFlow2.d(value2, ProductListContract.ProductListFlow.a(productListFlow, null, emptyList2, r3 == 0 ? emptyList : r3, null, null, null, null, 121)));
        return productFetchRequestModel.f5329a;
    }
}
