package au.com.woolworths.foundation.shop.instore.presence.domain;

import android.location.Location;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-presence_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StoreLocatorResultExtKt {
    public static final Location a(StoreLocatorResult.Store store) {
        Intrinsics.h(store, "<this>");
        Location location = new Location("stores api");
        String latitude = store.getLatitude();
        Intrinsics.g(latitude, "getLatitude(...)");
        location.setLatitude(Double.parseDouble(latitude));
        String longitude = store.getLongitude();
        Intrinsics.g(longitude, "getLongitude(...)");
        location.setLongitude(Double.parseDouble(longitude));
        return location;
    }
}
