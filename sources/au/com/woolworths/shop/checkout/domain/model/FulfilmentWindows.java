package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentWindowsSuggestedGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindows;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindows {

    /* renamed from: a, reason: collision with root package name */
    public final String f10610a;
    public final String b;
    public final InsetBannerApiData c;
    public final String d;
    public final List e;
    public final FulfilmentWindowsFooter f;
    public final String g;
    public final FulfilmentExtraInfo h;
    public final FulfilmentSlotSelectionOptionsInfo i;
    public final FulfilmentWindowsSuggestedGroup j;

    public FulfilmentWindows(String str, String str2, InsetBannerApiData insetBannerApiData, String str3, List list, FulfilmentWindowsFooter fulfilmentWindowsFooter, String str4, FulfilmentExtraInfo fulfilmentExtraInfo, FulfilmentSlotSelectionOptionsInfo fulfilmentSlotSelectionOptionsInfo, FulfilmentWindowsSuggestedGroup fulfilmentWindowsSuggestedGroup) {
        this.f10610a = str;
        this.b = str2;
        this.c = insetBannerApiData;
        this.d = str3;
        this.e = list;
        this.f = fulfilmentWindowsFooter;
        this.g = str4;
        this.h = fulfilmentExtraInfo;
        this.i = fulfilmentSlotSelectionOptionsInfo;
        this.j = fulfilmentWindowsSuggestedGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindows)) {
            return false;
        }
        FulfilmentWindows fulfilmentWindows = (FulfilmentWindows) obj;
        return Intrinsics.c(this.f10610a, fulfilmentWindows.f10610a) && Intrinsics.c(this.b, fulfilmentWindows.b) && Intrinsics.c(this.c, fulfilmentWindows.c) && Intrinsics.c(this.d, fulfilmentWindows.d) && Intrinsics.c(this.e, fulfilmentWindows.e) && Intrinsics.c(this.f, fulfilmentWindows.f) && Intrinsics.c(this.g, fulfilmentWindows.g) && Intrinsics.c(this.h, fulfilmentWindows.h) && Intrinsics.c(this.i, fulfilmentWindows.i) && Intrinsics.c(this.j, fulfilmentWindows.j);
    }

    public final int hashCode() {
        int iC = b.c(this.f10610a.hashCode() * 31, 31, this.b);
        InsetBannerApiData insetBannerApiData = this.c;
        int iD = b.d(b.c((iC + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31, 31, this.d), 31, this.e);
        FulfilmentWindowsFooter fulfilmentWindowsFooter = this.f;
        int iHashCode = (iD + (fulfilmentWindowsFooter == null ? 0 : fulfilmentWindowsFooter.f10612a.hashCode())) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        FulfilmentExtraInfo fulfilmentExtraInfo = this.h;
        int iHashCode3 = (iHashCode2 + (fulfilmentExtraInfo == null ? 0 : fulfilmentExtraInfo.hashCode())) * 31;
        FulfilmentSlotSelectionOptionsInfo fulfilmentSlotSelectionOptionsInfo = this.i;
        int iHashCode4 = (iHashCode3 + (fulfilmentSlotSelectionOptionsInfo == null ? 0 : fulfilmentSlotSelectionOptionsInfo.hashCode())) * 31;
        FulfilmentWindowsSuggestedGroup fulfilmentWindowsSuggestedGroup = this.j;
        return iHashCode4 + (fulfilmentWindowsSuggestedGroup != null ? fulfilmentWindowsSuggestedGroup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("FulfilmentWindows(title=", this.f10610a, ", header=", this.b, ", subheader=");
        sbV.append(this.c);
        sbV.append(", subtitle=");
        sbV.append(this.d);
        sbV.append(", options=");
        sbV.append(this.e);
        sbV.append(", footer=");
        sbV.append(this.f);
        sbV.append(", sectionHeader=");
        sbV.append(this.g);
        sbV.append(", feesInfo=");
        sbV.append(this.h);
        sbV.append(", selectionOptionsInfo=");
        sbV.append(this.i);
        sbV.append(", suggestedGroup=");
        sbV.append(this.j);
        sbV.append(")");
        return sbV.toString();
    }
}
