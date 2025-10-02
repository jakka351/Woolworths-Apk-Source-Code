package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.PreferenceId;
import au.com.woolworths.shop.graphql.type.CheckoutDeliveryPreferenceId;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutDeliveryPreferenceIdExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CheckoutDeliveryPreferenceId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckoutDeliveryPreferenceId.Companion companion = CheckoutDeliveryPreferenceId.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckoutDeliveryPreferenceId.Companion companion2 = CheckoutDeliveryPreferenceId.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CheckoutDeliveryPreferenceId.Companion companion3 = CheckoutDeliveryPreferenceId.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CheckoutDeliveryPreferenceId.Companion companion4 = CheckoutDeliveryPreferenceId.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final PreferenceId a(CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceId) {
        int iOrdinal = checkoutDeliveryPreferenceId.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? PreferenceId.i : PreferenceId.h : PreferenceId.g : PreferenceId.f : PreferenceId.e : PreferenceId.d;
    }
}
