package au.com.woolworths.feature.product.list.legacy.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListByHaveYouForgottenApiData;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByHaveYouForgottenApiData {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5358a;
    public final Integer b;

    public ProductListByHaveYouForgottenApiData(Integer num, ArrayList arrayList) {
        this.f5358a = arrayList;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListByHaveYouForgottenApiData)) {
            return false;
        }
        ProductListByHaveYouForgottenApiData productListByHaveYouForgottenApiData = (ProductListByHaveYouForgottenApiData) obj;
        return this.f5358a.equals(productListByHaveYouForgottenApiData.f5358a) && Intrinsics.c(this.b, productListByHaveYouForgottenApiData.b);
    }

    public final int hashCode() {
        int iHashCode = this.f5358a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ProductListByHaveYouForgottenApiData(productsFeed=" + this.f5358a + ", totalCount=" + this.b + ")";
    }
}
