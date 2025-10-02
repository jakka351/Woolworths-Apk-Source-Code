package au.com.woolworths.foundation.shop.cart.data.model;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartInlineMessage;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartSection;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartInlineMessage implements CartSection {

    /* renamed from: a, reason: collision with root package name */
    public final InsetBannerTypeApiData f8677a;
    public final String b;

    public CartInlineMessage(InsetBannerTypeApiData displayType, String str) {
        Intrinsics.h(displayType, "displayType");
        this.f8677a = displayType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartInlineMessage)) {
            return false;
        }
        CartInlineMessage cartInlineMessage = (CartInlineMessage) obj;
        return this.f8677a == cartInlineMessage.f8677a && Intrinsics.c(this.b, cartInlineMessage.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8677a.hashCode() * 31);
    }

    public final String toString() {
        return "CartInlineMessage(displayType=" + this.f8677a + ", message=" + this.b + ")";
    }
}
