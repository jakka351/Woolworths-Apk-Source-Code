package au.com.woolworths.foundation.shop.cart.data.model;

import android.support.v4.media.session.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantityInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductQuantityInfo {

    /* renamed from: a, reason: collision with root package name */
    public final double f8683a;
    public final double b;
    public final double c;
    public final double d;
    public final String e;

    public /* synthetic */ CartProductQuantityInfo(double d) {
        this(1.0d, d, 1.0d, 1.0d, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductQuantityInfo)) {
            return false;
        }
        CartProductQuantityInfo cartProductQuantityInfo = (CartProductQuantityInfo) obj;
        return Double.compare(this.f8683a, cartProductQuantityInfo.f8683a) == 0 && Double.compare(this.b, cartProductQuantityInfo.b) == 0 && Double.compare(this.c, cartProductQuantityInfo.c) == 0 && Double.compare(this.d, cartProductQuantityInfo.d) == 0 && Intrinsics.c(this.e, cartProductQuantityInfo.e);
    }

    public final int hashCode() {
        int iA = a.a(this.d, a.a(this.c, a.a(this.b, Double.hashCode(this.f8683a) * 31, 31), 31), 31);
        String str = this.e;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f8683a, "CartProductQuantityInfo(minimum=", ", maximum=");
        sbN.append(this.b);
        au.com.woolworths.android.onesite.a.z(sbN, ", increment=", this.c, ", defaultValue=");
        sbN.append(this.d);
        sbN.append(", unitLabel=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }

    public CartProductQuantityInfo(double d, double d2, double d3, double d4, String str) {
        this.f8683a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = str;
    }
}
