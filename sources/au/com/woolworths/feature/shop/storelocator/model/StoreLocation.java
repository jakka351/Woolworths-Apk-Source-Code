package au.com.woolworths.feature.shop.storelocator.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/model/StoreLocation;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoreLocation {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreLocation) && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "StoreLocation(address=null, typename=null, pickupTypes=null, distanceInKm=null, instoreTradingHours=null, phone=null, name=null, id=null, facilities=null, supportedShoppingModes=null, pickupTradingHours=null, latitude=0.0, longitude=0.0)";
    }
}
