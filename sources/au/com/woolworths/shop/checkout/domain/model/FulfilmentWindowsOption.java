package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentWindowsFooterV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsOption;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowsOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f10615a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final FulfilmentWindowsFooterV2 f;
    public final String g;
    public final ExtraInfoButton h;
    public final FulfilmentExtraInfo i;
    public final DeliveryNowStatus j;
    public final DirectToBootNowWindow k;
    public final DirectToBootNowStatus l;
    public final List m;
    public final DeliveryNowWindow n;
    public final DirectToBootNowWindow o;

    public FulfilmentWindowsOption(String str, String str2, boolean z, boolean z2, String str3, FulfilmentWindowsFooterV2 fulfilmentWindowsFooterV2, String str4, ExtraInfoButton extraInfoButton, FulfilmentExtraInfo fulfilmentExtraInfo, DeliveryNowStatus deliveryNowStatus, DirectToBootNowWindow directToBootNowWindow, DirectToBootNowStatus directToBootNowStatus, List list, DeliveryNowWindow deliveryNowWindow, DirectToBootNowWindow directToBootNowWindow2) {
        this.f10615a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = fulfilmentWindowsFooterV2;
        this.g = str4;
        this.h = extraInfoButton;
        this.i = fulfilmentExtraInfo;
        this.j = deliveryNowStatus;
        this.k = directToBootNowWindow;
        this.l = directToBootNowStatus;
        this.m = list;
        this.n = deliveryNowWindow;
        this.o = directToBootNowWindow2;
    }

    public static FulfilmentWindowsOption a(FulfilmentWindowsOption fulfilmentWindowsOption, boolean z, ExtraInfoButton extraInfoButton, ArrayList arrayList, int i) {
        String str = fulfilmentWindowsOption.f10615a;
        String str2 = fulfilmentWindowsOption.b;
        boolean z2 = fulfilmentWindowsOption.c;
        boolean z3 = (i & 8) != 0 ? fulfilmentWindowsOption.d : z;
        String str3 = fulfilmentWindowsOption.e;
        boolean z4 = z3;
        FulfilmentWindowsFooterV2 fulfilmentWindowsFooterV2 = fulfilmentWindowsOption.f;
        String str4 = fulfilmentWindowsOption.g;
        ExtraInfoButton extraInfoButton2 = (i & 128) != 0 ? fulfilmentWindowsOption.h : extraInfoButton;
        FulfilmentExtraInfo fulfilmentExtraInfo = fulfilmentWindowsOption.i;
        ExtraInfoButton extraInfoButton3 = extraInfoButton2;
        DeliveryNowStatus deliveryNowStatus = fulfilmentWindowsOption.j;
        DirectToBootNowWindow directToBootNowWindow = fulfilmentWindowsOption.k;
        DirectToBootNowStatus directToBootNowStatus = fulfilmentWindowsOption.l;
        List list = (i & 4096) != 0 ? fulfilmentWindowsOption.m : arrayList;
        DeliveryNowWindow deliveryNowWindow = fulfilmentWindowsOption.n;
        DirectToBootNowWindow directToBootNowWindow2 = fulfilmentWindowsOption.o;
        fulfilmentWindowsOption.getClass();
        return new FulfilmentWindowsOption(str, str2, z2, z4, str3, fulfilmentWindowsFooterV2, str4, extraInfoButton3, fulfilmentExtraInfo, deliveryNowStatus, directToBootNowWindow, directToBootNowStatus, list, deliveryNowWindow, directToBootNowWindow2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowsOption)) {
            return false;
        }
        FulfilmentWindowsOption fulfilmentWindowsOption = (FulfilmentWindowsOption) obj;
        return Intrinsics.c(this.f10615a, fulfilmentWindowsOption.f10615a) && Intrinsics.c(this.b, fulfilmentWindowsOption.b) && this.c == fulfilmentWindowsOption.c && this.d == fulfilmentWindowsOption.d && Intrinsics.c(this.e, fulfilmentWindowsOption.e) && Intrinsics.c(this.f, fulfilmentWindowsOption.f) && Intrinsics.c(this.g, fulfilmentWindowsOption.g) && Intrinsics.c(this.h, fulfilmentWindowsOption.h) && Intrinsics.c(this.i, fulfilmentWindowsOption.i) && this.j == fulfilmentWindowsOption.j && Intrinsics.c(this.k, fulfilmentWindowsOption.k) && this.l == fulfilmentWindowsOption.l && Intrinsics.c(this.m, fulfilmentWindowsOption.m) && Intrinsics.c(this.n, fulfilmentWindowsOption.n) && Intrinsics.c(this.o, fulfilmentWindowsOption.o);
    }

    public final int hashCode() {
        int iC = b.c(b.e(b.e(b.c(this.f10615a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        FulfilmentWindowsFooterV2 fulfilmentWindowsFooterV2 = this.f;
        int iC2 = b.c((iC + (fulfilmentWindowsFooterV2 == null ? 0 : fulfilmentWindowsFooterV2.hashCode())) * 31, 31, this.g);
        ExtraInfoButton extraInfoButton = this.h;
        int iHashCode = (iC2 + (extraInfoButton == null ? 0 : extraInfoButton.hashCode())) * 31;
        FulfilmentExtraInfo fulfilmentExtraInfo = this.i;
        int iHashCode2 = (this.j.hashCode() + ((iHashCode + (fulfilmentExtraInfo == null ? 0 : fulfilmentExtraInfo.hashCode())) * 31)) * 31;
        DirectToBootNowWindow directToBootNowWindow = this.k;
        int iHashCode3 = (iHashCode2 + (directToBootNowWindow == null ? 0 : directToBootNowWindow.hashCode())) * 31;
        DirectToBootNowStatus directToBootNowStatus = this.l;
        int iD = b.d((iHashCode3 + (directToBootNowStatus == null ? 0 : directToBootNowStatus.hashCode())) * 31, 31, this.m);
        DeliveryNowWindow deliveryNowWindow = this.n;
        int iHashCode4 = (iD + (deliveryNowWindow == null ? 0 : deliveryNowWindow.hashCode())) * 31;
        DirectToBootNowWindow directToBootNowWindow2 = this.o;
        return iHashCode4 + (directToBootNowWindow2 != null ? directToBootNowWindow2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("FulfilmentWindowsOption(title=", this.f10615a, ", subtitle=", this.b, ", isAvailable=");
        au.com.woolworths.android.onesite.a.D(sbV, this.c, ", isSelected=", this.d, ", footer=");
        sbV.append(this.e);
        sbV.append(", footerV2=");
        sbV.append(this.f);
        sbV.append(", sectionTitle=");
        sbV.append(this.g);
        sbV.append(", extraInfoButton=");
        sbV.append(this.h);
        sbV.append(", extraInfo=");
        sbV.append(this.i);
        sbV.append(", deliveryNowStatus=");
        sbV.append(this.j);
        sbV.append(", directToBootNow=");
        sbV.append(this.k);
        sbV.append(", directToBootNowStatus=");
        sbV.append(this.l);
        sbV.append(", groups=");
        sbV.append(this.m);
        sbV.append(", deliveryNowV2=");
        sbV.append(this.n);
        sbV.append(", directToBootNowV2=");
        sbV.append(this.o);
        sbV.append(")");
        return sbV.toString();
    }
}
