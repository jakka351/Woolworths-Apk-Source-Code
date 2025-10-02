package au.com.woolworths.shop.lists.ui.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/models/ListDetailsTotalOverview;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListDetailsTotalOverview {

    /* renamed from: a, reason: collision with root package name */
    public final String f12312a;
    public final String b;
    public final String c;

    public ListDetailsTotalOverview(String str, String str2, String str3) {
        this.f12312a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailsTotalOverview)) {
            return false;
        }
        ListDetailsTotalOverview listDetailsTotalOverview = (ListDetailsTotalOverview) obj;
        return Intrinsics.c(this.f12312a, listDetailsTotalOverview.f12312a) && Intrinsics.c(this.b, listDetailsTotalOverview.b) && Intrinsics.c(this.c, listDetailsTotalOverview.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f12312a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("ListDetailsTotalOverview(label=", this.f12312a, ", value=", this.b, ", altText="), this.c, ")");
    }
}
