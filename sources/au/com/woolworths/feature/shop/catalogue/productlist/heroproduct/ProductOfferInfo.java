package au.com.woolworths.feature.shop.catalogue.productlist.heroproduct;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/heroproduct/ProductOfferInfo;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class ProductOfferInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f6941a;
    public final String b;
    public final String c;
    public final Boolean d;

    public ProductOfferInfo(String str, Boolean bool, String str2, String str3) {
        this.f6941a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductOfferInfo)) {
            return false;
        }
        ProductOfferInfo productOfferInfo = (ProductOfferInfo) obj;
        return Intrinsics.c(this.f6941a, productOfferInfo.f6941a) && Intrinsics.c(this.b, productOfferInfo.b) && Intrinsics.c(this.c, productOfferInfo.c) && Intrinsics.c(this.d, productOfferInfo.d);
    }

    public final int hashCode() {
        String str = this.f6941a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductOfferInfo(priceOptionDesc=", this.f6941a, ", priceReg=", this.b, ", priceRegSuffix=");
        sbV.append(this.c);
        sbV.append(", memberPricing=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
