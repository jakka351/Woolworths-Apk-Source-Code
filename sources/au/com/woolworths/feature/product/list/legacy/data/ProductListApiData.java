package au.com.woolworths.feature.product.list.legacy.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListApiData;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListApiData {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5355a;
    public final Object b;
    public final Integer c;
    public final Integer d;
    public final ArrayList e;
    public final ArrayList f;
    public final InsetBannerApiData g;
    public final ProductFilterSwitch h;
    public final InfoSection i;
    public final BottomSheetContent.Marketplace j;
    public final Object k;
    public final Object l;
    public final String m;
    public final ZeroResultPageData n;
    public final ProductListZeroResults o;

    public ProductListApiData(ArrayList arrayList, List list, Integer num, Integer num2, ArrayList arrayList2, ArrayList arrayList3, InsetBannerApiData insetBannerApiData, ProductFilterSwitch productFilterSwitch, InfoSection infoSection, BottomSheetContent.Marketplace marketplace, List list2, List list3, String str, ZeroResultPageData zeroResultPageData, ProductListZeroResults productListZeroResults) {
        this.f5355a = arrayList;
        this.b = list;
        this.c = num;
        this.d = num2;
        this.e = arrayList2;
        this.f = arrayList3;
        this.g = insetBannerApiData;
        this.h = productFilterSwitch;
        this.i = infoSection;
        this.j = marketplace;
        this.k = list2;
        this.l = list3;
        this.m = str;
        this.n = zeroResultPageData;
        this.o = productListZeroResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListApiData)) {
            return false;
        }
        ProductListApiData productListApiData = (ProductListApiData) obj;
        return this.f5355a.equals(productListApiData.f5355a) && this.b.equals(productListApiData.b) && Intrinsics.c(this.c, productListApiData.c) && Intrinsics.c(this.d, productListApiData.d) && this.e.equals(productListApiData.e) && this.f.equals(productListApiData.f) && Intrinsics.c(this.g, productListApiData.g) && Intrinsics.c(this.h, productListApiData.h) && Intrinsics.c(this.i, productListApiData.i) && Intrinsics.c(this.j, productListApiData.j) && this.k.equals(productListApiData.k) && this.l.equals(productListApiData.l) && Intrinsics.c(this.m, productListApiData.m) && Intrinsics.c(this.n, productListApiData.n) && Intrinsics.c(this.o, productListApiData.o);
    }

    public final int hashCode() {
        int iE = a.e(this.f5355a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iB = androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.e), 31, this.f);
        InsetBannerApiData insetBannerApiData = this.g;
        int iHashCode2 = (iB + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        ProductFilterSwitch productFilterSwitch = this.h;
        int iHashCode3 = (iHashCode2 + (productFilterSwitch == null ? 0 : productFilterSwitch.hashCode())) * 31;
        InfoSection infoSection = this.i;
        int iHashCode4 = (iHashCode3 + (infoSection == null ? 0 : infoSection.hashCode())) * 31;
        BottomSheetContent.Marketplace marketplace = this.j;
        int iE2 = a.e(a.e((iHashCode4 + (marketplace == null ? 0 : marketplace.hashCode())) * 31, 31, this.k), 31, this.l);
        String str = this.m;
        int iHashCode5 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        ZeroResultPageData zeroResultPageData = this.n;
        int iHashCode6 = (iHashCode5 + (zeroResultPageData == null ? 0 : zeroResultPageData.hashCode())) * 31;
        ProductListZeroResults productListZeroResults = this.o;
        return iHashCode6 + (productListZeroResults != null ? productListZeroResults.hashCode() : 0);
    }

    public final String toString() {
        return "ProductListApiData(products=null, productsFeed=" + this.f5355a + ", analytics=" + this.b + ", totalCount=" + this.c + ", nextPageKey=" + this.d + ", filterList=" + this.e + ", sortList=" + this.f + ", sortOptionsBanner=" + this.g + ", marketplaceProductsSwitch=" + this.h + ", infoSection=" + this.i + ", bottomSheet=" + this.j + ", chips=" + this.k + ", facetChips=" + this.l + ", pageTitle=" + this.m + ", zeroResultContent=" + this.n + ", zeroResult=" + this.o + ")";
    }
}
