package au.com.woolworths.shop.cart.domain.model;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/CartProductQuantityUpdate;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductQuantityUpdate {

    /* renamed from: a, reason: collision with root package name */
    public final String f10433a;
    public final double b;
    public final String c;
    public final String d;

    public CartProductQuantityUpdate(double d, String productId, String str, String str2) {
        Intrinsics.h(productId, "productId");
        this.f10433a = productId;
        this.b = d;
        this.c = str;
        this.d = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getF10433a() {
        return this.f10433a;
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
        if (!(obj instanceof CartProductQuantityUpdate)) {
            return false;
        }
        CartProductQuantityUpdate cartProductQuantityUpdate = (CartProductQuantityUpdate) obj;
        return Intrinsics.c(this.f10433a, cartProductQuantityUpdate.f10433a) && Double.compare(this.b, cartProductQuantityUpdate.b) == 0 && Intrinsics.c(this.c, cartProductQuantityUpdate.c) && Intrinsics.c(this.d, cartProductQuantityUpdate.d);
    }

    public final int hashCode() {
        int iA = a.a(this.b, this.f10433a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "CartProductQuantityUpdate(productId=", this.f10433a, ", quantity=");
        androidx.constraintlayout.core.state.a.B(sbR, ", adId=", this.c, ", source=", this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
