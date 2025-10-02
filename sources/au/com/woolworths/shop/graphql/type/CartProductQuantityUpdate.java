package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CartProductQuantityUpdate;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductQuantityUpdate {

    /* renamed from: a, reason: collision with root package name */
    public final String f11116a;
    public final double b;
    public final Optional c;
    public final Optional d;

    public CartProductQuantityUpdate(String productId, double d, Optional optional, Optional optional2) {
        Intrinsics.h(productId, "productId");
        this.f11116a = productId;
        this.b = d;
        this.c = optional;
        this.d = optional2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductQuantityUpdate)) {
            return false;
        }
        CartProductQuantityUpdate cartProductQuantityUpdate = (CartProductQuantityUpdate) obj;
        return Intrinsics.c(this.f11116a, cartProductQuantityUpdate.f11116a) && Double.compare(this.b, cartProductQuantityUpdate.b) == 0 && Intrinsics.c(this.c, cartProductQuantityUpdate.c) && Intrinsics.c(this.d, cartProductQuantityUpdate.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.c(this.c, android.support.v4.media.session.a.a(this.b, this.f11116a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "CartProductQuantityUpdate(productId=", this.f11116a, ", quantity=");
        sbR.append(", adId=");
        sbR.append(this.c);
        sbR.append(", source=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
