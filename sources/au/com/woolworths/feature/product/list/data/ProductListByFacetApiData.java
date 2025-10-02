package au.com.woolworths.feature.product.list.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u008e\u0001\u00103\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0007HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006;"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListByFacetApiData;", "", "products", "", "Lau/com/woolworths/product/models/ProductCard;", "analytics", "totalCount", "", "nextPageKey", "filterList", "Lau/com/woolworths/feature/product/list/data/FilterOptionApiData;", "sortList", "Lau/com/woolworths/feature/product/list/data/SortOption;", "sortOptionsBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "infoSection", "Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "bottomSheet", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;Lau/com/woolworths/base/shopapp/data/models/InfoSection;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;)V", "getProducts$annotations", "()V", "getProducts", "()Ljava/util/List;", "getAnalytics", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPageKey", "getFilterList", "getSortList", "getSortOptionsBanner", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "getInfoSection", "()Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "setInfoSection", "(Lau/com/woolworths/base/shopapp/data/models/InfoSection;)V", "getBottomSheet", "()Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "setBottomSheet", "(Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;Lau/com/woolworths/base/shopapp/data/models/InfoSection;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;)Lau/com/woolworths/feature/product/list/data/ProductListByFacetApiData;", "equals", "", "other", "hashCode", "toString", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByFacetApiData {
    public static final int $stable = 8;

    @Nullable
    private final List<Object> analytics;

    @MappedName
    @Nullable
    private BottomSheetContent.Marketplace bottomSheet;

    @MappedName
    @NotNull
    private final List<FilterOptionApiData> filterList;

    @MappedName
    @Nullable
    private InfoSection infoSection;

    @MappedName
    @Nullable
    private final Integer nextPageKey;

    @Nullable
    private final List<ProductCard> products;

    @MappedName
    @NotNull
    private final List<SortOption> sortList;

    @MappedName
    @Nullable
    private final InsetBannerApiData sortOptionsBanner;

    @MappedName
    @Nullable
    private final Integer totalCount;

    public ProductListByFacetApiData(@Nullable List<ProductCard> list, @Nullable List<? extends Object> list2, @Nullable Integer num, @Nullable Integer num2, @NotNull List<FilterOptionApiData> filterList, @NotNull List<SortOption> sortList, @Nullable InsetBannerApiData insetBannerApiData, @Nullable InfoSection infoSection, @Nullable BottomSheetContent.Marketplace marketplace) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        this.products = list;
        this.analytics = list2;
        this.totalCount = num;
        this.nextPageKey = num2;
        this.filterList = filterList;
        this.sortList = sortList;
        this.sortOptionsBanner = insetBannerApiData;
        this.infoSection = infoSection;
        this.bottomSheet = marketplace;
    }

    public static /* synthetic */ ProductListByFacetApiData copy$default(ProductListByFacetApiData productListByFacetApiData, List list, List list2, Integer num, Integer num2, List list3, List list4, InsetBannerApiData insetBannerApiData, InfoSection infoSection, BottomSheetContent.Marketplace marketplace, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productListByFacetApiData.products;
        }
        if ((i & 2) != 0) {
            list2 = productListByFacetApiData.analytics;
        }
        if ((i & 4) != 0) {
            num = productListByFacetApiData.totalCount;
        }
        if ((i & 8) != 0) {
            num2 = productListByFacetApiData.nextPageKey;
        }
        if ((i & 16) != 0) {
            list3 = productListByFacetApiData.filterList;
        }
        if ((i & 32) != 0) {
            list4 = productListByFacetApiData.sortList;
        }
        if ((i & 64) != 0) {
            insetBannerApiData = productListByFacetApiData.sortOptionsBanner;
        }
        if ((i & 128) != 0) {
            infoSection = productListByFacetApiData.infoSection;
        }
        if ((i & 256) != 0) {
            marketplace = productListByFacetApiData.bottomSheet;
        }
        InfoSection infoSection2 = infoSection;
        BottomSheetContent.Marketplace marketplace2 = marketplace;
        List list5 = list4;
        InsetBannerApiData insetBannerApiData2 = insetBannerApiData;
        List list6 = list3;
        Integer num3 = num;
        return productListByFacetApiData.copy(list, list2, num3, num2, list6, list5, insetBannerApiData2, infoSection2, marketplace2);
    }

    @Deprecated
    public static /* synthetic */ void getProducts$annotations() {
    }

    @Nullable
    public final List<ProductCard> component1() {
        return this.products;
    }

    @Nullable
    public final List<Object> component2() {
        return this.analytics;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getNextPageKey() {
        return this.nextPageKey;
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
    public final InsetBannerApiData getSortOptionsBanner() {
        return this.sortOptionsBanner;
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
    public final ProductListByFacetApiData copy(@Nullable List<ProductCard> products, @Nullable List<? extends Object> analytics, @Nullable Integer totalCount, @Nullable Integer nextPageKey, @NotNull List<FilterOptionApiData> filterList, @NotNull List<SortOption> sortList, @Nullable InsetBannerApiData sortOptionsBanner, @Nullable InfoSection infoSection, @Nullable BottomSheetContent.Marketplace bottomSheet) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        return new ProductListByFacetApiData(products, analytics, totalCount, nextPageKey, filterList, sortList, sortOptionsBanner, infoSection, bottomSheet);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListByFacetApiData)) {
            return false;
        }
        ProductListByFacetApiData productListByFacetApiData = (ProductListByFacetApiData) other;
        return Intrinsics.c(this.products, productListByFacetApiData.products) && Intrinsics.c(this.analytics, productListByFacetApiData.analytics) && Intrinsics.c(this.totalCount, productListByFacetApiData.totalCount) && Intrinsics.c(this.nextPageKey, productListByFacetApiData.nextPageKey) && Intrinsics.c(this.filterList, productListByFacetApiData.filterList) && Intrinsics.c(this.sortList, productListByFacetApiData.sortList) && Intrinsics.c(this.sortOptionsBanner, productListByFacetApiData.sortOptionsBanner) && Intrinsics.c(this.infoSection, productListByFacetApiData.infoSection) && Intrinsics.c(this.bottomSheet, productListByFacetApiData.bottomSheet);
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
    public final List<FilterOptionApiData> getFilterList() {
        return this.filterList;
    }

    @Nullable
    public final InfoSection getInfoSection() {
        return this.infoSection;
    }

    @Nullable
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @Nullable
    public final List<ProductCard> getProducts() {
        return this.products;
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
        List<ProductCard> list = this.products;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Object> list2 = this.analytics;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.totalCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nextPageKey;
        int iD = b.d(b.d((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.filterList), 31, this.sortList);
        InsetBannerApiData insetBannerApiData = this.sortOptionsBanner;
        int iHashCode4 = (iD + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        InfoSection infoSection = this.infoSection;
        int iHashCode5 = (iHashCode4 + (infoSection == null ? 0 : infoSection.hashCode())) * 31;
        BottomSheetContent.Marketplace marketplace = this.bottomSheet;
        return iHashCode5 + (marketplace != null ? marketplace.hashCode() : 0);
    }

    public final void setBottomSheet(@Nullable BottomSheetContent.Marketplace marketplace) {
        this.bottomSheet = marketplace;
    }

    public final void setInfoSection(@Nullable InfoSection infoSection) {
        this.infoSection = infoSection;
    }

    @NotNull
    public String toString() {
        List<ProductCard> list = this.products;
        List<Object> list2 = this.analytics;
        Integer num = this.totalCount;
        Integer num2 = this.nextPageKey;
        List<FilterOptionApiData> list3 = this.filterList;
        List<SortOption> list4 = this.sortList;
        InsetBannerApiData insetBannerApiData = this.sortOptionsBanner;
        InfoSection infoSection = this.infoSection;
        BottomSheetContent.Marketplace marketplace = this.bottomSheet;
        StringBuilder sb = new StringBuilder("ProductListByFacetApiData(products=");
        sb.append(list);
        sb.append(", analytics=");
        sb.append(list2);
        sb.append(", totalCount=");
        sb.append(num);
        sb.append(", nextPageKey=");
        sb.append(num2);
        sb.append(", filterList=");
        a.C(sb, list3, ", sortList=", list4, ", sortOptionsBanner=");
        sb.append(insetBannerApiData);
        sb.append(", infoSection=");
        sb.append(infoSection);
        sb.append(", bottomSheet=");
        sb.append(marketplace);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ProductListByFacetApiData(List list, List list2, Integer num, Integer num2, List list3, List list4, InsetBannerApiData insetBannerApiData, InfoSection infoSection, BottomSheetContent.Marketplace marketplace, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? null : num2, list3, list4, insetBannerApiData, infoSection, marketplace);
    }
}
