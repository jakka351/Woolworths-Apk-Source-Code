package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderOverview;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderOverview {

    /* renamed from: a, reason: collision with root package name */
    public final InsetBannerApiData f7767a;
    public final OrderDetailsStatusData b;
    public final OrderTimeData c;
    public final OrderDetailSummary d;
    public final ButtonApiData e;
    public final ButtonApiData f;
    public final ButtonApiData g;
    public final String h;
    public final String i;

    public OrderOverview(InsetBannerApiData insetBannerApiData, OrderDetailsStatusData orderDetailsStatusData, OrderTimeData orderTimeData, OrderDetailSummary orderDetailSummary, ButtonApiData buttonApiData, ButtonApiData buttonApiData2, ButtonApiData buttonApiData3, String str, String str2) {
        this.f7767a = insetBannerApiData;
        this.b = orderDetailsStatusData;
        this.c = orderTimeData;
        this.d = orderDetailSummary;
        this.e = buttonApiData;
        this.f = buttonApiData2;
        this.g = buttonApiData3;
        this.h = str;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderOverview)) {
            return false;
        }
        OrderOverview orderOverview = (OrderOverview) obj;
        return Intrinsics.c(this.f7767a, orderOverview.f7767a) && Intrinsics.c(this.b, orderOverview.b) && Intrinsics.c(this.c, orderOverview.c) && Intrinsics.c(this.d, orderOverview.d) && Intrinsics.c(this.e, orderOverview.e) && Intrinsics.c(this.f, orderOverview.f) && Intrinsics.c(this.g, orderOverview.g) && Intrinsics.c(this.h, orderOverview.h) && Intrinsics.c(this.i, orderOverview.i);
    }

    public final int hashCode() {
        InsetBannerApiData insetBannerApiData = this.f7767a;
        int iHashCode = (this.b.hashCode() + ((insetBannerApiData == null ? 0 : insetBannerApiData.hashCode()) * 31)) * 31;
        OrderTimeData orderTimeData = this.c;
        int iHashCode2 = (iHashCode + (orderTimeData == null ? 0 : orderTimeData.hashCode())) * 31;
        OrderDetailSummary orderDetailSummary = this.d;
        int iHashCode3 = (iHashCode2 + (orderDetailSummary == null ? 0 : orderDetailSummary.hashCode())) * 31;
        ButtonApiData buttonApiData = this.e;
        int iHashCode4 = (iHashCode3 + (buttonApiData == null ? 0 : buttonApiData.hashCode())) * 31;
        ButtonApiData buttonApiData2 = this.f;
        int iHashCode5 = (iHashCode4 + (buttonApiData2 == null ? 0 : buttonApiData2.hashCode())) * 31;
        ButtonApiData buttonApiData3 = this.g;
        int iHashCode6 = (iHashCode5 + (buttonApiData3 == null ? 0 : buttonApiData3.hashCode())) * 31;
        String str = this.h;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderOverview(insetBanner=");
        sb.append(this.f7767a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", time=");
        sb.append(this.c);
        sb.append(", summary=");
        sb.append(this.d);
        sb.append(", editButtonData=");
        sb.append(this.e);
        sb.append(", cancelButtonData=");
        sb.append(this.f);
        sb.append(", viewInvoiceButton=");
        sb.append(this.g);
        sb.append(", instructionsMd=");
        sb.append(this.h);
        sb.append(", helpMd=");
        return a.o(sb, this.i, ")");
    }
}
