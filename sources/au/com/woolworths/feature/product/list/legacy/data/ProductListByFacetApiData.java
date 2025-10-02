package au.com.woolworths.feature.product.list.legacy.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListByFacetApiData;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByFacetApiData {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5357a;
    public final Integer b;
    public final Integer c;
    public final ArrayList d;
    public final ArrayList e;
    public final InsetBannerApiData f;
    public final InfoSection g;
    public final BottomSheetContent.Marketplace h;

    public ProductListByFacetApiData(ArrayList arrayList, Integer num, Integer num2, ArrayList arrayList2, ArrayList arrayList3, InsetBannerApiData insetBannerApiData, InfoSection infoSection, BottomSheetContent.Marketplace marketplace) {
        this.f5357a = arrayList;
        this.b = num;
        this.c = num2;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = insetBannerApiData;
        this.g = infoSection;
        this.h = marketplace;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListByFacetApiData)) {
            return false;
        }
        ProductListByFacetApiData productListByFacetApiData = (ProductListByFacetApiData) obj;
        return this.f5357a.equals(productListByFacetApiData.f5357a) && Intrinsics.c(this.b, productListByFacetApiData.b) && Intrinsics.c(this.c, productListByFacetApiData.c) && this.d.equals(productListByFacetApiData.d) && this.e.equals(productListByFacetApiData.e) && Intrinsics.c(this.f, productListByFacetApiData.f) && Intrinsics.c(this.g, productListByFacetApiData.g) && Intrinsics.c(this.h, productListByFacetApiData.h);
    }

    public final int hashCode() {
        int iHashCode = this.f5357a.hashCode() * 961;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iB = a.b(a.b((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.d), 31, this.e);
        InsetBannerApiData insetBannerApiData = this.f;
        int iHashCode3 = (iB + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        InfoSection infoSection = this.g;
        int iHashCode4 = (iHashCode3 + (infoSection == null ? 0 : infoSection.hashCode())) * 31;
        BottomSheetContent.Marketplace marketplace = this.h;
        return iHashCode4 + (marketplace != null ? marketplace.hashCode() : 0);
    }

    public final String toString() {
        return "ProductListByFacetApiData(products=" + this.f5357a + ", analytics=null, totalCount=" + this.b + ", nextPageKey=" + this.c + ", filterList=" + this.d + ", sortList=" + this.e + ", sortOptionsBanner=" + this.f + ", infoSection=" + this.g + ", bottomSheet=" + this.h + ")";
    }
}
