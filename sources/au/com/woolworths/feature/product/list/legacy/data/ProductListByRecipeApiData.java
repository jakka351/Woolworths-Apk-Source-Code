package au.com.woolworths.feature.product.list.legacy.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListByRecipeApiData;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByRecipeApiData {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5361a;
    public final Integer b;
    public final Integer c;

    public ProductListByRecipeApiData(Integer num, Integer num2, ArrayList arrayList) {
        this.f5361a = arrayList;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListByRecipeApiData)) {
            return false;
        }
        ProductListByRecipeApiData productListByRecipeApiData = (ProductListByRecipeApiData) obj;
        return this.f5361a.equals(productListByRecipeApiData.f5361a) && Intrinsics.c(this.b, productListByRecipeApiData.b) && Intrinsics.c(this.c, productListByRecipeApiData.c);
    }

    public final int hashCode() {
        int iHashCode = this.f5361a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductListByRecipeApiData(productsFeed=");
        sb.append(this.f5361a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", nextPageKey=");
        return a.p(sb, this.c, ")");
    }
}
