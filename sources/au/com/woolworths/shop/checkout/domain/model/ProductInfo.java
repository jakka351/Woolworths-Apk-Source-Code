package au.com.woolworths.shop.checkout.domain.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ProductInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f10632a;
    public final String b;
    public final double c;
    public final double d;
    public final double e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public ProductInfo(String str, String str2, double d, double d2, double d3, boolean z, String str3, String str4, String str5, String str6) {
        this.f10632a = str;
        this.b = str2;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = z;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInfo)) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) obj;
        return Intrinsics.c(this.f10632a, productInfo.f10632a) && Intrinsics.c(this.b, productInfo.b) && Double.compare(this.c, productInfo.c) == 0 && Double.compare(this.d, productInfo.d) == 0 && Double.compare(this.e, productInfo.e) == 0 && this.f == productInfo.f && Intrinsics.c(this.g, productInfo.g) && Intrinsics.c(this.h, productInfo.h) && Intrinsics.c(this.i, productInfo.i) && Intrinsics.c(this.j, productInfo.j);
    }

    public final int hashCode() {
        int iE = b.e(a.a(this.e, a.a(this.d, a.a(this.c, b.c(this.f10632a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f);
        String str = this.g;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("ProductInfo(productId=", this.f10632a, ", productName=", this.b, ", price=");
        sbV.append(this.c);
        au.com.woolworths.android.onesite.a.z(sbV, ", quantity=", this.d, ", subtotal=");
        sbV.append(this.e);
        sbV.append(", isAvailable=");
        sbV.append(this.f);
        androidx.constraintlayout.core.state.a.B(sbV, ", sellerName=", this.g, ", brandName=", this.h);
        androidx.constraintlayout.core.state.a.B(sbV, ", dispatchNote=", this.i, ", source=", this.j);
        sbV.append(")");
        return sbV.toString();
    }
}
