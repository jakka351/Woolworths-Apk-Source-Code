package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutLegacyErrors;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutLegacyErrors {

    /* renamed from: a, reason: collision with root package name */
    public final int f10563a;
    public final String b;
    public final String c;

    public CheckoutLegacyErrors(int i, String str, String str2) {
        this.f10563a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutLegacyErrors)) {
            return false;
        }
        CheckoutLegacyErrors checkoutLegacyErrors = (CheckoutLegacyErrors) obj;
        return this.f10563a == checkoutLegacyErrors.f10563a && Intrinsics.c(this.b, checkoutLegacyErrors.b) && Intrinsics.c(this.c, checkoutLegacyErrors.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(Integer.hashCode(this.f10563a) * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(androidx.constraintlayout.core.state.a.p("CheckoutLegacyErrors(errorCode=", this.f10563a, ", message=", this.b, ", key="), this.c, ")");
    }
}
