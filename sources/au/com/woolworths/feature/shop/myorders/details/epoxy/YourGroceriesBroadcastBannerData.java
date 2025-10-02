package au.com.woolworths.feature.shop.myorders.details.epoxy;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesBroadcastBannerData;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$YourGroceriesItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YourGroceriesBroadcastBannerData implements YourGroceriesContract.YourGroceriesItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f7701a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final BroadcastBannerType f;
    public final String g;
    public final Boolean h;
    public final String i;

    public YourGroceriesBroadcastBannerData(String str, String str2, String str3, String str4, String str5, BroadcastBannerType broadcastBannerType, String str6, Boolean bool, String str7) {
        this.f7701a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = broadcastBannerType;
        this.g = str6;
        this.h = bool;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YourGroceriesBroadcastBannerData)) {
            return false;
        }
        YourGroceriesBroadcastBannerData yourGroceriesBroadcastBannerData = (YourGroceriesBroadcastBannerData) obj;
        return Intrinsics.c(this.f7701a, yourGroceriesBroadcastBannerData.f7701a) && Intrinsics.c(this.b, yourGroceriesBroadcastBannerData.b) && Intrinsics.c(this.c, yourGroceriesBroadcastBannerData.c) && Intrinsics.c(this.d, yourGroceriesBroadcastBannerData.d) && Intrinsics.c(this.e, yourGroceriesBroadcastBannerData.e) && this.f == yourGroceriesBroadcastBannerData.f && Intrinsics.c(this.g, yourGroceriesBroadcastBannerData.g) && Intrinsics.c(this.h, yourGroceriesBroadcastBannerData.h) && Intrinsics.c(this.i, yourGroceriesBroadcastBannerData.i);
    }

    public final int hashCode() {
        int iHashCode = this.f7701a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BroadcastBannerType broadcastBannerType = this.f;
        int iC = b.c((iHashCode5 + (broadcastBannerType == null ? 0 : broadcastBannerType.hashCode())) * 31, 31, this.g);
        Boolean bool = this.h;
        int iHashCode6 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.i;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("YourGroceriesBroadcastBannerData(title=", this.f7701a, ", subtitle=", this.b, ", deeplink=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionLabel=", this.d, ", analyticsLabel=");
        sbV.append(this.e);
        sbV.append(", type=");
        sbV.append(this.f);
        sbV.append(", imageUrl=");
        au.com.woolworths.android.onesite.a.A(sbV, this.g, ", dismissible=", this.h, ", bannerId=");
        return YU.a.o(sbV, this.i, ")");
    }
}
