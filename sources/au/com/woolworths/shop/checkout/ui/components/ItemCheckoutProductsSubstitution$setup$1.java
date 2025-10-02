package au.com.woolworths.shop.checkout.ui.components;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/checkout/ui/components/ItemCheckoutProductsSubstitution$setup$1", "Landroid/view/View$AccessibilityDelegate;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ItemCheckoutProductsSubstitution$setup$1 extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View host, int i) {
        Intrinsics.h(host, "host");
        if (i != 4) {
            super.sendAccessibilityEvent(host, i);
        }
    }
}
