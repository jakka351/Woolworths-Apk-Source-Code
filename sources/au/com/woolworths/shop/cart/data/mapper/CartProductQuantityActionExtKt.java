package au.com.woolworths.shop.cart.data.mapper;

import au.com.woolworths.shop.graphql.type.CartProductQuantityAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductQuantityActionExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CartProductQuantityAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CartProductQuantityAction.Companion companion = CartProductQuantityAction.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CartProductQuantityAction.Companion companion2 = CartProductQuantityAction.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CartProductQuantityAction.Companion companion3 = CartProductQuantityAction.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CartProductQuantityAction.Companion companion4 = CartProductQuantityAction.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction a(CartProductQuantityAction cartProductQuantityAction) {
        Intrinsics.h(cartProductQuantityAction, "<this>");
        int iOrdinal = cartProductQuantityAction.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction.h : au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction.h : au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction.g : au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction.f : au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction.e : au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction.d;
    }
}
