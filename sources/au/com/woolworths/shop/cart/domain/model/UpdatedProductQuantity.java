package au.com.woolworths.shop.cart.domain.model;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/UpdatedProductQuantity;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatedProductQuantity {

    /* renamed from: a, reason: collision with root package name */
    public final String f10451a;
    public final double b;
    public final String c;
    public final String d;

    public UpdatedProductQuantity(double d, String productId, String str, String str2) {
        Intrinsics.h(productId, "productId");
        this.f10451a = productId;
        this.b = d;
        this.c = str;
        this.d = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getF10451a() {
        return this.f10451a;
    }

    /* renamed from: c, reason: from getter */
    public final double getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatedProductQuantity)) {
            return false;
        }
        UpdatedProductQuantity updatedProductQuantity = (UpdatedProductQuantity) obj;
        return Intrinsics.c(this.f10451a, updatedProductQuantity.f10451a) && Double.compare(this.b, updatedProductQuantity.b) == 0 && Intrinsics.c(this.c, updatedProductQuantity.c) && Intrinsics.c(this.d, updatedProductQuantity.d);
    }

    public final int hashCode() {
        int iA = a.a(this.b, this.f10451a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "UpdatedProductQuantity(productId=", this.f10451a, ", quantity=");
        androidx.constraintlayout.core.state.a.B(sbR, ", adId=", this.c, ", source=", this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
