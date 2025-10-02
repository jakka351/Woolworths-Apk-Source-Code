package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsFooterIconData;
import au.com.woolworths.shop.graphql.type.FulfilmentWindowsFooterIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FulfilmentWindowsFooterIconExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FulfilmentWindowsFooterIcon.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FulfilmentWindowsFooterIcon.Companion companion = FulfilmentWindowsFooterIcon.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FulfilmentWindowsFooterIcon.Companion companion2 = FulfilmentWindowsFooterIcon.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final FulfilmentWindowsFooterIconData a(FulfilmentWindowsFooterIcon fulfilmentWindowsFooterIcon) {
        Intrinsics.h(fulfilmentWindowsFooterIcon, "<this>");
        int iOrdinal = fulfilmentWindowsFooterIcon.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? FulfilmentWindowsFooterIconData.d : FulfilmentWindowsFooterIconData.d : FulfilmentWindowsFooterIconData.PARTNER_DELIVERY : FulfilmentWindowsFooterIconData.GREEN_DELIVERY;
    }
}
