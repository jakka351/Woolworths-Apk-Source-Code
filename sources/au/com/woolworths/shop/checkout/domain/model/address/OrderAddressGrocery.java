package au.com.woolworths.shop.checkout.domain.model.address;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddressGrocery;", "Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderAddressGrocery extends OrderAddress {

    /* renamed from: a, reason: collision with root package name */
    public final String f10642a;
    public final String b;
    public final String c;
    public final String d;

    public OrderAddressGrocery(String str, String str2, String str3, String str4) {
        this.f10642a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.address.OrderAddress
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.address.OrderAddress
    public final int b() {
        return R.drawable.ic_product_image_unavailable_circle;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.address.OrderAddress
    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.address.OrderAddress
    /* renamed from: d, reason: from getter */
    public final String getF10642a() {
        return this.f10642a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderAddressGrocery)) {
            return false;
        }
        OrderAddressGrocery orderAddressGrocery = (OrderAddressGrocery) obj;
        return Intrinsics.c(this.f10642a, orderAddressGrocery.f10642a) && Intrinsics.c(this.b, orderAddressGrocery.b) && Intrinsics.c(this.c, orderAddressGrocery.c) && Intrinsics.c(this.d, orderAddressGrocery.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.c(b.c(this.f10642a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return a.l(YU.a.v("OrderAddressGrocery(title=", this.f10642a, ", imageUrl=", this.b, ", addressText="), this.c, ", fulfilmentWindow=", this.d, ")");
    }
}
