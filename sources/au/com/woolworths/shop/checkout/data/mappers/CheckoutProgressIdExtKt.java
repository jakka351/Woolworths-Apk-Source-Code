package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.graphql.type.CheckoutProgressId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutProgressIdExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CheckoutProgressId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckoutProgressId.Companion companion = CheckoutProgressId.e;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckoutProgressId.Companion companion2 = CheckoutProgressId.e;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CheckoutProgressId.Companion companion3 = CheckoutProgressId.e;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CheckoutProgressId.Companion companion4 = CheckoutProgressId.e;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final ProgressId a(CheckoutProgressId checkoutProgressId) {
        Intrinsics.h(checkoutProgressId, "<this>");
        int iOrdinal = checkoutProgressId.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? ProgressId.i : ProgressId.g : ProgressId.f : ProgressId.e : ProgressId.h : ProgressId.d;
    }
}
