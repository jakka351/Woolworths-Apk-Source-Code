package au.com.woolworths.base.shopapp.cartbadge;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/cartbadge/CartItemCount;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CartItemCount {

    /* renamed from: a, reason: collision with root package name */
    public final float f4614a;
    public final String b;

    public CartItemCount(float f, String cartLabelText) {
        Intrinsics.h(cartLabelText, "cartLabelText");
        this.f4614a = f;
        this.b = cartLabelText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartItemCount)) {
            return false;
        }
        CartItemCount cartItemCount = (CartItemCount) obj;
        return Float.compare(this.f4614a, cartItemCount.f4614a) == 0 && Intrinsics.c(this.b, cartItemCount.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.f4614a) * 31);
    }

    public final String toString() {
        return "CartItemCount(fontSizeInSp=" + this.f4614a + ", cartLabelText=" + this.b + ")";
    }
}
