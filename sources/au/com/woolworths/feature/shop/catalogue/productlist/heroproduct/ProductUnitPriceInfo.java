package au.com.woolworths.feature.shop.catalogue.productlist.heroproduct;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/heroproduct/ProductUnitPriceInfo;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductUnitPriceInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f6943a;

    public ProductUnitPriceInfo(String str) {
        this.f6943a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductUnitPriceInfo) && Intrinsics.c(this.f6943a, ((ProductUnitPriceInfo) obj).f6943a);
    }

    public final int hashCode() {
        String str = this.f6943a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.h("ProductUnitPriceInfo(priceOptionDesc=", this.f6943a, ")");
    }
}
