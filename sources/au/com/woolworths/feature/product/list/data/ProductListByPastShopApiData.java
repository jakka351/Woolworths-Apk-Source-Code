package au.com.woolworths.feature.product.list.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.MappedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003Jd\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListByPastShopApiData;", "", "totalCount", "", "nextPageKey", "productsFeed", "", "filterList", "Lau/com/woolworths/feature/product/list/data/FilterOptionApiData;", "sortList", "Lau/com/woolworths/feature/product/list/data/SortOption;", "sortOptionsBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;)V", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPageKey", "getProductsFeed", "()Ljava/util/List;", "getFilterList", "getSortList", "getSortOptionsBanner", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;)Lau/com/woolworths/feature/product/list/data/ProductListByPastShopApiData;", "equals", "", "other", "hashCode", "toString", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByPastShopApiData {
    public static final int $stable = 8;

    @MappedName
    @NotNull
    private final List<FilterOptionApiData> filterList;

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

    public ProductListByPastShopApiData(@Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends Object> list, @NotNull List<FilterOptionApiData> filterList, @NotNull List<SortOption> sortList, @Nullable InsetBannerApiData insetBannerApiData) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        this.totalCount = num;
        this.nextPageKey = num2;
        this.productsFeed = list;
        this.filterList = filterList;
        this.sortList = sortList;
        this.sortOptionsBanner = insetBannerApiData;
    }

    public static /* synthetic */ ProductListByPastShopApiData copy$default(ProductListByPastShopApiData productListByPastShopApiData, Integer num, Integer num2, List list, List list2, List list3, InsetBannerApiData insetBannerApiData, int i, Object obj) {
        if ((i & 1) != 0) {
            num = productListByPastShopApiData.totalCount;
        }
        if ((i & 2) != 0) {
            num2 = productListByPastShopApiData.nextPageKey;
        }
        if ((i & 4) != 0) {
            list = productListByPastShopApiData.productsFeed;
        }
        if ((i & 8) != 0) {
            list2 = productListByPastShopApiData.filterList;
        }
        if ((i & 16) != 0) {
            list3 = productListByPastShopApiData.sortList;
        }
        if ((i & 32) != 0) {
            insetBannerApiData = productListByPastShopApiData.sortOptionsBanner;
        }
        List list4 = list3;
        InsetBannerApiData insetBannerApiData2 = insetBannerApiData;
        return productListByPastShopApiData.copy(num, num2, list, list2, list4, insetBannerApiData2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @Nullable
    public final List<Object> component3() {
        return this.productsFeed;
    }

    @NotNull
    public final List<FilterOptionApiData> component4() {
        return this.filterList;
    }

    @NotNull
    public final List<SortOption> component5() {
        return this.sortList;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final InsetBannerApiData getSortOptionsBanner() {
        return this.sortOptionsBanner;
    }

    @NotNull
    public final ProductListByPastShopApiData copy(@Nullable Integer totalCount, @Nullable Integer nextPageKey, @Nullable List<? extends Object> productsFeed, @NotNull List<FilterOptionApiData> filterList, @NotNull List<SortOption> sortList, @Nullable InsetBannerApiData sortOptionsBanner) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        return new ProductListByPastShopApiData(totalCount, nextPageKey, productsFeed, filterList, sortList, sortOptionsBanner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListByPastShopApiData)) {
            return false;
        }
        ProductListByPastShopApiData productListByPastShopApiData = (ProductListByPastShopApiData) other;
        return Intrinsics.c(this.totalCount, productListByPastShopApiData.totalCount) && Intrinsics.c(this.nextPageKey, productListByPastShopApiData.nextPageKey) && Intrinsics.c(this.productsFeed, productListByPastShopApiData.productsFeed) && Intrinsics.c(this.filterList, productListByPastShopApiData.filterList) && Intrinsics.c(this.sortList, productListByPastShopApiData.sortList) && Intrinsics.c(this.sortOptionsBanner, productListByPastShopApiData.sortOptionsBanner);
    }

    @NotNull
    public final List<FilterOptionApiData> getFilterList() {
        return this.filterList;
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
        Integer num = this.totalCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.nextPageKey;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Object> list = this.productsFeed;
        int iD = b.d(b.d((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.filterList), 31, this.sortList);
        InsetBannerApiData insetBannerApiData = this.sortOptionsBanner;
        return iD + (insetBannerApiData != null ? insetBannerApiData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.totalCount;
        Integer num2 = this.nextPageKey;
        List<Object> list = this.productsFeed;
        List<FilterOptionApiData> list2 = this.filterList;
        List<SortOption> list3 = this.sortList;
        InsetBannerApiData insetBannerApiData = this.sortOptionsBanner;
        StringBuilder sbV = d.v("ProductListByPastShopApiData(totalCount=", num, ", nextPageKey=", num2, ", productsFeed=");
        a.C(sbV, list, ", filterList=", list2, ", sortList=");
        sbV.append(list3);
        sbV.append(", sortOptionsBanner=");
        sbV.append(insetBannerApiData);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ ProductListByPastShopApiData(Integer num, Integer num2, List list, List list2, List list3, InsetBannerApiData insetBannerApiData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : num2, list, list2, list3, insetBannerApiData);
    }
}
