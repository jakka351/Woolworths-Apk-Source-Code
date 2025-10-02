package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderDetailsDeliveryDriverInfo;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderDetailsDeliveryDriverInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f7764a;
    public final String b;
    public final String c;
    public final InsetBannerApiData d;
    public final ButtonApiData e;
    public final DeliveryMethodsTooltip f;

    public OrderDetailsDeliveryDriverInfo(String str, String str2, String str3, InsetBannerApiData insetBannerApiData, ButtonApiData buttonApiData, DeliveryMethodsTooltip deliveryMethodsTooltip) {
        this.f7764a = str;
        this.b = str2;
        this.c = str3;
        this.d = insetBannerApiData;
        this.e = buttonApiData;
        this.f = deliveryMethodsTooltip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsDeliveryDriverInfo)) {
            return false;
        }
        OrderDetailsDeliveryDriverInfo orderDetailsDeliveryDriverInfo = (OrderDetailsDeliveryDriverInfo) obj;
        return Intrinsics.c(this.f7764a, orderDetailsDeliveryDriverInfo.f7764a) && Intrinsics.c(this.b, orderDetailsDeliveryDriverInfo.b) && Intrinsics.c(this.c, orderDetailsDeliveryDriverInfo.c) && Intrinsics.c(this.d, orderDetailsDeliveryDriverInfo.d) && Intrinsics.c(this.e, orderDetailsDeliveryDriverInfo.e) && Intrinsics.c(this.f, orderDetailsDeliveryDriverInfo.f);
    }

    public final int hashCode() {
        int iC = b.c(this.f7764a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        InsetBannerApiData insetBannerApiData = this.d;
        int iHashCode2 = (iHashCode + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        ButtonApiData buttonApiData = this.e;
        int iHashCode3 = (iHashCode2 + (buttonApiData == null ? 0 : buttonApiData.hashCode())) * 31;
        DeliveryMethodsTooltip deliveryMethodsTooltip = this.f;
        return iHashCode3 + (deliveryMethodsTooltip != null ? deliveryMethodsTooltip.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OrderDetailsDeliveryDriverInfo(driverName=", this.f7764a, ", deliveryPartner=", this.b, ", iconUrl=");
        sbV.append(this.c);
        sbV.append(", insetBanner=");
        sbV.append(this.d);
        sbV.append(", liveTrackingButton=");
        sbV.append(this.e);
        sbV.append(", deliveryTooltip=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
