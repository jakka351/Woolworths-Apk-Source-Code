package au.com.woolworths.foundation.rewards.offers.ui.accessibility;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/ui/accessibility/OfferTileAccessibilityDelegate;", "Landroidx/core/view/AccessibilityDelegateCompat;", "offers-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferTileAccessibilityDelegate extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View host, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Intrinsics.h(host, "host");
        this.f2466a.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfoCompat.f2508a);
        accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, host.getResources().getText(R.string.rewards_offer_list_view_details)));
    }
}
