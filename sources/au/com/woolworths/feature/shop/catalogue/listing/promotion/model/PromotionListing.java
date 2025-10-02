package au.com.woolworths.feature.shop.catalogue.listing.promotion.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/model/PromotionListing;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromotionListing {

    /* renamed from: a, reason: collision with root package name */
    public final ListingHeader f6907a;
    public final ArrayList b;

    public PromotionListing(ListingHeader listingHeader, ArrayList arrayList) {
        this.f6907a = listingHeader;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionListing)) {
            return false;
        }
        PromotionListing promotionListing = (PromotionListing) obj;
        return Intrinsics.c(this.f6907a, promotionListing.f6907a) && this.b.equals(promotionListing.b);
    }

    public final int hashCode() {
        ListingHeader listingHeader = this.f6907a;
        return this.b.hashCode() + ((listingHeader == null ? 0 : listingHeader.hashCode()) * 31);
    }

    public final String toString() {
        return "PromotionListing(header=" + this.f6907a + ", items=" + this.b + ")";
    }
}
