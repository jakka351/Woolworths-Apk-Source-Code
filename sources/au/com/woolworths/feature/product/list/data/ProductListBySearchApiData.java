package au.com.woolworths.feature.product.list.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\r0\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003HÆ\u0003JØ\u0001\u0010I\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003HÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\bHÖ\u0001J\t\u0010O\u001a\u00020PHÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b&\u0010$R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u00107R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010 ¨\u0006Q"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListBySearchApiData;", "", "products", "", "Lau/com/woolworths/product/models/ProductCard;", "productsFeed", "analytics", "totalCount", "", "nextPageKey", "filterList", "Lau/com/woolworths/feature/product/list/data/FilterOptionApiData;", "sortList", "Lau/com/woolworths/feature/product/list/data/SortOption;", "sortOptionsBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "marketplaceProductsSwitch", "Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;", "infoSection", "Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "bottomSheet", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "chips", "Lau/com/woolworths/feature/product/list/data/ProductListChip;", "zeroResultContent", "Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;", "facetChips", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;Lau/com/woolworths/base/shopapp/data/models/InfoSection;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;Ljava/util/List;Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;Ljava/util/List;)V", "getProducts$annotations", "()V", "getProducts", "()Ljava/util/List;", "getProductsFeed", "getAnalytics", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPageKey", "getFilterList", "getSortList", "getSortOptionsBanner", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "getMarketplaceProductsSwitch", "()Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;", "getInfoSection", "()Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "setInfoSection", "(Lau/com/woolworths/base/shopapp/data/models/InfoSection;)V", "getBottomSheet", "()Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "setBottomSheet", "(Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;)V", "getChips", "setChips", "(Ljava/util/List;)V", "getZeroResultContent", "()Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;", "getFacetChips", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;Lau/com/woolworths/base/shopapp/data/models/InfoSection;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;Ljava/util/List;Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;Ljava/util/List;)Lau/com/woolworths/feature/product/list/data/ProductListBySearchApiData;", "equals", "", "other", "hashCode", "toString", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListBySearchApiData {
    public static final int $stable = 8;

    @Nullable
    private final List<Object> analytics;

    @MappedName
    @Nullable
    private BottomSheetContent.Marketplace bottomSheet;

    @NotNull
    private List<ProductListChip> chips;

    @NotNull
    private final List<ProductListChip> facetChips;

    @MappedName
    @NotNull
    private final List<FilterOptionApiData> filterList;

    @MappedName
    @Nullable
    private InfoSection infoSection;

    @MappedName
    @Nullable
    private final ProductFilterSwitch marketplaceProductsSwitch;

    @MappedName
    @Nullable
    private final Integer nextPageKey;

    @Nullable
    private final List<ProductCard> products;

    @Nullable
    private final List<Object> productsFeed;

    @MappedName
    @NotNull
    private final List<SortOption> sortList;

    @MappedName
    @Nullable
    private final InsetBannerApiData sortOptionsBanner;

    @MappedName
    @Nullable
    private final Integer totalCount;

    @Nullable
    private final ZeroResultPageData zeroResultContent;

    public ProductListBySearchApiData(@Nullable List<ProductCard> list, @Nullable List<? extends Object> list2, @Nullable List<? extends Object> list3, @Nullable Integer num, @Nullable Integer num2, @NotNull List<FilterOptionApiData> filterList, @NotNull List<SortOption> sortList, @Nullable InsetBannerApiData insetBannerApiData, @Nullable ProductFilterSwitch productFilterSwitch, @Nullable InfoSection infoSection, @Nullable BottomSheetContent.Marketplace marketplace, @NotNull List<ProductListChip> chips, @Nullable ZeroResultPageData zeroResultPageData, @NotNull List<ProductListChip> facetChips) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(chips, "chips");
        Intrinsics.h(facetChips, "facetChips");
        this.products = list;
        this.productsFeed = list2;
        this.analytics = list3;
        this.totalCount = num;
        this.nextPageKey = num2;
        this.filterList = filterList;
        this.sortList = sortList;
        this.sortOptionsBanner = insetBannerApiData;
        this.marketplaceProductsSwitch = productFilterSwitch;
        this.infoSection = infoSection;
        this.bottomSheet = marketplace;
        this.chips = chips;
        this.zeroResultContent = zeroResultPageData;
        this.facetChips = facetChips;
    }

    @Deprecated
    public static /* synthetic */ void getProducts$annotations() {
    }

    @Nullable
    public final List<ProductCard> component1() {
        return this.products;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final InfoSection getInfoSection() {
        return this.infoSection;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final BottomSheetContent.Marketplace getBottomSheet() {
        return this.bottomSheet;
    }

    @NotNull
    public final List<ProductListChip> component12() {
        return this.chips;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final ZeroResultPageData getZeroResultContent() {
        return this.zeroResultContent;
    }

    @NotNull
    public final List<ProductListChip> component14() {
        return this.facetChips;
    }

    @Nullable
    public final List<Object> component2() {
        return this.productsFeed;
    }

    @Nullable
    public final List<Object> component3() {
        return this.analytics;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @NotNull
    public final List<FilterOptionApiData> component6() {
        return this.filterList;
    }

    @NotNull
    public final List<SortOption> component7() {
        return this.sortList;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final InsetBannerApiData getSortOptionsBanner() {
        return this.sortOptionsBanner;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final ProductFilterSwitch getMarketplaceProductsSwitch() {
        return this.marketplaceProductsSwitch;
    }

    @NotNull
    public final ProductListBySearchApiData copy(@Nullable List<ProductCard> products, @Nullable List<? extends Object> productsFeed, @Nullable List<? extends Object> analytics, @Nullable Integer totalCount, @Nullable Integer nextPageKey, @NotNull List<FilterOptionApiData> filterList, @NotNull List<SortOption> sortList, @Nullable InsetBannerApiData sortOptionsBanner, @Nullable ProductFilterSwitch marketplaceProductsSwitch, @Nullable InfoSection infoSection, @Nullable BottomSheetContent.Marketplace bottomSheet, @NotNull List<ProductListChip> chips, @Nullable ZeroResultPageData zeroResultContent, @NotNull List<ProductListChip> facetChips) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(chips, "chips");
        Intrinsics.h(facetChips, "facetChips");
        return new ProductListBySearchApiData(products, productsFeed, analytics, totalCount, nextPageKey, filterList, sortList, sortOptionsBanner, marketplaceProductsSwitch, infoSection, bottomSheet, chips, zeroResultContent, facetChips);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListBySearchApiData)) {
            return false;
        }
        ProductListBySearchApiData productListBySearchApiData = (ProductListBySearchApiData) other;
        return Intrinsics.c(this.products, productListBySearchApiData.products) && Intrinsics.c(this.productsFeed, productListBySearchApiData.productsFeed) && Intrinsics.c(this.analytics, productListBySearchApiData.analytics) && Intrinsics.c(this.totalCount, productListBySearchApiData.totalCount) && Intrinsics.c(this.nextPageKey, productListBySearchApiData.nextPageKey) && Intrinsics.c(this.filterList, productListBySearchApiData.filterList) && Intrinsics.c(this.sortList, productListBySearchApiData.sortList) && Intrinsics.c(this.sortOptionsBanner, productListBySearchApiData.sortOptionsBanner) && Intrinsics.c(this.marketplaceProductsSwitch, productListBySearchApiData.marketplaceProductsSwitch) && Intrinsics.c(this.infoSection, productListBySearchApiData.infoSection) && Intrinsics.c(this.bottomSheet, productListBySearchApiData.bottomSheet) && Intrinsics.c(this.chips, productListBySearchApiData.chips) && Intrinsics.c(this.zeroResultContent, productListBySearchApiData.zeroResultContent) && Intrinsics.c(this.facetChips, productListBySearchApiData.facetChips);
    }

    @Nullable
    public final List<Object> getAnalytics() {
        return this.analytics;
    }

    @Nullable
    public final BottomSheetContent.Marketplace getBottomSheet() {
        return this.bottomSheet;
    }

    @NotNull
    public final List<ProductListChip> getChips() {
        return this.chips;
    }

    @NotNull
    public final List<ProductListChip> getFacetChips() {
        return this.facetChips;
    }

    @NotNull
    public final List<FilterOptionApiData> getFilterList() {
        return this.filterList;
    }

    @Nullable
    public final InfoSection getInfoSection() {
        return this.infoSection;
    }

    @Nullable
    public final ProductFilterSwitch getMarketplaceProductsSwitch() {
        return this.marketplaceProductsSwitch;
    }

    @Nullable
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @Nullable
    public final List<ProductCard> getProducts() {
        return this.products;
    }

    @Nullable
    public final List<Object> getProductsFeed() {
        return this.productsFeed;
    }

    @NotNull
    public final List<SortOption> getSortList() {
        return this.sortList;
    }

    @Nullable
    public final InsetBannerApiData getSortOptionsBanner() {
        return this.sortOptionsBanner;
    }

    @Nullable
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    public final ZeroResultPageData getZeroResultContent() {
        return this.zeroResultContent;
    }

    public int hashCode() {
        List<ProductCard> list = this.products;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Object> list2 = this.productsFeed;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Object> list3 = this.analytics;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.totalCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nextPageKey;
        int iD = b.d(b.d((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.filterList), 31, this.sortList);
        InsetBannerApiData insetBannerApiData = this.sortOptionsBanner;
        int iHashCode5 = (iD + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        ProductFilterSwitch productFilterSwitch = this.marketplaceProductsSwitch;
        int iHashCode6 = (iHashCode5 + (productFilterSwitch == null ? 0 : productFilterSwitch.hashCode())) * 31;
        InfoSection infoSection = this.infoSection;
        int iHashCode7 = (iHashCode6 + (infoSection == null ? 0 : infoSection.hashCode())) * 31;
        BottomSheetContent.Marketplace marketplace = this.bottomSheet;
        int iD2 = b.d((iHashCode7 + (marketplace == null ? 0 : marketplace.hashCode())) * 31, 31, this.chips);
        ZeroResultPageData zeroResultPageData = this.zeroResultContent;
        return this.facetChips.hashCode() + ((iD2 + (zeroResultPageData != null ? zeroResultPageData.hashCode() : 0)) * 31);
    }

    public final void setBottomSheet(@Nullable BottomSheetContent.Marketplace marketplace) {
        this.bottomSheet = marketplace;
    }

    public final void setChips(@NotNull List<ProductListChip> list) {
        Intrinsics.h(list, "<set-?>");
        this.chips = list;
    }

    public final void setInfoSection(@Nullable InfoSection infoSection) {
        this.infoSection = infoSection;
    }

    @NotNull
    public String toString() {
        return "ProductListBySearchApiData(products=" + this.products + ", productsFeed=" + this.productsFeed + ", analytics=" + this.analytics + ", totalCount=" + this.totalCount + ", nextPageKey=" + this.nextPageKey + ", filterList=" + this.filterList + ", sortList=" + this.sortList + ", sortOptionsBanner=" + this.sortOptionsBanner + ", marketplaceProductsSwitch=" + this.marketplaceProductsSwitch + ", infoSection=" + this.infoSection + ", bottomSheet=" + this.bottomSheet + ", chips=" + this.chips + ", zeroResultContent=" + this.zeroResultContent + ", facetChips=" + this.facetChips + ")";
    }

    public /* synthetic */ ProductListBySearchApiData(List list, List list2, List list3, Integer num, Integer num2, List list4, List list5, InsetBannerApiData insetBannerApiData, ProductFilterSwitch productFilterSwitch, InfoSection infoSection, BottomSheetContent.Marketplace marketplace, List list6, ZeroResultPageData zeroResultPageData, List list7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i & 8) != 0 ? 0 : num, (i & 16) != 0 ? null : num2, list4, list5, insetBannerApiData, productFilterSwitch, infoSection, marketplace, list6, zeroResultPageData, (i & 8192) != 0 ? EmptyList.d : list7);
    }
}
