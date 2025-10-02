package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutProductSubstitution;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutProductSubstitution {

    /* renamed from: a, reason: collision with root package name */
    public final String f10571a;
    public final String b;
    public final ArrayList c;
    public final CheckoutProductsSubstitutionInfo d;

    public CheckoutProductSubstitution(String str, String str2, ArrayList arrayList, CheckoutProductsSubstitutionInfo checkoutProductsSubstitutionInfo) {
        this.f10571a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = checkoutProductsSubstitutionInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutProductSubstitution)) {
            return false;
        }
        CheckoutProductSubstitution checkoutProductSubstitution = (CheckoutProductSubstitution) obj;
        return this.f10571a.equals(checkoutProductSubstitution.f10571a) && this.b.equals(checkoutProductSubstitution.b) && this.c.equals(checkoutProductSubstitution.c) && this.d.equals(checkoutProductSubstitution.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.b(b.c(this.f10571a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("CheckoutProductSubstitution(title=", this.f10571a, ", selectedOptionTitle=", this.b, ", options=");
        sbV.append(this.c);
        sbV.append(", info=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
