package au.com.woolworths.shop.checkout.domain.model.confirmation;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmation;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderConfirmation {

    /* renamed from: a, reason: collision with root package name */
    public final List f10649a;
    public final String b;
    public final OrderInfo c;

    public OrderConfirmation(List list, String str, OrderInfo orderInfo) {
        this.f10649a = list;
        this.b = str;
        this.c = orderInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderConfirmation)) {
            return false;
        }
        OrderConfirmation orderConfirmation = (OrderConfirmation) obj;
        return Intrinsics.c(this.f10649a, orderConfirmation.f10649a) && Intrinsics.c(this.b, orderConfirmation.b) && Intrinsics.c(this.c, orderConfirmation.c);
    }

    public final int hashCode() {
        int iHashCode = this.f10649a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "OrderConfirmation(content=" + this.f10649a + ", buttonTitle=" + this.b + ", orderInfo=" + this.c + ")";
    }
}
