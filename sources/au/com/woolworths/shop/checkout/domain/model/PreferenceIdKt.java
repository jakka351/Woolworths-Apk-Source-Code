package au.com.woolworths.shop.checkout.domain.model;

import au.com.woolworths.shop.graphql.type.CheckoutDeliveryPreferenceId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PreferenceIdKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PreferenceId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PreferenceId preferenceId = PreferenceId.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PreferenceId preferenceId2 = PreferenceId.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PreferenceId preferenceId3 = PreferenceId.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PreferenceId preferenceId4 = PreferenceId.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final CheckoutDeliveryPreferenceId a(PreferenceId preferenceId) {
        Intrinsics.h(preferenceId, "<this>");
        int iOrdinal = preferenceId.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? CheckoutDeliveryPreferenceId.l : CheckoutDeliveryPreferenceId.k : CheckoutDeliveryPreferenceId.j : CheckoutDeliveryPreferenceId.i : CheckoutDeliveryPreferenceId.h : CheckoutDeliveryPreferenceId.g;
    }
}
