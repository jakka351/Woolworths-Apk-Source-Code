package au.com.woolworths.product.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/offers/TrackableBoostMetadata;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TrackableBoostMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final Screen f9330a;
    public final TrackingMetadata b;

    public TrackableBoostMetadata(Screen screen, TrackingMetadata trackingMetadata) {
        this.f9330a = screen;
        this.b = trackingMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackableBoostMetadata)) {
            return false;
        }
        TrackableBoostMetadata trackableBoostMetadata = (TrackableBoostMetadata) obj;
        return Intrinsics.c(this.f9330a, trackableBoostMetadata.f9330a) && Intrinsics.c(this.b, trackableBoostMetadata.b);
    }

    public final int hashCode() {
        int iHashCode = this.f9330a.hashCode() * 31;
        TrackingMetadata trackingMetadata = this.b;
        return iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode());
    }

    public final String toString() {
        return "TrackableBoostMetadata(screen=" + this.f9330a + ", metadata=" + this.b + ")";
    }
}
