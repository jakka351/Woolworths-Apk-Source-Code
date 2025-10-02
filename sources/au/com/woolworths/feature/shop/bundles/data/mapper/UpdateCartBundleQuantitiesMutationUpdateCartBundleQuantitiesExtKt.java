package au.com.woolworths.feature.shop.bundles.data.mapper;

import au.com.woolworths.feature.shop.bundles.data.BundleQuantityStepper;
import au.com.woolworths.feature.shop.bundles.data.UpdateCartBundleQuantity;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityUpdated;
import au.com.woolworths.foundation.shop.cart.data.model.ErrorUpdateCartProductQuantity;
import au.com.woolworths.foundation.shop.cart.data.model.UpdateCartProductQuantityFailedReason;
import com.woolworths.feature.shop.bundles.UpdateCartBundleQuantitiesMutation;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"bundles_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class UpdateCartBundleQuantitiesMutationUpdateCartBundleQuantitiesExtKt {
    public static final UpdateCartBundleQuantity a(UpdateCartBundleQuantitiesMutation.UpdateCartBundleQuantities updateCartBundleQuantities) {
        ErrorUpdateCartProductQuantity errorUpdateCartProductQuantity;
        String str;
        CartProductQuantityAction cartProductQuantityAction;
        int i = updateCartBundleQuantities.f19445a;
        int i2 = updateCartBundleQuantities.b;
        UpdateCartBundleQuantitiesMutation.OnBundleQuantityStepper onBundleQuantityStepper = updateCartBundleQuantities.c.b;
        BundleQuantityStepper bundleQuantityStepper = new BundleQuantityStepper(onBundleQuantityStepper.f19444a, onBundleQuantityStepper.b, onBundleQuantityStepper.c, onBundleQuantityStepper.d, onBundleQuantityStepper.e, onBundleQuantityStepper.f, onBundleQuantityStepper.g);
        ArrayList<UpdateCartBundleQuantitiesMutation.UpdatedProductQuantity> arrayList = updateCartBundleQuantities.d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (UpdateCartBundleQuantitiesMutation.UpdatedProductQuantity updatedProductQuantity : arrayList) {
            Intrinsics.h(updatedProductQuantity, "<this>");
            String str2 = updatedProductQuantity.f19447a;
            double d = updatedProductQuantity.b;
            boolean z = updatedProductQuantity.c;
            UpdateCartBundleQuantitiesMutation.Error error = updatedProductQuantity.d;
            if (error != null) {
                int iOrdinal = error.f19443a.ordinal();
                errorUpdateCartProductQuantity = new ErrorUpdateCartProductQuantity(iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? UpdateCartProductQuantityFailedReason.f : UpdateCartProductQuantityFailedReason.f : UpdateCartProductQuantityFailedReason.e : UpdateCartProductQuantityFailedReason.d, error.b);
            } else {
                errorUpdateCartProductQuantity = null;
            }
            Double d2 = updatedProductQuantity.e;
            String str3 = updatedProductQuantity.f;
            au.com.woolworths.shop.graphql.type.CartProductQuantityAction cartProductQuantityAction2 = updatedProductQuantity.g;
            if (cartProductQuantityAction2 != null) {
                int iOrdinal2 = cartProductQuantityAction2.ordinal();
                str = str3;
                cartProductQuantityAction = iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? iOrdinal2 != 4 ? CartProductQuantityAction.h : CartProductQuantityAction.h : CartProductQuantityAction.g : CartProductQuantityAction.f : CartProductQuantityAction.e : CartProductQuantityAction.d;
            } else {
                str = str3;
                cartProductQuantityAction = null;
            }
            arrayList2.add(new CartProductQuantityUpdated(str2, d, z, errorUpdateCartProductQuantity, d2, str, cartProductQuantityAction));
        }
        return new UpdateCartBundleQuantity(i, i2, bundleQuantityStepper, arrayList2);
    }
}
