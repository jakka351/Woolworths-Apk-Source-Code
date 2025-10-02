package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.models.FeedData;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderSummaryData;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderSummaryData {

    /* renamed from: a, reason: collision with root package name */
    public final int f7770a;
    public final OrderHelpDataList b;
    public final FeedData c;
    public final OrderCancelWarning d;
    public final EditOrderWarning e;
    public final OrderFulfilmentType f;
    public final String g;
    public final String h;
    public final boolean i;
    public final OrderStatusTypeData j;

    public OrderSummaryData(int i, OrderHelpDataList orderHelpDataList, FeedData feedData, OrderCancelWarning orderCancelWarning, EditOrderWarning editOrderWarning, OrderFulfilmentType orderFulfilmentType, String str, String str2, boolean z, OrderStatusTypeData orderStatusTypeData) {
        this.f7770a = i;
        this.b = orderHelpDataList;
        this.c = feedData;
        this.d = orderCancelWarning;
        this.e = editOrderWarning;
        this.f = orderFulfilmentType;
        this.g = str;
        this.h = str2;
        this.i = z;
        this.j = orderStatusTypeData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSummaryData)) {
            return false;
        }
        OrderSummaryData orderSummaryData = (OrderSummaryData) obj;
        return this.f7770a == orderSummaryData.f7770a && Intrinsics.c(this.b, orderSummaryData.b) && Intrinsics.c(this.c, orderSummaryData.c) && Intrinsics.c(this.d, orderSummaryData.d) && Intrinsics.c(this.e, orderSummaryData.e) && this.f == orderSummaryData.f && Intrinsics.c(this.g, orderSummaryData.g) && Intrinsics.c(this.h, orderSummaryData.h) && this.i == orderSummaryData.i && this.j == orderSummaryData.j;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f7770a) * 31;
        OrderHelpDataList orderHelpDataList = this.b;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (orderHelpDataList == null ? 0 : orderHelpDataList.hashCode())) * 31)) * 31)) * 31)) * 31;
        OrderFulfilmentType orderFulfilmentType = this.f;
        int iHashCode3 = (iHashCode2 + (orderFulfilmentType == null ? 0 : orderFulfilmentType.hashCode())) * 31;
        String str = this.g;
        return this.j.hashCode() + b.e(b.c((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderSummaryData(orderId=");
        sb.append(this.f7770a);
        sb.append(", helpList=");
        sb.append(this.b);
        sb.append(", feed=");
        sb.append(this.c);
        sb.append(", cancelWarning=");
        sb.append(this.d);
        sb.append(", editOrderWarning=");
        sb.append(this.e);
        sb.append(", fulfilmentMethod=");
        sb.append(this.f);
        sb.append(", progress=");
        a.B(sb, this.g, ", progressDetail=", this.h, ", showDelightAnimation=");
        sb.append(this.i);
        sb.append(", status=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
