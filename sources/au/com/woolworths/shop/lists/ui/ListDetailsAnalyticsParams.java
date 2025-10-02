package au.com.woolworths.shop.lists.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.data.utils.ListsAnalyticsAppSection;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/ListDetailsAnalyticsParams;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListDetailsAnalyticsParams {

    /* renamed from: a, reason: collision with root package name */
    public final ListsAnalyticsAppSection f12301a;
    public final boolean b;

    public ListDetailsAnalyticsParams(ListsAnalyticsAppSection listsAnalyticsAppSection, boolean z) {
        this.f12301a = listsAnalyticsAppSection;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailsAnalyticsParams)) {
            return false;
        }
        ListDetailsAnalyticsParams listDetailsAnalyticsParams = (ListDetailsAnalyticsParams) obj;
        return this.f12301a == listDetailsAnalyticsParams.f12301a && this.b == listDetailsAnalyticsParams.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f12301a.hashCode() * 31);
    }

    public final String toString() {
        return "ListDetailsAnalyticsParams(appSection=" + this.f12301a + ", isWatchlist=" + this.b + ")";
    }
}
