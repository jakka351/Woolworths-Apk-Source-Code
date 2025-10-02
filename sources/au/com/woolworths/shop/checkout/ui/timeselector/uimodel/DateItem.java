package au.com.woolworths.shop.checkout.ui.timeselector.uimodel;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/DateItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DateItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10842a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final FulfilmentSlot i;

    public DateItem(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, List list, FulfilmentSlot fulfilmentSlot) {
        this.f10842a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = list;
        this.i = fulfilmentSlot;
    }

    public static DateItem a(DateItem dateItem, boolean z) {
        String str = dateItem.f10842a;
        String str2 = dateItem.b;
        String str3 = dateItem.c;
        String str4 = dateItem.d;
        boolean z2 = dateItem.f;
        boolean z3 = dateItem.g;
        List list = dateItem.h;
        FulfilmentSlot fulfilmentSlot = dateItem.i;
        dateItem.getClass();
        return new DateItem(str, str2, str3, str4, z, z2, z3, list, fulfilmentSlot);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateItem)) {
            return false;
        }
        DateItem dateItem = (DateItem) obj;
        return Intrinsics.c(this.f10842a, dateItem.f10842a) && Intrinsics.c(this.b, dateItem.b) && Intrinsics.c(this.c, dateItem.c) && Intrinsics.c(this.d, dateItem.d) && this.e == dateItem.e && this.f == dateItem.f && this.g == dateItem.g && Intrinsics.c(this.h, dateItem.h) && Intrinsics.c(this.i, dateItem.i);
    }

    public final int hashCode() {
        int iD = b.d(b.e(b.e(b.e(b.c(b.c(b.c(this.f10842a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        FulfilmentSlot fulfilmentSlot = this.i;
        return iD + (fulfilmentSlot == null ? 0 : fulfilmentSlot.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = a.v("DateItem(dayOfWeek=", this.f10842a, ", date=", this.b, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", price=", this.d, ", isSelected=");
        au.com.woolworths.android.onesite.a.D(sbV, this.e, ", shouldHighlightPrice=", this.f, ", isClosed=");
        sbV.append(this.g);
        sbV.append(", groups=");
        sbV.append(this.h);
        sbV.append(", deliveryNowOrDirectToBootNowTimeSlot=");
        sbV.append(this.i);
        sbV.append(")");
        return sbV.toString();
    }
}
