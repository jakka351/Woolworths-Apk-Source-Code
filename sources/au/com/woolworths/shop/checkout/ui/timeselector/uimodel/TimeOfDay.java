package au.com.woolworths.shop.checkout.ui.timeselector.uimodel;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeOfDay;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TimeOfDay {

    /* renamed from: a, reason: collision with root package name */
    public final String f10843a;
    public final boolean b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ TimeOfDay(String str, int i, String str2, boolean z) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? "You can change your time of day to see more options." : null, EmptyList.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    public static TimeOfDay a(TimeOfDay timeOfDay, boolean z, ArrayList arrayList, int i) {
        String label = timeOfDay.f10843a;
        if ((i & 2) != 0) {
            z = timeOfDay.b;
        }
        boolean z2 = z;
        String str = timeOfDay.c;
        String str2 = timeOfDay.d;
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = timeOfDay.e;
        }
        ArrayList slots = arrayList2;
        timeOfDay.getClass();
        Intrinsics.h(label, "label");
        Intrinsics.h(slots, "slots");
        return new TimeOfDay(label, z2, str, str2, slots);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeOfDay)) {
            return false;
        }
        TimeOfDay timeOfDay = (TimeOfDay) obj;
        return Intrinsics.c(this.f10843a, timeOfDay.f10843a) && this.b == timeOfDay.b && Intrinsics.c(this.c, timeOfDay.c) && Intrinsics.c(this.d, timeOfDay.d) && Intrinsics.c(this.e, timeOfDay.e);
    }

    public final int hashCode() {
        int iE = b.e(this.f10843a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = a.q("TimeOfDay(label=", this.f10843a, ", isSelected=", ", emptyStateTitle=", this.b);
        a.B(sbQ, this.c, ", emptyStateSubtitle=", this.d, ", slots=");
        return android.support.v4.media.session.a.t(sbQ, this.e, ")");
    }

    public TimeOfDay(String str, boolean z, String str2, String str3, List list) {
        this.f10843a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }
}
