package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsSlot;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowsSlot {

    /* renamed from: a, reason: collision with root package name */
    public final String f10617a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final List i;
    public final FulfilmentWindowSlotSelectionInfo j;
    public final FulfilmentSlotSelectionOptionsState k;
    public final List l;
    public final List m;

    public FulfilmentWindowsSlot(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, String str4, List list, FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo, FulfilmentSlotSelectionOptionsState fulfilmentSlotSelectionOptionsState, List list2, List list3) {
        this.f10617a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str4;
        this.i = list;
        this.j = fulfilmentWindowSlotSelectionInfo;
        this.k = fulfilmentSlotSelectionOptionsState;
        this.l = list2;
        this.m = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowsSlot)) {
            return false;
        }
        FulfilmentWindowsSlot fulfilmentWindowsSlot = (FulfilmentWindowsSlot) obj;
        return Intrinsics.c(this.f10617a, fulfilmentWindowsSlot.f10617a) && Intrinsics.c(this.b, fulfilmentWindowsSlot.b) && Intrinsics.c(this.c, fulfilmentWindowsSlot.c) && this.d == fulfilmentWindowsSlot.d && this.e == fulfilmentWindowsSlot.e && this.f == fulfilmentWindowsSlot.f && this.g == fulfilmentWindowsSlot.g && Intrinsics.c(this.h, fulfilmentWindowsSlot.h) && Intrinsics.c(this.i, fulfilmentWindowsSlot.i) && Intrinsics.c(this.j, fulfilmentWindowsSlot.j) && Intrinsics.c(this.k, fulfilmentWindowsSlot.k) && Intrinsics.c(this.l, fulfilmentWindowsSlot.l) && Intrinsics.c(this.m, fulfilmentWindowsSlot.m);
    }

    public final int hashCode() {
        int iD = b.d(b.c(b.e(b.e(b.e(b.a(this.d, b.c(b.c(this.f10617a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo = this.j;
        int iHashCode = (iD + (fulfilmentWindowSlotSelectionInfo == null ? 0 : fulfilmentWindowSlotSelectionInfo.hashCode())) * 31;
        FulfilmentSlotSelectionOptionsState fulfilmentSlotSelectionOptionsState = this.k;
        int iHashCode2 = (iHashCode + (fulfilmentSlotSelectionOptionsState == null ? 0 : fulfilmentSlotSelectionOptionsState.f10608a.hashCode())) * 31;
        List list = this.l;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.m;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("FulfilmentWindowsSlot(title=", this.f10617a, ", subtitle=", this.b, ", startTime=");
        a.x(this.d, this.c, ", id=", ", isAvailable=", sbV);
        au.com.woolworths.android.onesite.a.D(sbV, this.e, ", isReserved=", this.f, ", isPartnerDriver=");
        au.com.woolworths.android.onesite.a.y(", sectionTitle=", this.h, ", badges=", sbV, this.g);
        sbV.append(this.i);
        sbV.append(", selectionInfo=");
        sbV.append(this.j);
        sbV.append(", selectionOptionsState=");
        sbV.append(this.k);
        sbV.append(", tags=");
        sbV.append(this.l);
        sbV.append(", statuses=");
        return android.support.v4.media.session.a.t(sbV, this.m, ")");
    }
}
