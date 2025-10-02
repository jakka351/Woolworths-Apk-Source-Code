package au.com.woolworths.shop.checkout.domain.model.confirmation;

import au.com.woolworths.shop.checkout.domain.model.breakdown.DetailsSectionValueType;
import au.com.woolworths.shop.graphql.type.CheckoutSummaryValueType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutSummaryValueTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CheckoutSummaryValueType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckoutSummaryValueType.Companion companion = CheckoutSummaryValueType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckoutSummaryValueType.Companion companion2 = CheckoutSummaryValueType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CheckoutSummaryValueType.Companion companion3 = CheckoutSummaryValueType.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CheckoutSummaryValueType.Companion companion4 = CheckoutSummaryValueType.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final DetailsSectionValueType a(CheckoutSummaryValueType checkoutSummaryValueType) {
        int iOrdinal = checkoutSummaryValueType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? DetailsSectionValueType.g : DetailsSectionValueType.j : DetailsSectionValueType.i : DetailsSectionValueType.h : DetailsSectionValueType.g : DetailsSectionValueType.f;
    }
}
