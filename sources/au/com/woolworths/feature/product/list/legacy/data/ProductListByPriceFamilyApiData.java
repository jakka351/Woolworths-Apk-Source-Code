package au.com.woolworths.feature.product.list.legacy.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListByPriceFamilyApiData;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByPriceFamilyApiData {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5360a;
    public final ArrayList b;

    public ProductListByPriceFamilyApiData(Integer num, ArrayList arrayList) {
        this.f5360a = num;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListByPriceFamilyApiData)) {
            return false;
        }
        ProductListByPriceFamilyApiData productListByPriceFamilyApiData = (ProductListByPriceFamilyApiData) obj;
        return Intrinsics.c(this.f5360a, productListByPriceFamilyApiData.f5360a) && this.b.equals(productListByPriceFamilyApiData.b);
    }

    public final int hashCode() {
        Integer num = this.f5360a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ProductListByPriceFamilyApiData(totalNumberOfProducts=" + this.f5360a + ", productsFeed=" + this.b + ")";
    }
}
