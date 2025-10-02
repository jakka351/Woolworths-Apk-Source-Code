package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/OrderDetailFulfilmentData;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderDetailFulfilmentData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7797a;
    public final String b;
    public final ImageVector c;
    public final Function0 d;

    public OrderDetailFulfilmentData(String overline, String str, ImageVector imageVector, Function0 action) {
        Intrinsics.h(overline, "overline");
        Intrinsics.h(action, "action");
        this.f7797a = overline;
        this.b = str;
        this.c = imageVector;
        this.d = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailFulfilmentData)) {
            return false;
        }
        OrderDetailFulfilmentData orderDetailFulfilmentData = (OrderDetailFulfilmentData) obj;
        return Intrinsics.c(this.f7797a, orderDetailFulfilmentData.f7797a) && Intrinsics.c(this.b, orderDetailFulfilmentData.b) && Intrinsics.c(this.c, orderDetailFulfilmentData.c) && Intrinsics.c(this.d, orderDetailFulfilmentData.d);
    }

    public final int hashCode() {
        int iC = androidx.camera.core.impl.b.c(this.f7797a.hashCode() * 31, 31, this.b);
        ImageVector imageVector = this.c;
        return this.d.hashCode() + ((iC + (imageVector == null ? 0 : imageVector.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("OrderDetailFulfilmentData(overline=", this.f7797a, ", title=", this.b, ", icon=");
        sbV.append(this.c);
        sbV.append(", action=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
