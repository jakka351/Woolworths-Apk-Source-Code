package au.com.woolworths.feature.product.list.legacy.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.pagingutils.NumericPageData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListData;", "Lau/com/woolworths/pagingutils/NumericPageData;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListData implements NumericPageData<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final List f5365a;
    public final List b;
    public final List c;
    public final int d;
    public final Integer e;
    public final List f;
    public final List g;
    public final InsetBannerData h;
    public final ProductFilterSwitch i;
    public final List j;
    public final InfoSection k;
    public final BottomSheetContent.Marketplace l;
    public final ZeroResultPageData m;
    public final List n;
    public final List o;
    public final String p;
    public final ProductListZeroResults q;
    public boolean r;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductListData(List list, List list2, List list3, int i, Integer num, List list4, List list5, InsetBannerData insetBannerData, ProductFilterSwitch productFilterSwitch, ArrayList arrayList, InfoSection infoSection, BottomSheetContent.Marketplace marketplace, ZeroResultPageData zeroResultPageData, List list6, List list7, String str, ProductListZeroResults productListZeroResults, int i2) {
        InsetBannerData insetBannerData2 = (i2 & 128) != 0 ? null : insetBannerData;
        ProductFilterSwitch productFilterSwitch2 = (i2 & 256) != 0 ? null : productFilterSwitch;
        ArrayList arrayList2 = (i2 & 512) != 0 ? null : arrayList;
        InfoSection infoSection2 = (i2 & 1024) != 0 ? null : infoSection;
        BottomSheetContent.Marketplace marketplace2 = (i2 & 2048) != 0 ? null : marketplace;
        ZeroResultPageData zeroResultPageData2 = (i2 & 4096) != 0 ? null : zeroResultPageData;
        int i3 = i2 & 8192;
        EmptyList emptyList = EmptyList.d;
        this(list, list2, list3, i, num, list4, list5, insetBannerData2, productFilterSwitch2, arrayList2, infoSection2, marketplace2, zeroResultPageData2, i3 != 0 ? emptyList : list6, (i2 & 16384) != 0 ? emptyList : list7, (32768 & i2) != 0 ? null : str, (i2 & 65536) != 0 ? null : productListZeroResults);
    }

    public static ProductListData a(ProductListData productListData, List list) {
        List list2 = productListData.f5365a;
        List list3 = productListData.c;
        int i = productListData.d;
        Integer num = productListData.e;
        List filterList = productListData.f;
        List sortList = productListData.g;
        InsetBannerData insetBannerData = productListData.h;
        ProductFilterSwitch productFilterSwitch = productListData.i;
        List list4 = productListData.j;
        InfoSection infoSection = productListData.k;
        BottomSheetContent.Marketplace marketplace = productListData.l;
        ZeroResultPageData zeroResultPageData = productListData.m;
        List chips = productListData.n;
        List facetChips = productListData.o;
        String str = productListData.p;
        ProductListZeroResults productListZeroResults = productListData.q;
        productListData.getClass();
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(chips, "chips");
        Intrinsics.h(facetChips, "facetChips");
        return new ProductListData(list2, list, list3, i, num, filterList, sortList, insetBannerData, productFilterSwitch, list4, infoSection, marketplace, zeroResultPageData, chips, facetChips, str, productListZeroResults);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListData)) {
            return false;
        }
        ProductListData productListData = (ProductListData) obj;
        return Intrinsics.c(this.f5365a, productListData.f5365a) && Intrinsics.c(this.b, productListData.b) && Intrinsics.c(this.c, productListData.c) && this.d == productListData.d && Intrinsics.c(this.e, productListData.e) && Intrinsics.c(this.f, productListData.f) && Intrinsics.c(this.g, productListData.g) && Intrinsics.c(this.h, productListData.h) && Intrinsics.c(this.i, productListData.i) && Intrinsics.c(this.j, productListData.j) && Intrinsics.c(this.k, productListData.k) && Intrinsics.c(this.l, productListData.l) && Intrinsics.c(this.m, productListData.m) && Intrinsics.c(this.n, productListData.n) && Intrinsics.c(this.o, productListData.o) && Intrinsics.c(this.p, productListData.p) && Intrinsics.c(this.q, productListData.q);
    }

    @Override // au.com.woolworths.pagingutils.PageData
    /* renamed from: getItems */
    public final List getC() {
        List list = this.b;
        if (list != null) {
            return list;
        }
        List list2 = this.f5365a;
        if (list2 != null) {
            return list2;
        }
        List list3 = Collections.EMPTY_LIST;
        Intrinsics.g(list3, "emptyList(...)");
        return list3;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    public final Object getNextPageKey() {
        return this.e;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    /* renamed from: getTotalCount, reason: from getter */
    public final int getD() {
        return this.d;
    }

    public final int hashCode() {
        List list = this.f5365a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        int iA = b.a(this.d, (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31, 31);
        Integer num = this.e;
        int iD = b.d(b.d((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.f), 31, this.g);
        InsetBannerData insetBannerData = this.h;
        int iHashCode3 = (iD + (insetBannerData == null ? 0 : insetBannerData.hashCode())) * 31;
        ProductFilterSwitch productFilterSwitch = this.i;
        int iHashCode4 = (iHashCode3 + (productFilterSwitch == null ? 0 : productFilterSwitch.hashCode())) * 31;
        List list4 = this.j;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        InfoSection infoSection = this.k;
        int iHashCode6 = (iHashCode5 + (infoSection == null ? 0 : infoSection.hashCode())) * 31;
        BottomSheetContent.Marketplace marketplace = this.l;
        int iHashCode7 = (iHashCode6 + (marketplace == null ? 0 : marketplace.hashCode())) * 31;
        ZeroResultPageData zeroResultPageData = this.m;
        int iD2 = b.d(b.d((iHashCode7 + (zeroResultPageData == null ? 0 : zeroResultPageData.hashCode())) * 31, 31, this.n), 31, this.o);
        String str = this.p;
        int iHashCode8 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        ProductListZeroResults productListZeroResults = this.q;
        return iHashCode8 + (productListZeroResults != null ? productListZeroResults.hashCode() : 0);
    }

    public final String toString() {
        return "ProductListData(products=" + this.f5365a + ", productsFeed=" + this.b + ", analytics=" + this.c + ", totalCount=" + this.d + ", nextPageKey=" + this.e + ", filterList=" + this.f + ", sortList=" + this.g + ", sortOptionsBanner=" + this.h + ", marketplaceProductsSwitch=" + this.i + ", customMessages=" + this.j + ", infoSection=" + this.k + ", bottomSheet=" + this.l + ", zeroResultContent=" + this.m + ", chips=" + this.n + ", facetChips=" + this.o + ", pageTitle=" + this.p + ", zeroResult=" + this.q + ")";
    }

    public ProductListData(List list, List list2, List list3, int i, Integer num, List filterList, List sortList, InsetBannerData insetBannerData, ProductFilterSwitch productFilterSwitch, List list4, InfoSection infoSection, BottomSheetContent.Marketplace marketplace, ZeroResultPageData zeroResultPageData, List chips, List facetChips, String str, ProductListZeroResults productListZeroResults) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(chips, "chips");
        Intrinsics.h(facetChips, "facetChips");
        this.f5365a = list;
        this.b = list2;
        this.c = list3;
        this.d = i;
        this.e = num;
        this.f = filterList;
        this.g = sortList;
        this.h = insetBannerData;
        this.i = productFilterSwitch;
        this.j = list4;
        this.k = infoSection;
        this.l = marketplace;
        this.m = zeroResultPageData;
        this.n = chips;
        this.o = facetChips;
        this.p = str;
        this.q = productListZeroResults;
    }
}
