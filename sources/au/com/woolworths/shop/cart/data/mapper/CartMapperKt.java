package au.com.woolworths.shop.cart.data.mapper;

import au.com.woolworths.foundation.shop.cart.data.mapper.CartExtKt;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityUpdated;
import au.com.woolworths.foundation.shop.cart.data.model.ErrorUpdateCartProductQuantity;
import au.com.woolworths.foundation.shop.cart.data.model.UpdateCartProductQuantityFailedReason;
import com.woolworths.shop.cart.UpdateCartProductQuantitiesLiteMutation;
import com.woolworths.shop.cart.UpdateCartProductQuantitiesMutation;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartMapperKt {
    public static final CartProductQuantitiesUpdatedResponse a(UpdateCartProductQuantitiesLiteMutation.UpdateCartProductQuantities updateCartProductQuantities) {
        ErrorUpdateCartProductQuantity errorUpdateCartProductQuantity;
        CartProductQuantityAction cartProductQuantityAction;
        Intrinsics.h(updateCartProductQuantities, "<this>");
        int i = updateCartProductQuantities.f21557a;
        int i2 = updateCartProductQuantities.b;
        ArrayList<UpdateCartProductQuantitiesLiteMutation.UpdatedProductQuantity> arrayList = updateCartProductQuantities.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (UpdateCartProductQuantitiesLiteMutation.UpdatedProductQuantity updatedProductQuantity : arrayList) {
            Intrinsics.h(updatedProductQuantity, "<this>");
            String str = updatedProductQuantity.f21558a;
            double d = updatedProductQuantity.b;
            boolean z = updatedProductQuantity.c;
            UpdateCartProductQuantitiesLiteMutation.Error error = updatedProductQuantity.d;
            if (error != null) {
                int iOrdinal = error.f21555a.ordinal();
                errorUpdateCartProductQuantity = new ErrorUpdateCartProductQuantity(iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? UpdateCartProductQuantityFailedReason.f : UpdateCartProductQuantityFailedReason.f : UpdateCartProductQuantityFailedReason.e : UpdateCartProductQuantityFailedReason.d, error.b);
                cartProductQuantityAction = null;
            } else {
                errorUpdateCartProductQuantity = null;
                cartProductQuantityAction = null;
            }
            Double d2 = updatedProductQuantity.e;
            CartProductQuantityAction cartProductQuantityActionA = cartProductQuantityAction;
            String str2 = updatedProductQuantity.f;
            au.com.woolworths.shop.graphql.type.CartProductQuantityAction cartProductQuantityAction2 = updatedProductQuantity.g;
            if (cartProductQuantityAction2 != null) {
                cartProductQuantityActionA = CartProductQuantityActionExtKt.a(cartProductQuantityAction2);
            }
            arrayList2.add(new CartProductQuantityUpdated(str, d, z, errorUpdateCartProductQuantity, d2, str2, cartProductQuantityActionA));
        }
        return new CartProductQuantitiesUpdatedResponse(i, i2, arrayList2, null, 16);
    }

    public static final CartProductQuantitiesUpdatedResponse b(UpdateCartProductQuantitiesMutation.UpdateCartProductQuantities updateCartProductQuantities) {
        ErrorUpdateCartProductQuantity errorUpdateCartProductQuantity;
        Intrinsics.h(updateCartProductQuantities, "<this>");
        int i = updateCartProductQuantities.f21564a;
        int i2 = updateCartProductQuantities.b;
        ArrayList<UpdateCartProductQuantitiesMutation.UpdatedProductQuantity> arrayList = updateCartProductQuantities.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (UpdateCartProductQuantitiesMutation.UpdatedProductQuantity updatedProductQuantity : arrayList) {
            Intrinsics.h(updatedProductQuantity, "<this>");
            String str = updatedProductQuantity.f21565a;
            double d = updatedProductQuantity.b;
            boolean z = updatedProductQuantity.c;
            UpdateCartProductQuantitiesMutation.Error error = updatedProductQuantity.d;
            if (error != null) {
                int iOrdinal = error.f21562a.ordinal();
                errorUpdateCartProductQuantity = new ErrorUpdateCartProductQuantity(iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? UpdateCartProductQuantityFailedReason.f : UpdateCartProductQuantityFailedReason.f : UpdateCartProductQuantityFailedReason.e : UpdateCartProductQuantityFailedReason.d, error.b);
            } else {
                errorUpdateCartProductQuantity = null;
            }
            Double d2 = updatedProductQuantity.e;
            String str2 = updatedProductQuantity.f;
            au.com.woolworths.shop.graphql.type.CartProductQuantityAction cartProductQuantityAction = updatedProductQuantity.g;
            arrayList2.add(new CartProductQuantityUpdated(str, d, z, errorUpdateCartProductQuantity, d2, str2, cartProductQuantityAction != null ? CartProductQuantityActionExtKt.a(cartProductQuantityAction) : null));
        }
        return new CartProductQuantitiesUpdatedResponse(i, i2, arrayList2, CartExtKt.a(updateCartProductQuantities.d.b), 16);
    }
}
