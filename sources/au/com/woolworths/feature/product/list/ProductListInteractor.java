package au.com.woolworths.feature.product.list;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.state.ToggleableState;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.data.FilterOptionsManager;
import au.com.woolworths.feature.product.list.data.ProductFilterSwitch;
import au.com.woolworths.feature.product.list.data.ProductListChip;
import au.com.woolworths.feature.product.list.data.ProductListData;
import au.com.woolworths.feature.product.list.data.ProductListOptions;
import au.com.woolworths.feature.product.list.data.SortOption;
import au.com.woolworths.feature.product.list.ui.FilterOptionKt;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetRepository;
import au.com.woolworths.product.interactor.ProductsInteractor;
import au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater;
import au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListInteractor;", "", "ProductFetchRequestModel", "Companion", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ProductsListRepository f5251a;
    public final ProductsInteractor b;
    public final RepositoryManager c;
    public final GoogleAdManagerInteractor d;
    public final TrolleyInteractor e;
    public final EducationBottomSheetRepository f;
    public final FirebasePerfMonitor g;
    public int h;
    public Integer i;
    public List j;
    public List k;
    public final MutableStateFlow l;
    public final MutableStateFlow m;
    public final SharedFlowImpl n;
    public List o;
    public final FilterOptionsManager p;
    public BottomSheetContent.Marketplace q;
    public InfoSection r;
    public final ProductFetchRequestModel[] s;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListInteractor$Companion;", "", "", "PRODUCT_PAGING_LOAD_SIZE", "I", "PRODUCT_PAGING_PRELOAD_SIZE", "", "FOR_YOU_FILTER_CHIP_ID", "Ljava/lang/String;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListInteractor$ProductFetchRequestModel;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductFetchRequestModel {

        /* renamed from: a, reason: collision with root package name */
        public final Activities.ProductList.Extras f5252a;
        public final Boolean b;
        public final List c;
        public final Map d;
        public final List e;
        public final List f;

        public ProductFetchRequestModel(Activities.ProductList.Extras extras, Boolean bool, List list, Map map, List list2, List list3) {
            Intrinsics.h(extras, "extras");
            this.f5252a = extras;
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
            return Intrinsics.c(this.f5252a, productFetchRequestModel.f5252a) && Intrinsics.c(this.b, productFetchRequestModel.b) && Intrinsics.c(this.c, productFetchRequestModel.c) && Intrinsics.c(this.d, productFetchRequestModel.d) && Intrinsics.c(this.e, productFetchRequestModel.e) && Intrinsics.c(this.f, productFetchRequestModel.f);
        }

        public final int hashCode() {
            int iHashCode = this.f5252a.hashCode() * 31;
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
            return "ProductFetchRequestModel(extras=" + this.f5252a + ", isMarketplaceChecked=" + this.b + ", sortList=" + this.c + ", appliedFilters=" + this.d + ", chips=" + this.e + ", facetChips=" + this.f + ")";
        }
    }

    public ProductListInteractor(ProductsListRepository productsListRepository, ProductsInteractor productsInteractor, RepositoryManager repositoryManager, GoogleAdManagerInteractor googleAdManagerInteractor, TrolleyInteractor trolleyInteractor, EducationBottomSheetRepository educationBottomSheetRepository, FirebasePerfMonitor firebasePerfMonitor) {
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        this.f5251a = productsListRepository;
        this.b = productsInteractor;
        this.c = repositoryManager;
        this.d = googleAdManagerInteractor;
        this.e = trolleyInteractor;
        this.f = educationBottomSheetRepository;
        this.g = firebasePerfMonitor;
        EmptyList emptyList = EmptyList.d;
        this.j = emptyList;
        this.k = emptyList;
        this.l = StateFlowKt.a(new ProductListContract.ProductListFlow(null, emptyList, emptyList, null, null, 0, new ProductListContract.ProductListFilterState(0, false), emptyList));
        this.m = StateFlowKt.a(null);
        this.n = SharedFlowKt.b(0, 2, BufferOverflow.e, 1);
        this.p = new FilterOptionsManager();
        this.s = new ProductFetchRequestModel[2];
    }

    public static boolean B(Integer num) {
        return num == null || num.intValue() <= 1;
    }

    public static void J(MutableStateFlow mutableStateFlow, List updatedFilters, List updatedSortOptions, List originalSortOptions, ProductFilterSwitch productFilterSwitch, int i, InsetBannerData insetBannerData) {
        Intrinsics.h(mutableStateFlow, "<this>");
        Intrinsics.h(updatedFilters, "updatedFilters");
        Intrinsics.h(updatedSortOptions, "updatedSortOptions");
        Intrinsics.h(originalSortOptions, "originalSortOptions");
        mutableStateFlow.setValue(new ProductListOptions(updatedFilters, updatedSortOptions, originalSortOptions, insetBannerData, productFilterSwitch, i));
    }

    public static void K(ProductListInteractor productListInteractor, MutableStateFlow mutableStateFlow, ArrayList arrayList, List list, List list2, ProductFilterSwitch productFilterSwitch, int i, InsetBannerData insetBannerData, int i2) {
        List filterList;
        List sortList;
        ProductFilterSwitch marketplaceProductsSwitch;
        int productsCount;
        List<SortOption> originalSortList;
        int i3 = i2 & 1;
        List list3 = EmptyList.d;
        if (i3 != 0) {
            ProductListOptions productListOptions = (ProductListOptions) productListInteractor.m.getValue();
            if (productListOptions == null || (filterList = productListOptions.getFilterList()) == null) {
                filterList = list3;
            }
        } else {
            filterList = arrayList;
        }
        if ((i2 & 2) != 0) {
            ProductListOptions productListOptions2 = (ProductListOptions) productListInteractor.m.getValue();
            if (productListOptions2 == null || (sortList = productListOptions2.getSortList()) == null) {
                sortList = list3;
            }
        } else {
            sortList = list;
        }
        if ((i2 & 4) != 0) {
            ProductListOptions productListOptions3 = (ProductListOptions) productListInteractor.m.getValue();
            if (productListOptions3 != null && (originalSortList = productListOptions3.getOriginalSortList()) != null) {
                list3 = originalSortList;
            }
        } else {
            list3 = list2;
        }
        InsetBannerData sortOptionsInsetBanner = null;
        if ((i2 & 8) != 0) {
            ProductListOptions productListOptions4 = (ProductListOptions) productListInteractor.m.getValue();
            marketplaceProductsSwitch = productListOptions4 != null ? productListOptions4.getMarketplaceProductsSwitch() : null;
        } else {
            marketplaceProductsSwitch = productFilterSwitch;
        }
        if ((i2 & 16) != 0) {
            ProductListOptions productListOptions5 = (ProductListOptions) productListInteractor.m.getValue();
            productsCount = productListOptions5 != null ? productListOptions5.getProductsCount() : 0;
        } else {
            productsCount = i;
        }
        if ((i2 & 32) != 0) {
            ProductListOptions productListOptions6 = (ProductListOptions) productListInteractor.m.getValue();
            if (productListOptions6 != null) {
                sortOptionsInsetBanner = productListOptions6.getSortOptionsInsetBanner();
            }
        } else {
            sortOptionsInsetBanner = insetBannerData;
        }
        productListInteractor.getClass();
        J(mutableStateFlow, filterList, sortList, list3, marketplaceProductsSwitch, productsCount, sortOptionsInsetBanner);
    }

    public static /* synthetic */ Object i(ProductListInteractor productListInteractor, Integer num, Activities.ProductList.Extras extras, String str, ProductListData productListData, String str2, String str3, Map map, boolean z, ContinuationImpl continuationImpl, int i) {
        if ((i & 8) != 0) {
            productListData = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            map = null;
        }
        return productListInteractor.h(num, extras, str, productListData, str2, str3, map, z, continuationImpl);
    }

    public static /* synthetic */ Object o(ProductListInteractor productListInteractor, Integer num, Activities.ProductList.Extras extras, String str, String str2, boolean z, String str3, ProductListData productListData, Map map, String str4, String str5, ContinuationImpl continuationImpl, int i) {
        if ((i & 256) != 0) {
            productListData = null;
        }
        if ((i & 512) != 0) {
            map = null;
        }
        if ((i & 1024) != 0) {
            str4 = null;
        }
        if ((i & 2048) != 0) {
            str5 = null;
        }
        return productListInteractor.n(num, extras, str, str2, z, str3, productListData, map, str4, str5, continuationImpl);
    }

    public static /* synthetic */ Object u(ProductListInteractor productListInteractor, Integer num, Activities.ProductList.Extras extras, String str, String str2, ProductListData productListData, String str3, Map map, String str4, ContinuationImpl continuationImpl, int i) {
        if ((i & 32) != 0) {
            productListData = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            map = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        return productListInteractor.t(num, extras, str, str2, productListData, str3, map, str4, continuationImpl);
    }

    public final String A() {
        List<SortOption> sortList;
        Object next;
        ProductListOptions productListOptions = (ProductListOptions) this.m.getValue();
        if (productListOptions != null && (sortList = productListOptions.getSortList()) != null) {
            Iterator<T> it = sortList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((SortOption) next).isApplied()) {
                    break;
                }
            }
            SortOption sortOption = (SortOption) next;
            if (sortOption != null) {
                return sortOption.getId();
            }
        }
        return null;
    }

    public final Boolean C() {
        ProductFilterSwitch marketplaceProductsSwitch;
        ProductListOptions productListOptions = (ProductListOptions) this.m.getValue();
        if (productListOptions == null || (marketplaceProductsSwitch = productListOptions.getMarketplaceProductsSwitch()) == null) {
            return null;
        }
        return Boolean.valueOf(marketplaceProductsSwitch.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(au.com.woolworths.feature.product.list.data.ProductListData r31, boolean r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.D(au.com.woolworths.feature.product.list.data.ProductListData, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void E(ProductListOptions productListOptions) {
        K(this, this.m, FilterOptionKt.a(this.p.setData(productListOptions.getFilterList())), productListOptions.getSortList(), productListOptions.getOriginalSortList(), productListOptions.getMarketplaceProductsSwitch(), productListOptions.getProductsCount(), null, 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    public final Activities.ProductList.Extras F() {
        MutableStateFlow mutableStateFlow;
        Object value;
        EmptyList emptyList;
        ProductListOptions productListOptionsCopy$default;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        ProductListContract.ProductListFlow productListFlow;
        EmptyList emptyList2;
        ?? r4;
        ProductFilterSwitch productFilterSwitchCopy$default;
        ProductFetchRequestModel productFetchRequestModel = this.s[1];
        if (productFetchRequestModel == null) {
            return null;
        }
        Map<String, ? extends List<String>> map = productFetchRequestModel.d;
        if (map != null) {
            this.p.setAppliedFilters(map);
        }
        do {
            mutableStateFlow = this.m;
            value = mutableStateFlow.getValue();
            ProductListOptions productListOptions = (ProductListOptions) value;
            emptyList = EmptyList.d;
            if (productListOptions != null) {
                ProductFilterSwitch marketplaceProductsSwitch = productListOptions.getMarketplaceProductsSwitch();
                if (marketplaceProductsSwitch != null) {
                    Boolean bool = productFetchRequestModel.b;
                    productFilterSwitchCopy$default = ProductFilterSwitch.copy$default(marketplaceProductsSwitch, null, null, null, bool != null ? bool.booleanValue() : false, null, 23, null);
                } else {
                    productFilterSwitchCopy$default = null;
                }
                ?? r5 = productFetchRequestModel.c;
                productListOptionsCopy$default = ProductListOptions.copy$default(productListOptions, null, r5 == 0 ? emptyList : r5, null, null, productFilterSwitchCopy$default, 0, 45, null);
            } else {
                productListOptionsCopy$default = null;
            }
        } while (!mutableStateFlow.d(value, productListOptionsCopy$default));
        do {
            mutableStateFlow2 = this.l;
            value2 = mutableStateFlow2.getValue();
            productListFlow = (ProductListContract.ProductListFlow) value2;
            ?? r42 = productFetchRequestModel.e;
            emptyList2 = r42 == 0 ? emptyList : r42;
            r4 = productFetchRequestModel.f;
        } while (!mutableStateFlow2.d(value2, ProductListContract.ProductListFlow.a(productListFlow, null, emptyList2, r4 == 0 ? emptyList : r4, null, null, 0, null, null, 4029)));
        return productFetchRequestModel.f5252a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[PHI: r2
  0x006e: PHI (r2v25 au.com.woolworths.feature.product.list.data.ProductListZeroResults) = 
  (r2v1 au.com.woolworths.feature.product.list.data.ProductListZeroResults)
  (r2v8 au.com.woolworths.feature.product.list.data.ProductListZeroResults)
 binds: [B:24:0x006c, B:42:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(au.com.woolworths.feature.product.list.data.ProductListData r26) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.G(au.com.woolworths.feature.product.list.data.ProductListData):void");
    }

    public final void H(String filterId) {
        Intrinsics.h(filterId, "filterId");
        K(this, this.m, FilterOptionKt.a(this.p.setAllAscendantStatesOf(filterId)), null, null, null, 0, null, 62);
    }

    public final void I(String filterId, ToggleableState newState) {
        Intrinsics.h(filterId, "filterId");
        Intrinsics.h(newState, "newState");
        K(this, this.m, FilterOptionKt.a(this.p.setAllDescendantsStatesOf(filterId, newState)), null, null, null, 0, null, 62);
    }

    public final void L(Activities.ProductList.Extras extras, Boolean bool, List sortList, Map appliedFilters, List list, List list2) {
        Intrinsics.h(extras, "extras");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(appliedFilters, "appliedFilters");
        ProductFetchRequestModel productFetchRequestModel = new ProductFetchRequestModel(extras, bool, sortList, appliedFilters, list, list2);
        ProductFetchRequestModel[] productFetchRequestModelArr = this.s;
        ProductFetchRequestModel productFetchRequestModel2 = productFetchRequestModelArr[0];
        if (productFetchRequestModel2 == null) {
            productFetchRequestModelArr[0] = productFetchRequestModel;
        } else {
            productFetchRequestModelArr[1] = productFetchRequestModel2;
            productFetchRequestModelArr[0] = productFetchRequestModel;
        }
    }

    public final ProductListData M(ProductListData productListData) {
        TrolleyResult trolleyResult;
        ProductListData productListDataCopy$default;
        TrolleyInteractor trolleyInteractor = this.e;
        Result result = (Result) trolleyInteractor.getP().getValue();
        if (result.b()) {
            trolleyResult = (TrolleyResult) result.f4591a;
        } else {
            trolleyInteractor.d();
            trolleyResult = (TrolleyResult) ((Result) trolleyInteractor.getP().getValue()).f4591a;
        }
        return (trolleyResult == null || (productListDataCopy$default = ProductListData.copy$default(productListData, null, ProductListFeedTrolleyUpdater.b(productListData.getC(), trolleyResult), null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 131069, null)) == null) ? productListData : productListDataCopy$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r27, kotlin.jvm.functions.Function1 r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r29
            boolean r2 = r1 instanceof au.com.woolworths.feature.product.list.ProductListInteractor$buildProductListSource$1
            if (r2 == 0) goto L17
            r2 = r1
            au.com.woolworths.feature.product.list.ProductListInteractor$buildProductListSource$1 r2 = (au.com.woolworths.feature.product.list.ProductListInteractor$buildProductListSource$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.product.list.ProductListInteractor$buildProductListSource$1 r2 = new au.com.woolworths.feature.product.list.ProductListInteractor$buildProductListSource$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            kotlin.ResultKt.b(r1)
            goto L75
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            kotlin.ResultKt.b(r1)
            if (r27 != 0) goto L6a
            java.util.List r8 = r0.o
            if (r8 != 0) goto L3d
            goto L6a
        L3d:
            au.com.woolworths.feature.product.list.data.ProductListData r6 = new au.com.woolworths.feature.product.list.data.ProductListData
            int r10 = r0.h
            java.lang.Integer r11 = r0.i
            java.util.List r12 = r0.j
            java.util.List r13 = r0.k
            r24 = 126848(0x1ef80, float:1.77752E-40)
            r25 = 0
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
            r23 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6.setFromCache(r5)
            r1 = 0
            r0.o = r1
            return r6
        L6a:
            r2.r = r5
            r1 = r28
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 != r3) goto L75
            return r3
        L75:
            au.com.woolworths.feature.product.list.data.ProductListData r1 = (au.com.woolworths.feature.product.list.data.ProductListData) r1
            r0.G(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.a(boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r29, java.lang.String r30, java.lang.String r31, boolean r32, java.lang.String r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.b(au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r27, java.lang.String r28, boolean r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.c(au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r29, java.lang.String r30, java.lang.String r31, boolean r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.d(au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r28v0, types: [au.com.woolworths.feature.product.list.ProductListInteractor] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r29, java.lang.String r30, java.lang.String r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.e(au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r27, java.lang.String r28, boolean r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.f(au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r22, java.util.List r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.g(java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.Integer r27, au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r28, java.lang.String r29, au.com.woolworths.feature.product.list.data.ProductListData r30, java.lang.String r31, java.lang.String r32, java.util.Map r33, boolean r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.h(java.lang.Integer, au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, au.com.woolworths.feature.product.list.data.ProductListData, java.lang.String, java.lang.String, java.util.Map, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Integer r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.Map r20, au.com.woolworths.feature.product.list.data.ProductListData r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            r13 = this;
            r0 = r22
            boolean r1 = r0 instanceof au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByFacet$1
            if (r1 == 0) goto L16
            r1 = r0
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByFacet$1 r1 = (au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByFacet$1) r1
            int r2 = r1.s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.s = r2
        L14:
            r11 = r1
            goto L1c
        L16:
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByFacet$1 r1 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByFacet$1
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r11.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r11.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            au.com.woolworths.feature.product.list.data.ProductListData r14 = r11.p
            kotlin.ResultKt.b(r0)
            goto L57
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            kotlin.ResultKt.b(r0)
            r0 = r21
            r11.p = r0
            r11.s = r3
            au.com.woolworths.feature.product.list.ProductsListRepository r2 = r13.f5251a
            r8 = 0
            r10 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r20
            java.lang.Object r14 = r2.d(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r14 != r1) goto L54
            return r1
        L54:
            r12 = r0
            r0 = r14
            r14 = r12
        L57:
            au.com.woolworths.feature.product.list.data.ProductListData r0 = (au.com.woolworths.feature.product.list.data.ProductListData) r0
            if (r14 == 0) goto L5e
            r13.G(r14)
        L5e:
            kotlinx.coroutines.flow.MutableStateFlow r14 = r13.l
            java.lang.Object r15 = r14.getValue()
            r1 = r15
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r1 = (au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow) r1
            java.lang.String r2 = r0.getPageTitle()
            java.util.List r3 = r0.getChips()
            java.util.List r4 = r0.getFacetChips()
            au.com.woolworths.feature.product.list.data.ZeroResultPageData r5 = r0.getZeroResultContent()
            int r7 = r0.getD()
            r9 = 0
            r10 = 3388(0xd3c, float:4.748E-42)
            r6 = 0
            r8 = 0
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r1 = au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r14 = r14.d(r15, r1)
            if (r14 == 0) goto L5e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.j(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, au.com.woolworths.feature.product.list.data.ProductListData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByHaveYouForgotten$1
            if (r2 == 0) goto L17
            r2 = r1
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByHaveYouForgotten$1 r2 = (au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByHaveYouForgotten$1) r2
            int r3 = r2.s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.s = r3
            goto L1c
        L17:
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByHaveYouForgotten$1 r2 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByHaveYouForgotten$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.s
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3c
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            au.com.woolworths.feature.product.list.data.ProductListData r2 = r2.p
            kotlin.ResultKt.b(r1)
            return r2
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.b(r1)
            goto L4a
        L3c:
            kotlin.ResultKt.b(r1)
            r2.s = r6
            au.com.woolworths.feature.product.list.ProductsListRepository r1 = r0.f5251a
            java.lang.Object r1 = r1.e(r2)
            if (r1 != r3) goto L4a
            goto L89
        L4a:
            au.com.woolworths.feature.product.list.data.ProductListData r1 = (au.com.woolworths.feature.product.list.data.ProductListData) r1
        L4c:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r0.l
            java.lang.Object r6 = r4.getValue()
            r7 = r6
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r7 = (au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow) r7
            java.lang.String r8 = r1.getPageTitle()
            java.util.List r9 = r1.getChips()
            java.util.List r10 = r1.getFacetChips()
            au.com.woolworths.feature.product.list.data.ZeroResultPageData r11 = r1.getZeroResultContent()
            int r13 = r1.getD()
            r15 = 0
            r16 = 3388(0xd3c, float:4.748E-42)
            r12 = 0
            r14 = 0
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r7 = au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r4 = r4.d(r6, r7)
            if (r4 == 0) goto L4c
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByHaveYouForgotten$3 r4 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByHaveYouForgotten$3
            r6 = 0
            r4.<init>(r1, r6)
            r2.p = r1
            r2.s = r5
            r5 = 0
            java.lang.Object r2 = r0.a(r5, r4, r2)
            if (r2 != r3) goto L8a
        L89:
            return r3
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.k(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.Integer r18, java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPastShop$1
            if (r2 == 0) goto L17
            r2 = r1
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPastShop$1 r2 = (au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPastShop$1) r2
            int r3 = r2.s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.s = r3
            goto L1c
        L17:
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPastShop$1 r2 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPastShop$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.s
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L42
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            java.lang.Object r2 = r2.p
            au.com.woolworths.feature.product.list.data.ProductListData r2 = (au.com.woolworths.feature.product.list.data.ProductListData) r2
            kotlin.ResultKt.b(r1)
            return r2
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.Object r4 = r2.p
            au.com.woolworths.feature.product.list.ProductListInteractor r4 = (au.com.woolworths.feature.product.list.ProductListInteractor) r4
            kotlin.ResultKt.b(r1)
            goto L55
        L42:
            kotlin.ResultKt.b(r1)
            r2.p = r0
            r2.s = r6
            r1 = r18
            r4 = r19
            java.lang.Object r1 = r0.v(r1, r4, r2)
            if (r1 != r3) goto L54
            goto L98
        L54:
            r4 = r0
        L55:
            au.com.woolworths.feature.product.list.data.ProductListData r1 = (au.com.woolworths.feature.product.list.data.ProductListData) r1
            au.com.woolworths.feature.product.list.data.ProductListData r1 = r4.M(r1)
        L5b:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r0.l
            java.lang.Object r6 = r4.getValue()
            r7 = r6
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r7 = (au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow) r7
            java.lang.String r8 = r1.getPageTitle()
            java.util.List r9 = r1.getChips()
            java.util.List r10 = r1.getFacetChips()
            au.com.woolworths.feature.product.list.data.ZeroResultPageData r11 = r1.getZeroResultContent()
            int r13 = r1.getD()
            r15 = 0
            r16 = 3388(0xd3c, float:4.748E-42)
            r12 = 0
            r14 = 0
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r7 = au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r4 = r4.d(r6, r7)
            if (r4 == 0) goto L5b
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPastShop$3 r4 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPastShop$3
            r6 = 0
            r4.<init>(r1, r6)
            r2.p = r1
            r2.s = r5
            r5 = 0
            java.lang.Object r2 = r0.a(r5, r4, r2)
            if (r2 != r3) goto L99
        L98:
            return r3
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.l(java.lang.Integer, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPriceFamily$1
            if (r2 == 0) goto L17
            r2 = r1
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPriceFamily$1 r2 = (au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPriceFamily$1) r2
            int r3 = r2.t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.t = r3
            goto L1c
        L17:
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPriceFamily$1 r2 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPriceFamily$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.t
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L46
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            kotlin.jvm.internal.Ref$ObjectRef r2 = r2.p
            kotlin.ResultKt.b(r1)
            goto Lc3
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            kotlin.jvm.internal.Ref$ObjectRef r4 = r2.q
            kotlin.jvm.internal.Ref$ObjectRef r6 = r2.p
            kotlin.ResultKt.b(r1)
            r17 = r6
            r6 = r4
            r4 = r17
            goto L62
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r4 = androidx.camera.core.impl.b.x(r1)
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r1 = r0.c
            java.lang.String r1 = r1.f()
            r2.p = r4
            r2.q = r4
            r2.t = r6
            au.com.woolworths.feature.product.list.ProductsListRepository r6 = r0.f5251a
            r7 = r19
            java.lang.Object r1 = r6.g(r7, r1, r2)
            if (r1 != r3) goto L61
            goto Lc1
        L61:
            r6 = r4
        L62:
            r6.d = r1
            java.lang.Object r1 = r4.d
            au.com.woolworths.feature.product.list.data.ProductListData r1 = (au.com.woolworths.feature.product.list.data.ProductListData) r1
            au.com.woolworths.feature.product.list.data.ProductListData r1 = r0.M(r1)
            r4.d = r1
        L6e:
            kotlinx.coroutines.flow.MutableStateFlow r1 = r0.l
            java.lang.Object r6 = r1.getValue()
            r7 = r6
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r7 = (au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow) r7
            java.lang.Object r8 = r4.d
            au.com.woolworths.feature.product.list.data.ProductListData r8 = (au.com.woolworths.feature.product.list.data.ProductListData) r8
            java.lang.String r8 = r8.getPageTitle()
            java.lang.Object r9 = r4.d
            au.com.woolworths.feature.product.list.data.ProductListData r9 = (au.com.woolworths.feature.product.list.data.ProductListData) r9
            java.util.List r9 = r9.getChips()
            java.lang.Object r10 = r4.d
            au.com.woolworths.feature.product.list.data.ProductListData r10 = (au.com.woolworths.feature.product.list.data.ProductListData) r10
            java.util.List r10 = r10.getFacetChips()
            java.lang.Object r11 = r4.d
            au.com.woolworths.feature.product.list.data.ProductListData r11 = (au.com.woolworths.feature.product.list.data.ProductListData) r11
            au.com.woolworths.feature.product.list.data.ZeroResultPageData r11 = r11.getZeroResultContent()
            java.lang.Object r12 = r4.d
            au.com.woolworths.feature.product.list.data.ProductListData r12 = (au.com.woolworths.feature.product.list.data.ProductListData) r12
            int r13 = r12.getD()
            r15 = 0
            r16 = 3388(0xd3c, float:4.748E-42)
            r12 = 0
            r14 = 0
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r7 = au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = r1.d(r6, r7)
            if (r1 == 0) goto L6e
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPriceFamily$3 r1 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByPriceFamily$3
            r6 = 0
            r1.<init>(r4, r6)
            r2.p = r4
            r2.q = r6
            r2.t = r5
            r5 = 0
            java.lang.Object r1 = r0.a(r5, r1, r2)
            if (r1 != r3) goto Lc2
        Lc1:
            return r3
        Lc2:
            r2 = r4
        Lc3:
            java.lang.Object r1 = r2.d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.m(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map, kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Integer r20, au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r21, java.lang.String r22, java.lang.String r23, boolean r24, java.lang.String r25, au.com.woolworths.feature.product.list.data.ProductListData r26, java.util.Map r27, java.lang.String r28, java.lang.String r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.n(java.lang.Integer, au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, java.lang.String, boolean, java.lang.String, au.com.woolworths.feature.product.list.data.ProductListData, java.util.Map, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.util.List r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByProductIds$1
            if (r2 == 0) goto L18
            r2 = r1
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByProductIds$1 r2 = (au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByProductIds$1) r2
            int r3 = r2.s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.s = r3
        L16:
            r7 = r2
            goto L1e
        L18:
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByProductIds$1 r2 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByProductIds$1
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r7.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r7.s
            r9 = 2
            r4 = 1
            if (r3 == 0) goto L3e
            if (r3 == r4) goto L3a
            if (r3 != r9) goto L32
            au.com.woolworths.feature.product.list.data.ProductListData r2 = r7.p
            kotlin.ResultKt.b(r1)
            return r2
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.ResultKt.b(r1)
            goto L57
        L3e:
            kotlin.ResultKt.b(r1)
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r1 = r0.c
            java.lang.String r5 = r1.f()
            r7.s = r4
            au.com.woolworths.product.interactor.ProductsInteractor r3 = r0.b
            r6 = 0
            r8 = 12
            r4 = r21
            java.lang.Object r1 = au.com.woolworths.product.interactor.ProductsInteractor.a(r3, r4, r5, r6, r7, r8)
            if (r1 != r2) goto L57
            goto L9c
        L57:
            au.com.woolworths.product.models.ProductListByProductIdsApiData r1 = (au.com.woolworths.product.models.ProductListByProductIdsApiData) r1
            au.com.woolworths.feature.product.list.data.ProductListData r1 = au.com.woolworths.feature.product.list.data.ProductListDataKt.toProductListData(r1)
        L5d:
            kotlinx.coroutines.flow.MutableStateFlow r3 = r0.l
            java.lang.Object r4 = r3.getValue()
            r10 = r4
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r10 = (au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow) r10
            java.lang.String r11 = r1.getPageTitle()
            java.util.List r12 = r1.getChips()
            java.util.List r13 = r1.getFacetChips()
            au.com.woolworths.feature.product.list.data.ZeroResultPageData r14 = r1.getZeroResultContent()
            int r16 = r1.getD()
            r18 = 0
            r19 = 3388(0xd3c, float:4.748E-42)
            r15 = 0
            r17 = 0
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r5 = au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r3 = r3.d(r4, r5)
            if (r3 == 0) goto L5d
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByProductIds$3 r3 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByProductIds$3
            r4 = 0
            r3.<init>(r1, r4)
            r7.p = r1
            r7.s = r9
            r4 = 0
            java.lang.Object r3 = r0.a(r4, r3, r7)
            if (r3 != r2) goto L9d
        L9c:
            return r2
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.p(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Integer r18, java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByRecipeId$1
            if (r2 == 0) goto L17
            r2 = r1
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByRecipeId$1 r2 = (au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByRecipeId$1) r2
            int r3 = r2.s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.s = r3
            goto L1c
        L17:
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByRecipeId$1 r2 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByRecipeId$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.s
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3c
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            au.com.woolworths.feature.product.list.data.ProductListData r2 = r2.p
            kotlin.ResultKt.b(r1)
            return r2
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.b(r1)
            goto L54
        L3c:
            kotlin.ResultKt.b(r1)
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r1 = r0.c
            java.lang.String r1 = r1.f()
            r2.s = r6
            au.com.woolworths.feature.product.list.ProductsListRepository r4 = r0.f5251a
            r6 = r18
            r7 = r19
            java.lang.Object r1 = r4.h(r7, r1, r6, r2)
            if (r1 != r3) goto L54
            goto L93
        L54:
            au.com.woolworths.feature.product.list.data.ProductListData r1 = (au.com.woolworths.feature.product.list.data.ProductListData) r1
        L56:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r0.l
            java.lang.Object r6 = r4.getValue()
            r7 = r6
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r7 = (au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow) r7
            java.lang.String r8 = r1.getPageTitle()
            java.util.List r9 = r1.getChips()
            java.util.List r10 = r1.getFacetChips()
            au.com.woolworths.feature.product.list.data.ZeroResultPageData r11 = r1.getZeroResultContent()
            int r13 = r1.getD()
            r15 = 0
            r16 = 3388(0xd3c, float:4.748E-42)
            r12 = 0
            r14 = 0
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r7 = au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r4 = r4.d(r6, r7)
            if (r4 == 0) goto L56
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByRecipeId$3 r4 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListByRecipeId$3
            r6 = 0
            r4.<init>(r1, r6)
            r2.p = r1
            r2.s = r5
            r5 = 0
            java.lang.Object r2 = r0.a(r5, r4, r2)
            if (r2 != r3) goto L94
        L93:
            return r3
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.q(java.lang.Integer, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.Map, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, java.util.Map, kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r18v0, types: [au.com.woolworths.feature.product.list.ProductListInteractor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Integer r19, au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.List r24, java.util.Map r25, java.lang.String r26, boolean r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.r(java.lang.Integer, au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Map, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map, kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Integer r28, au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r29, java.lang.String r30, java.lang.String r31, au.com.woolworths.feature.product.list.data.ProductListData r32, java.lang.String r33, java.util.Map r34, java.lang.String r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.t(java.lang.Integer, au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, java.lang.String, au.com.woolworths.feature.product.list.data.ProductListData, java.lang.String, java.util.Map, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(java.lang.Integer r19, java.lang.String r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.v(java.lang.Integer, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(java.lang.Integer r27, au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r28, java.lang.String r29, au.com.woolworths.feature.product.list.data.ProductListData r30, java.lang.String r31, java.lang.String r32, java.util.Map r33, boolean r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.w(java.lang.Integer, au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, au.com.woolworths.feature.product.list.data.ProductListData, java.lang.String, java.lang.String, java.util.Map, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(java.lang.Integer r21, java.lang.String r22, int r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r24
            boolean r2 = r1 instanceof au.com.woolworths.feature.product.list.ProductListInteractor$fetchSuggestedProductList$1
            if (r2 == 0) goto L18
            r2 = r1
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchSuggestedProductList$1 r2 = (au.com.woolworths.feature.product.list.ProductListInteractor$fetchSuggestedProductList$1) r2
            int r3 = r2.s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.s = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchSuggestedProductList$1 r2 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchSuggestedProductList$1
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r8.s
            r9 = 2
            r4 = 1
            if (r3 == 0) goto L44
            if (r3 == r4) goto L3c
            if (r3 != r9) goto L34
            java.lang.Object r2 = r8.p
            au.com.woolworths.feature.product.list.data.ProductListData r2 = (au.com.woolworths.feature.product.list.data.ProductListData) r2
            kotlin.ResultKt.b(r1)
            return r2
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            java.lang.Object r3 = r8.p
            au.com.woolworths.feature.product.list.ProductListInteractor r3 = (au.com.woolworths.feature.product.list.ProductListInteractor) r3
            kotlin.ResultKt.b(r1)
            goto L62
        L44:
            kotlin.ResultKt.b(r1)
            java.lang.Integer r7 = new java.lang.Integer
            r1 = 50
            r7.<init>(r1)
            r8.p = r0
            r8.s = r4
            au.com.woolworths.feature.product.list.ProductsListRepository r3 = r0.f5251a
            r6 = r21
            r4 = r22
            r5 = r23
            java.lang.Object r1 = r3.j(r4, r5, r6, r7, r8)
            if (r1 != r2) goto L61
            goto La7
        L61:
            r3 = r0
        L62:
            au.com.woolworths.feature.product.list.data.ProductListData r1 = (au.com.woolworths.feature.product.list.data.ProductListData) r1
            au.com.woolworths.feature.product.list.data.ProductListData r1 = r3.M(r1)
        L68:
            kotlinx.coroutines.flow.MutableStateFlow r3 = r0.l
            java.lang.Object r4 = r3.getValue()
            r10 = r4
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r10 = (au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow) r10
            java.lang.String r11 = r1.getPageTitle()
            java.util.List r12 = r1.getChips()
            java.util.List r13 = r1.getFacetChips()
            au.com.woolworths.feature.product.list.data.ZeroResultPageData r14 = r1.getZeroResultContent()
            int r16 = r1.getD()
            r18 = 0
            r19 = 3388(0xd3c, float:4.748E-42)
            r15 = 0
            r17 = 0
            au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r5 = au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r3 = r3.d(r4, r5)
            if (r3 == 0) goto L68
            au.com.woolworths.feature.product.list.ProductListInteractor$fetchSuggestedProductList$3 r3 = new au.com.woolworths.feature.product.list.ProductListInteractor$fetchSuggestedProductList$3
            r4 = 0
            r3.<init>(r1, r4)
            r8.p = r1
            r8.s = r9
            r4 = 0
            java.lang.Object r3 = r0.a(r4, r3, r8)
            if (r3 != r2) goto La8
        La7:
            return r2
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListInteractor.x(java.lang.Integer, java.lang.String, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final ChipsProductListInputArgs y(Integer num, String str) {
        Object obj = null;
        if (!B(num)) {
            str = null;
        }
        List list = ((ProductListContract.ProductListFlow) this.l.getValue()).b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ProductListChip) obj2).isSelected()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ProductListChip) it.next()).getId());
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

    public final String z() {
        Object next;
        Iterator it = ((ProductListContract.ProductListFlow) this.l.getValue()).c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProductListChip) next).isSelected()) {
                break;
            }
        }
        ProductListChip productListChip = (ProductListChip) next;
        if (productListChip != null) {
            return productListChip.getId();
        }
        return null;
    }
}
