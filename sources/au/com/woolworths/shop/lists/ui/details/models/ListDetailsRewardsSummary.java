package au.com.woolworths.shop.lists.ui.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/models/ListDetailsRewardsSummary;", "Lau/com/woolworths/shop/lists/ui/details/models/ListDetailsTotalSectionSubItemBase;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListDetailsRewardsSummary implements ListDetailsTotalSectionSubItemBase {

    /* renamed from: a, reason: collision with root package name */
    public final String f12309a;
    public final String b;
    public final String c;

    public ListDetailsRewardsSummary(String str, String str2, String str3) {
        this.f12309a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionSubItemBase
    /* renamed from: a, reason: from getter */
    public final String getF12309a() {
        return this.f12309a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailsRewardsSummary)) {
            return false;
        }
        ListDetailsRewardsSummary listDetailsRewardsSummary = (ListDetailsRewardsSummary) obj;
        return Intrinsics.c(this.f12309a, listDetailsRewardsSummary.f12309a) && Intrinsics.c(this.b, listDetailsRewardsSummary.b) && Intrinsics.c(this.c, listDetailsRewardsSummary.c);
    }

    @Override // au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionSubItemBase
    /* renamed from: getImageUrl, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionSubItemBase
    /* renamed from: getValue, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iC = b.c(this.f12309a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.o(a.v("ListDetailsRewardsSummary(label=", this.f12309a, ", value=", this.b, ", imageUrl="), this.c, ")");
    }
}
