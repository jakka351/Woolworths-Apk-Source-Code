package au.com.woolworths.feature.shop.catalogue.productlist.heroproduct;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/heroproduct/ProductBasicInfo;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductBasicInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f6940a;
    public final String b;

    public ProductBasicInfo(String str, String str2) {
        this.f6940a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBasicInfo)) {
            return false;
        }
        ProductBasicInfo productBasicInfo = (ProductBasicInfo) obj;
        return Intrinsics.c(this.f6940a, productBasicInfo.f6940a) && Intrinsics.c(this.b, productBasicInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6940a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("ProductBasicInfo(imagePath=", this.f6940a, ", itemDescription=", this.b, ")");
    }
}
