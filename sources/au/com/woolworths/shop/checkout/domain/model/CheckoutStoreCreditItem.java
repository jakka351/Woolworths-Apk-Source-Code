package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutStoreCreditItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10587a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final Boolean h;

    public CheckoutStoreCreditItem(String str, String str2, String str3, String str4, boolean z, String str5, String str6, Boolean bool) {
        this.f10587a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = str6;
        this.h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutStoreCreditItem)) {
            return false;
        }
        CheckoutStoreCreditItem checkoutStoreCreditItem = (CheckoutStoreCreditItem) obj;
        return Intrinsics.c(this.f10587a, checkoutStoreCreditItem.f10587a) && Intrinsics.c(this.b, checkoutStoreCreditItem.b) && Intrinsics.c(this.c, checkoutStoreCreditItem.c) && Intrinsics.c(this.d, checkoutStoreCreditItem.d) && this.e == checkoutStoreCreditItem.e && Intrinsics.c(this.f, checkoutStoreCreditItem.f) && Intrinsics.c(this.g, checkoutStoreCreditItem.g) && Intrinsics.c(this.h, checkoutStoreCreditItem.h);
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.e(b.c(b.c(b.c(this.f10587a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        Boolean bool = this.h;
        return iC + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = a.v("CheckoutStoreCreditItem(title=", this.f10587a, ", subtitle=", this.b, ", primaryLabel=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", secondaryLabel=", this.d, ", isApplied=");
        au.com.woolworths.android.onesite.a.y(", code=", this.f, ", amount=", sbV, this.e);
        sbV.append(this.g);
        sbV.append(", isProcessing=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }
}
