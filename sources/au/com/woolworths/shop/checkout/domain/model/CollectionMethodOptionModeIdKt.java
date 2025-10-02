package au.com.woolworths.shop.checkout.domain.model;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CollectionMethodOptionModeIdKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CollectionMethodOptionModeId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CollectionMethodOptionModeId collectionMethodOptionModeId = CollectionMethodOptionModeId.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CollectionMethodOptionModeId collectionMethodOptionModeId2 = CollectionMethodOptionModeId.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CollectionMethodOptionModeId collectionMethodOptionModeId3 = CollectionMethodOptionModeId.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final CollectionMode a(CollectionMethodOptionModeId collectionMethodOptionModeId) {
        int iOrdinal = collectionMethodOptionModeId.ordinal();
        if (iOrdinal == 0) {
            return new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard);
        }
        if (iOrdinal == 1) {
            return CollectionMode.PickUp.d;
        }
        if (iOrdinal == 2) {
            return new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow);
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Collection mode is unknown");
    }
}
