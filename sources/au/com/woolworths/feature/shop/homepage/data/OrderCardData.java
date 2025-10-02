package au.com.woolworths.feature.shop.homepage.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/OrderCardData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderCardData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7204a;
    public final String b;
    public final OrderStatus c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ActionData i;
    public final FulfilmentStatusBannerData j;

    public OrderCardData(String str, String str2, OrderStatus orderStatus, int i, String str3, String str4, String str5, String str6, ActionData actionData, FulfilmentStatusBannerData fulfilmentStatusBannerData) {
        this.f7204a = str;
        this.b = str2;
        this.c = orderStatus;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = actionData;
        this.j = fulfilmentStatusBannerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCardData)) {
            return false;
        }
        OrderCardData orderCardData = (OrderCardData) obj;
        return Intrinsics.c(this.f7204a, orderCardData.f7204a) && Intrinsics.c(this.b, orderCardData.b) && this.c == orderCardData.c && this.d == orderCardData.d && Intrinsics.c(this.e, orderCardData.e) && Intrinsics.c(this.f, orderCardData.f) && Intrinsics.c(this.g, orderCardData.g) && Intrinsics.c(this.h, orderCardData.h) && Intrinsics.c(this.i, orderCardData.i) && Intrinsics.c(this.j, orderCardData.j);
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(b.c(b.a(this.d, (this.c.hashCode() + b.c(this.f7204a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        ActionData actionData = this.i;
        int iHashCode = (iC + (actionData == null ? 0 : actionData.hashCode())) * 31;
        FulfilmentStatusBannerData fulfilmentStatusBannerData = this.j;
        return iHashCode + (fulfilmentStatusBannerData != null ? fulfilmentStatusBannerData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OrderCardData(title=", this.f7204a, ", subtitle=", this.b, ", status=");
        sbV.append(this.c);
        sbV.append(", id=");
        sbV.append(this.d);
        sbV.append(", total=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", timeLabel=", this.f, ", timeValue=");
        androidx.constraintlayout.core.state.a.B(sbV, this.g, ", date=", this.h, ", orderCardAction=");
        sbV.append(this.i);
        sbV.append(", fulfilmentStatusBanner=");
        sbV.append(this.j);
        sbV.append(")");
        return sbV.toString();
    }
}
