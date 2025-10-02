package au.com.woolworths.feature.shop.myorders.details.models;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/CurrentDeliveryOrderOverview;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CurrentDeliveryOrderOverview {

    /* renamed from: a, reason: collision with root package name */
    public final List f7748a;
    public final Object b;
    public final ProgressStepper c;
    public final StepsToolTip d;
    public final String e;
    public final String f;
    public final ButtonApiData g;
    public final ButtonApiData h;
    public final String i;
    public final String j;
    public final OrderSubtitleIcon k;
    public final String l;

    public CurrentDeliveryOrderOverview(List list, List list2, ProgressStepper progressStepper, StepsToolTip stepsToolTip, String str, String str2, ButtonApiData buttonApiData, ButtonApiData buttonApiData2, String str3, String str4, OrderSubtitleIcon orderSubtitleIcon, String str5) {
        this.f7748a = list;
        this.b = list2;
        this.c = progressStepper;
        this.d = stepsToolTip;
        this.e = str;
        this.f = str2;
        this.g = buttonApiData;
        this.h = buttonApiData2;
        this.i = str3;
        this.j = str4;
        this.k = orderSubtitleIcon;
        this.l = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentDeliveryOrderOverview)) {
            return false;
        }
        CurrentDeliveryOrderOverview currentDeliveryOrderOverview = (CurrentDeliveryOrderOverview) obj;
        return this.f7748a.equals(currentDeliveryOrderOverview.f7748a) && this.b.equals(currentDeliveryOrderOverview.b) && Intrinsics.c(this.c, currentDeliveryOrderOverview.c) && Intrinsics.c(this.d, currentDeliveryOrderOverview.d) && Intrinsics.c(this.e, currentDeliveryOrderOverview.e) && Intrinsics.c(this.f, currentDeliveryOrderOverview.f) && Intrinsics.c(this.g, currentDeliveryOrderOverview.g) && Intrinsics.c(this.h, currentDeliveryOrderOverview.h) && Intrinsics.c(this.i, currentDeliveryOrderOverview.i) && Intrinsics.c(this.j, currentDeliveryOrderOverview.j) && this.k == currentDeliveryOrderOverview.k && Intrinsics.c(this.l, currentDeliveryOrderOverview.l);
    }

    public final int hashCode() {
        int iE = a.e(this.f7748a.hashCode() * 31, 31, this.b);
        ProgressStepper progressStepper = this.c;
        int iHashCode = (iE + (progressStepper == null ? 0 : progressStepper.hashCode())) * 31;
        StepsToolTip stepsToolTip = this.d;
        int iHashCode2 = (iHashCode + (stepsToolTip == null ? 0 : stepsToolTip.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonApiData buttonApiData = this.g;
        int iHashCode5 = (iHashCode4 + (buttonApiData == null ? 0 : buttonApiData.hashCode())) * 31;
        ButtonApiData buttonApiData2 = this.h;
        int iHashCode6 = (iHashCode5 + (buttonApiData2 == null ? 0 : buttonApiData2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        OrderSubtitleIcon orderSubtitleIcon = this.k;
        int iHashCode9 = (iHashCode8 + (orderSubtitleIcon == null ? 0 : orderSubtitleIcon.hashCode())) * 31;
        String str5 = this.l;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurrentDeliveryOrderOverview(insetBanners=");
        sb.append(this.f7748a);
        sb.append(", bannerAnalyticLabels=");
        sb.append(this.b);
        sb.append(", progressStepper=");
        sb.append(this.c);
        sb.append(", toolTip=");
        sb.append(this.d);
        sb.append(", instructionsMd=");
        androidx.constraintlayout.core.state.a.B(sb, this.e, ", helpMd=", this.f, ", changeOrderButton=");
        sb.append(this.g);
        sb.append(", cancelOrderButton=");
        sb.append(this.h);
        sb.append(", orderTitle=");
        androidx.constraintlayout.core.state.a.B(sb, this.i, ", orderSubtitle=", this.j, ", orderSubtitleIcon=");
        sb.append(this.k);
        sb.append(", liveTrackingMapUrl=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
