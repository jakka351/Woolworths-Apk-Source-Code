package au.com.woolworths.feature.product.list.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.graphql.MappedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003HÆ\u0003Jª\u0001\u0010;\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0005HÖ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010/¨\u0006C"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListOnSpecialByCategoryApiData;", "", "analytics", "", "totalCount", "", "nextPageKey", "productsFeed", "filterList", "Lau/com/woolworths/feature/product/list/data/FilterOptionApiData;", "sortList", "Lau/com/woolworths/feature/product/list/data/SortOption;", "marketplaceProductsSwitch", "Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;", "infoSection", "Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "bottomSheet", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "sortOptionsBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "chips", "Lau/com/woolworths/feature/product/list/data/ProductListChip;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;Lau/com/woolworths/base/shopapp/data/models/InfoSection;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;Ljava/util/List;)V", "getAnalytics", "()Ljava/util/List;", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPageKey", "getProductsFeed", "getFilterList", "getSortList", "getMarketplaceProductsSwitch", "()Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;", "getInfoSection", "()Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "setInfoSection", "(Lau/com/woolworths/base/shopapp/data/models/InfoSection;)V", "getBottomSheet", "()Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "setBottomSheet", "(Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;)V", "getSortOptionsBanner", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "getChips", "setChips", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;Lau/com/woolworths/base/shopapp/data/models/InfoSection;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;Ljava/util/List;)Lau/com/woolworths/feature/product/list/data/ProductListOnSpecialByCategoryApiData;", "equals", "", "other", "hashCode", "toString", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListOnSpecialByCategoryApiData {
    public static final int $stable = 8;

    @Nullable
    private final List<Object> analytics;

    @MappedName
    @Nullable
    private BottomSheetContent.Marketplace bottomSheet;

    @NotNull
    private List<ProductListChip> chips;

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

    public ProductListOnSpecialByCategoryApiData(@Nullable List<? extends Object> list, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends Object> list2, @NotNull List<FilterOptionApiData> filterList, @NotNull List<SortOption> sortList, @Nullable ProductFilterSwitch productFilterSwitch, @Nullable InfoSection infoSection, @Nullable BottomSheetContent.Marketplace marketplace, @Nullable InsetBannerApiData insetBannerApiData, @NotNull List<ProductListChip> chips) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(chips, "chips");
        this.analytics = list;
        this.totalCount = num;
        this.nextPageKey = num2;
        this.productsFeed = list2;
        this.filterList = filterList;
        this.sortList = sortList;
        this.marketplaceProductsSwitch = productFilterSwitch;
        this.infoSection = infoSection;
        this.bottomSheet = marketplace;
        this.sortOptionsBanner = insetBannerApiData;
        this.chips = chips;
    }

    public static /* synthetic */ ProductListOnSpecialByCategoryApiData copy$default(ProductListOnSpecialByCategoryApiData productListOnSpecialByCategoryApiData, List list, Integer num, Integer num2, List list2, List list3, List list4, ProductFilterSwitch productFilterSwitch, InfoSection infoSection, BottomSheetContent.Marketplace marketplace, InsetBannerApiData insetBannerApiData, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productListOnSpecialByCategoryApiData.analytics;
        }
        if ((i & 2) != 0) {
            num = productListOnSpecialByCategoryApiData.totalCount;
        }
        if ((i & 4) != 0) {
            num2 = productListOnSpecialByCategoryApiData.nextPageKey;
        }
        if ((i & 8) != 0) {
            list2 = productListOnSpecialByCategoryApiData.productsFeed;
        }
        if ((i & 16) != 0) {
            list3 = productListOnSpecialByCategoryApiData.filterList;
        }
        if ((i & 32) != 0) {
            list4 = productListOnSpecialByCategoryApiData.sortList;
        }
        if ((i & 64) != 0) {
            productFilterSwitch = productListOnSpecialByCategoryApiData.marketplaceProductsSwitch;
        }
        if ((i & 128) != 0) {
            infoSection = productListOnSpecialByCategoryApiData.infoSection;
        }
        if ((i & 256) != 0) {
            marketplace = productListOnSpecialByCategoryApiData.bottomSheet;
        }
        if ((i & 512) != 0) {
            insetBannerApiData = productListOnSpecialByCategoryApiData.sortOptionsBanner;
        }
        if ((i & 1024) != 0) {
            list5 = productListOnSpecialByCategoryApiData.chips;
        }
        InsetBannerApiData insetBannerApiData2 = insetBannerApiData;
        List list6 = list5;
        InfoSection infoSection2 = infoSection;
        BottomSheetContent.Marketplace marketplace2 = marketplace;
        List list7 = list4;
        ProductFilterSwitch productFilterSwitch2 = productFilterSwitch;
        List list8 = list3;
        Integer num3 = num2;
        return productListOnSpecialByCategoryApiData.copy(list, num, num3, list2, list8, list7, productFilterSwitch2, infoSection2, marketplace2, insetBannerApiData2, list6);
    }

    @Nullable
    public final List<Object> component1() {
        return this.analytics;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final InsetBannerApiData getSortOptionsBanner() {
        return this.sortOptionsBanner;
    }

    @NotNull
    public final List<ProductListChip> component11() {
        return this.chips;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @Nullable
    public final List<Object> component4() {
        return this.productsFeed;
    }

    @NotNull
    public final List<FilterOptionApiData> component5() {
        return this.filterList;
    }

    @NotNull
    public final List<SortOption> component6() {
        return this.sortList;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final ProductFilterSwitch getMarketplaceProductsSwitch() {
        return this.marketplaceProductsSwitch;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final InfoSection getInfoSection() {
        return this.infoSection;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final BottomSheetContent.Marketplace getBottomSheet() {
        return this.bottomSheet;
    }

    @NotNull
    public final ProductListOnSpecialByCategoryApiData copy(@Nullable List<? extends Object> analytics, @Nullable Integer totalCount, @Nullable Integer nextPageKey, @Nullable List<? extends Object> productsFeed, @NotNull List<FilterOptionApiData> filterList, @NotNull List<SortOption> sortList, @Nullable ProductFilterSwitch marketplaceProductsSwitch, @Nullable InfoSection infoSection, @Nullable BottomSheetContent.Marketplace bottomSheet, @Nullable InsetBannerApiData sortOptionsBanner, @NotNull List<ProductListChip> chips) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(chips, "chips");
        return new ProductListOnSpecialByCategoryApiData(analytics, totalCount, nextPageKey, productsFeed, filterList, sortList, marketplaceProductsSwitch, infoSection, bottomSheet, sortOptionsBanner, chips);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListOnSpecialByCategoryApiData)) {
            return false;
        }
        ProductListOnSpecialByCategoryApiData productListOnSpecialByCategoryApiData = (ProductListOnSpecialByCategoryApiData) other;
        return Intrinsics.c(this.analytics, productListOnSpecialByCategoryApiData.analytics) && Intrinsics.c(this.totalCount, productListOnSpecialByCategoryApiData.totalCount) && Intrinsics.c(this.nextPageKey, productListOnSpecialByCategoryApiData.nextPageKey) && Intrinsics.c(this.productsFeed, productListOnSpecialByCategoryApiData.productsFeed) && Intrinsics.c(this.filterList, productListOnSpecialByCategoryApiData.filterList) && Intrinsics.c(this.sortList, productListOnSpecialByCategoryApiData.sortList) && Intrinsics.c(this.marketplaceProductsSwitch, productListOnSpecialByCategoryApiData.marketplaceProductsSwitch) && Intrinsics.c(this.infoSection, productListOnSpecialByCategoryApiData.infoSection) && Intrinsics.c(this.bottomSheet, productListOnSpecialByCategoryApiData.bottomSheet) && Intrinsics.c(this.sortOptionsBanner, productListOnSpecialByCategoryApiData.sortOptionsBanner) && Intrinsics.c(this.chips, productListOnSpecialByCategoryApiData.chips);
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

    public int hashCode() {
        List<Object> list = this.analytics;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.totalCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nextPageKey;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Object> list2 = this.productsFeed;
        int iD = b.d(b.d((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.filterList), 31, this.sortList);
        ProductFilterSwitch productFilterSwitch = this.marketplaceProductsSwitch;
        int iHashCode4 = (iD + (productFilterSwitch == null ? 0 : productFilterSwitch.hashCode())) * 31;
        InfoSection infoSection = this.infoSection;
        int iHashCode5 = (iHashCode4 + (infoSection == null ? 0 : infoSection.hashCode())) * 31;
        BottomSheetContent.Marketplace marketplace = this.bottomSheet;
        int iHashCode6 = (iHashCode5 + (marketplace == null ? 0 : marketplace.hashCode())) * 31;
        InsetBannerApiData insetBannerApiData = this.sortOptionsBanner;
        return this.chips.hashCode() + ((iHashCode6 + (insetBannerApiData != null ? insetBannerApiData.hashCode() : 0)) * 31);
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
        List<Object> list = this.analytics;
        Integer num = this.totalCount;
        Integer num2 = this.nextPageKey;
        List<Object> list2 = this.productsFeed;
        List<FilterOptionApiData> list3 = this.filterList;
        List<SortOption> list4 = this.sortList;
        ProductFilterSwitch productFilterSwitch = this.marketplaceProductsSwitch;
        InfoSection infoSection = this.infoSection;
        BottomSheetContent.Marketplace marketplace = this.bottomSheet;
        InsetBannerApiData insetBannerApiData = this.sortOptionsBanner;
        List<ProductListChip> list5 = this.chips;
        StringBuilder sb = new StringBuilder("ProductListOnSpecialByCategoryApiData(analytics=");
        sb.append(list);
        sb.append(", totalCount=");
        sb.append(num);
        sb.append(", nextPageKey=");
        sb.append(num2);
        sb.append(", productsFeed=");
        sb.append(list2);
        sb.append(", filterList=");
        a.C(sb, list3, ", sortList=", list4, ", marketplaceProductsSwitch=");
        sb.append(productFilterSwitch);
        sb.append(", infoSection=");
        sb.append(infoSection);
        sb.append(", bottomSheet=");
        sb.append(marketplace);
        sb.append(", sortOptionsBanner=");
        sb.append(insetBannerApiData);
        sb.append(", chips=");
        return android.support.v4.media.session.a.t(sb, list5, ")");
    }

    public /* synthetic */ ProductListOnSpecialByCategoryApiData(List list, Integer num, Integer num2, List list2, List list3, List list4, ProductFilterSwitch productFilterSwitch, InfoSection infoSection, BottomSheetContent.Marketplace marketplace, InsetBannerApiData insetBannerApiData, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? null : num2, list2, list3, list4, productFilterSwitch, infoSection, marketplace, insetBannerApiData, list5);
    }
}
