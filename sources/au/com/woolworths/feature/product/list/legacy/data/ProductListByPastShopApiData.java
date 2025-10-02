package au.com.woolworths.feature.product.list.legacy.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListByPastShopApiData;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByPastShopApiData {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5359a;
    public final Integer b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final InsetBannerApiData f;

    public ProductListByPastShopApiData(Integer num, Integer num2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, InsetBannerApiData insetBannerApiData) {
        this.f5359a = num;
        this.b = num2;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = insetBannerApiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListByPastShopApiData)) {
            return false;
        }
        ProductListByPastShopApiData productListByPastShopApiData = (ProductListByPastShopApiData) obj;
        return Intrinsics.c(this.f5359a, productListByPastShopApiData.f5359a) && Intrinsics.c(this.b, productListByPastShopApiData.b) && this.c.equals(productListByPastShopApiData.c) && this.d.equals(productListByPastShopApiData.d) && this.e.equals(productListByPastShopApiData.e) && Intrinsics.c(this.f, productListByPastShopApiData.f);
    }

    public final int hashCode() {
        Integer num = this.f5359a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iB = a.b(a.b(a.b((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        InsetBannerApiData insetBannerApiData = this.f;
        return iB + (insetBannerApiData != null ? insetBannerApiData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = d.v("ProductListByPastShopApiData(totalCount=", this.f5359a, ", nextPageKey=", this.b, ", productsFeed=");
        sbV.append(this.c);
        sbV.append(", filterList=");
        sbV.append(this.d);
        sbV.append(", sortList=");
        sbV.append(this.e);
        sbV.append(", sortOptionsBanner=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
