package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CallerStateKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PickupLocationComponent.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PickupLocationComponent pickupLocationComponent = PickupLocationComponent.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final au.com.woolworths.shop.graphql.type.PickupLocationComponent a(PickupLocationComponent pickupLocationComponent) {
        Intrinsics.h(pickupLocationComponent, "<this>");
        int iOrdinal = pickupLocationComponent.ordinal();
        if (iOrdinal == 0) {
            return au.com.woolworths.shop.graphql.type.PickupLocationComponent.f;
        }
        if (iOrdinal == 1) {
            return au.com.woolworths.shop.graphql.type.PickupLocationComponent.g;
        }
        throw new NoWhenBranchMatchedException();
    }
}
