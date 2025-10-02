package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CartBundleQuantityUpdate;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartBundleQuantityUpdate {

    /* renamed from: a, reason: collision with root package name */
    public final String f11104a;
    public final double b;
    public final Optional.Present c;
    public final Optional.Present d;
    public final double e;
    public final double f;

    public CartBundleQuantityUpdate(String productId, double d, Optional.Present present, Optional.Present present2, double d2, double d3) {
        Intrinsics.h(productId, "productId");
        this.f11104a = productId;
        this.b = d;
        this.c = present;
        this.d = present2;
        this.e = d2;
        this.f = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartBundleQuantityUpdate)) {
            return false;
        }
        CartBundleQuantityUpdate cartBundleQuantityUpdate = (CartBundleQuantityUpdate) obj;
        return Intrinsics.c(this.f11104a, cartBundleQuantityUpdate.f11104a) && Double.compare(this.b, cartBundleQuantityUpdate.b) == 0 && this.c.equals(cartBundleQuantityUpdate.c) && this.d.equals(cartBundleQuantityUpdate.d) && Double.compare(this.e, cartBundleQuantityUpdate.e) == 0 && Double.compare(this.f, cartBundleQuantityUpdate.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + a.a(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.b(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.b(this.c, a.a(this.b, this.f11104a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "CartBundleQuantityUpdate(productId=", this.f11104a, ", quantity=");
        sbR.append(", adId=");
        sbR.append(this.c);
        sbR.append(", source=");
        sbR.append(this.d);
        au.com.woolworths.android.onesite.a.z(sbR, ", maximum=", this.e, ", increment=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
