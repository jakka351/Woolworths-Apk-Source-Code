package au.com.woolworths.shop.checkout.domain.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/MarketProductRow;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketProductRow {

    /* renamed from: a, reason: collision with root package name */
    public final String f10620a;
    public final double b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final CheckoutRemoveProductInfo i;
    public final CartProductInfo j;

    public MarketProductRow(String str, double d, String str2, String str3, String str4, String str5, String str6, String str7, CheckoutRemoveProductInfo checkoutRemoveProductInfo, CartProductInfo cartProductInfo) {
        this.f10620a = str;
        this.b = d;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = checkoutRemoveProductInfo;
        this.j = cartProductInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketProductRow)) {
            return false;
        }
        MarketProductRow marketProductRow = (MarketProductRow) obj;
        return Intrinsics.c(this.f10620a, marketProductRow.f10620a) && Double.compare(this.b, marketProductRow.b) == 0 && Intrinsics.c(this.c, marketProductRow.c) && Intrinsics.c(this.d, marketProductRow.d) && Intrinsics.c(this.e, marketProductRow.e) && Intrinsics.c(this.f, marketProductRow.f) && Intrinsics.c(this.g, marketProductRow.g) && Intrinsics.c(this.h, marketProductRow.h) && Intrinsics.c(this.i, marketProductRow.i) && Intrinsics.c(this.j, marketProductRow.j);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + b.c(b.c(b.c(b.c(b.c(b.c(a.a(this.b, this.f10620a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31;
        CartProductInfo cartProductInfo = this.j;
        return iHashCode + (cartProductInfo == null ? 0 : cartProductInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "MarketProductRow(title=", this.f10620a, ", quantity=");
        androidx.constraintlayout.core.state.a.B(sbR, ", productId=", this.c, ", unitPrice=", this.d);
        androidx.constraintlayout.core.state.a.B(sbR, ", totalPrice=", this.e, ", totalTitle=", this.f);
        androidx.constraintlayout.core.state.a.B(sbR, ", imageUrl=", this.g, ", brandName=", this.h);
        sbR.append(", removeInfo=");
        sbR.append(this.i);
        sbR.append(", cartProductInfo=");
        sbR.append(this.j);
        sbR.append(")");
        return sbR.toString();
    }
}
