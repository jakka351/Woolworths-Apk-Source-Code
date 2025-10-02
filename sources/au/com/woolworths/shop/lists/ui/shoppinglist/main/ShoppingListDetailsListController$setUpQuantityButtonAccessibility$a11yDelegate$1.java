package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsListController$setUpQuantityButtonAccessibility$a11yDelegate$1", "Landroidx/core/view/AccessibilityDelegateCompat;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingListDetailsListController$setUpQuantityButtonAccessibility$a11yDelegate$1 extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View host, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Intrinsics.h(host, "host");
        this.f2466a.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfoCompat.f2508a);
        accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, host.getContext().getString(R.string.shop_lists_quantity_button_click_action_description)));
    }
}
