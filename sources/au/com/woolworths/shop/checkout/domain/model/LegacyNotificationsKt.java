package au.com.woolworths.shop.checkout.domain.model;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LegacyNotificationsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10619a = CollectionsKt.R(Integer.valueOf(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), Integer.valueOf(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT), 1002, 1001, 1029, 1031);
    public static final Set b = ArraysKt.r0(new Integer[]{1006, 1003, 1007, 1008, 1026, 1027, 1028, 1009});

    public static final LinkedHashMap a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            linkedHashMap.put(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(i));
            i = i2;
        }
        return linkedHashMap;
    }
}
