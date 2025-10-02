package au.com.woolworths.shop.checkout.ui.epoxy.controller;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.ItemCheckoutPackagingMethodOptionBindingModel_;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethod;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/epoxy/controller/ItemCheckoutPackagingMethodController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/shop/checkout/domain/model/PackagingMethod;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsListener;", "packagingMethod", "<init>", "(Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsListener;Lau/com/woolworths/shop/checkout/domain/model/PackagingMethod;)V", "buildModels", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ItemCheckoutPackagingMethodController extends TypedEpoxyController<PackagingMethod> {
    public static final int $stable = 8;

    @Nullable
    private final CheckoutDetailsListener listener;

    public ItemCheckoutPackagingMethodController(@Nullable CheckoutDetailsListener checkoutDetailsListener, @NotNull PackagingMethod packagingMethod) {
        Intrinsics.h(packagingMethod, "packagingMethod");
        this.listener = checkoutDetailsListener;
        setData(packagingMethod);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable PackagingMethod packagingMethod) {
        if (packagingMethod != null) {
            for (PackagingMethodOption packagingMethodOption : packagingMethod.b) {
                ItemCheckoutPackagingMethodOptionBindingModel_ itemCheckoutPackagingMethodOptionBindingModel_ = new ItemCheckoutPackagingMethodOptionBindingModel_();
                itemCheckoutPackagingMethodOptionBindingModel_.M("packing_method_option_" + packagingMethodOption.f10624a);
                itemCheckoutPackagingMethodOptionBindingModel_.t();
                itemCheckoutPackagingMethodOptionBindingModel_.n = packagingMethodOption;
                CheckoutDetailsListener checkoutDetailsListener = this.listener;
                itemCheckoutPackagingMethodOptionBindingModel_.t();
                itemCheckoutPackagingMethodOptionBindingModel_.o = checkoutDetailsListener;
                add(itemCheckoutPackagingMethodOptionBindingModel_);
            }
        }
    }
}
