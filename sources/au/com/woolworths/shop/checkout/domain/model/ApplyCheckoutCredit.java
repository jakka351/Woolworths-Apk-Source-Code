package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutCredit;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ApplyCheckoutCredit {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10555a;
    public final String b;
    public final Checkout c;

    public ApplyCheckoutCredit(boolean z, String str, Checkout checkout) {
        this.f10555a = z;
        this.b = str;
        this.c = checkout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyCheckoutCredit)) {
            return false;
        }
        ApplyCheckoutCredit applyCheckoutCredit = (ApplyCheckoutCredit) obj;
        return this.f10555a == applyCheckoutCredit.f10555a && Intrinsics.c(this.b, applyCheckoutCredit.b) && Intrinsics.c(this.c, applyCheckoutCredit.c);
    }

    public final int hashCode() {
        int iC = b.c(Boolean.hashCode(this.f10555a) * 31, 31, this.b);
        Checkout checkout = this.c;
        return iC + (checkout == null ? 0 : checkout.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = a.t("ApplyCheckoutCredit(success=", ", message=", this.b, ", checkoutSummary=", this.f10555a);
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
