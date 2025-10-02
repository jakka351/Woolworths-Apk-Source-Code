package au.com.woolworths.shop.lists.ui.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/models/ListDetailsPotentialSavings;", "Lau/com/woolworths/shop/lists/ui/details/models/ListDetailsTotalSectionSubItemBase;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListDetailsPotentialSavings implements ListDetailsTotalSectionSubItemBase {

    /* renamed from: a, reason: collision with root package name */
    public final String f12307a;
    public final String b;

    public ListDetailsPotentialSavings(String str, String str2) {
        this.f12307a = str;
        this.b = str2;
    }

    @Override // au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionSubItemBase
    /* renamed from: a, reason: from getter */
    public final String getF12307a() {
        return this.f12307a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailsPotentialSavings)) {
            return false;
        }
        ListDetailsPotentialSavings listDetailsPotentialSavings = (ListDetailsPotentialSavings) obj;
        return this.f12307a.equals(listDetailsPotentialSavings.f12307a) && this.b.equals(listDetailsPotentialSavings.b);
    }

    @Override // au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionSubItemBase
    public final String getImageUrl() {
        return null;
    }

    @Override // au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionSubItemBase
    /* renamed from: getValue, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        return b.c(this.f12307a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.j("ListDetailsPotentialSavings(label=", this.f12307a, ", value=", this.b, ", imageUrl=null)");
    }
}
