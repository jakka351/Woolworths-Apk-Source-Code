package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/utils/Reporting;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class Reporting {

    /* renamed from: a, reason: collision with root package name */
    public final Text f12452a;
    public final String b;

    public Reporting(Text text, String eventDescription) {
        Intrinsics.h(eventDescription, "eventDescription");
        this.f12452a = text;
        this.b = eventDescription;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reporting)) {
            return false;
        }
        Reporting reporting = (Reporting) obj;
        return Intrinsics.c(this.f12452a, reporting.f12452a) && Intrinsics.c(this.b, reporting.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12452a.hashCode() * 31);
    }

    public final String toString() {
        return "Reporting(message=" + this.f12452a + ", eventDescription=" + this.b + ")";
    }
}
