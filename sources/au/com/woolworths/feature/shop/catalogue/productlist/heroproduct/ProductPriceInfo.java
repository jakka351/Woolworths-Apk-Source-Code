package au.com.woolworths.feature.shop.catalogue.productlist.heroproduct;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/heroproduct/ProductPriceInfo;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductPriceInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f6942a;
    public final String b;
    public final String c;

    public ProductPriceInfo(String str, String str2, String str3) {
        this.f6942a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        String str = this.b;
        if (str != null) {
            return (String) CollectionsKt.D(CollectionsKt.x(StringsKt.T(str, new String[]{"."}, 6), 1));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPriceInfo)) {
            return false;
        }
        ProductPriceInfo productPriceInfo = (ProductPriceInfo) obj;
        return Intrinsics.c(this.f6942a, productPriceInfo.f6942a) && Intrinsics.c(this.b, productPriceInfo.b) && Intrinsics.c(this.c, productPriceInfo.c);
    }

    public final int hashCode() {
        String str = this.f6942a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return a.o(a.v("ProductPriceInfo(priceOptionDescription=", this.f6942a, ", priceSale=", this.b, ", priceSaleSuffix="), this.c, ")");
    }
}
