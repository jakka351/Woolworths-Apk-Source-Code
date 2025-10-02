package au.com.woolworths.feature.rewards.offers.accessibility;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/accessibility/StandardBannerAccessibilityDelegate;", "Landroidx/core/view/AccessibilityDelegateCompat;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StandardBannerAccessibilityDelegate extends AccessibilityDelegateCompat {
    public final String d;

    public StandardBannerAccessibilityDelegate(String str) {
        this.d = str;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View host, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Intrinsics.h(host, "host");
        this.f2466a.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfoCompat.f2508a);
        accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, this.d));
    }
}
