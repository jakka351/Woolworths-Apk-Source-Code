package au.com.woolworths.feature.shop.catalogue.listing.category.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/model/CategoryListing;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CategoryListing {

    /* renamed from: a, reason: collision with root package name */
    public final ListingHeader f6877a;
    public final ArrayList b;

    public CategoryListing(ListingHeader listingHeader, ArrayList arrayList) {
        this.f6877a = listingHeader;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryListing)) {
            return false;
        }
        CategoryListing categoryListing = (CategoryListing) obj;
        return Intrinsics.c(this.f6877a, categoryListing.f6877a) && this.b.equals(categoryListing.b);
    }

    public final int hashCode() {
        ListingHeader listingHeader = this.f6877a;
        return this.b.hashCode() + ((listingHeader == null ? 0 : listingHeader.hashCode()) * 31);
    }

    public final String toString() {
        return "CategoryListing(header=" + this.f6877a + ", items=" + this.b + ")";
    }
}
