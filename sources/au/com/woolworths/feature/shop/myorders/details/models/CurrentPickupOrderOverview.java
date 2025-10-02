package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/CurrentPickupOrderOverview;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CurrentPickupOrderOverview {

    /* renamed from: a, reason: collision with root package name */
    public final ProgressStepper f7751a;
    public final ProgressStepper b;
    public final StepsToolTip c;
    public final String d;
    public final String e;
    public final String f;
    public final ButtonApiData g;
    public final ButtonApiData h;
    public final ButtonApiData i;
    public final String j;
    public final InsetBannerApiData k;
    public final BayNumberPreferences l;
    public final ButtonApiData m;
    public final OnMyWayPreferences n;
    public final boolean o;
    public final LocationTrackingPrimingPage p;
    public final BroadcastBannerData q;
    public final OrderSubtitleIcon r;
    public final BroadcastBannerData s;

    public CurrentPickupOrderOverview(ProgressStepper progressStepper, ProgressStepper progressStepper2, StepsToolTip stepsToolTip, String str, String str2, String str3, ButtonApiData buttonApiData, ButtonApiData buttonApiData2, ButtonApiData buttonApiData3, String str4, InsetBannerApiData insetBannerApiData, BayNumberPreferences bayNumberPreferences, ButtonApiData buttonApiData4, OnMyWayPreferences onMyWayPreferences, boolean z, LocationTrackingPrimingPage locationTrackingPrimingPage, BroadcastBannerData broadcastBannerData, OrderSubtitleIcon orderSubtitleIcon, BroadcastBannerData broadcastBannerData2) {
        this.f7751a = progressStepper;
        this.b = progressStepper2;
        this.c = stepsToolTip;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = buttonApiData;
        this.h = buttonApiData2;
        this.i = buttonApiData3;
        this.j = str4;
        this.k = insetBannerApiData;
        this.l = bayNumberPreferences;
        this.m = buttonApiData4;
        this.n = onMyWayPreferences;
        this.o = z;
        this.p = locationTrackingPrimingPage;
        this.q = broadcastBannerData;
        this.r = orderSubtitleIcon;
        this.s = broadcastBannerData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentPickupOrderOverview)) {
            return false;
        }
        CurrentPickupOrderOverview currentPickupOrderOverview = (CurrentPickupOrderOverview) obj;
        return Intrinsics.c(this.f7751a, currentPickupOrderOverview.f7751a) && Intrinsics.c(this.b, currentPickupOrderOverview.b) && Intrinsics.c(this.c, currentPickupOrderOverview.c) && Intrinsics.c(this.d, currentPickupOrderOverview.d) && Intrinsics.c(this.e, currentPickupOrderOverview.e) && Intrinsics.c(this.f, currentPickupOrderOverview.f) && Intrinsics.c(this.g, currentPickupOrderOverview.g) && Intrinsics.c(this.h, currentPickupOrderOverview.h) && Intrinsics.c(this.i, currentPickupOrderOverview.i) && Intrinsics.c(this.j, currentPickupOrderOverview.j) && Intrinsics.c(this.k, currentPickupOrderOverview.k) && Intrinsics.c(this.l, currentPickupOrderOverview.l) && Intrinsics.c(this.m, currentPickupOrderOverview.m) && Intrinsics.c(this.n, currentPickupOrderOverview.n) && this.o == currentPickupOrderOverview.o && Intrinsics.c(this.p, currentPickupOrderOverview.p) && Intrinsics.c(this.q, currentPickupOrderOverview.q) && this.r == currentPickupOrderOverview.r && Intrinsics.c(this.s, currentPickupOrderOverview.s);
    }

    public final int hashCode() {
        ProgressStepper progressStepper = this.f7751a;
        int iHashCode = (progressStepper == null ? 0 : progressStepper.hashCode()) * 31;
        ProgressStepper progressStepper2 = this.b;
        int iHashCode2 = (iHashCode + (progressStepper2 == null ? 0 : progressStepper2.hashCode())) * 31;
        StepsToolTip stepsToolTip = this.c;
        int iHashCode3 = (iHashCode2 + (stepsToolTip == null ? 0 : stepsToolTip.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ButtonApiData buttonApiData = this.g;
        int iHashCode7 = (iHashCode6 + (buttonApiData == null ? 0 : buttonApiData.hashCode())) * 31;
        ButtonApiData buttonApiData2 = this.h;
        int iHashCode8 = (iHashCode7 + (buttonApiData2 == null ? 0 : buttonApiData2.hashCode())) * 31;
        ButtonApiData buttonApiData3 = this.i;
        int iHashCode9 = (iHashCode8 + (buttonApiData3 == null ? 0 : buttonApiData3.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InsetBannerApiData insetBannerApiData = this.k;
        int iHashCode11 = (iHashCode10 + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        BayNumberPreferences bayNumberPreferences = this.l;
        int iHashCode12 = (iHashCode11 + (bayNumberPreferences == null ? 0 : bayNumberPreferences.hashCode())) * 31;
        ButtonApiData buttonApiData4 = this.m;
        int iHashCode13 = (iHashCode12 + (buttonApiData4 == null ? 0 : buttonApiData4.hashCode())) * 31;
        OnMyWayPreferences onMyWayPreferences = this.n;
        int iE = b.e((iHashCode13 + (onMyWayPreferences == null ? 0 : onMyWayPreferences.hashCode())) * 31, 31, this.o);
        LocationTrackingPrimingPage locationTrackingPrimingPage = this.p;
        int iHashCode14 = (iE + (locationTrackingPrimingPage == null ? 0 : locationTrackingPrimingPage.hashCode())) * 31;
        BroadcastBannerData broadcastBannerData = this.q;
        int iHashCode15 = (iHashCode14 + (broadcastBannerData == null ? 0 : broadcastBannerData.hashCode())) * 31;
        OrderSubtitleIcon orderSubtitleIcon = this.r;
        int iHashCode16 = (iHashCode15 + (orderSubtitleIcon == null ? 0 : orderSubtitleIcon.hashCode())) * 31;
        BroadcastBannerData broadcastBannerData2 = this.s;
        return iHashCode16 + (broadcastBannerData2 != null ? broadcastBannerData2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurrentPickupOrderOverview(progressStepper=");
        sb.append(this.f7751a);
        sb.append(", progressStepperForCollectedState=");
        sb.append(this.b);
        sb.append(", toolTip=");
        sb.append(this.c);
        sb.append(", orderTitle=");
        sb.append(this.d);
        sb.append(", orderSubtitle=");
        a.B(sb, this.e, ", instructionsMd=", this.f, ", changeOrderButton=");
        sb.append(this.g);
        sb.append(", cancelOrderButton=");
        sb.append(this.h);
        sb.append(", checkInNowButton=");
        sb.append(this.i);
        sb.append(", helpMd=");
        sb.append(this.j);
        sb.append(", collectionBanner=");
        sb.append(this.k);
        sb.append(", bayNumberPreferences=");
        sb.append(this.l);
        sb.append(", checkInOnMyWayButton=");
        sb.append(this.m);
        sb.append(", onMyWayPreferences=");
        sb.append(this.n);
        sb.append(", locationTrackingEnabled=");
        sb.append(this.o);
        sb.append(", locationTrackingPrimingPage=");
        sb.append(this.p);
        sb.append(", saveTimeBanner=");
        sb.append(this.q);
        sb.append(", orderSubtitleIcon=");
        sb.append(this.r);
        sb.append(", handoverBanner=");
        sb.append(this.s);
        sb.append(")");
        return sb.toString();
    }
}
