package au.com.woolworths.foundation.shop.cart.data.model;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartAlert;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartAlert {

    /* renamed from: a, reason: collision with root package name */
    public final String f8672a;
    public final String b;
    public final String c;
    public final AnalyticsData d;

    public CartAlert(String str, String str2, String str3, AnalyticsData analyticsData) {
        this.f8672a = str;
        this.b = str2;
        this.c = str3;
        this.d = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartAlert)) {
            return false;
        }
        CartAlert cartAlert = (CartAlert) obj;
        return Intrinsics.c(this.f8672a, cartAlert.f8672a) && Intrinsics.c(this.b, cartAlert.b) && Intrinsics.c(this.c, cartAlert.c) && Intrinsics.c(this.d, cartAlert.d);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f8672a.hashCode() * 31, 31, this.b), 31, this.c);
        AnalyticsData analyticsData = this.d;
        return iC + (analyticsData == null ? 0 : analyticsData.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = a.v("CartAlert(title=", this.f8672a, ", message=", this.b, ", buttonTitle=");
        sbV.append(this.c);
        sbV.append(", analytics=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
