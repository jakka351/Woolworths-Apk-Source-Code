package au.com.woolworths.shop.checkout.domain.model;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutMarketProducts;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutMarketProducts {

    /* renamed from: a, reason: collision with root package name */
    public final String f10564a;
    public final String b;
    public final ArrayList c;

    public CheckoutMarketProducts(String str, String str2, ArrayList arrayList) {
        this.f10564a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutMarketProducts)) {
            return false;
        }
        CheckoutMarketProducts checkoutMarketProducts = (CheckoutMarketProducts) obj;
        return this.f10564a.equals(checkoutMarketProducts.f10564a) && Intrinsics.c(this.b, checkoutMarketProducts.b) && this.c.equals(checkoutMarketProducts.c);
    }

    public final int hashCode() {
        int iHashCode = this.f10564a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return a.q(")", YU.a.v("CheckoutMarketProducts(title=", this.f10564a, ", descriptionText=", this.b, ", sellerGroups="), this.c);
    }
}
