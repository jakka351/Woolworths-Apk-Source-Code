package au.com.woolworths.shop.checkout.ui.content;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.LegacyNotifications;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentData;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutContentData {

    /* renamed from: a, reason: collision with root package name */
    public final Checkout f10756a;
    public final LegacyNotifications b;
    public final boolean c;

    public CheckoutContentData(Checkout checkout, LegacyNotifications legacyNotifications, boolean z) {
        this.f10756a = checkout;
        this.b = legacyNotifications;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutContentData)) {
            return false;
        }
        CheckoutContentData checkoutContentData = (CheckoutContentData) obj;
        return Intrinsics.c(this.f10756a, checkoutContentData.f10756a) && Intrinsics.c(this.b, checkoutContentData.b) && this.c == checkoutContentData.c;
    }

    public final int hashCode() {
        Checkout checkout = this.f10756a;
        int iHashCode = (checkout == null ? 0 : checkout.hashCode()) * 31;
        LegacyNotifications legacyNotifications = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (legacyNotifications != null ? legacyNotifications.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutContentData(checkout=");
        sb.append(this.f10756a);
        sb.append(", notifications=");
        sb.append(this.b);
        sb.append(", shouldShowCmoBanner=");
        return YU.a.k(")", sb, this.c);
    }
}
