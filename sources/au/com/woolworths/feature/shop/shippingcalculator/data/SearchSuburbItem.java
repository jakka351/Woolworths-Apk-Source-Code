package au.com.woolworths.feature.shop.shippingcalculator.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/data/SearchSuburbItem;", "", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SearchSuburbItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f8103a;
    public final String b;
    public final String c;

    public SearchSuburbItem(String str, String str2, String str3) {
        this.f8103a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSuburbItem)) {
            return false;
        }
        SearchSuburbItem searchSuburbItem = (SearchSuburbItem) obj;
        return Intrinsics.c(this.f8103a, searchSuburbItem.f8103a) && Intrinsics.c(this.b, searchSuburbItem.b) && Intrinsics.c(this.c, searchSuburbItem.c);
    }

    public final int hashCode() {
        String str = this.f8103a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return YU.a.o(YU.a.v("SearchSuburbItem(postcode=", this.f8103a, ", state=", this.b, ", text="), this.c, ")");
    }
}
