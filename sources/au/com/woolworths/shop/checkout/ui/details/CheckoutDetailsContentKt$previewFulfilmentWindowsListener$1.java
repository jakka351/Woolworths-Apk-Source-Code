package au.com.woolworths.shop.checkout.ui.details;

import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/checkout/ui/details/CheckoutDetailsContentKt$previewFulfilmentWindowsListener$1", "Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsListener;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutDetailsContentKt$previewFulfilmentWindowsListener$1 implements FulfilmentWindowsListener {
    @Override // au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener
    public final void J(String title, FulfilmentWindows fulfilmentWindows, FulfilmentWindowsOption fulfilmentWindowsOption) {
        Intrinsics.h(title, "title");
        Intrinsics.h(fulfilmentWindows, "fulfilmentWindows");
        Intrinsics.h(fulfilmentWindowsOption, "fulfilmentWindowsOption");
    }
}
