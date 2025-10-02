package au.com.woolworths.shop.lists.ui.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/models/ListDetails;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListDetails {

    /* renamed from: a, reason: collision with root package name */
    public final ListDetailsTotal f12306a;
    public final List b;

    public ListDetails(ListDetailsTotal listDetailsTotal, List list) {
        this.f12306a = listDetailsTotal;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetails)) {
            return false;
        }
        ListDetails listDetails = (ListDetails) obj;
        return Intrinsics.c(this.f12306a, listDetails.f12306a) && Intrinsics.c(this.b, listDetails.b);
    }

    public final int hashCode() {
        ListDetailsTotal listDetailsTotal = this.f12306a;
        int iHashCode = (listDetailsTotal == null ? 0 : listDetailsTotal.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ListDetails(total=" + this.f12306a + ", productActions=" + this.b + ")";
    }
}
