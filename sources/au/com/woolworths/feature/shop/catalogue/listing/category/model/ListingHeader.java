package au.com.woolworths.feature.shop.catalogue.listing.category.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/model/ListingHeader;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ListingHeader {

    /* renamed from: a, reason: collision with root package name */
    public final String f6878a;
    public final String b;
    public final String c;

    public ListingHeader(String str, String str2, String str3) {
        this.f6878a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingHeader)) {
            return false;
        }
        ListingHeader listingHeader = (ListingHeader) obj;
        return Intrinsics.c(this.f6878a, listingHeader.f6878a) && Intrinsics.c(this.b, listingHeader.b) && Intrinsics.c(this.c, listingHeader.c);
    }

    public final int hashCode() {
        int iHashCode = this.f6878a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.o(a.v("ListingHeader(title=", this.f6878a, ", imageUrl=", this.b, ", backgroundColor="), this.c, ")");
    }
}
