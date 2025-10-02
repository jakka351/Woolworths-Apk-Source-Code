package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics;
import au.com.woolworths.analytics.supers.payments.PaymentAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardAnalyticsTracker;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddGiftCardAnalyticsTracker {

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsManager f8335a;

    public AddGiftCardAnalyticsTracker(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f8335a = analyticsManager;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static AddGiftCardAnalytics.Payment a() {
        return new AddGiftCardAnalytics.Payment(String.valueOf(PaymentAnalytics.Payment.e.get("app.Section")));
    }
}
