package au.com.woolworths.shop.checkout.domain.model.address;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddressMarket;", "Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderAddressMarket extends OrderAddress {

    /* renamed from: a, reason: collision with root package name */
    public final String f10643a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public OrderAddressMarket(String str, String str2, String str3, ArrayList arrayList) {
        this.f10643a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.address.OrderAddress
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.address.OrderAddress
    public final int b() {
        return R.drawable.ic_everyday_market_logo_small;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.address.OrderAddress
    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.address.OrderAddress
    /* renamed from: d, reason: from getter */
    public final String getF10643a() {
        return this.f10643a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderAddressMarket)) {
            return false;
        }
        OrderAddressMarket orderAddressMarket = (OrderAddressMarket) obj;
        return this.f10643a.equals(orderAddressMarket.f10643a) && this.b.equals(orderAddressMarket.b) && this.c.equals(orderAddressMarket.c) && this.d.equals(orderAddressMarket.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.c(b.c(this.f10643a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OrderAddressMarket(title=", this.f10643a, ", imageUrl=", this.b, ", addressText=");
        sbV.append(this.c);
        sbV.append(", sellerInfo=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
