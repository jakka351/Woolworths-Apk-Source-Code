package au.com.woolworths.checkout.common.responsemodels;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import au.com.woolworths.foundation.shop.model.checkout.CheckoutError;
import au.com.woolworths.foundation.shop.model.checkout.CheckoutRecognisedError;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\"\u0017\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"getCheckoutCollectionMode", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrder;", "hasWindowError", "", "getHasWindowError", "(Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrder;)Z", "shop-checkout-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CheckoutOrderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionMode getCheckoutCollectionMode(CheckoutOrder checkoutOrder) {
        CheckoutSelectedWindowData window;
        return (checkoutOrder.getDelivery() == null || !checkoutOrder.getDelivery().isDeliveryAddressSet()) ? (checkoutOrder.getPickup() == null || !checkoutOrder.getPickup().isPickUpStoreSet()) ? CollectionMode.NotSet.d : CollectionMode.PickUp.d : (checkoutOrder.getIsDeliveryNowSelected() || ((window = checkoutOrder.getDelivery().getWindow()) != null && window.isExpress())) ? new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow) : new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard);
    }

    public static final boolean getHasWindowError(@Nullable CheckoutOrder checkoutOrder) {
        List<CheckoutError> errors;
        if (checkoutOrder == null || (errors = checkoutOrder.getErrors()) == null) {
            return false;
        }
        List<CheckoutError> list = errors;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (CheckoutError checkoutError : list) {
            CheckoutRecognisedError.Companion companion = CheckoutRecognisedError.e;
            int errorCode = checkoutError.getErrorCode();
            companion.getClass();
            CheckoutRecognisedError checkoutRecognisedErrorA = CheckoutRecognisedError.Companion.a(errorCode);
            if (checkoutRecognisedErrorA == CheckoutRecognisedError.h || checkoutRecognisedErrorA == CheckoutRecognisedError.g) {
                return true;
            }
        }
        return false;
    }
}
