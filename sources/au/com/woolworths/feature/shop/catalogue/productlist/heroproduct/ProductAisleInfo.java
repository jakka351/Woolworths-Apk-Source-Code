package au.com.woolworths.feature.shop.catalogue.productlist.heroproduct;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/heroproduct/ProductAisleInfo;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductAisleInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f6939a;
    public final int b;
    public final int c;

    public ProductAisleInfo(String str, int i, int i2) {
        this.f6939a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductAisleInfo)) {
            return false;
        }
        ProductAisleInfo productAisleInfo = (ProductAisleInfo) obj;
        return Intrinsics.c(this.f6939a, productAisleInfo.f6939a) && this.b == productAisleInfo.b && this.c == productAisleInfo.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b.a(this.b, this.f6939a.hashCode() * 31, 31);
    }

    public final String toString() {
        return a.m(b.u("ProductAisleInfo(text=", this.b, this.f6939a, ", textColor=", ", icon="), this.c, ")");
    }
}
