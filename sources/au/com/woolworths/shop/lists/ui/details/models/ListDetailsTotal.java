package au.com.woolworths.shop.lists.ui.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/models/ListDetailsTotal;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListDetailsTotal {

    /* renamed from: a, reason: collision with root package name */
    public final ListDetailsTotalOverview f12310a;
    public final ListDetailsTotalSummary b;
    public final ListDetailsTotalDisclaimer c;

    public ListDetailsTotal(ListDetailsTotalOverview listDetailsTotalOverview, ListDetailsTotalSummary listDetailsTotalSummary, ListDetailsTotalDisclaimer listDetailsTotalDisclaimer) {
        this.f12310a = listDetailsTotalOverview;
        this.b = listDetailsTotalSummary;
        this.c = listDetailsTotalDisclaimer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailsTotal)) {
            return false;
        }
        ListDetailsTotal listDetailsTotal = (ListDetailsTotal) obj;
        return Intrinsics.c(this.f12310a, listDetailsTotal.f12310a) && Intrinsics.c(this.b, listDetailsTotal.b) && Intrinsics.c(this.c, listDetailsTotal.c);
    }

    public final int hashCode() {
        ListDetailsTotalOverview listDetailsTotalOverview = this.f12310a;
        int iHashCode = (listDetailsTotalOverview == null ? 0 : listDetailsTotalOverview.hashCode()) * 31;
        ListDetailsTotalSummary listDetailsTotalSummary = this.b;
        int iHashCode2 = (iHashCode + (listDetailsTotalSummary == null ? 0 : listDetailsTotalSummary.f12314a.hashCode())) * 31;
        ListDetailsTotalDisclaimer listDetailsTotalDisclaimer = this.c;
        return iHashCode2 + (listDetailsTotalDisclaimer != null ? listDetailsTotalDisclaimer.f12311a.hashCode() : 0);
    }

    public final String toString() {
        return "ListDetailsTotal(overview=" + this.f12310a + ", summary=" + this.b + ", disclaimer=" + this.c + ")";
    }
}
