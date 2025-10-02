package au.com.woolworths.foundation.shop.nhp.model.personalisedproducts;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/personalisedproducts/ProductInBannerData;", "", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductInBannerData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8785a;
    public final String b;
    public final String c;

    public ProductInBannerData(String productId, String name, String str) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(name, "name");
        this.f8785a = productId;
        this.b = name;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInBannerData)) {
            return false;
        }
        ProductInBannerData productInBannerData = (ProductInBannerData) obj;
        return Intrinsics.c(this.f8785a, productInBannerData.f8785a) && Intrinsics.c(this.b, productInBannerData.b) && Intrinsics.c(this.c, productInBannerData.c);
    }

    public final int hashCode() {
        int iC = b.c(this.f8785a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.o(a.v("ProductInBannerData(productId=", this.f8785a, ", name=", this.b, ", productImage="), this.c, ")");
    }
}
