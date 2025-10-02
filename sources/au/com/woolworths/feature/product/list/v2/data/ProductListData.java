package au.com.woolworths.feature.product.list.v2.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/data/ProductListData;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListData {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5624a;
    public final Integer b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final InsetBannerApiData h;
    public final ProductMarketPlaceFilterSwitch i;
    public final BottomSheetContent.Marketplace j;
    public final InfoSection k;
    public final List l;
    public final List m;
    public final ProductListZeroResults n;

    public ProductListData(Integer num, Integer num2, String str, List list, List list2, List list3, List list4, InsetBannerApiData insetBannerApiData, ProductMarketPlaceFilterSwitch productMarketPlaceFilterSwitch, BottomSheetContent.Marketplace marketplace, InfoSection infoSection, List list5, List list6, ProductListZeroResults productListZeroResults) {
        this.f5624a = num;
        this.b = num2;
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
        this.h = insetBannerApiData;
        this.i = productMarketPlaceFilterSwitch;
        this.j = marketplace;
        this.k = infoSection;
        this.l = list5;
        this.m = list6;
        this.n = productListZeroResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListData)) {
            return false;
        }
        ProductListData productListData = (ProductListData) obj;
        return Intrinsics.c(this.f5624a, productListData.f5624a) && Intrinsics.c(this.b, productListData.b) && Intrinsics.c(this.c, productListData.c) && Intrinsics.c(this.d, productListData.d) && Intrinsics.c(this.e, productListData.e) && Intrinsics.c(this.f, productListData.f) && Intrinsics.c(this.g, productListData.g) && Intrinsics.c(this.h, productListData.h) && Intrinsics.c(this.i, productListData.i) && Intrinsics.c(this.j, productListData.j) && Intrinsics.c(this.k, productListData.k) && Intrinsics.c(this.l, productListData.l) && Intrinsics.c(this.m, productListData.m) && Intrinsics.c(this.n, productListData.n);
    }

    public final int hashCode() {
        Integer num = this.f5624a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        int iD = b.d(b.d(b.d((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        InsetBannerApiData insetBannerApiData = this.h;
        int iHashCode4 = (iD + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        ProductMarketPlaceFilterSwitch productMarketPlaceFilterSwitch = this.i;
        int iHashCode5 = (iHashCode4 + (productMarketPlaceFilterSwitch == null ? 0 : productMarketPlaceFilterSwitch.hashCode())) * 31;
        BottomSheetContent.Marketplace marketplace = this.j;
        int iHashCode6 = (iHashCode5 + (marketplace == null ? 0 : marketplace.hashCode())) * 31;
        InfoSection infoSection = this.k;
        int iHashCode7 = (iHashCode6 + (infoSection == null ? 0 : infoSection.hashCode())) * 31;
        List list2 = this.l;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.m;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ProductListZeroResults productListZeroResults = this.n;
        return iHashCode9 + (productListZeroResults != null ? productListZeroResults.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = d.v("ProductListData(totalNumberOfProducts=", this.f5624a, ", nextPage=", this.b, ", pageTitle=");
        a.B(sbV, this.c, ", analytics=", this.d, ", productsFeed=");
        a.C(sbV, this.e, ", filters=", this.f, ", sortOptions=");
        sbV.append(this.g);
        sbV.append(", sortOptionsBanner=");
        sbV.append(this.h);
        sbV.append(", marketplaceFilterSwitch=");
        sbV.append(this.i);
        sbV.append(", marketplaceBottomSheet=");
        sbV.append(this.j);
        sbV.append(", marketplaceInfo=");
        sbV.append(this.k);
        sbV.append(", chips=");
        sbV.append(this.l);
        sbV.append(", facetChips=");
        sbV.append(this.m);
        sbV.append(", zeroResult=");
        sbV.append(this.n);
        sbV.append(")");
        return sbV.toString();
    }
}
