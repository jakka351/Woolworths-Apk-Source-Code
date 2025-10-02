package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.BadgeStyle;
import au.com.woolworths.shop.graphql.type.CheckoutBadgeStyle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutBadgeStyleExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CheckoutBadgeStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckoutBadgeStyle.Companion companion = CheckoutBadgeStyle.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckoutBadgeStyle.Companion companion2 = CheckoutBadgeStyle.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final BadgeStyle a(CheckoutBadgeStyle checkoutBadgeStyle) {
        int iOrdinal = checkoutBadgeStyle.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? BadgeStyle.g : BadgeStyle.f : BadgeStyle.e : BadgeStyle.d;
    }
}
