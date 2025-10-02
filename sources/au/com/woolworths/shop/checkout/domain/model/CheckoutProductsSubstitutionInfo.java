package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutProductsSubstitutionInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutProductsSubstitutionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f10574a;
    public final String b;
    public final String c;

    public CheckoutProductsSubstitutionInfo(String str, String str2, String str3) {
        this.f10574a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutProductsSubstitutionInfo)) {
            return false;
        }
        CheckoutProductsSubstitutionInfo checkoutProductsSubstitutionInfo = (CheckoutProductsSubstitutionInfo) obj;
        return Intrinsics.c(this.f10574a, checkoutProductsSubstitutionInfo.f10574a) && Intrinsics.c(this.b, checkoutProductsSubstitutionInfo.b) && Intrinsics.c(this.c, checkoutProductsSubstitutionInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f10574a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("CheckoutProductsSubstitutionInfo(title=", this.f10574a, ", message=", this.b, ", buttonTitle="), this.c, ")");
    }
}
