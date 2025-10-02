package au.com.woolworths.foundation.shop.cart.data.model;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartPromotionInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartPromotionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8686a;
    public final String b;
    public final String c;
    public final CartPromotionsToolTipMessage d;

    public CartPromotionInfo(boolean z, String str, String str2, CartPromotionsToolTipMessage cartPromotionsToolTipMessage) {
        this.f8686a = z;
        this.b = str;
        this.c = str2;
        this.d = cartPromotionsToolTipMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartPromotionInfo)) {
            return false;
        }
        CartPromotionInfo cartPromotionInfo = (CartPromotionInfo) obj;
        return this.f8686a == cartPromotionInfo.f8686a && Intrinsics.c(this.b, cartPromotionInfo.b) && Intrinsics.c(this.c, cartPromotionInfo.c) && Intrinsics.c(this.d, cartPromotionInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.c(b.c(Boolean.hashCode(this.f8686a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = a.t("CartPromotionInfo(active=", ", imageUrl=", this.b, ", description=", this.f8686a);
        sbT.append(this.c);
        sbT.append(", tooltipMessage=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
