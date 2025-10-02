package au.com.woolworths.feature.product.list.legacy.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListOnSpecialByCategoryApiData;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListOnSpecialByCategoryApiData {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5366a;
    public final Integer b;
    public final Integer c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ProductFilterSwitch g;
    public final InfoSection h;
    public final BottomSheetContent.Marketplace i;
    public final InsetBannerApiData j;
    public final Object k;

    public ProductListOnSpecialByCategoryApiData(InsetBannerApiData insetBannerApiData, InfoSection infoSection, ProductFilterSwitch productFilterSwitch, BottomSheetContent.Marketplace marketplace, Integer num, Integer num2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, List list, List list2) {
        this.f5366a = list;
        this.b = num;
        this.c = num2;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
        this.g = productFilterSwitch;
        this.h = infoSection;
        this.i = marketplace;
        this.j = insetBannerApiData;
        this.k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListOnSpecialByCategoryApiData)) {
            return false;
        }
        ProductListOnSpecialByCategoryApiData productListOnSpecialByCategoryApiData = (ProductListOnSpecialByCategoryApiData) obj;
        return this.f5366a.equals(productListOnSpecialByCategoryApiData.f5366a) && Intrinsics.c(this.b, productListOnSpecialByCategoryApiData.b) && Intrinsics.c(this.c, productListOnSpecialByCategoryApiData.c) && this.d.equals(productListOnSpecialByCategoryApiData.d) && this.e.equals(productListOnSpecialByCategoryApiData.e) && this.f.equals(productListOnSpecialByCategoryApiData.f) && Intrinsics.c(this.g, productListOnSpecialByCategoryApiData.g) && Intrinsics.c(this.h, productListOnSpecialByCategoryApiData.h) && Intrinsics.c(this.i, productListOnSpecialByCategoryApiData.i) && Intrinsics.c(this.j, productListOnSpecialByCategoryApiData.j) && this.k.equals(productListOnSpecialByCategoryApiData.k);
    }

    public final int hashCode() {
        int iHashCode = this.f5366a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iB = a.b(a.b(a.b((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        ProductFilterSwitch productFilterSwitch = this.g;
        int iHashCode3 = (iB + (productFilterSwitch == null ? 0 : productFilterSwitch.hashCode())) * 31;
        InfoSection infoSection = this.h;
        int iHashCode4 = (iHashCode3 + (infoSection == null ? 0 : infoSection.hashCode())) * 31;
        BottomSheetContent.Marketplace marketplace = this.i;
        int iHashCode5 = (iHashCode4 + (marketplace == null ? 0 : marketplace.hashCode())) * 31;
        InsetBannerApiData insetBannerApiData = this.j;
        return this.k.hashCode() + ((iHashCode5 + (insetBannerApiData != null ? insetBannerApiData.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductListOnSpecialByCategoryApiData(analytics=");
        sb.append(this.f5366a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", nextPageKey=");
        sb.append(this.c);
        sb.append(", productsFeed=");
        sb.append(this.d);
        sb.append(", filterList=");
        sb.append(this.e);
        sb.append(", sortList=");
        sb.append(this.f);
        sb.append(", marketplaceProductsSwitch=");
        sb.append(this.g);
        sb.append(", infoSection=");
        sb.append(this.h);
        sb.append(", bottomSheet=");
        sb.append(this.i);
        sb.append(", sortOptionsBanner=");
        sb.append(this.j);
        sb.append(", chips=");
        return android.support.v4.media.session.a.o(this.k, ")", sb);
    }
}
