package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import au.com.woolworths.shop.graphql.type.ShoppingModeVariantState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-shop-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingModeVariantStateExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ShoppingModeVariantState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ShoppingModeVariantState.Companion companion = ShoppingModeVariantState.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ShoppingModeVariantState.Companion companion2 = ShoppingModeVariantState.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final ShoppingModeVariantStateData a(ShoppingModeVariantState shoppingModeVariantState) {
        Intrinsics.h(shoppingModeVariantState, "<this>");
        int iOrdinal = shoppingModeVariantState.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? ShoppingModeVariantStateData.AVAILABLE : ShoppingModeVariantStateData.SELECTED : ShoppingModeVariantStateData.DISABLED : ShoppingModeVariantStateData.AVAILABLE;
    }
}
