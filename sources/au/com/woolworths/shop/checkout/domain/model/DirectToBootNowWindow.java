package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/DirectToBootNowWindow;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DirectToBootNowWindow {

    /* renamed from: a, reason: collision with root package name */
    public final int f10597a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Boolean i;
    public final BadgeApiData j;
    public final FulfilmentWindowSlotSelectionInfo k;
    public final FulfilmentSlotSelectionOptionsState l;
    public final List m;
    public final List n;

    public DirectToBootNowWindow(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Boolean bool, BadgeApiData badgeApiData, FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo, FulfilmentSlotSelectionOptionsState fulfilmentSlotSelectionOptionsState, List list, List list2) {
        this.f10597a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = bool;
        this.j = badgeApiData;
        this.k = fulfilmentWindowSlotSelectionInfo;
        this.l = fulfilmentSlotSelectionOptionsState;
        this.m = list;
        this.n = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectToBootNowWindow)) {
            return false;
        }
        DirectToBootNowWindow directToBootNowWindow = (DirectToBootNowWindow) obj;
        return this.f10597a == directToBootNowWindow.f10597a && this.b.equals(directToBootNowWindow.b) && this.c.equals(directToBootNowWindow.c) && this.d.equals(directToBootNowWindow.d) && Intrinsics.c(this.e, directToBootNowWindow.e) && this.f.equals(directToBootNowWindow.f) && this.g.equals(directToBootNowWindow.g) && this.h == directToBootNowWindow.h && Intrinsics.c(this.i, directToBootNowWindow.i) && Intrinsics.c(this.j, directToBootNowWindow.j) && Intrinsics.c(this.k, directToBootNowWindow.k) && Intrinsics.c(this.l, directToBootNowWindow.l) && Intrinsics.c(this.m, directToBootNowWindow.m) && Intrinsics.c(this.n, directToBootNowWindow.n);
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(Integer.hashCode(this.f10597a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iE = b.e(b.c(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        Boolean bool = this.i;
        int iHashCode = (iE + (bool == null ? 0 : bool.hashCode())) * 961;
        BadgeApiData badgeApiData = this.j;
        int iHashCode2 = (iHashCode + (badgeApiData == null ? 0 : badgeApiData.hashCode())) * 31;
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo = this.k;
        int iHashCode3 = (iHashCode2 + (fulfilmentWindowSlotSelectionInfo == null ? 0 : fulfilmentWindowSlotSelectionInfo.hashCode())) * 31;
        FulfilmentSlotSelectionOptionsState fulfilmentSlotSelectionOptionsState = this.l;
        int iHashCode4 = (iHashCode3 + (fulfilmentSlotSelectionOptionsState == null ? 0 : fulfilmentSlotSelectionOptionsState.f10608a.hashCode())) * 31;
        List list = this.m;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.n;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = a.p("DirectToBootNowWindow(id=", this.f10597a, ", startTime=", this.b, ", title=");
        a.B(sbP, this.c, ", subtitle=", this.d, ", secondarySubtitle=");
        a.B(sbP, this.e, ", sectionTitle=", this.f, ", imageUrl=");
        d.A(this.g, ", isReserved=", ", isEnabled=", sbP, this.h);
        sbP.append(this.i);
        sbP.append(", badge=null, tileBadge=");
        sbP.append(this.j);
        sbP.append(", selectionInfo=");
        sbP.append(this.k);
        sbP.append(", selectionOptionsState=");
        sbP.append(this.l);
        sbP.append(", tags=");
        sbP.append(this.m);
        sbP.append(", statuses=");
        sbP.append(this.n);
        sbP.append(")");
        return sbP.toString();
    }
}
