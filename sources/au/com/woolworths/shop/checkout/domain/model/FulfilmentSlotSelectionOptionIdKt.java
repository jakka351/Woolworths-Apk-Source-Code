package au.com.woolworths.shop.checkout.domain.model;

import au.com.woolworths.shop.graphql.type.FulfilmentWindowSlotSelectionOptionId;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FulfilmentSlotSelectionOptionIdKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FulfilmentSlotSelectionOptionId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId = FulfilmentSlotSelectionOptionId.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId2 = FulfilmentSlotSelectionOptionId.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final FulfilmentWindowSlotSelectionOptionId a(FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId) {
        Intrinsics.h(fulfilmentSlotSelectionOptionId, "<this>");
        int iOrdinal = fulfilmentSlotSelectionOptionId.ordinal();
        if (iOrdinal == 0) {
            return FulfilmentWindowSlotSelectionOptionId.g;
        }
        if (iOrdinal == 1) {
            return FulfilmentWindowSlotSelectionOptionId.i;
        }
        if (iOrdinal == 2) {
            return FulfilmentWindowSlotSelectionOptionId.h;
        }
        throw new NoWhenBranchMatchedException();
    }
}
