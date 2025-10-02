package au.com.woolworths.android.onesite.modules.collectionmode.common;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CollectionModeKt {
    public static final int a(CollectionMode collectionMode) {
        Intrinsics.h(collectionMode, "<this>");
        if (collectionMode instanceof CollectionMode.PickUp) {
            return R.string.shopping_header_pick_up_from;
        }
        if (collectionMode instanceof CollectionMode.Delivery) {
            return ((CollectionMode.Delivery) collectionMode).getVariant() == DeliveryModeVariant.DeliveryNow ? R.string.shopping_header_delivery_now_to : R.string.shopping_header_deliver_to;
        }
        if (collectionMode instanceof CollectionMode.InStore) {
            return R.string.shopping_header_in_store;
        }
        return 0;
    }

    public static final String b(CollectionMode collectionMode) {
        Intrinsics.h(collectionMode, "<this>");
        return collectionMode instanceof CollectionMode.Delivery ? ((CollectionMode.Delivery) collectionMode).getVariant().d : collectionMode.getModeName();
    }

    public static final CollectionMode c(String str, boolean z) {
        Intrinsics.h(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode != -1935147396) {
            if (iHashCode != -1619401028) {
                if (iHashCode == 1606093812 && str.equals("DELIVERY")) {
                    return z ? new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow) : new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard);
                }
            } else if (str.equals("INSTORE")) {
                return CollectionMode.InStore.d;
            }
        } else if (str.equals("PICKUP")) {
            return CollectionMode.PickUp.d;
        }
        throw new IllegalArgumentException("Collection mode is unknown");
    }
}
