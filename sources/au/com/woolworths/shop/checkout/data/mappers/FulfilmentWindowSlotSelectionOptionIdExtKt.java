package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId;
import au.com.woolworths.shop.graphql.type.FulfilmentWindowSlotSelectionOptionId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FulfilmentWindowSlotSelectionOptionIdExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FulfilmentWindowSlotSelectionOptionId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FulfilmentWindowSlotSelectionOptionId.Companion companion = FulfilmentWindowSlotSelectionOptionId.e;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FulfilmentWindowSlotSelectionOptionId.Companion companion2 = FulfilmentWindowSlotSelectionOptionId.e;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final FulfilmentSlotSelectionOptionId a(FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionId) {
        Intrinsics.h(fulfilmentWindowSlotSelectionOptionId, "<this>");
        int iOrdinal = fulfilmentWindowSlotSelectionOptionId.ordinal();
        if (iOrdinal == 0) {
            return FulfilmentSlotSelectionOptionId.d;
        }
        if (iOrdinal != 1 && iOrdinal == 2) {
            return FulfilmentSlotSelectionOptionId.e;
        }
        return FulfilmentSlotSelectionOptionId.f;
    }
}
