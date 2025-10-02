package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutInfoDialog;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutInfoDialog {

    /* renamed from: a, reason: collision with root package name */
    public final String f10562a;
    public final String b;
    public final String c;
    public final String d;

    public CheckoutInfoDialog(String str, String str2, String str3, String str4) {
        this.f10562a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutInfoDialog)) {
            return false;
        }
        CheckoutInfoDialog checkoutInfoDialog = (CheckoutInfoDialog) obj;
        return Intrinsics.c(this.f10562a, checkoutInfoDialog.f10562a) && Intrinsics.c(this.b, checkoutInfoDialog.b) && Intrinsics.c(this.c, checkoutInfoDialog.c) && Intrinsics.c(this.d, checkoutInfoDialog.d);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f10562a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.l(YU.a.v("CheckoutInfoDialog(title=", this.f10562a, ", message=", this.b, ", buttonTitle="), this.c, ", secondaryButtonTitle=", this.d, ")");
    }
}
